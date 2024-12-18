package X;

import com.instagram.common.session.UserSession;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;

/* renamed from: X.0Iw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03810Iw extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ C211211o A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03810Iw(C211211o c211211o) {
        super(0);
        this.A00 = c211211o;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final C211211o c211211o = this.A00;
        return new AbstractC211911v(c211211o) { // from class: X.13b
            public final C211211o A00;

            @Override // X.AbstractC211911v
            public final String A06() {
                return "FeedCacheInitializer";
            }

            @Override // X.AbstractC211911v
            public final void A07() {
                final AbstractC12990ll A08 = ((AnonymousClass122) this.A00.A00()).A08();
                if (A08 instanceof UserSession) {
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, A08, 36314893380488079L)) {
                        if (!C20150ym.A07(AbstractC20100yh.A00(36321249932092671L))) {
                            if (C18U.A06(c06090Tz, A08, 36314893380553616L)) {
                                C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.1P6
                                    {
                                        super(1099672250, 3, false, false);
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C1X5.A00((UserSession) AbstractC12990ll.this).A03();
                                    }
                                });
                                return;
                            } else {
                                C1X5.A00((UserSession) A08).A03();
                                return;
                            }
                        }
                        MainFeedLocalDataSource A00 = Nv3.A00((UserSession) A08);
                        if (!A00.A0J) {
                            return;
                        }
                        A00.A0F.set(true);
                        C19L c19l = A00.A0H;
                        AbstractC23641Du.A05(AnonymousClass191.A00, new PZF(A00, null, 9), c19l);
                    }
                }
            }

            {
                this.A00 = c211211o;
            }
        };
    }
}
