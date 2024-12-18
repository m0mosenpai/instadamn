package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.SeJ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63161SeJ {
    public final SAJ A00;

    public final File A02(EnumC61208Rh8 enumC61208Rh8, InputStream inputStream, String str) {
        File A0w = MSW.A0w(A00(this), A01(enumC61208Rh8, str, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(A0w);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        return A0w;
                    }
                }
            } finally {
                fileOutputStream.close();
            }
        } finally {
            inputStream.close();
        }
    }

    public static File A00(C63161SeJ c63161SeJ) {
        File A0w = MSW.A0w(c63161SeJ.A00.A00.getCacheDir(), "lottie_network_cache");
        if (A0w.isFile()) {
            A0w.delete();
        }
        if (!A0w.exists()) {
            A0w.mkdirs();
        }
        return A0w;
    }

    public static String A01(EnumC61208Rh8 enumC61208Rh8, String str, boolean z) {
        String str2;
        if (z) {
            str2 = AnonymousClass001.A0R(".temp", enumC61208Rh8.A00);
        } else {
            str2 = enumC61208Rh8.A00;
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder A1C = AbstractC166987dD.A1C();
                for (byte b : digest) {
                    A1C.append(String.format("%02x", Byte.valueOf(b)));
                }
                replaceAll = A1C.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return AnonymousClass001.A0g("lottie_cache_", replaceAll, str2);
    }

    public C63161SeJ(SAJ saj) {
        this.A00 = saj;
    }
}
