package X;

/* renamed from: X.2EZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2EZ {
    public final C2EY A00(String str) {
        C14360o3.A0B(str, 0);
        C2EY c2ey = (C2EY) C2EY.A0B.get(str);
        if (c2ey == null) {
            C0w9.A04("DirectMessageContentType_getType", AnonymousClass001.A0R("Unknown type found: ", str), 1);
            if ("IGTV_SHARE".equalsIgnoreCase(str)) {
                C0w9.A03("DirectMessageContentType_IGTV_SHARE", "Mapped IGTV_SHARE to FELIX_SHARE");
                return C2EY.A0t;
            }
            if ("XMA".equalsIgnoreCase(str)) {
                return C2EY.A0s;
            }
            try {
                return C2EY.valueOf(str);
            } catch (IllegalArgumentException unused) {
                C0w9.A03("DirectMessageContentType_getType", AnonymousClass001.A0R("Unable to parse DirectMessageContentType string: ", str));
                return C2EY.A1O;
            }
        }
        return c2ey;
    }
}
