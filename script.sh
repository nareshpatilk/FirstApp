echo "Stopping Container"
docker-compose -p firstapp down
sleep 5
echo "Building"
docker-compose build -no-cache
sleep 5
echo "Starting Container"
docker-compose -p firstapp up -d