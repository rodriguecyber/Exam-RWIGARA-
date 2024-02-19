-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 10:15 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `regno` int(9) NOT NULL,
  `Nationalid` int(100) DEFAULT NULL,
  `Campus` varchar(50) NOT NULL,
  `Department` varchar(50) NOT NULL,
  `College` varchar(50) NOT NULL,
  `Pin` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`firstname`, `lastname`, `regno`, `Nationalid`, `Campus`, `Department`, `College`, `Pin`) VALUES
('Rodrigue', 'RWIGARA', 222003167, 2147483647, 'GIKONDO', 'BIT', 'CBE', 20055),
('BAGABO', 'Frank', 1236678, 12345, 'HUYE', 'BIT', 'cbe', 123),
('ISHIMWE', 'Michel', 289, 789032, 'busogo', 'bit', 'cbe', 1234),
('MUCYO', 'papy', 2220043, 12345, 'gikondo', 'bit', 'cbe', 123),
('MUCYO', 'PAPY', 12345678, 12345678, 'GIKONDO', 'BIT', 'CBE', 123),
('tresor', 'kamanzi', 111111, 2222222, 'busogo', 'bit', 'ce', 1111),
('Enter lastname', 'Enter firstname', 111, 111, 'Enter Campus', 'Enter Your Department', 'Enter College', 111),
('hertier', 'ishimwe', 123456789, 12345, 'rusizi', 'when', 'gh', 12),
('Enter lastname', 'Enter firstname', 111, 111, 'Enter Campus', 'Enter Your Department', 'Enter College', 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
