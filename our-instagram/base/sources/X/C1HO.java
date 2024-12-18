package X;

import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.facebook.endtoend.EndToEnd;
import com.instagram.debug.devoptions.sandboxselector.SandboxDataModelConverterKt;

/* renamed from: X.1HO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HO {
    public static Boolean A00;

    public static synchronized String A02() {
        String str;
        synchronized (C1HO.class) {
            C17280tP A002 = C17280tP.A00();
            str = (String) A002.A1J.CES(A002, C17280tP.A4G[215]);
        }
        return str;
    }

    public static String A04(String str) {
        String str2;
        StringBuilder sb;
        if (str.endsWith(SandboxDataModelConverterKt.SANDBOX_SUBDOMAIN_ON_DEMAND)) {
            sb = new StringBuilder();
            str2 = "graph.svcscm.";
        } else {
            str2 = "graph.";
            if (!str.contains(".")) {
                sb = new StringBuilder();
            } else {
                if (!str.contains("instagram.com")) {
                    return str;
                }
                if (str.contains("i.")) {
                    str = str.replaceFirst("i.", "");
                }
                String replace = str.replace("instagram.com", IGPixelRequestBuffer.URL_PREFIX);
                sb = new StringBuilder();
                sb.append("graph.");
                sb.append(replace);
                return sb.toString();
            }
        }
        sb.append(str2);
        sb.append(str);
        sb.append(".");
        sb.append(IGPixelRequestBuffer.URL_PREFIX);
        return sb.toString();
    }

    public static String A05(String str) {
        StringBuilder sb;
        String str2;
        if (str.contains(" ")) {
            str = str.replaceAll("\\s+", "");
        }
        if ("preprod".equals(str)) {
            return "preprod.instagram.com";
        }
        if (str.contains(".")) {
            if (!str.endsWith(SandboxDataModelConverterKt.SANDBOX_SUBDOMAIN_ON_DEMAND)) {
                return str;
            }
            sb = new StringBuilder();
            sb.append("i.svcscm.");
            sb.append(str);
            str2 = ".instagram.com";
        } else {
            sb = new StringBuilder();
            sb.append("i.");
            sb.append(str);
            str2 = ".sb.instagram.com:8040";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static synchronized void A07() {
        synchronized (C1HO.class) {
            A00 = null;
        }
    }

    public static synchronized boolean A08() {
        boolean booleanValue;
        synchronized (C1HO.class) {
            C17280tP A002 = C17280tP.A00();
            booleanValue = ((Boolean) A002.A1v.CES(A002, C17280tP.A4G[8])).booleanValue();
        }
        return booleanValue;
    }

    public static String A00() {
        boolean booleanValue;
        String property;
        boolean z = false;
        if (EndToEnd.isRunningEndToEndTest() && (property = System.getProperty("fb.e2e.instagram_server_host")) != null && !property.trim().isEmpty()) {
            z = true;
        }
        if (z) {
            String property2 = System.getProperty("fb.e2e.instagram_server_host");
            if (property2 == null) {
                return "";
            }
            return A05(property2.trim());
        }
        synchronized (C1HO.class) {
            Boolean bool = A00;
            if (bool == null) {
                bool = Boolean.valueOf(C17280tP.A00().A0g());
                A00 = bool;
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue ? C17280tP.A00().A05() : "i.instagram.com";
    }

    public static String A01() {
        if (A08()) {
            return AbstractC13670mt.A06("www.%s", A02().replace("instagram", "facebook"));
        }
        return "";
    }

    public static String A03(String str) {
        return AbstractC13670mt.A06("https://%s%s", A00(), str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (com.facebook.endtoend.EndToEnd.A03() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.URI A06() {
        /*
            boolean r0 = A08()
            if (r0 == 0) goto L27
            java.lang.String r1 = A02()
        La:
            java.lang.String r0 = "i."
            boolean r0 = r1.startsWith(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            if (r0 == 0) goto L23
            java.lang.String r0 = "https://%s/graphql_www"
        L1a:
            java.lang.String r0 = X.AbstractC13670mt.A06(r0, r1)
            java.net.URI r0 = java.net.URI.create(r0)
            return r0
        L23:
            java.lang.String r0 = "https://i.%s/graphql_www"
            goto L1a
        L27:
            java.lang.Class<X.1HO> r2 = X.C1HO.class
            monitor-enter(r2)
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L37
            boolean r1 = com.facebook.endtoend.EndToEnd.A03()     // Catch: java.lang.Throwable -> L57
            r0 = 0
            if (r1 == 0) goto L38
        L37:
            r0 = 1
        L38:
            monitor-exit(r2)
            if (r0 == 0) goto L53
            java.util.Map r1 = com.facebook.endtoend.EndToEnd.A01()
            java.lang.String r0 = "/settings/e2e_instagram_graphql_www_host"
            java.lang.Object r1 = r1.get(r0)
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L53
            java.lang.String r0 = "value"
            java.lang.String r1 = r1.optString(r0)
            if (r1 == 0) goto L53
            goto La
        L53:
            java.lang.String r1 = "instagram.com"
            goto La
        L57:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1HO.A06():java.net.URI");
    }
}
