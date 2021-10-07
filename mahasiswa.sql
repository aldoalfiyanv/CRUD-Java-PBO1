-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 09 Jan 2020 pada 09.36
-- Versi Server: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mahasiswa`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_nilai`
--

CREATE TABLE `tb_nilai` (
  `nim` int(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `semester` varchar(5) NOT NULL,
  `prodi` varchar(20) NOT NULL,
  `nilai_absen` int(5) NOT NULL,
  `nilai_tugas` int(5) NOT NULL,
  `nilai_uts` int(5) NOT NULL,
  `nilai_uas` int(5) NOT NULL,
  `rata_rata` int(5) NOT NULL,
  `grade` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_nilai`
--

INSERT INTO `tb_nilai` (`nim`, `nama`, `semester`, `prodi`, `nilai_absen`, `nilai_tugas`, `nilai_uts`, `nilai_uas`, `rata_rata`, `grade`) VALUES
(18040119, 'NAUFAL ZIDAN A', 'III', 'TEKNIK KOMPUTER', 80, 65, 66, 66, 77, 'B'),
(18040122, 'AFIF MAULANA', 'IV', 'TEKNIK KOMPUTER', 66, 80, 77, 80, 90, 'A'),
(18040129, 'ADE UKI RIYANTO', 'III', 'TEKNIK KOMPUTER', 90, 67, 81, 66, 82, 'A'),
(18040143, 'ALDO ALFIYAN V', 'IV', 'TEKNIK KOMPUTER', 99, 80, 90, 85, 98, 'A');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_nilai`
--
ALTER TABLE `tb_nilai`
  ADD PRIMARY KEY (`nim`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
