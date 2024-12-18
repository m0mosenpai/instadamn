package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.15U, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C15U {
    public static final int[] A00(String... strArr) {
        FileInputStream fileInputStream;
        long size;
        byte[] A01;
        String str;
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = -1;
        }
        C0s6 A00 = AbstractC13190m5.A00(new File("/proc/self/task/").list());
        int i2 = 0;
        while (A00.hasNext()) {
            String str2 = (String) A00.next();
            if (length <= i2) {
                break;
            }
            try {
                FileInputStream fileInputStream2 = null;
                try {
                    fileInputStream = new FileInputStream(new File(AnonymousClass001.A0g("/proc/self/task/", str2, "/stat")));
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    size = fileInputStream.getChannel().size();
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    throw th;
                    break;
                }
            } catch (IOException unused) {
            }
            if (size <= 2147483647L) {
                if (size == 0) {
                    A01 = C15V.A00(fileInputStream);
                } else {
                    A01 = C15V.A01(fileInputStream, (int) size);
                }
                fileInputStream.close();
                C14360o3.A07(A01);
                String[] strArr2 = (String[]) new C11L(" ").A03(new String(A01, C15W.A05)).toArray(new String[0]);
                if (strArr2.length < 2 || (str = strArr2[1]) == null) {
                    str = null;
                }
                if (str != null) {
                    for (int i3 = 0; i3 < length; i3++) {
                        try {
                            if (iArr[i3] == -1 && str.equals(strArr[i3])) {
                                C14360o3.A0A(str2);
                                iArr[i3] = Integer.parseInt(str2);
                                i2++;
                            }
                        } catch (NumberFormatException unused2) {
                        }
                    }
                }
            } else {
                throw new OutOfMemoryError(AnonymousClass001.A0e("file is too large to fit in a byte array: ", " bytes", size));
                break;
            }
        }
        return iArr;
    }
}
