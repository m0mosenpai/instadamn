package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.T8w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64313T8w implements InterfaceC65550TmT {
    public final int A00;

    @Override // X.InterfaceC65550TmT
    public final byte[] EMX(byte[] key, byte[] nonce, byte[] plaintext, byte[] associatedData) {
        int length = key.length;
        if (length == this.A00) {
            if (AbstractC62863SUk.A00.A00()) {
                AbstractC58563Pxf.A01(length);
                SecretKeySpec A16 = AbstractC58318PtA.A16("AES", key);
                if (nonce.length == 12) {
                    if (plaintext.length <= 2147483619) {
                        AlgorithmParameterSpec A00 = AbstractC62863SUk.A00(nonce);
                        ThreadLocal threadLocal = AbstractC62863SUk.A01;
                        ((Cipher) threadLocal.get()).init(1, A16, A00);
                        return ((Cipher) threadLocal.get()).doFinal(plaintext);
                    }
                    throw AbstractC58318PtA.A0x("plaintext too long");
                }
                throw AbstractC58318PtA.A0x("iv is wrong size");
            }
            throw AbstractC58318PtA.A0x("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        throw new InvalidAlgorithmParameterException(AnonymousClass001.A0O("Unexpected key length: ", length));
    }

    @Override // X.InterfaceC65550TmT
    public final byte[] AaK() {
        int i = this.A00;
        if (i != 16) {
            if (i == 32) {
                return AbstractC63126SdU.A01;
            }
            throw AbstractC58318PtA.A0x("Could not determine HPKE AEAD ID");
        }
        return AbstractC63126SdU.A00;
    }

    @Override // X.InterfaceC65550TmT
    public final int BKj() {
        return this.A00;
    }

    public C64313T8w(int keyLength) {
        if (keyLength != 16 && keyLength != 32) {
            throw new InvalidAlgorithmParameterException(AnonymousClass001.A0O("Unsupported key length: ", keyLength));
        }
        this.A00 = keyLength;
    }
}
