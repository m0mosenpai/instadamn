package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1Pp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26341Pp implements InterfaceC12870lZ, InterfaceC13000lm {
    public static boolean A02;
    public final UserSession A00;
    public final C23031Ai A01;

    public final long A00() {
        InterfaceC19630xq interfaceC19630xq = this.A01.A01;
        String str = "";
        String string = interfaceC19630xq.getString("last_navigated_surface", "");
        if (string != null) {
            str = string;
        }
        if (str.equals(C1QO.A09.toString())) {
            return System.currentTimeMillis() - interfaceC19630xq.getLong("last_clips_background_time", 0L);
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bb, code lost:
    
        if (((java.lang.Boolean) r10.A0q.CES(r10, X.C17280tP.A4G[254(0xfe, float:3.56E-43)])).booleanValue() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r1.A05 != true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26341Pp.A01(android.content.Context):boolean");
    }

    public C26341Pp(UserSession userSession) {
        this.A00 = userSession;
        this.A01 = AbstractC23021Ah.A00(userSession);
        C218914p.A04(EnumC220415e.A02, this, false, false);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(1889930399);
        C23031Ai A00 = AbstractC23021Ah.A00(this.A00);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = A00.A01.ARD();
        ARD.E7G("last_clips_background_time", currentTimeMillis);
        ARD.apply();
        C0f9.A0A(795579737, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1266783463, C0f9.A03(7936094));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A07(this);
    }
}
