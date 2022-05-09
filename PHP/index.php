<?php
require_once("car.php");
require_once("uberX.php");
require_once("user.php")
require_once("account.php");

$uberX = new UberX("CVB123", new Account("Andres Herrera", "AND123"), "Chevrolet","Spark" );
$uberX->printDataCar();

$user = new User("Mario Villa", "MARI123", "marivi123@gmail.com", "mario1234")
$user->printDataYser();
?>