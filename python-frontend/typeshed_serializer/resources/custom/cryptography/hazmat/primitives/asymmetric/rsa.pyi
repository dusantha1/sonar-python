from SonarPythonAnalyzerFakeStub import CustomStubBase

from typing import Any

class RSAPublicKey(CustomStubBase):
    def encrypt(self, *args, **kwargs) -> Any: ...

class RSAPrivateKey(CustomStubBase):
    def decrypt(self, *args, **kwargs) -> Any: ...
    def public_key(self, *args, **kwargs) -> RSAPublicKey: ...

def generate_private_key(self, *args, **kwargs) -> RSAPrivateKey: ...
