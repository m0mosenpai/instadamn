package X;

import java.io.InputStream;

/* loaded from: classes8.dex */
public abstract class JWM {
    public static void A00(C0f6 c0f6, C43601zh c43601zh, C59722oF c59722oF, InputStream inputStream, String str, long j) {
        int i;
        String str2;
        if (c43601zh != null && c43601zh.A01) {
            i = c43601zh.A00;
        } else {
            i = Integer.MAX_VALUE;
        }
        if (j <= i) {
            c59722oF.A02(inputStream);
            return;
        }
        int A07 = AbstractC001900j.A07(str, ".", str.length() - 1);
        if (A07 != -1) {
            str2 = str.substring(A07);
            C14360o3.A07(str2);
        } else {
            str2 = "file_extension_not_found";
        }
        AbstractC107914ta.A00(c0f6, "ERROR_LARGE_FILE", new DHQ(j, str2, 0));
    }
}
