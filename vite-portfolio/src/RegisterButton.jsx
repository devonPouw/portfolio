import { useHistory } from 'react';

const RegisterButton = () => {
  const history = useHistory();

  const handleClick = () => {
    history.push("src/RegistrationForm.jsx"); // Replace '/register' with the actual path of your register page
  };

  return (
    <button onClick={handleClick}>Register</button>
  );
};

export default RegisterButton;