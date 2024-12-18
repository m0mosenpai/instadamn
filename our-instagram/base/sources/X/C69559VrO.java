package X;

import java.security.KeyStore;
import java.security.PublicKey;

/* renamed from: X.VrO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69559VrO {
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(new X2z(this, 28));
    public final boolean A01;

    public final PublicKey A00(String str) {
        C14360o3.A0B(str, 0);
        try {
            KeyStore.Entry A01 = ((C53E) this.A00.getValue()).A00.A01(str);
            try {
                if (A01 instanceof KeyStore.PrivateKeyEntry) {
                    PublicKey publicKey = ((KeyStore.PrivateKeyEntry) A01).getCertificate().getPublicKey();
                    C14360o3.A07(publicKey);
                    return publicKey;
                }
                throw new IllegalStateException(AbstractC111324zv.A00(3503));
            } catch (IllegalArgumentException | IllegalStateException e) {
                throw new Exception(AnonymousClass001.A0g("Unable to get key (keyName=", str, ")"), e);
            }
        } catch (C53391Njg e2) {
            throw new Exception("Failed to retrieve public key", e2);
        }
    }

    public C69559VrO(boolean z) {
        this.A01 = z;
    }
}
