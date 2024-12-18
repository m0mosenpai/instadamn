package X;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.T8v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64312T8v implements InterfaceC65550TmT {
    @Override // X.InterfaceC65550TmT
    public final int BKj() {
        return 32;
    }

    @Override // X.InterfaceC65550TmT
    public final byte[] EMX(byte[] key, byte[] nonce, byte[] plaintext, byte[] associatedData) {
        if (key.length == 32) {
            EnumC61068Rei enumC61068Rei = AbstractC62330S7a.A00;
            ThreadLocal threadLocal = T8U.A02;
            if (threadLocal.get() != null) {
                if (AbstractC62330S7a.A00.A00()) {
                    if (threadLocal.get() != null) {
                        SecretKeySpec A16 = AbstractC58318PtA.A16("ChaCha20", key);
                        if (nonce.length == 12) {
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(nonce);
                            Cipher cipher = (Cipher) threadLocal.get();
                            cipher.init(1, A16, ivParameterSpec);
                            return cipher.doFinal(plaintext);
                        }
                        throw AbstractC58318PtA.A0x("nonce length must be 12 bytes.");
                    }
                    throw AbstractC58318PtA.A0x("JCE does not support algorithm: ChaCha20-Poly1305");
                }
                throw AbstractC58318PtA.A0x("Can not use ChaCha20Poly1305 in FIPS-mode.");
            }
            AbstractC63189Ser abstractC63189Ser = new AbstractC63189Ser(key);
            int length = plaintext.length;
            if (length <= 2147483631) {
                ByteBuffer allocate = ByteBuffer.allocate(length + 16);
                abstractC63189Ser.A01(allocate, nonce, plaintext, associatedData);
                return allocate.array();
            }
            throw AbstractC58318PtA.A0x("plaintext too long");
        }
        throw new InvalidAlgorithmParameterException(AnonymousClass001.A0O("Unexpected key length: ", 32));
    }

    @Override // X.InterfaceC65550TmT
    public final byte[] AaK() {
        return AbstractC63126SdU.A04;
    }
}
