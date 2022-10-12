-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20221012.f1f31c313d
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-10-2022 a las 20:19:15
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Rustica`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarAdm` (`buscar` CHAR(20))   SELECT
  *
FROM
  administrador
WHERE
  nombre LIKE buscar$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarBoleta` (`buscar` CHAR(20))   SELECT
  *
FROM
  boleta
WHERE
  nombre LIKE buscar$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarCliente` (`buscar` CHAR(20))   SELECT
  *
FROM
  clientes
WHERE
  nombre LIKE buscar$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarFactura` (`buscar` CHAR(20))   SELECT
  *
FROM
  factura
WHERE
  nombre LIKE buscar$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `buscarMesero` (`buscar` CHAR(20))   SELECT
  *
FROM
  mesero
WHERE
  nombre LIKE buscar$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE `administrador` (
  `idadministrador` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `contraseña` longblob NOT NULL,
  `username` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `administrador`
--

INSERT INTO `administrador` (`idadministrador`, `nombre`, `telefono`, `mail`, `contraseña`, `username`) VALUES
(1, 'Carlos Aquino', '923288546', 'ca285543@gmail.com', 0x32303231, 'carlos'),
(2, 'Danilo Castro', '903355736', 'danilo@gmail.com', 0x61646d696e, 'danilo'),
(3, 'Marko Arrunategui', '982365895', 'marko@gmail.com', 0x61646d696e, 'markoadm');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bebidas`
--

