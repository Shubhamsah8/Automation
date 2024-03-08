; Activate the application window
WinActivate("Window Title", "Open")

; Wait for the window to be active
WinWaitActive("Window Title", "Open", 10)


; Wait for the file selection dialog to appear
WinWaitActive("File Upload", "", 10)

; Navigate to the desired location
Send("C:\Users\RYZEN\Downloads")
Send("{ENTER}")

WinWaitActive("Window Title", "Open", 10)

ControlCommand("Window Title", "Open", "[CLASS:ComboBox; INSTANCE:2]", "SelectString", "All Files (*.*)")

ControlSetText("Window Title", "Open", "[CLASS:Edit; INSTANCE:1]", "C:\Users\RYZEN\Downloads\bill.pdf")