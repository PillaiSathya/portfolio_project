# 🖥️ NGINX-Reverse-Proxy-Setup


1. Basic NGINX Reverse Proxy Concept
NGINX receives requests and forwards them to backend services (frontend, backend, API, etc.).

It hides internal service ports and exposes a single entry point (e.g., port 80 or 8081).

---

## 📁 Project Structure

project-root/
│
├── frontend/
│   └── index.html
├── backend/
│   └── index.html
├── nginx/
│   └── default.conf
├── docker-compose.yml

---

### 🚀 How to Run This Project

3. NGINX Config (nginx/default.conf)

server {
    listen 80;

    location /frontend/ {
        proxy_pass http://frontend:80/;
    }

    location /backend/ {
        proxy_pass http://backend:80/;
    }
}

4. HTML Files

frontend/index.html

<h1>Hello from Frontend</h1>
<p>This is served using Docker + NGINX reverse proxy!</p>

backend/index.html
<h1>Hello from Backend</h1>
<p>This is served using Docker + NGINX reverse proxy!</p>

5. Dockerfiles
Each folder should contain a basic Dockerfile:

Dockerfile

FROM nginx:alpine
COPY . /usr/share/nginx/html

6. Docker Compose (docker-compose.yml)

version: '3'
services:
  frontend:
    build: ./frontend
    container_name: frontend

  backend:
    build: ./backend
    container_name: backend

  reverse-proxy:
    image: nginx:alpine
    container_name: reverse-proxy
    ports:
      - "8081:80"
    volumes:
      - ./nginx/default.conf:/etc/nginx/conf.d/default.conf
    depends_on:
      - frontend
      - backend

7. Run It
bash

docker-compose up --build

output:
Visit in browser:

http://localhost:8081/frontend/

http://localhost:8081/backend/
