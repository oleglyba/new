import React from 'react';
import PropTypes from 'prop-types';

const Modal = ({ message, onClose }) => {
    return (
        <div className="modal" role="dialog" aria-modal="true" aria-labelledby="modalTitle">
            <div className="modal-content">
                <span className="close-btn" onClick={onClose}>&times;</span>
                <p id="modalTitle">{message}</p>
            </div>
        </div>
    );
};

Modal.propTypes = {
    message: PropTypes.string.isRequired,
    onClose: PropTypes.func.isRequired,
};

export default Modal;
