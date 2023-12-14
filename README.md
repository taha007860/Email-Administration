# 📧 Email Application

Welcome to the Email Application, a powerful tool designed to simplify the process of creating email accounts for new hires. As an IT Support Administrator Specialist, your role involves generating email accounts with specific syntax, managing department assignments, creating secure passwords, and providing methods for further customization.

## Application Features:

### 1. 🚀 Email Generation:
The application automatically generates an email address with the following syntax: `firstname.lastname@department.company.com`

### 2. 🏢 Department Assignment:
The application determines the department (sales, development, accounting) based on user input. If no department is specified, the field remains blank.

### 3. 🔐 Random Password Generation:
A random string is generated for the initial password to ensure security.

### 4. 🛠 Customization Methods:
#### a. 🔒 Change Password:
Use the `setPassword()` method to change the password associated with the email account.

#### b. 📦 Set Mailbox Capacity:
Utilize the `setMailboxCapacity()` method to define the mailbox capacity for each user.

#### c. 📧 Define Alternate Email Address:
The `setAlternateEmail()` method allows you to set an alternate email address for account recovery.

### 5. 📚 Information Retrieval Methods:
#### a. 🧑‍💼 Get Name:
Retrieve the user's name using the `getName()` method.

#### b. 📧 Get Email:
Obtain the user's email address with the `getEmail()` method.

#### c. 📥 Get Mailbox Capacity:
Retrieve the mailbox capacity using the `getMailboxCapacity()` method.
