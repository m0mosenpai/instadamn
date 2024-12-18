package X;

import android.net.Uri;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ffe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35186Ffe {
    public static final boolean A03(android.net.Uri uri) {
        String host = uri.getHost();
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2) {
            return false;
        }
        String str = (String) AbstractC25227BEk.A0t(pathSegments);
        if (!"ig.me".equalsIgnoreCase(host) && !C1QD.A00(host)) {
            return false;
        }
        String A0c = AbstractC31175DnJ.A0c(pathSegments, 0);
        if ((!"j".equalsIgnoreCase(A0c) && !"channel".equalsIgnoreCase(A0c)) || str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public static final String A00(android.net.Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (!A03(uri)) {
            return null;
        }
        return (String) AbstractC25227BEk.A0t(pathSegments);
    }

    public static String A01(android.net.Uri uri, String str) {
        if (!A03(uri)) {
            return null;
        }
        return uri.getQueryParameter(str);
    }

    public static final String A02(String str, List list) {
        Uri.Builder buildUpon = android.net.Uri.parse(str).buildUpon();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            buildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
        }
        return AbstractC166987dD.A19(buildUpon.build());
    }
}
