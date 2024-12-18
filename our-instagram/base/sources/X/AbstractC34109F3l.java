package X;

/* renamed from: X.F3l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34109F3l {
    public static final boolean A00(String str) {
        android.net.Uri A0B = AbstractC25227BEk.A0B(str);
        if ("fb".equalsIgnoreCase(A0B.getScheme()) && "profile".equalsIgnoreCase(A0B.getHost())) {
            return AbstractC166987dD.A1b(A0B.getPathSegments());
        }
        return false;
    }
}
