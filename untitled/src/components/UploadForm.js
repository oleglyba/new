import React, { useState } from 'react';
import PropTypes from 'prop-types';

const UploadForm = ({ label, onUpload, multiple = false }) => {
    const [fileInputKey, setFileInputKey] = useState(0);

    const handleFileChange = (e) => {
        const files = e.target.files;
        if (multiple) {
            onUpload(Array.from(files));
        } else {
            onUpload(files[0]);
        }
        setFileInputKey(prevKey => prevKey + 1); // To reset the file input
    };

    return (
        <div className="upload-form">
            <label>{label}</label>
            <input
                key={fileInputKey}
                type="file"
                accept={multiple ? ".csv" : undefined}
                onChange={handleFileChange}
                multiple={multiple}
            />
        </div>
    );
};

UploadForm.propTypes = {
    label: PropTypes.string.isRequired,
    onUpload: PropTypes.func.isRequired,
    multiple: PropTypes.bool,
};

export default UploadForm;
