package X;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes10.dex */
public final class TYO extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        try {
            Cipher cipher = (Cipher) InterfaceC65621ToC.A00(C62890SVv.A01, "ChaCha20-Poly1305");
            ThreadLocal threadLocal = T8U.A02;
            boolean z = false;
            try {
                IvParameterSpec ivParameterSpec = new IvParameterSpec(T8U.A05);
                byte[] bArr = T8U.A04;
                cipher.init(2, AbstractC58318PtA.A16("ChaCha20", bArr), ivParameterSpec);
                byte[] bArr2 = T8U.A03;
                if (cipher.doFinal(bArr2).length == 0) {
                    cipher.init(2, AbstractC58318PtA.A16("ChaCha20", bArr), ivParameterSpec);
                    if (cipher.doFinal(bArr2).length == 0) {
                        z = true;
                    }
                }
            } catch (GeneralSecurityException unused) {
            }
            if (z) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused2) {
            return null;
        }
    }
}
