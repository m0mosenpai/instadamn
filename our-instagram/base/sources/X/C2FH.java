package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2FH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FH implements InterfaceC41501vz, InterfaceC13000lm {
    public C25671My A00;
    public UserSession A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A02(this, C2FJ.class);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        int A03 = C0f9.A03(-569558549);
        int A032 = C0f9.A03(1782258842);
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean booleanValue = Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36326154786977484L)).booleanValue();
        if (C18U.A06(c06090Tz, userSession, 36326154786911947L)) {
            str = "deterministic_after_feed_ui_render";
        } else {
            str = "deterministic_after_feed_request_start";
            if (!booleanValue) {
                C2DG.A00(userSession).A0A("deterministic_after_feed_request_start");
                C0f9.A0A(1044692996, A032);
                C0f9.A0A(-139655092, A03);
            }
        }
        C2DG.A00(userSession).A09(str);
        C0f9.A0A(1044692996, A032);
        C0f9.A0A(-139655092, A03);
    }
}
