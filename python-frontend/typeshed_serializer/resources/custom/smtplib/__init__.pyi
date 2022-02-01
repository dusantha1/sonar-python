from SonarPythonAnalyzerFakeStub import CustomStubBase

class SMTP(CustomStubBase):
    def sendmail(self, *args, **kwargs) -> None: ...
    def send_message(self, *args, **kwargs) -> None: ...
    def starttls(self, *args, **kwargs) -> None: ...

class SMTP_SSL(SMTP): ...
