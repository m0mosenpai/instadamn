package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.TFp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64479TFp implements InterfaceC12870lZ {
    public final Context A00;
    public final C18920wW A01;
    public final C14140ne A02;
    public final C40701ud A03;
    public final InterfaceC19630xq A04;
    public final String A05;
    public final long A06;
    public final UserSession A07;

    public C64479TFp(UserSession userSession, Context context) {
        AbstractC167017dG.A1P(userSession, context);
        this.A07 = userSession;
        this.A00 = context;
        this.A04 = AbstractC19750y3.A00(context, "on_device_app_history_top_spend_apps");
        this.A02 = new C14140ne(1892066561, 3, false, false);
        this.A03 = AbstractC40691uc.A01(userSession);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "on_device_app_history_top_spend_apps";
        this.A01 = c12210kP.A00();
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A05 = C18U.A04(c06090Tz, userSession, 36880312941084990L);
        this.A06 = C18U.A01(c06090Tz, userSession, 36598837964442939L);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        C0f9.A0A(15263988, C0f9.A03(-1242841962));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int i;
        int A03 = C0f9.A03(275533813);
        long j = this.A04.getLong("last_query_time_in_sec", -1L);
        if (j > 0 && AbstractC31177DnL.A06() - j <= this.A06) {
            i = -1738806711;
        } else if (AbstractC001900j.A0T(this.A05)) {
            i = -1413034364;
        } else {
            this.A02.execute(new RunnableC64599TLk(this));
            i = 1927953894;
        }
        C0f9.A0A(i, A03);
    }
}
