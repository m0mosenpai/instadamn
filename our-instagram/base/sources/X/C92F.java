package X;

import com.facebook.mantle.ig.IGMantle;
import com.facebook.models.IgModelLoader;
import com.facebook.msys.mca.Mailbox;
import com.instagram.common.session.UserSession;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.92F, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C92F {
    public final C42221xC A00;

    public C92F(final UserSession userSession) {
        String str;
        MTC mtc = new MTC(EnumC27091Ti.A1D);
        mtc.A03 = C05F.A01;
        MTD mtd = new MTD(mtc);
        try {
            C1RQ.A00().A03(userSession, mtd);
            C1RQ.A00().A04(userSession, mtd);
            C09170dP.A0D("torch-code-gen", 16);
            C09170dP.A0D("dynamic_pytorch_impl", 16);
        } catch (Exception e) {
            e = e;
            str = "SoLoader pytorch library exception:";
            C0w9.A06("MantleManager", str, e);
            C42201xA c42201xA = C1334460n.A01(userSession, "MantleManager").A02;
            C14360o3.A07(c42201xA);
            this.A00 = c42201xA.A0K(new C6D2() { // from class: X.5l3
                @Override // X.C6D2
                public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                    Mailbox mailbox = (Mailbox) obj;
                    C14360o3.A0B(mailbox, 0);
                    C132875zC c132875zC = IGMantle.Companion;
                    C14140ne c14140ne = new C14140ne(939516106, 2, false, true);
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
                    C14360o3.A07(scheduledThreadPoolExecutor);
                    IgModelLoader A00 = C195908lc.A00(UserSession.this);
                    if (A00 != null) {
                        return new IGMantle(mailbox, c14140ne, scheduledThreadPoolExecutor, "", A00);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }).A0A();
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            str = "SoLoader UnsatisfiedLinkError:";
            C0w9.A06("MantleManager", str, e);
            C42201xA c42201xA2 = C1334460n.A01(userSession, "MantleManager").A02;
            C14360o3.A07(c42201xA2);
            this.A00 = c42201xA2.A0K(new C6D2() { // from class: X.5l3
                @Override // X.C6D2
                public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                    Mailbox mailbox = (Mailbox) obj;
                    C14360o3.A0B(mailbox, 0);
                    C132875zC c132875zC = IGMantle.Companion;
                    C14140ne c14140ne = new C14140ne(939516106, 2, false, true);
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
                    C14360o3.A07(scheduledThreadPoolExecutor);
                    IgModelLoader A00 = C195908lc.A00(UserSession.this);
                    if (A00 != null) {
                        return new IGMantle(mailbox, c14140ne, scheduledThreadPoolExecutor, "", A00);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            }).A0A();
        }
        C42201xA c42201xA22 = C1334460n.A01(userSession, "MantleManager").A02;
        C14360o3.A07(c42201xA22);
        this.A00 = c42201xA22.A0K(new C6D2() { // from class: X.5l3
            @Override // X.C6D2
            public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                Mailbox mailbox = (Mailbox) obj;
                C14360o3.A0B(mailbox, 0);
                C132875zC c132875zC = IGMantle.Companion;
                C14140ne c14140ne = new C14140ne(939516106, 2, false, true);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
                C14360o3.A07(scheduledThreadPoolExecutor);
                IgModelLoader A00 = C195908lc.A00(UserSession.this);
                if (A00 != null) {
                    return new IGMantle(mailbox, c14140ne, scheduledThreadPoolExecutor, "", A00);
                }
                throw new IllegalStateException("Required value was null.");
            }
        }).A0A();
    }
}
