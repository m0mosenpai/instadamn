package X;

import com.facebook.common.dextricks.Constants;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class S1Z {
    public static void A00(FileOutputStream fileOutputStream, InputStream inputStream, String str) {
        if (inputStream != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                    if (fileOutputStream != null) {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                String A01 = C0JT.A01(messageDigest.digest());
                if (str.equals(A01)) {
                    return;
                } else {
                    throw new IOException(String.format(Locale.US, "App module actual hash %s does not match expected hash %s", A01, str));
                }
            } catch (NoSuchAlgorithmException e) {
                throw AbstractC58318PtA.A0f(e);
            }
        }
        throw new IOException("Stream data is null");
    }
}
