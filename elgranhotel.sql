-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-10-2023 a las 16:35:11
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `elgranhotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `piso` int(11) DEFAULT NULL,
  `tipoHabitacionCodigo` varchar(10) DEFAULT NULL,
  `disponibilidad` tinyint(1) DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `piso`, `tipoHabitacionCodigo`, `disponibilidad`, `estado`) VALUES
(1, 1, 'S', 0, 1),
(2, 1, 'S', 0, 1),
(3, 1, 'S', 0, 1),
(4, 1, 'S', 0, 1),
(5, 1, 'S', 0, 1),
(6, 1, 'S', 0, 1),
(7, 1, 'S', 0, 1),
(8, 1, 'S', 0, 1),
(9, 1, 'S', 0, 1),
(10, 1, 'S', 0, 1),
(11, 1, 'S', 0, 1),
(12, 1, 'S', 0, 1),
(13, 1, 'S', 0, 1),
(14, 1, 'S', 0, 1),
(15, 1, 'S', 0, 1),
(16, 1, 'S', 0, 1),
(17, 1, 'S', 0, 1),
(18, 1, 'S', 0, 1),
(19, 1, 'S', 0, 1),
(20, 1, 'S', 0, 1),
(21, 1, 'S', 0, 1),
(22, 1, 'S', 0, 1),
(23, 1, 'S', 0, 1),
(24, 1, 'S', 0, 1),
(25, 1, 'S', 0, 1),
(26, 1, 'DQ', 0, 1),
(27, 1, 'DQ', 0, 1),
(28, 1, 'DQ', 0, 1),
(29, 1, 'DQ', 0, 1),
(30, 1, 'DQ', 0, 1),
(31, 1, 'DQ', 0, 1),
(32, 1, 'DQ', 0, 1),
(33, 1, 'DQ', 0, 1),
(34, 1, 'DQ', 0, 1),
(35, 1, 'DQ', 0, 1),
(36, 1, 'DQ', 0, 1),
(37, 1, 'DQ', 0, 1),
(38, 1, 'DQ', 0, 1),
(39, 1, 'DQ', 0, 1),
(40, 1, 'DQ', 0, 1),
(41, 1, 'DQ', 0, 1),
(42, 1, 'DQ', 0, 1),
(43, 1, 'DQ', 0, 1),
(44, 1, 'DQ', 0, 1),
(45, 1, 'DQ', 0, 1),
(46, 1, 'DQ', 0, 1),
(47, 1, 'DQ', 0, 1),
(48, 1, 'DQ', 0, 1),
(49, 1, 'DQ', 0, 1),
(50, 1, 'DQ', 0, 1),
(51, 2, 'DS', 0, 1),
(52, 2, 'DS', 0, 1),
(53, 2, 'DS', 0, 1),
(54, 2, 'DS', 0, 1),
(55, 2, 'DS', 0, 1),
(56, 2, 'DS', 0, 1),
(57, 2, 'DS', 0, 1),
(58, 2, 'DS', 0, 1),
(59, 2, 'DS', 0, 1),
(60, 2, 'DS', 0, 1),
(61, 2, 'DS', 0, 1),
(62, 2, 'DS', 0, 1),
(63, 2, 'DS', 0, 1),
(64, 2, 'DS', 0, 1),
(65, 2, 'DS', 0, 1),
(66, 2, 'DS', 0, 1),
(67, 2, 'DS', 0, 1),
(68, 2, 'DS', 0, 1),
(69, 2, 'DS', 0, 1),
(70, 2, 'DS', 0, 1),
(71, 2, 'DS', 0, 1),
(72, 2, 'DS', 0, 1),
(73, 2, 'DS', 0, 1),
(74, 2, 'DS', 0, 1),
(75, 2, 'DS', 0, 1),
(76, 2, 'TS', 0, 1),
(77, 2, 'TS', 0, 1),
(78, 2, 'TS', 0, 1),
(79, 2, 'TS', 0, 1),
(80, 2, 'TS', 0, 1),
(81, 2, 'TS', 0, 1),
(82, 2, 'TS', 0, 1),
(83, 2, 'TS', 0, 1),
(84, 2, 'TS', 0, 1),
(85, 2, 'TS', 0, 1),
(86, 2, 'TS', 0, 1),
(87, 2, 'TS', 0, 1),
(88, 2, 'TS', 0, 1),
(89, 2, 'TS', 0, 1),
(90, 2, 'TS', 0, 1),
(91, 2, 'TS', 0, 1),
(92, 2, 'TS', 0, 1),
(93, 2, 'TS', 0, 1),
(94, 2, 'TS', 0, 1),
(95, 2, 'TS', 0, 1),
(96, 2, 'TS', 0, 1),
(97, 2, 'TS', 0, 1),
(98, 2, 'TS', 0, 1),
(99, 2, 'TS', 0, 1),
(100, 2, 'TS', 0, 1),
(101, 3, 'TSQ', 0, 1),
(102, 3, 'TSQ', 0, 1),
(103, 3, 'TSQ', 0, 1),
(104, 3, 'TSQ', 0, 1),
(105, 3, 'TSQ', 0, 1),
(106, 3, 'TSQ', 0, 1),
(107, 3, 'TSQ', 0, 1),
(108, 3, 'TSQ', 0, 1),
(109, 3, 'TSQ', 0, 1),
(110, 3, 'TSQ', 0, 1),
(111, 3, 'TSQ', 0, 1),
(112, 3, 'TSQ', 0, 1),
(113, 3, 'TSQ', 0, 1),
(114, 3, 'TSQ', 0, 1),
(115, 3, 'TSQ', 0, 1),
(116, 3, 'TSQ', 0, 1),
(117, 3, 'TSQ', 0, 1),
(118, 3, 'TSQ', 0, 1),
(119, 3, 'TSQ', 0, 1),
(120, 3, 'TSQ', 0, 1),
(121, 3, 'TSQ', 0, 1),
(122, 3, 'TSQ', 0, 1),
(123, 3, 'TSQ', 0, 1),
(124, 3, 'TSQ', 0, 1),
(125, 3, 'TSQ', 0, 1),
(126, 3, 'C2SQ', 0, 1),
(127, 3, 'C2SQ', 0, 1),
(128, 3, 'C2SQ', 0, 1),
(129, 3, 'C2SQ', 0, 1),
(130, 3, 'C2SQ', 0, 1),
(131, 3, 'C2SQ', 0, 1),
(132, 3, 'C2SQ', 0, 1),
(133, 3, 'C2SQ', 0, 1),
(134, 3, 'C2SQ', 0, 1),
(135, 3, 'C2SQ', 0, 1),
(136, 3, 'C2SQ', 0, 1),
(137, 3, 'C2SQ', 0, 1),
(138, 3, 'C2SQ', 0, 1),
(139, 3, 'C2SQ', 0, 1),
(140, 3, 'C2SQ', 0, 1),
(141, 3, 'C2SQ', 0, 1),
(142, 3, 'C2SQ', 0, 1),
(143, 3, 'C2SQ', 0, 1),
(144, 3, 'C2SQ', 0, 1),
(145, 3, 'C2SQ', 0, 1),
(146, 3, 'C2SQ', 0, 1),
(147, 3, 'C2SQ', 0, 1),
(148, 3, 'C2SQ', 0, 1),
(149, 3, 'C2SQ', 0, 1),
(150, 3, 'C2SQ', 0, 1),
(151, 4, 'CS', 0, 1),
(152, 4, 'CS', 0, 1),
(153, 4, 'CS', 0, 1),
(154, 4, 'CS', 0, 1),
(155, 4, 'CS', 0, 1),
(156, 4, 'CS', 0, 1),
(157, 4, 'CS', 0, 1),
(158, 4, 'CS', 0, 1),
(159, 4, 'CS', 0, 1),
(160, 4, 'CS', 0, 1),
(161, 4, 'CS', 0, 1),
(162, 4, 'CS', 0, 1),
(163, 4, 'CS', 0, 1),
(164, 4, 'CS', 0, 1),
(165, 4, 'CS', 0, 1),
(166, 4, 'CS', 0, 1),
(167, 4, 'CS', 0, 1),
(168, 4, 'CS', 0, 1),
(169, 4, 'CS', 0, 1),
(170, 4, 'CS', 0, 1),
(171, 4, 'CS', 0, 1),
(172, 4, 'CS', 0, 1),
(173, 4, 'CS', 0, 1),
(174, 4, 'CS', 0, 1),
(175, 4, 'CS', 0, 1),
(176, 4, 'S', 0, 1),
(177, 4, 'S', 0, 1),
(178, 4, 'S', 0, 1),
(179, 4, 'S', 0, 1),
(180, 4, 'S', 0, 1),
(181, 4, 'S', 0, 1),
(182, 4, 'S', 0, 1),
(183, 4, 'S', 0, 1),
(184, 4, 'S', 0, 1),
(185, 4, 'S', 0, 1),
(186, 4, 'DQ', 0, 1),
(187, 4, 'DQ', 0, 1),
(188, 4, 'DQ', 0, 1),
(189, 4, 'DQ', 0, 1),
(190, 4, 'DQ', 0, 1),
(191, 5, 'SL', 0, 1),
(192, 5, 'SL', 0, 1),
(193, 5, 'SL', 0, 1),
(194, 5, 'SL', 0, 1),
(195, 5, 'SL', 0, 1),
(196, 5, 'SL', 0, 1),
(197, 5, 'SL', 0, 1),
(198, 5, 'SL', 0, 1),
(199, 5, 'SL', 0, 1),
(200, 5, 'SL', 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `dni` int(11) DEFAULT NULL,
  `correo` varchar(60) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `domicilio` varchar(60) DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `nombre`, `dni`, `correo`, `celular`, `domicilio`, `estado`) VALUES
(1, 'Cristian March', 12345689, 'correofalso@falsomail.com', '1123456789', 'Calle Falsa 123', 1),
(2, 'Aldana Alvarez', 11111111, 'mailfalso@falsomail.com', '1523649874', 'Calle Verdadera 333', 1),
(3, 'Leo Huari', 87654321, 'correoverdadero@falsomail.com', '1123456711', 'Calle Falsa 123', 1),
(6, 'Persona Falsa', 22222222, 'correonormal@falsomail.com', '1523446789', 'Calle Falsa 123', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `idReservas` int(11) NOT NULL,
  `idHuesped` int(11) DEFAULT NULL,
  `idHabitacion` int(11) DEFAULT NULL,
  `cantPersona` int(11) DEFAULT NULL,
  `fechaEntrada` date DEFAULT NULL,
  `fechaSalida` date DEFAULT NULL,
  `importe` double DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipohabitacion`
