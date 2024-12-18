package X;

import java.util.List;

/* renamed from: X.F3i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34106F3i {
    public static final String A00(android.net.Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 3 && ((String) AbstractC25227BEk.A0t(pathSegments)).equals("live")) {
            return AbstractC25226BEj.A1I(pathSegments, 2);
        }
        return null;
    }
}
