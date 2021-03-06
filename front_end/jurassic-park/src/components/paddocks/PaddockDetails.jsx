import React from 'react';
import Paddock from './Paddock';

const PaddockDetails = (props) => {

  const handlePaddockDelete = () => {
    props.onPaddockDelete(props.paddock.id)
  }

  return(
    <div className="component" id="paddock-details">
      <h3>Paddock Details</h3>
      <Paddock paddock={props.paddock}/>
      <div className="buttons">
        <button onClick={handlePaddockDelete}>Delete Paddock</button>
      </div>
    </div>
  )
}
export default PaddockDetails
