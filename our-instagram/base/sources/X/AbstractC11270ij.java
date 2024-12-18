package X;

/* renamed from: X.0ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11270ij {
    public static final String A00 = A00("graph.instagram.com");

    public static String A00(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.contains("://")) {
            sb.append("https://");
        }
        sb.append(str);
        sb.append("/logging_client_events");
        return sb.toString();
    }
}
