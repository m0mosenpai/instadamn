package X;

import android.util.Base64;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.6BX, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6BX {
    public static final android.net.Uri A00(android.net.Uri uri) {
        C14360o3.A0B(uri, 0);
        String A00 = C6BS.A00(new C63721Ssb(uri), C6BS.A02);
        if (A00 != null) {
            android.net.Uri A03 = AbstractC08820cl.A03(A00);
            C14360o3.A07(A03);
            return A03;
        }
        return uri;
    }

    public static final android.net.Uri A01(android.net.Uri uri, boolean z) {
        C14360o3.A0B(uri, 0);
        C6BS c6bs = C6BS.A02;
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        C14360o3.A07(schemeSpecificPart);
        uri.getPath();
        SecretKey secretKey = C6BT.A00;
        String str = null;
        if (C14360o3.A0K(scheme, "file")) {
            if (z) {
                AbstractC25241Le.A02("BloksFilePathSecurityFailure", "[BKFileURLObfuscation] Unexpected file URI encountered, expected bkfileurl or other scheme. ");
                throw new RuntimeException("Unexpected file URI encountered, expected bkfileurl or other scheme. ");
            }
        } else if (C14360o3.A0K(scheme, "bkfileurl")) {
            try {
                Charset charset = C15W.A05;
                byte[] bytes = schemeSpecificPart.getBytes(charset);
                C14360o3.A07(bytes);
                byte[] decode = Base64.decode(bytes, 9);
                C14360o3.A0A(decode);
                byte[] A0v = AbstractC001800i.A0v(AbstractC009903n.A0B(new C17u(0, 11), decode));
                byte[] A0v2 = AbstractC001800i.A0v(AbstractC009903n.A0B(C17s.A0C(12, decode.length), decode));
                IvParameterSpec ivParameterSpec = new IvParameterSpec(A0v);
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, c6bs.A01, ivParameterSpec);
                byte[] doFinal = cipher.doFinal(A0v2);
                C14360o3.A07(doFinal);
                str = new String(doFinal, charset);
            } catch (Exception e) {
                throw new RuntimeException(AnonymousClass001.A0R("Failed to decrypt encrypted file path URL: ", e.getMessage()));
            }
        }
        if (str != null) {
            android.net.Uri A03 = AbstractC08820cl.A03(str);
            C14360o3.A07(A03);
            return A03;
        }
        return uri;
    }
}
