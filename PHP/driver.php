<?php
require_once("account.php");
class Driver extends Account {
    public function__construct($name, $document, $email, $password){
        parent::__construct($name, $document, $email, $password);
    }
    public function printDataUser() {
        echo "Driver";
        echo "<br>";
        echo "Name: $this->name Document: $this->document Email: $this->email Password: $this->password"
        echo "<br>"
    }
}
?>