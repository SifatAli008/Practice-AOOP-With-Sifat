@echo off
echo ========================================
echo Week 1 Practice - Build and Run Script
echo ========================================
echo.

REM Check if Java is installed
java -version >nul 2>&1
if %errorlevel% neq 0 (
    echo ERROR: Java is not installed or not in PATH
    echo Please install Java and try again
    pause
    exit /b 1
)

echo Java is installed. Proceeding with build...
echo.

REM Create bin directory if it doesn't exist
if not exist "bin" mkdir bin

REM Compile all Java files
echo Compiling Java files...
javac -d bin src/*.java

if %errorlevel% neq 0 (
    echo ERROR: Compilation failed
    pause
    exit /b 1
)

echo Compilation successful!
echo.

REM Run the main program
echo Running Week 1 Practice Demo...
echo ========================================
java -cp bin Main

echo.
echo ========================================
echo Program execution completed
echo ========================================
pause 