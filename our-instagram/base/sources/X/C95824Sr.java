package X;

/* renamed from: X.4Sr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95824Sr {
    public static final String[] A00(String str) {
        if (str != null && str.length() != 0) {
            return (String[]) new C11L("_").A03(str).toArray(new String[0]);
        }
        return null;
    }

    public final long A01(String str) {
        if (str != null && str.length() != 0) {
            String[] A00 = A00(str);
            if (A00 != null && A00.length > 1) {
                str = A00[0];
            }
            C14360o3.A0B(str, 0);
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        return 0L;
    }
}
