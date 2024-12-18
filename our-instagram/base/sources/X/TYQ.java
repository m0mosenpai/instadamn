package X;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes10.dex */
public final class TYQ extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        try {
            Cipher cipher = (Cipher) InterfaceC65621ToC.A00(C62890SVv.A01, "AES/GCM-SIV/NoPadding");
            boolean z = false;
            try {
                byte[] bArr = T8V.A05;
                cipher.init(2, AbstractC58318PtA.A16("AES", T8V.A04), new GCMParameterSpec(128, bArr, 0, bArr.length));
                cipher.updateAAD(T8V.A03);
                byte[] bArr2 = T8V.A07;
                z = MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), T8V.A06);
            } catch (GeneralSecurityException unused) {
            }
            if (!z) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
