## ✅ Jenkins Maven Job: TEST FOR MAVEN RECOG

### 🎯 Goal:
Automate a Maven Java project's lifecycle using Jenkins: 
Clone → Build → Test → Package → Archive

---

### 📂 Jenkins Job Details:
- **Job Name**: `TEST FOR MAVEN RECOG`
- **Build Triggered By**: Manual (User: PILLAI SATHYA SUDALAI)
- **Node**: Built-in Jenkins node
- **Git Repository**: [portfolio_project](https://github.com/PillaiSathya/portfolio_project.git)
- **Branch**: `master`

---

### 🔧 Build Commands:
```bash
cd docker_project/portfolio_project
mvn clean package

🧪 Test Results:
Tests Run: 1

Failures: 0

Skipped: 0

Class: HelloWorldTest

Output: Test is running...

📦 Build Artifacts:
target/portfolio_project-1.0-SNAPSHOT.jar successfully created

Artifacts archived in Jenkins for download and deployment

✅ Final Result:

BUILD SUCCESS

📅 Build Timestamp:
2025-05-31 @ 23:13 GST
