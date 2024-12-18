package X;

import android.net.Uri;

/* loaded from: classes8.dex */
public abstract class LHB {
    public static final android.net.Uri A00(String str, String str2, long j) {
        Uri.Builder appendPath = AbstractC08820cl.A03(AbstractC111324zv.A00(841)).buildUpon().appendPath(String.valueOf(j));
        if (str != null) {
            appendPath.appendPath(str);
        }
        if (str2 != null) {
            appendPath.appendPath(str2);
        }
        android.net.Uri build = appendPath.build();
        C14360o3.A07(build);
        return build;
    }

    public static final String A01(String str) {
        android.net.Uri A0B = AbstractC25227BEk.A0B(str);
        if (A0B.getPathSegments().size() < 3) {
            return null;
        }
        return AbstractC25226BEj.A1I(A0B.getPathSegments(), 2);
    }

    public static String A02(String str, String str2, long j) {
        return A00(str, str2, j).toString();
    }
}
