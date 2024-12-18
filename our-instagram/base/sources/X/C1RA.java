package X;

import java.net.URISyntaxException;

/* renamed from: X.1RA, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1RA {
    public static final String A00(java.net.URI uri) {
        try {
            return new java.net.URI(uri.getScheme(), uri.getHost(), uri.getPath(), null).toString();
        } catch (URISyntaxException unused) {
            return "Invalid URI";
        }
    }
}
