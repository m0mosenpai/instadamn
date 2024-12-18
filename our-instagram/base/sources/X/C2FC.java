package X;

import android.content.IntentFilter;
import com.instagram.common.session.UserSession;
import com.instagram.direct.store.InboxNetworkSource;
import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.2FC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FC implements InterfaceC41501vz, InterfaceC13000lm {
    public C25671My A00;
    public UserSession A01;

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A00.A02(this, C2FF.class);
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(363369618);
        int A032 = C0f9.A03(1998302511);
        AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.2pA
            {
                super("DirectUserScopedInitializer.initOnMainAppUiCreated", 318, 5, false, false);
            }

            @Override // X.AbstractC18280vF
            public final void loggedRun() {
                C36741nX c36741nX;
                final C2DG A00 = C2DG.A00(C2FC.this.A01);
                UserSession userSession = A00.A09;
                if (C18U.A06(C06090Tz.A05, userSession, 36316216231923860L)) {
                    AbstractC24641Ih.A02.Ep8(new C45729KMg(A00));
                } else {
                    C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.92c
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC121115e3.A00(C2DG.this.A09);
                        }

                        {
                            super(481699532, 2, false, true);
                        }
                    });
                }
                AbstractC2042992d.A00(userSession).A06();
                C14360o3.A0B(userSession, 0);
                C165977bP c165977bP = (C165977bP) userSession.A01(C165977bP.class, new C50159MDm(userSession, 6));
                UserSession userSession2 = c165977bP.A03;
                C06090Tz c06090Tz = C06090Tz.A06;
                if (C18U.A06(c06090Tz, userSession2, 36315885517934261L) && (c36741nX = C36741nX.A00) != null && !c165977bP.A02) {
                    c165977bP.A00 = c36741nX.A00(c165977bP.A04);
                    C36741nX c36741nX2 = C36741nX.A00;
                    if (c36741nX2 != null) {
                        c165977bP.A01 = c36741nX2;
                        AbstractC23641Du.A05(AnonymousClass191.A00, new MCL(c165977bP, (InterfaceC23621Ds) null, 15, 42), c165977bP.A06);
                    } else {
                        C14360o3.A0F("instance");
                        throw C00O.createAndThrow();
                    }
                }
                if (!AbstractC47132Ef.A00(userSession).A05()) {
                    C2DG.A05(A00, C05F.A00);
                }
                if (AbstractC117345St.A01(userSession) && C18U.A06(c06090Tz, userSession, 2342157851056081773L) && AbstractC47873LCt.A01(userSession)) {
                    int intValue = new Long(C18U.A01(c06090Tz, userSession, 36596316819032458L)).intValue();
                    C32217EDq c32217EDq = new C32217EDq(userSession);
                    C1ON A002 = FXB.A00(userSession, AbstractC111324zv.A00(1019));
                    A002.A00 = c32217EDq;
                    if (intValue > 0) {
                        C1GJ.A05(A002, 365916736, 3, intValue, true, true);
                    } else {
                        C1GJ.A03(A002);
                    }
                    C32218EDr c32218EDr = new C32218EDr(userSession);
                    C1ON A003 = FXB.A00(userSession, "notifications");
                    A003.A00 = c32218EDr;
                    if (intValue > 0) {
                        C1GJ.A05(A003, 365916736, 3, intValue, true, true);
                    } else {
                        C1GJ.A03(A003);
                    }
                    AbstractC47873LCt.A00(userSession);
                }
                if (C2E8.A07(userSession) && C18U.A06(c06090Tz, userSession, 36316671497015907L)) {
                    IntentFilter intentFilter = C2057098u.A0J;
                    C2057098u A004 = AbstractC2057198v.A00(userSession);
                    synchronized (A004) {
                        InboxNetworkSource inboxNetworkSource = A004.A09;
                        UserSession userSession3 = inboxNetworkSource.A07;
                        C25621Ms c25621Ms = new C25621Ms(userSession3);
                        c25621Ms.A09(C05F.A0N);
                        c25621Ms.A0B("direct_v2/should_show_ad_responses_tab/");
                        c25621Ms.A0S(EBX.class, FV1.class);
                        C1ON A0N = c25621Ms.A0N();
                        A0N.A00 = new K8W(userSession3, inboxNetworkSource);
                        InboxNetworkSource.A01(A0N, inboxNetworkSource);
                    }
                }
                RealtimeClientManager.getInstance(userSession).initOnMainAppUiCreated();
            }
        });
        C0f9.A0A(-141270683, A032);
        C0f9.A0A(589873008, A03);
    }
}
