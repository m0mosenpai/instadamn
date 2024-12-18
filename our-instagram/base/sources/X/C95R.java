package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.95R, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C95R implements InterfaceC12870lZ {
    public static C95R A01;
    public UserSession A00;

    /* JADX WARN: Type inference failed for: r11v0, types: [X.AMj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.AMj, java.lang.Object] */
    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1144498802);
        final ?? obj = new Object();
        final UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        C14270nr.A00().A01(new AbstractRunnableC14200nk() { // from class: X.9iw
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1695590504, 5, false, false);
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r5, 36324870589526567L) == false) goto L11;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 452
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C217019iw.run():void");
            }
        }, C18U.A01(c06090Tz, userSession, 36606345566754240L) * 1000);
        final ?? obj2 = new Object();
        final UserSession userSession2 = this.A00;
        final String str = userSession2.userId;
        if (str != null) {
            C14270nr.A00().A01(new AbstractRunnableC14200nk() { // from class: X.9jE
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(449332491, 5, false, false);
                }

                /* JADX WARN: Code restructure failed: missing block: B:6:0x0040, code lost:
                
                    if (X.C18U.A06(X.C06090Tz.A05, r7, 36324870589526567L) == false) goto L8;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 309
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C217199jE.run():void");
                }
            }, C18U.A01(c06090Tz, userSession2, 36606345566754240L) * 1000);
        }
        C0f9.A0A(884229422, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1233192743, C0f9.A03(1838180671));
    }
}
