package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GgH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37561GgH {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    public final void A00(C120985dq c120985dq, long j, long j2, long j3, boolean z) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A00, this.A01), "instagram_reels_auto_advance_countdown_started");
        if (A0f.isSampled()) {
            A0f.A9K("num_of_loops", Long.valueOf(j));
            A0f.A9K("clip_duration", Long.valueOf(j2));
            A0f.A7v("is_short_video", AbstractC37300Gc1.A0P(A0f, Long.valueOf(j3), "trigger_time", z));
            String str = null;
            A0f.AAP("media_id", AbstractC37301Gc2.A0h(c120985dq.A02));
            if (c120985dq.CdW()) {
                str = AbstractC25226BEj.A1E(c120985dq);
            }
            A0f.AAP("ad_id", str);
            AbstractC37300Gc1.A0o(A0f, c120985dq.A0P);
            A0f.Cht();
        }
    }

    public C37561GgH(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, interfaceC11380iw);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
