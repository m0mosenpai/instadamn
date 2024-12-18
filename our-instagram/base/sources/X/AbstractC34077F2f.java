package X;

import java.util.List;

/* renamed from: X.F2f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34077F2f {
    public static final boolean A00(String str) {
        android.net.Uri A0B = AbstractC25227BEk.A0B(str);
        if (!"instagram".equals(A0B.getScheme()) || !"notifications".equals(A0B.getHost())) {
            return false;
        }
        List<String> pathSegments = A0B.getPathSegments();
        C14360o3.A07(pathSegments);
        return C14360o3.A0K(AbstractC001800i.A0J(pathSegments), "manage") && !A0B.getQueryParameterNames().isEmpty();
    }
}
