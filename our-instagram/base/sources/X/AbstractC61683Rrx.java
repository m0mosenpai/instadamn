package X;

/* renamed from: X.Rrx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61683Rrx {
    public static boolean A00(android.net.Uri uri) {
        if (uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
            return true;
        }
        return false;
    }
}
