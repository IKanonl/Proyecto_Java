@echo off
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
REM Universidad de los Andes (Bogot� - Colombia)
REM Departamento de Ingenier�a de Sistemas y Computaci�n 
REM Licenciado bajo el esquema Academic Free License version 2.1 
REM
REM Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
REM Ejercicio: n1_alquilerCarros
REM Autor: Kelvin Guerrero - 06-feb-2013
REM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

SET CLASSPATH=

REM ---------------------------------------------------------
REM Asegura la creaci�n de los directorios classes y lib
REM ---------------------------------------------------------

cd ../../
mkdir classes
mkdir lib

REM ---------------------------------------------------------
REM Compila las clases del directorio source
REM ---------------------------------------------------------


cd source
javac -source 1.5 -nowarn -d ../classes/ uniandes/cupi2/alquilerCarros/mundo/*.java
javac -source 1.5 -nowarn -d ../classes/ uniandes/cupi2/alquilerCarros/interfaz/*.java

REM ---------------------------------------------------------
REM Crea el archivo jar a partir de los archivos compilados
REM ---------------------------------------------------------

cd ../classes
jar cf ../lib/alquilerCarros.jar uniandes/*

cd ../bin/win

pause
