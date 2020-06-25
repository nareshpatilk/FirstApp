echo "Stopping Container"
docker-compose down firstapp
sleep 5
echo "Building"
docker-compose build --no-cache firstapp
sleep 5
echo "Starting Container"
docker-compose up -d firstapp