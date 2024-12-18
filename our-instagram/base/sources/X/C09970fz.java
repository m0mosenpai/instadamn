package X;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0fz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09970fz {
    public final C09960fy A00;
    public final File A01;

    public final C27411Uu A01(String str, String str2) {
        File file = this.A01;
        if (str2 == null) {
            str2 = "0";
        }
        return new C27411Uu(this.A00, new File(file, AnonymousClass001.A0g(str, "_", str2)), false);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0fy, X.11N] */
    public C09970fz(Context context) {
        File A00 = C0eS.A00(context, 211429074);
        this.A01 = A00;
        try {
            this.A00 = new C11N(A00.getCanonicalPath());
        } catch (IOException unused) {
            throw new SecurityException("Cannot resolve the canonical path of the module's root dir.");
        }
    }

    public static void A00(File file) {
        if (file.isDirectory()) {
            file.setWritable(true);
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    A00(file2);
                }
            }
        }
        file.delete();
    }

    public final File A02(Context context, String str, String str2) {
        File A00;
        if (AbstractC10000gD.A01(context, str) && (A00 = AbstractC10000gD.A00(context, str)) != null) {
            return A00;
        }
        return A03(str, str2);
    }

    public final File A03(String str, String str2) {
        return new C27411Uu(this.A00, new File(A01(str, str2), "download.zip"), false);
    }
}
