@echo off
echo -------------------------------- Building ExtrabiomesXL -----------------------------------
echo Backing up src
XCOPY src src-bak /E /I /Q
echo.
echo Copying source 
XCOPY extrabiomes\src src\common /E /Q
echo.
call recompile.bat
call reobfuscate.bat
echo.
echo Adding release assets
XCOPY extrabiomes\*.txt reobf\minecraft /Q
XCOPY extrabiomes\mcmod.info reobf\minecraft /Q
XCOPY extrabiomes\src\extrabiomes\*.png reobf\minecraft\extrabiomes /E /Q
echo.
echo Restoring src-bak
RMDIR /S /Q src
PAUSE
REN src-bak src
PAUSE