--

CREATE TABLE `tipohabitacion` (
  `codigo` varchar(10) NOT NULL,
  `cantidadPersonas` int(11) DEFAULT NULL,
  `cantidadCamas` int(11) DEFAULT NULL,
  `tipoCamas` varchar(20) DEFAULT NULL,
  `precio` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipohabitacion`
--

INSERT INTO `tipohabitacion` (`codigo`, `cantidadPersonas`, `cantidadCamas`, `tipoCamas`, `precio`) VALUES
('C2SQ', 4, 3, 'Simple y Queen', 50.5),
('CS', 4, 4, 'Simple', 50.5),
('DQ', 2, 1, 'Queen', 30.5),
('DS', 2, 2, 'Simple', 30.5),
('S', 1, 1, 'Simple', 20.5),
('SL', 2, 1, 'KING SIZE', 200.5),
('TS', 3, 3, 'Simple', 40.5),
('TSQ', 3, 2, 'Simple y Queen', 40.5);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`),
  ADD KEY `tipoHabitacionCodigo` (`tipoHabitacionCodigo`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD UNIQUE KEY `correo` (`correo`),
  ADD UNIQUE KEY `celular` (`celular`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`idReservas`),
  ADD KEY `idHuesped` (`idHuesped`),
  ADD KEY `idHabitacion` (`idHabitacion`);

--
-- Indices de la tabla `tipohabitacion`
--
ALTER TABLE `tipohabitacion`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `idReservas` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD CONSTRAINT `habitacion_ibfk_1` FOREIGN KEY (`tipoHabitacionCodigo`) REFERENCES `tipohabitacion` (`codigo`);

--
-- Filtros para la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`),
  ADD CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
