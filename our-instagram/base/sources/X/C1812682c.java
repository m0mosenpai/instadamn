package X;

/* renamed from: X.82c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1812682c implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "QccAnalyticsModule";
    public C8TT A00;
    public final AnonymousClass825 A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str;
        EnumC1810381f AuH;
        C8TT c8tt = this.A00;
        if (c8tt != null) {
            Object obj = c8tt.A0B.A08.A00;
            if (C14360o3.A0K(obj, C208509Kk.A00)) {
                str = "stories_postcapture_camera";
            } else if (C14360o3.A0K(obj, C81T.A00)) {
                str = "direct_postcapture_camera";
            } else if (C14360o3.A0K(obj, C1811481q.A00)) {
                str = "note_postcapture_camera";
            } else {
                str = "clips_postcapture_camera";
            }
            C8TT c8tt2 = this.A00;
            if (c8tt2 != null && (AuH = c8tt2.A0Z.AuH()) != null) {
                int ordinal = AuH.ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 3) {
                    if (ordinal == 2) {
                        return str;
                    }
                } else {
                    return "reel_composer_camera";
                }
            }
            throw new IllegalStateException("unexpected CaptureState");
        }
        return "reel_composer_camera";
    }

    public C1812682c(AnonymousClass825 anonymousClass825) {
        this.A01 = anonymousClass825;
    }
}
