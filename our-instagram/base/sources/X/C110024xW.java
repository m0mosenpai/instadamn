package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.4xW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110024xW implements InterfaceC12870lZ, InterfaceC13000lm {
    public long A00;
    public long A01;
    public Context A02;
    public boolean A03;
    public boolean A04;
    public final UserSession A05;
    public final C70243Di A06;

    public C110024xW(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A05 = userSession;
        this.A06 = AbstractC70233Dh.A00(userSession);
    }

    public final void A00(Context context) {
        if (context != null && !(context instanceof Application)) {
            if (C18U.A06(C06090Tz.A05, this.A05, 36330720335381484L)) {
                context = context.getApplicationContext();
            }
        }
        this.A02 = context;
        C218914p.A03(EnumC220415e.A03, this);
    }

    public final boolean A01() {
        if (this.A00 > 0) {
            UserSession userSession = this.A05;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36328151946116352L) && this.A01 - this.A00 >= C18U.A01(c06090Tz, userSession, 36609626922751938L) * 1000 && !this.A04 && !this.A03 && C37787Gk2.A01.A0A(userSession)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-313728066);
        this.A00 = System.currentTimeMillis();
        this.A03 = false;
        this.A04 = false;
        C0f9.A0A(-1995458576, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int i;
        int A03 = C0f9.A03(1843107709);
        this.A01 = System.currentTimeMillis();
        this.A04 = C14360o3.A0K(C55772hI.A00(this.A05).A05, C1QO.A09.toString());
        if (this.A06.A05) {
            i = 816329187;
        } else if (this.A00 == 0) {
            i = -867475658;
        } else {
            C11T.A04(new RunnableC38077Gp6(this), 200L);
            i = 684703940;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A06(this);
    }
}
