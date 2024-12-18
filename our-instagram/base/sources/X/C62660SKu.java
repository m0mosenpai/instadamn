package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.SKu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62660SKu {
    public final C18240vB A00;

    public final void A00(android.net.Uri uri, UserSession userSession, boolean z) {
        EnumC23341Bw enumC23341Bw;
        C1Ef c1Ef;
        if (C18U.A06(C06090Tz.A05, userSession, 36325398870570024L)) {
            enumC23341Bw = EnumC23341Bw.Video;
            if (z) {
                c1Ef = C1Ef.OffScreen;
                this.A00.ATO(new RcW(uri, c1Ef, enumC23341Bw, this));
            }
        } else {
            enumC23341Bw = EnumC23341Bw.API;
        }
        c1Ef = C1Ef.OnScreen;
        this.A00.ATO(new RcW(uri, c1Ef, enumC23341Bw, this));
    }

    public C62660SKu() {
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "VideoSubtitleFetcher";
        this.A00 = new C18240vB(A00);
    }
}
