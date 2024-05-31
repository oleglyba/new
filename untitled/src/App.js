import React, { Component } from 'react';
import UploadForm from './components/UploadForm';
import DownloadButton from './components/DownloadButton';
import DifferenceDisplay from './components/DifferenceDisplay';
import Modal from './components/Modal';
import './App.css'; // Make sure to import your CSS file

class App extends Component {
    state = {
        newCSV: null,
        oldCSV: null,
        difference: null,
        errorMessage: '',
        differenceDownloaded: false, // New state to track if difference is downloaded
    };

    handleNewCSVUpload = (file) => {
        const reader = new FileReader();
        reader.onload = (e) => {
            const content = e.target.result;
            this.setState({ newCSV: content });
        };
        reader.readAsText(file);
    };

    handleOldCSVUpload = (file) => {
        const reader = new FileReader();
        reader.onload = (e) => {
            const content = e.target.result;
            this.setState({ oldCSV: content });
        };
        reader.readAsText(file);
    };

    handleDownloadDifference = () => {
        const { newCSV, oldCSV, differenceDownloaded } = this.state;

        if (differenceDownloaded) {
            this.setState({ errorMessage: 'Difference CSV file has already been downloaded.' });
            return;
        }

        if (!newCSV || !oldCSV) {
            this.setState({ errorMessage: 'Please upload both new and old CSV files.' });
            return;
        }

        const difference = this.compareCSV(newCSV, oldCSV);
        this.setState({ difference, errorMessage: '', differenceDownloaded: true });
        this.downloadCSV(difference);
    };

    downloadCSV = (difference) => {
        const blob = new Blob([difference], { type: 'text/csv' });
        const url = window.URL.createObjectURL(blob);
        const a = document.createElement('a');
        a.style.display = 'none';
        a.href = url;
        a.download = 'difference.csv';
        document.body.appendChild(a);
        a.click();
        window.URL.revokeObjectURL(url);
    };

    closeModal = () => {
        this.setState({ errorMessage: '' });
    };

    compareCSV = (newContent, oldContent) => {
        // Your CSV comparison logic here
        return "Sample difference text";
    };

    render() {
        const { difference, errorMessage } = this.state;

        return (
            <div className="container">
                <h1>CSV Difference Downloader</h1>
                <UploadForm label="Upload New CSV" onUpload={this.handleNewCSVUpload} />
                <UploadForm label="Upload Old CSV" onUpload={this.handleOldCSVUpload} />
                <DownloadButton onClick={this.handleDownloadDifference} />
                {difference && <DifferenceDisplay difference={difference} />}
                {errorMessage && <Modal message={errorMessage} onClose={this.closeModal} />}
            </div>
        );
    }
}

export default App;