CREATE TABLE `bebidas` (
  `idbebidas` int(11) NOT NULL,
  `nombreBebida` varchar(45) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `bebidas`
--

INSERT INTO `bebidas` (`idbebidas`, `nombreBebida`, `precio`) VALUES
(1, 'CRISTAL', 6),
(2, 'PILSEN', 7),
(3, 'CUSQUEÑA', 8),
(4, 'GASEOSA PERSONAL', 3),
(5, 'GASEOSA 1 1/2 LITRO', 8),
(6, 'JUGO SURTIDO', 8),
(7, 'JUGO PAPAYA', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bebida_pedido`
--

CREATE TABLE `bebida_pedido` (
  `idbebida_pedido` int(11) NOT NULL,
  `nombreBebida` varchar(45) NOT NULL,
  `cantidadBebida` int(11) NOT NULL,
  `precioBebida` double NOT NULL,
  `montoBebida` double NOT NULL,
  `idbebidas` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `bebida_pedido`
--

INSERT INTO `bebida_pedido` (`idbebida_pedido`, `nombreBebida`, `cantidadBebida`, `precioBebida`, `montoBebida`, `idbebidas`) VALUES
(1, 'CRISTAL', 7, 6, 42, NULL),
(2, 'PILSEN', 2, 7, 14, NULL),
(3, 'PILSEN', 1, 7, 7, NULL),
(4, 'CUSQUEÑA', 1, 8, 8, NULL),
(5, 'CRISTAL', 2, 6, 12, NULL),
(6, 'CRISTAL', 2, 6, 12, NULL),
(7, 'CUSQUEÑA', 1, 8, 8, NULL),
(8, 'CRISTAL', 1, 6, 6, NULL),
(9, 'PILSEN', 1, 7, 7, NULL),
(10, 'PILSEN', 1, 7, 7, NULL),
(11, 'CRISTAL', 2, 6, 12, NULL),
(12, 'PILSEN', 1, 7, 7, NULL),
(13, 'CRISTAL', 1, 6, 6, NULL),
(14, 'CUSQUEÑA', 1, 8, 8, NULL),
(15, 'PILSEN', 1, 7, 7, NULL),
(16, 'CRISTAL', 1, 6, 6, NULL),
(17, 'CRISTAL', 2, 6, 12, NULL),
(18, 'CRISTAL', 2, 6, 12, NULL),
(19, 'CRISTAL', 1, 6, 6, NULL),
(20, 'PILSEN', 1, 7, 7, NULL),
(21, 'CRISTAL', 2, 6, 12, NULL),
(22, 'PILSEN', 1, 7, 7, NULL),
(23, 'CUSQUEÑA', 2, 8, 16, NULL),
(24, 'CRISTAL', 1, 6, 6, NULL),
(25, 'CRISTAL', 2, 6, 12, NULL),
(26, 'CRISTAL', 1, 6, 6, NULL),
(27, 'CRISTAL', 1, 6, 6, NULL),
(28, 'CRISTAL', 2, 6, 12, NULL),
(29, 'GASEOSA PERSONAL', 1, 3, 3, NULL),
(30, 'CUSQUEÑA', 1, 8, 8, NULL),
(31, 'CRISTAL', 4, 6, 24, NULL),
(32, 'PILSEN', 1, 7, 7, NULL),
(33, 'CRISTAL', 3, 6, 18, NULL),
(34, 'PILSEN', 1, 7, 7, NULL),
(35, 'CUSQUEÑA', 2, 8, 16, NULL),
(36, 'GASEOSA PERSONAL', 3, 3, 9, NULL),
(37, 'GASEOSA DE LITRO Y MEDIO', 6, 8, 48, NULL),
(38, 'JUGO SURTIDO', 2, 8, 16, NULL),
(39, 'JUGO PAPAYA', 1, 5, 5, NULL),
(40, 'CRISTAL', 2, 6, 12, NULL),
(41, 'CRISTAL', 2, 6, 12, NULL),
(42, 'CUSQUEÑA', 1, 8, 8, NULL),
(43, 'CRISTAL', 1, 6, 6, NULL),
(44, 'CRISTAL', 1, 6, 6, NULL),
(45, 'PILSEN', 1, 7, 7, NULL),
(46, 'CUSQUEÑA', 1, 8, 8, NULL),
(47, 'GASEOSA PERSONAL', 2, 3, 6, NULL),
(48, 'GASEOSA DE LITRO Y MEDIO', 3, 8, 24, NULL),
(49, 'JUGO SURTIDO', 2, 8, 16, NULL),
(50, 'JUGO PAPAYA', 1, 5, 5, NULL),
(51, 'CRISTAL', 1, 6, 6, NULL),
(52, 'CRISTAL', 2, 6, 12, NULL),
(53, 'CRISTAL', 1, 6, 6, NULL),
(54, 'CUSQUEÑA', 4, 8, 32, NULL),
(55, 'CRISTAL', 2, 6, 12, NULL),
(56, 'CRISTAL', 1, 6, 6, NULL),
(57, 'CRISTAL', 2, 6, 12, NULL),
(58, 'GASEOSA PERSONAL', 2, 3, 6, NULL),
(59, 'PILSEN', 2, 7, 14, NULL),
(60, 'CRISTAL', 1, 6, 6, NULL),
(61, 'CRISTAL', 1, 6, 6, NULL),
(62, 'CRISTAL', 1, 6, 6, NULL),
(63, 'CRISTAL', 1, 6, 6, NULL),
(64, 'CRISTAL', 1, 6, 6, NULL),
(65, 'CRISTAL', 1, 6, 6, NULL),
(66, 'CRISTAL', 1, 6, 6, NULL),
(67, 'CRISTAL', 1, 6, 6, NULL),
(68, 'CRISTAL', 1, 6, 6, NULL),
(69, 'PILSEN', 1, 7, 7, NULL),
(70, 'CRISTAL', 1, 6, 6, NULL),
(71, 'CRISTAL', 1, 6, 6, NULL),
(72, 'CRISTAL', 1, 6, 6, NULL),
(73, 'PILSEN', 1, 7, 7, NULL),
(74, 'GASEOSA PERSONAL', 1, 3, 3, NULL),
(75, 'JUGO SURTIDO', 1, 8, 8, NULL),
(76, 'CRISTAL', 1, 6, 6, NULL),
(77, 'CUSQUEÑA', 1, 8, 8, NULL),
(78, 'PILSEN', 1, 7, 7, NULL),
(79, 'PILSEN', 1, 7, 7, NULL),
(80, 'CRISTAL', 1, 6, 6, NULL),
(81, 'PILSEN', 2, 7, 14, NULL),
(82, 'PILSEN', 3, 7, 21, NULL),
(83, 'JUGO SURTIDO', 4, 8, 32, NULL),
(84, 'PILSEN', 1, 7, 7, NULL),
(85, 'CUSQUEÑA', 2, 8, 16, NULL),
(86, 'GASEOSA DE LITRO Y MEDIO', 4, 8, 32, NULL),
(87, 'CRISTAL', 2, 6, 12, NULL),
(88, 'CRISTAL', 2, 6, 12, NULL),
(89, 'CUSQUEÑA', 5, 8, 40, NULL),
(90, 'PILSEN', 1, 7, 7, NULL),
(91, 'CRISTAL', 1, 6, 6, NULL),
(92, 'PILSEN', 2, 7, 14, NULL),
(93, 'CUSQUEÑA', 6, 8, 48, NULL),
(94, 'CRISTAL', 2, 6, 12, NULL),
(95, 'GASEOSA DE LITRO Y MEDIO', 2, 8, 16, NULL),
(96, 'JUGO SURTIDO', 2, 8, 16, NULL),
(97, 'CUSQUEÑA', 2, 8, 16, NULL),
(98, 'CRISTAL', 1, 6, 6, NULL),
(99, 'GASEOSA PERSONAL', 1, 3, 3, NULL),
(100, 'CUSQUEÑA', 2, 8, 16, NULL),
(101, 'GASEOSA DE LITRO Y MEDIO', 5, 8, 40, NULL),
(102, 'CRISTAL', 1, 6, 6, NULL),
(103, 'GASEOSA PERSONAL', 1, 3, 3, NULL),
(104, 'PILSEN', 2, 7, 14, NULL),
(105, 'CRISTAL', 1, 6, 6, NULL),
(106, 'PILSEN', 1, 7, 7, NULL),
(107, 'CRISTAL', 1, 6, 6, NULL),
(108, 'CUSQUEÑA', 2, 8, 16, NULL),
(109, 'PILSEN', 1, 7, 7, NULL),
(110, 'JUGO SURTIDO', 1, 8, 8, NULL),
(111, 'PILSEN', 2, 7, 14, NULL),
(112, 'CRISTAL', 1, 6, 6, NULL),
(113, 'GASEOSA PERSONAL', 2, 3, 6, NULL),
(114, 'CUSQUEÑA', 1, 8, 8, NULL),
(115, 'CRISTAL', 1, 6, 6, NULL),
(116, 'JUGO PAPAYA', 1, 5, 5, NULL),
(117, 'PILSEN', 2, 7, 14, NULL),
(118, 'GASEOSA DE LITRO Y MEDIO', 2, 8, 16, NULL),
(119, 'PILSEN', 1, 7, 7, NULL),
(120, 'GASEOSA PERSONAL', 2, 3, 6, NULL),
(121, 'GASEOSA DE LITRO Y MEDIO', 2, 8, 16, NULL),
(122, 'PILSEN', 2, 7, 14, NULL),
(123, 'CUSQUEÑA', 1, 8, 8, NULL),
(124, 'CRISTAL', 4, 6, 24, NULL),
(125, 'CRISTAL', 2, 6, 12, NULL),
(126, 'CRISTAL', 5, 6, 30, NULL),
(127, 'CUSQUEÑA', 1, 8, 8, NULL),
(128, 'CRISTAL', 1, 6, 6, NULL),
(129, 'PILSEN', 1, 7, 7, NULL),
(130, 'CRISTAL', 1, 6, 6, NULL),
(131, 'GASEOSA PERSONAL', 2, 3, 6, NULL),
(132, 'CRISTAL', 2, 6, 12, NULL),
(133, 'GASEOSA PERSONAL', 3, 3, 9, NULL),
(134, 'CUSQUEÑA', 2, 8, 16, NULL),
(135, 'GASEOSA PERSONAL', 1, 3, 3, NULL),
(136, 'CUSQUEÑA', 2, 8, 16, NULL),
(137, 'CRISTAL', 2, 6, 12, NULL),
(138, 'GASEOSA PERSONAL', 1, 3, 3, NULL),
(139, 'CRISTAL', 2, 6, 12, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleta`
--

CREATE TABLE `boleta` (
  `idboleta` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `dni` varchar(10) DEFAULT NULL,
  `telefono` varchar(10) NOT NULL,
  `atendidoPor` varchar(50) NOT NULL,
  `fecha` varchar(20) NOT NULL,
  `subTotal` double NOT NULL,
  `igv` double NOT NULL,
  `montoTotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `boleta`
--

INSERT INTO `boleta` (`idboleta`, `nombre`, `dni`, `telefono`, `atendidoPor`, `fecha`, `subTotal`, `igv`, `montoTotal`) VALUES
(1, 'Rocio Cardenas', '78569823', '976859325', 'Carlos Aquino', '17-07-2019', 26, 4.68, 30.68),
(2, 'Ana Villegas', '75896325', '963258963', 'Danilo Castro', '16-07-2019', 26, 4.68, 30.68),
(3, 'Jose Cordova', '0735698', '976859235', 'Danilo Castro', '13-07-2019', 26, 4.68, 30.68),
(4, 'Melissa Anton', '75214589', '985623547', 'Marko Arrunategui', '17-07-2019', 26, 4.68, 30.68),
(5, 'Maria Castro', '75823698', '985623568', 'Carlos Aquino', '15-07-2019', 114, 20.52, 134.52),
(6, 'Samantha Diaz', '72554895', '978569823', 'Carlos Aquino', '17-07-2019', 51, 9.18, 60.18),
(7, 'Carlos Salazar', '03698526', '978562358', 'Marko Arrunategui', '16-07-2019', 107, 19.26, 126.26),
(8, 'Juan Martinez', '75895623', '985625417', 'Marko Arrunategui', '10-07-2019', 260, 46.8, 306.8),
(9, 'Carlos Aquino', '72472698', '975895685', 'Carlos Aquino', '17-07-2019', 102, 18.36, 120.36),
(10, 'Alejando Sanchez', '72457698', '985632478', 'Marko Arrunategui', '16-07-2019', 292, 52.56, 344.56),
(11, 'Rodrigo Leon', '72457239', '976859236', 'Carlos Aquino', '17-07-2019', 167, 30.06, 197.06),
(12, 'Kevin Flores', '72457240', '968574112', 'Carlos Aquino', '17-07-2019', 26, 4.68, 30.68),
(13, 'Salvador Rojas', '72458965', '976859235', 'Carlos Aquino', '17-07-2019', 169, 30.42, 199.42),
(14, 'Miguel Fernandez', '72589662', '978562358', 'Marko Arrunategui', '17-07-2019', 278, 50.04, 328.04),
(15, 'Rafael Mamani', '72457239', '978569265', 'Carlos Aquino', '17-07-2019', 204, 36.72, 240.72),
(16, 'Aron Perez', '75482369', '978568922', 'Danilo Castro', '17-07-2019', 41, 7.38, 48.38),
(17, 'Saul Rojas', '72548956', '978562358', 'Marko Arrunategui', '17-07-2019', 84, 15.12, 99.12),
(18, 'Ismael Lopes', '78596256', '975862359', 'Danilo Castro', '17-07-2019', 131, 23.58, 154.58),
(19, 'Raquel Garcia', '77245895', '976856325', 'Danilo Castro', '14-07-2019', 65, 11.7, 76.7),
(20, 'Pablo Rodriguez', '72457239', '987456322', 'Carlos Aquino', '16-07-2019', 54, 9.72, 63.72),
(21, 'Jenifer Carrasco', '72458265', '978562356', 'Danilo Castro', '17-07-2019', 156, 28.08, 184.08),
(22, 'Andre Risco', '72458598', '975862358', 'Danilo Castro', '17-07-2019', 57, 10.26, 67.26),
(23, 'Gustavo Canova', '72457239', '989856685', 'Carlos Aquino', '17-07-2019', 72, 12.96, 84.96),
(24, 'Sebastian Alvarado', '03658956', '978523654', 'Marko Arrunategui', '17-07-2019', 70, 12.6, 82.6),
(25, 'Carlos Benites', '75896325', '985624156', 'Carlos Aquino', '17-07-2019', 89, 16.02, 105.02),
(26, 'uuuu', '9999', '9999', 'Carlos Aquino', '01-07-2022', 547, 98.46, 645.46),
(27, 'Carlos', '70993450', '92328222', 'Carlos Aquino', '07-07-2022', 165, 29.7, 194.7),
(28, 'Carlos', '77772221', '923821121', 'Marko Arrunategui', '14-07-2022', 206, 37.08, 243.08),
(29, 'Carlos', '70993450', '923288546', 'Marko Arrunategui', '24-07-2022', 164, 29.52, 193.52),
(30, 'Carlos', '77882313', '23231212', 'Prueba', '01-09-2022', 91, 16.38, 107.38),
(31, 'Carlos', '78823223', '92323234', 'Danilo Castro', '12-10-2022', 407, 73.26, 480.26);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idclientes` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `dni` varchar(8) DEFAULT NULL,
  `ruc` varchar(11) DEFAULT NULL,
  `telefono` varchar(11) NOT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `ciudad` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idclientes`, `nombre`, `dni`, `ruc`, `telefono`, `correo`, `ciudad`) VALUES
(1, 'Maria Benites', '00000000', '10754578975', '9767495834', 'Maria@gmail.com', 'Sullana'),
(2, 'Jenifer Carrasco', '72458265', '00000000000', '978562356', 'Sin especificar', 'Sin especificar'),
(3, 'Andre Risco', '72458592', '00000000000', '975862358', 'Sin especificar', 'Sin especificar'),
(4, 'Gustavo Canova', '72457239', '00000000000', '989856685', 'Sin especificar', 'Sin especificar'),
(5, 'Sebastian Alvarado', '03658956', '00000000000', '978523654', 'Sin especificar', 'Sin especificar'),
(6, 'Carlos Benites', '75896325', '00000000000', '985624156', 'Sin especificar', 'Sin especificar'),
(7, 'Juana Avila', '00000000', '10256585425', '975865235', 'juana@gmail.com', 'Sullana'),
(8, 'Pepe Ojeda', '00000000', '13216546545', '976568652', 'pepe@gmail.com', 'Piura'),
(9, 'Rocio Quedena', '00000000', '11231564645', '974845645', 'rocio@gmail.com', 'Piura'),
(10, 'Teresa Ortiz', '00000000', '10256556587', '978653265', 'teresa@gmail.com', 'Chiclayo'),
(11, 'Anthony Reyes', '00000000', '10325652389', '978562365', 'Anthony@gmail.com', 'catacaos'),
(12, 'Ismael Lopez', '00000000', '10256589568', '975864582', 'ismael@gmail.com', 'Sechura'),
(13, 'Hector Yesang', '00000000', '10256235698', '976856235', 'Hector@gmail.com', 'Piura'),
(14, 'Alexis Castro', '00000000', '10256895232', '975865235', 'alexis@gmail.com', 'Morropon'),
(15, 'Mario Rosales', '00000000', '10256325895', '976585235', 'mario@gmail.com', 'bellavista'),
(16, 'Harold Guzman', '00000000', '10265982356', '985623659', 'harold@gmail.com', 'Marcavelica'),
(17, 'Roberto Salazar', '00000000', '10036589523', '975865235', 'roberto@gmail.com', 'Sullana'),
(18, 'Walther Espinoza', '00000000', '10256525255', '975865985', 'walther@gmail.com', 'castilla'),
(19, 'Frank Castillo', '00000000', '10256328595', '975865326', 'frank@gmail.com', 'Piura'),
(20, 'Luis Nunuera', '00000000', '12503265986', '986532145', 'luis@gmail.com', 'Sullana'),
(21, 'Frey Diaz', '00000000', '10256523565', '978562358', 'frey@gmail.com', 'castilla'),
(22, 'Alisson Rodrigues', '00000000', '10256235652', '978565235', 'alisson@gmail.com', 'sullana'),
(23, 'Vania Dioses', '00000000', '11025689562', '978563568', 'vania@gmail.com', 'Lambayeque'),
(24, 'Jack delgado', '00000000', '10256235698', '975862556', 'jack@gmail.com', 'piura'),
(25, 'Kevin Martinez', '00000000', '12025652356', '976856231', 'kevin@gmail.com', 'Piura'),
(26, 'Diana Ojeda', '00000000', '10256328589', '976748562', 'diana@gmail.com', 'sullana'),
(27, 'Reynaldo Zapata', '00000000', '10256325896', '975896325', 'rey@gmail.com', 'castilla'),
(28, 'David Ojeda', '00000000', '1025632582', '978562356', 'david6@gmail.com', 'marcavelica'),
(29, 'Daniel Juarez', '00000000', '1025632568', '978562356', 'daniel@gmail.com', 'Catacaos'),
(30, 'Jose Niño', '00000000', '10258965236', '985623589', 'jose@gmail.com', 'Piura'),
(31, 'Elian cordova', '00000000', '1025632568', '975862356', 'elian@gmail.com', 'sullana');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `idfactura` int(11) NOT NULL,
  `fecha` varchar(45) NOT NULL,
  `montoTotal` double NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `ruc` varchar(11) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `subTotal` double NOT NULL,
  `atendidoPor` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`idfactura`, `fecha`, `montoTotal`, `ciudad`, `ruc`, `correo`, `nombre`, `telefono`, `subTotal`, `atendidoPor`) VALUES
(1, '17-07-2019', 120.36, 'Sullana', '10256585425', 'juana@gmail.com', 'Juana Avila', '975865235', 102, 'Carlos Aquino'),
(2, '17-07-2019', 97.94, 'Piura', '13216546545', 'pepe@gmail.com', 'Pepe Ojeda', '976568652', 83, 'Carlos Aquino'),
(3, '17-07-2019', 30.68, 'Piura', '11231564645', 'rocio@gmail.com', 'Rocio Quedena', '974845645', 26, 'Danilo Castro'),
(4, '17-07-2019', 87.32, 'Chiclayo', '10256556587', 'teresa@gmail.com', 'Teresa Ortiz', '978653265', 74, 'Marko Arrunategui'),
(5, '17-07-2019', 48.38, 'catacaos', '10325652389', 'Anthony@gmail.com', 'Anthony Reyes', '978562365', 41, 'Danilo Castro'),
(6, '14-07-2019', 43.66, 'Sechura', '10256589568', 'ismael@gmail.com', 'Ismael Lopez', '975864582', 37, 'Prueba'),
(7, '17-07-2019', 90.86, 'Piura', '10256235698', 'Hector@gmail.com', 'Hector Yesang', '976856235', 77, 'Marko Arrunategui'),
(8, '16-07-2019', 116.82, 'Morropon', '10256895232', 'alexis@gmail.com', 'Alexis Castro', '975865235', 99, 'Carlos Aquino'),
(9, '13-07-2019', 103.84, 'bellavista', '10256325895', 'mario@gmail.com', 'Mario Rosales', '976585235', 88, 'Marko Arrunategui'),
(10, '16-07-2019', 93.22, 'Marcavelica', '10265982356', 'harold@gmail.com', 'Harold Guzman', '985623659', 79, 'Marko Arrunategui'),
(11, '16-07-2019', 102.66, 'Sullana', '10036589523', 'roberto@gmail.com', 'Roberto Salazar', '975865235', 87, 'Danilo Castro'),
(12, '17-07-2019', 123.9, 'castilla', '10256525255', 'walther@gmail.com', 'Walther Espinoza', '975865985', 105, 'Marko Arrunategui'),
(13, '17-07-2019', 59, 'Piura', '10256328595', 'frank@gmail.com', 'Frank Castillo', '975865326', 50, 'Carlos Aquino'),
(14, '16-07-2019', 64.9, 'Sullana', '12503265986', 'luis@gmail.com', 'Luis Nunuera', '986532145', 55, 'Carlos Aquino'),
(15, '17-07-2019', 0, 'castilla', '10256523565', 'frey@gmail.com', 'Frey Diaz', '978562358', 0, 'Carlos Aquino'),
(16, '17-07-2019', 62.54, 'sullana', '10256235652', 'alisson@gmail.com', 'Alisson Rodrigues', '978565235', 53, 'Marko Arrunategui'),
(17, '09-07-2019', 29.5, 'Lambayeque', '11025689562', 'vania@gmail.com', 'Vania Dioses', '978563568', 25, 'Danilo Castro'),
(18, '10-07-2019', 153.4, 'piura', '10256235698', 'jack@gmail.com', 'Jack delgado', '975862556', 130, 'Marko Arrunategui'),
(19, '17-07-2019', 70.8, 'Piura', '12025652356', 'kevin@gmail.com', 'Kevin Martinez', '976856231', 60, 'Danilo Castro'),
(20, '16-07-2019', 23.6, 'sullana', '10256328589', 'diana@gmail.com', 'Diana Ojeda', '976748562', 20, 'Carlos Aquino'),
(21, '06-07-2019', 53.1, 'castilla', '10256325896', 'rey@gmail.com', 'Reynaldo Zapata', '975896325', 45, 'Danilo Castro'),
(22, '17-07-2019', 0, 'marcavelica', '1025632582', 'david6@gmail.com', 'David Ojeda', '978562356', 0, 'Marko Arrunategui'),
(23, '17-07-2019', 112.1, 'Catacaos', '1025632568', 'daniel@gmail.com', 'Daniel Juarez', '978562356', 95, 'Carlos Aquino'),
(24, '16-07-2019', 71.98, 'Piura', '10258965236', 'jose@gmail.com', 'Jose Niño', '985623589', 61, 'Danilo Castro'),
(25, '17-07-2019', 37.76, 'sullana', '1025632568', 'elian@gmail.com', 'Elian cordova', '975862356', 32, 'Danilo Castro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesero`
--

CREATE TABLE `mesero` (
  `idmesero` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `contraseña` longblob NOT NULL,
  `userName` varchar(45) NOT NULL,
  `numeroMesero` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mesero`
--

INSERT INTO `mesero` (`idmesero`, `nombre`, `telefono`, `mail`, `contraseña`, `userName`, `numeroMesero`) VALUES
(1, 'Carlos Aquino', '985623658', 'ca285543@gmail.com', 0x6d657365726f, 'carlosmsr', 1),
(2, 'Danilo Castro', '978568953', 'danilo@gmail.com', 0x6d657365726f, 'danilo', 2),
(3, 'Marko Arrunategui', '975856325', 'marko@gmail.com', 0x6e657365726f, 'markomsr', 3),
(4, 'Jose', '999999', 'cs2@gmail.com', 0x31323334, 'josemsr', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idpedido` int(11) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` double NOT NULL,
  `Monto` double NOT NULL,
  `numeropedido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `platos`
--

CREATE TABLE `platos` (
  `idplatos` int(11) NOT NULL,
  `nombrePlato` varchar(45) NOT NULL,
  `precio` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `platos`
--

INSERT INTO `platos` (`idplatos`, `nombrePlato`, `precio`) VALUES
(1, 'POLLO A LA BRASA', '45'),
(2, 'PARRILLA DUO', '25'),
(3, 'PARRILLA FAMILIAR', '55'),
(4, 'MONSTRITO', '25'),
(5, 'BISTEC A LO POBRE', '30'),
(6, 'CHAUFA', '20'),
(7, 'MEDIO POLLO', '25'),
(8, 'LOMO SALTADO', '18'),
(9, 'CUARTO DE POLLO', '15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plato_pedido`
--

CREATE TABLE `plato_pedido` (
  `idplato_pedido` int(11) NOT NULL,
  `nombrePlato` varchar(45) NOT NULL,
  `idplatos` int(11) DEFAULT NULL,
  `cantidadPlato` int(11) NOT NULL,
  `precioPlato` double NOT NULL,
  `montoPlato` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `plato_pedido`
--

INSERT INTO `plato_pedido` (`idplato_pedido`, `nombrePlato`, `idplatos`, `cantidadPlato`, `precioPlato`, `montoPlato`) VALUES
(1, 'PARRILLA DUO', NULL, 1, 25, 25),
(2, 'BISTEC A LO POBRE', NULL, 2, 30, 60),
(3, 'CHAUFA', NULL, 2, 20, 40),
(4, 'BISTEC A LO POBRE', NULL, 1, 30, 30),
(5, 'PARRILLA DUO', NULL, 1, 25, 25),
(6, 'LOMO SALTADO', NULL, 2, 18, 36),
(7, 'MONSTRITO', NULL, 3, 25, 75),
(8, 'MONSTRITO', NULL, 2, 25, 50),
(9, 'MEDIO POLLO', NULL, 1, 25, 25),
(10, 'CUARTO DE POLLO', NULL, 1, 15, 15),
(184, 'CEVICHE', NULL, 2, 20, 40),
(185, 'LOMO SALTADO', NULL, 3, 30, 90),
(186, 'POLLO A LA BRASA', NULL, 3, 45, 135),
(187, 'BISTEC A LO POBRE', NULL, 3, 30, 90),
(188, 'POLLO A LA BRASA', NULL, 4, 45, 180),
(189, 'POLLO A LA BRASA', NULL, 2, 45, 90),
(190, 'MONSTRITO', NULL, 3, 25, 75),
(191, 'PARRILLA DUO', NULL, 2, 25, 50),
(192, 'POLLO A LA BRASA', NULL, 3, 45, 135),
(193, 'POLLO A LA BRASA', NULL, 2, 45, 90),
(194, 'PARRILLA FAMILIAR', NULL, 1, 55, 55),
(195, 'PARRILLA DUO', NULL, 3, 25, 75),
(196, 'POLLO A LA BRASA', NULL, 2, 45, 90),
(197, 'POLLO A LA BRASA', NULL, 2, 45, 90),
(198, 'PARRILLA FAMILIAR', NULL, 2, 55, 110),
(199, 'POLLO A LA BRASA', NULL, 2, 45, 90);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idusuario` int(11) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `contraseña` longblob NOT NULL,
  `tipoNivel` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `telefono` varchar(11) NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idusuario`, `userName`, `contraseña`, `tipoNivel`, `mail`, `telefono`, `nombre`) VALUES
(1, 'carlos', 0x32303231, 'Administrador', 'ca285543@gmail.com', '903355736', 'Carlos Aquino'),
(2, 'carlos', 0x32303231, 'Administrador', 'ca285543@gmail.com', '903355736', 'Carlos Aquino'),
(3, 'danilo', 0x61646d696e, 'Administrador', 'danilo@gmail.com', '903355736', 'Frank Castro'),
(4, 'markoadm', 0x61646d696e, 'Administrador', 'marko@gmail.com', '982365895', 'Marko Arrunategui'),
(5, 'carlosmsr', 0x6d657365726f, 'Mesero', 'ca285543@gmail.com', '985623658', 'Carlos Aquino'),
(6, 'danilomsr', 0x6d657365726f, 'Mesero', 'frank@gmail.com', '978568953', 'Frank Castro'),
(7, 'markomsr', 0x6e657365726f, 'Mesero', 'marko@gmail.com', '975856325', 'Marko Arrunategui'),
(8, 'josemsr', 0x31323334, 'Mesero', 'cs2@gmail.com', '999999', 'Jose');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`idadministrador`);

--
-- Indices de la tabla `bebidas`
--
ALTER TABLE `bebidas`
  ADD PRIMARY KEY (`idbebidas`);

--
-- Indices de la tabla `bebida_pedido`
--
ALTER TABLE `bebida_pedido`
  ADD PRIMARY KEY (`idbebida_pedido`),
  ADD KEY `idbebidas` (`idbebidas`);

--
-- Indices de la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD PRIMARY KEY (`idboleta`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idclientes`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`idfactura`);

--
-- Indices de la tabla `mesero`
--
ALTER TABLE `mesero`
  ADD PRIMARY KEY (`idmesero`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idpedido`);

--
-- Indices de la tabla `platos`
--
ALTER TABLE `platos`
  ADD PRIMARY KEY (`idplatos`);

--
-- Indices de la tabla `plato_pedido`
--
ALTER TABLE `plato_pedido`
  ADD PRIMARY KEY (`idplato_pedido`),
  ADD KEY `idPlatos` (`idplatos`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administrador`
--
ALTER TABLE `administrador`
  MODIFY `idadministrador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `bebidas`
--
ALTER TABLE `bebidas`
  MODIFY `idbebidas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `bebida_pedido`
--
ALTER TABLE `bebida_pedido`
  MODIFY `idbebida_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=140;

--
-- AUTO_INCREMENT de la tabla `boleta`
--
ALTER TABLE `boleta`
  MODIFY `idboleta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idclientes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `idfactura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `mesero`
--
ALTER TABLE `mesero`
  MODIFY `idmesero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idpedido` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `platos`
--
ALTER TABLE `platos`
  MODIFY `idplatos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `plato_pedido`
--
ALTER TABLE `plato_pedido`
  MODIFY `idplato_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=200;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bebida_pedido`
--
ALTER TABLE `bebida_pedido`
  ADD CONSTRAINT `idbebidas` FOREIGN KEY (`idbebidas`) REFERENCES `bebidas` (`idbebidas`);

--
-- Filtros para la tabla `plato_pedido`
--
ALTER TABLE `plato_pedido`
  ADD CONSTRAINT `idPlatos` FOREIGN KEY (`idplatos`) REFERENCES `platos` (`idplatos`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
