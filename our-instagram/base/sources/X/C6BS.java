package X;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.6BS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6BS {
    public static final C6BS A02;
    public final SecureRandom A00 = new SecureRandom();
    public final SecretKey A01;

    static {
        SecretKey secretKey = C6BT.A00;
        A02 = new C6BS(((C6BV) C023409i.A0A.A05(C6BU.A00).A01(C6BV.class, C6BW.A00)).A00);
    }

    public static final String A00(InterfaceC50415MNr interfaceC50415MNr, C6BS c6bs) {
        int i;
        SecretKey secretKey = C6BT.A00;
        if (!C14360o3.A0K(interfaceC50415MNr.Bqb(), "file")) {
            return null;
        }
        try {
            byte[] bArr = new byte[12];
            c6bs.A00.nextBytes(bArr);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, c6bs.A01, ivParameterSpec);
            String obj = interfaceC50415MNr.toString();
            Charset charset = C15W.A05;
            byte[] bytes = obj.getBytes(charset);
            C14360o3.A07(bytes);
            byte[] doFinal = cipher.doFinal(bytes);
            byte[] bArr2 = new byte[2];
            C14360o3.A0B(doFinal, 0);
            Object[] objArr = {bArr, doFinal};
            int i2 = 0;
            char c = 0;
            while (true) {
                Object obj2 = objArr[c];
                if (obj2 != null) {
                    byte[] bArr3 = (byte[]) obj2;
                    C14360o3.A0B(bArr3, 0);
                    i = bArr3.length;
                } else {
                    i = 1;
                }
                i2 += i;
                if (c == 1) {
                    break;
                }
                c = 1;
            }
            byte[] bArr4 = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                Object obj3 = objArr[i3];
                if (obj3 != null) {
                    if (i4 < i3) {
                        int i6 = i3 - i4;
                        System.arraycopy(bArr2, i4, bArr4, i5, i6);
                        i5 += i6;
                    }
                    byte[] bArr5 = (byte[]) obj3;
                    C14360o3.A0B(bArr5, 0);
                    int length = bArr5.length;
                    System.arraycopy(obj3, 0, bArr4, i5, length);
                    i5 += length;
                    i4 = i3 + 1;
                }
                if (i3 == 1) {
                    break;
                }
                i3 = 1;
            }
            if (i4 < 2) {
                System.arraycopy(bArr2, i4, bArr4, i5, 2 - i4);
            }
            byte[] encode = Base64.encode(bArr4, 11);
            C14360o3.A07(encode);
            return AnonymousClass001.A0R("bkfileurl:", AbstractC001900j.A0B(new String(encode, charset)).toString());
        } catch (Exception e) {
            throw new RuntimeException(AnonymousClass001.A0R("Failed to encrypt file path URL: ", e.getMessage()));
        }
    }

    public C6BS(SecretKey secretKey) {
        this.A01 = secretKey;
    }
}
