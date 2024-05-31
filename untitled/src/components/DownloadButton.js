import React from 'react';
import PropTypes from 'prop-types';

const DownloadButton = ({ onClick }) => (
    <button className="download-button" onClick={onClick}>
        Download Difference
    </button>
);

DownloadButton.propTypes = {
    onClick: PropTypes.func.isRequired,
};

export default DownloadButton;
