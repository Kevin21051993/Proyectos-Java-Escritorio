-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-07-2016 a las 23:20:47
-- Versión del servidor: 5.6.21
-- Versión de PHP: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdllamadastel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefono`
--

DROP DATABASE IF EXISTS bdllamadastel;
CREATE DATABASE bdllamadastel;
USE bdllamadastel;

CREATE TABLE IF NOT EXISTS `telefono` (
  `NroTelefono` varchar(15) NOT NULL,
  `NombreCliente` varchar(30) NOT NULL,
  `Tipo` int(11) NOT NULL,
  `CantidadMinutos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `telefono`
--

INSERT INTO `telefono` (`NroTelefono`, `NombreCliente`, `Tipo`, `CantidadMinutos`) VALUES
('114689', 'Brisa Rosario', 1, 120),
('2648957', 'Junior Gutierres', 1, 80),
('00124869', 'Maria Rosmery', 2, 150),
('12098645', 'Timoteo Ramos', 1, 60);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
