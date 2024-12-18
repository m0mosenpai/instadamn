package X;

import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.NzM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54302NzM {
    public static final boolean A00(File file) {
        if (file.exists()) {
            byte[] bArr = new byte[2];
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                boolean z = false;
                if (fileInputStream.read(bArr) == 2) {
                    if ((bArr[0] & 255) == 31) {
                        if ((bArr[1] & 255) == 139) {
                            z = true;
                        }
                    }
                    fileInputStream.close();
                    return z;
                }
                fileInputStream.close();
                return false;
            } finally {
            }
        } else {
            throw MSY.A0X("File does not exist: ", file.getAbsolutePath());
        }
    }
}
