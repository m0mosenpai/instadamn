package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtime.requeststream.PulsarScheduler;

/* renamed from: X.14g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C218014g extends AbstractC211911v {
    public final C211211o A00;
    public final C17090t4 A01;

    public C218014g(C211211o c211211o, C17090t4 c17090t4) {
        C14360o3.A0B(c17090t4, 2);
        this.A00 = c211211o;
        this.A01 = c17090t4;
    }

    public static final void A00(C218014g c218014g) {
        AbstractC12990ll A08 = ((AnonymousClass122) c218014g.A00.A00()).A08();
        if (A08 instanceof UserSession) {
            PulsarScheduler.initialize((UserSession) A08);
        }
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "PulsarSchedulerInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        AbstractRunnableC14200nk abstractRunnableC14200nk;
        AbstractC12990ll A08 = ((AnonymousClass122) this.A00.A00()).A08();
        if (A08 instanceof UserSession) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, A08, 36318475383281821L)) {
                int A01 = (int) C18U.A01(c06090Tz, A08, 36599950360055463L);
                final int i = 2;
                if (A01 != 0) {
                    final int i2 = 3;
                    if (A01 != 1) {
                        if (A01 != 2) {
                            if (A01 == 3) {
                                AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.9jX
                                    {
                                        super("PulsarSchedulerInitialization", 822753014);
                                    }

                                    @Override // X.AbstractC18280vF
                                    public final void loggedRun() {
                                        C218014g.A00(C218014g.this);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i = 4;
                    } else {
                        abstractRunnableC14200nk = new AbstractRunnableC14200nk(i2) { // from class: X.2Wd
                            @Override // java.lang.Runnable
                            public final void run() {
                                C218014g.A00(C218014g.this);
                            }
                        };
                        C14120nc.A00().ATO(abstractRunnableC14200nk);
                    }
                }
                abstractRunnableC14200nk = new AbstractRunnableC14200nk(i) { // from class: X.2Wd
                    @Override // java.lang.Runnable
                    public final void run() {
                        C218014g.A00(C218014g.this);
                    }
                };
                C14120nc.A00().ATO(abstractRunnableC14200nk);
            }
        }
    }
}
