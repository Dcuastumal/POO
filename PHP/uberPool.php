<?php
require_once('car.php'); 
class UberPool extends Car {
    public $brand;
    public $model;

    public function__construct($license, $driver, $brand, $model){
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }
    
}
?>