package X;

import java.util.List;

/* renamed from: X.FZx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34911FZx {
    public static final List A00 = AbstractC166987dD.A1J("smsrecovery");

    public static final boolean A00(android.net.Uri uri) {
        String host = uri.getHost();
        if ("instagram.com".equalsIgnoreCase(host) || "www.instagram.com".equalsIgnoreCase(host) || "help.instagram.com".equalsIgnoreCase(host) || "about.instagram.com".equalsIgnoreCase(host) || "m.instagram.com".equalsIgnoreCase(host) || "applink.instagram.com".equalsIgnoreCase(host)) {
            return true;
        }
        return false;
    }
}
