package X;

import java.security.InvalidAlgorithmParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes10.dex */
public abstract class SXr {
    public static final EnumC61189Rgp A01 = EnumC61189Rgp.AES128GCM;
    public static final EnumC61189Rgp A02 = EnumC61189Rgp.AES256GCM;
    public final int A00;

    public final byte[] A00(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.A00) {
            int length2 = bArr2.length;
            EnumC61189Rgp enumC61189Rgp = A02;
            if (length2 == enumC61189Rgp.A01) {
                SecretKeySpec A16 = AbstractC58318PtA.A16("AES", bArr);
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(enumC61189Rgp.A02 * 8, bArr2);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, A16, gCMParameterSpec);
                cipher.updateAAD(bArr3);
                return cipher.doFinal(bArr4);
            }
            throw new InvalidAlgorithmParameterException(AnonymousClass001.A0O("Nonce has invalid length: ", length2));
        }
        throw new InvalidAlgorithmParameterException(AnonymousClass001.A0O("Key has invalid length: ", length));
    }

    public SXr(int i) {
        if (i != A01.A00 && i != A02.A00) {
            throw new Exception(AnonymousClass001.A0O("Unsupported key length: ", i));
        }
        this.A00 = i;
    }
}
