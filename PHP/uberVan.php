<?php
require_once('car.php'); 
class UberVan extends Car {
    public $typecarAccepted;
    public $seatsMaterial;

    public function__construct($license, $driver, $typecarAccepted, $seatsMaterial){
        parent::__construct($license, $driver);
        $this->typecarAccepted = $typecarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }
    
}
?>