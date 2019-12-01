import React from 'react';

const PaddockForm = (props) => {

  const handleSubmit = (event) => {
    event.preventDefault();
    const paddock ={
      "name": event.target.name.value,
      "type": event.target.type.value,
      "capacity": event.target.capacity.value
    }
    props.handlePaddockPost(paddock);

  }

  return (
    <div>
      <form onSubmit={handleSubmit}>
      <input type="text" placeholder="Name" name="name"/>
      <input type="number" placeholder="Capacity" name="capacity"/>
      <select name="type">Type:
        <option value="Herbivores">Herbivores Only</option>
        <option value="Carnivores">Carnivores Only</option>
      </select>
      <button type="submit">Save</button>
      </form>
    </div>
  )
}

export default PaddockForm;
