package X;

import android.content.Context;
import com.facebook.endtoend.EndToEnd;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.common.session.UserSession;

/* renamed from: X.13Q, reason: invalid class name */
/* loaded from: classes.dex */
public final class C13Q extends AbstractC211911v {
    public final C211511r A00;
    public final Context A01;
    public final C211211o A02;

    public C13Q(Context context, C211511r c211511r, C211211o c211211o) {
        C14360o3.A0B(context, 1);
        this.A01 = context;
        this.A02 = c211211o;
        this.A00 = c211511r;
    }

    @Override // X.AbstractC211911v
    public final void A04(C226418s c226418s) {
        C14360o3.A0B(c226418s, 0);
        long j = super.A01;
        long j2 = super.A00;
        c226418s.A0Q(c226418s.A02, "FIXIE_INIT_POST_QE_START", j);
        c226418s.A0Q(c226418s.A02, "FIXIE_INIT_POST_QE_END", j2);
    }

    @Override // X.AbstractC211911v
    public final String A06() {
        return "IgFixieAppInitializer";
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0RK, X.0hA] */
    @Override // X.AbstractC211911v
    public final void A07() {
        final UserSession userSession;
        AbstractC12990ll A08 = ((AnonymousClass122) this.A02.A00()).A08();
        if ((A08 instanceof UserSession) && (userSession = (UserSession) A08) != null) {
            Context context = this.A01;
            C10420hA c10420hA = C10420hA.A01;
            final C10420hA c10420hA2 = c10420hA;
            if (c10420hA == null) {
                ?? c0rk = new C0RK(context);
                C10420hA.A01 = c0rk;
                c10420hA2 = c0rk;
            }
            c10420hA2.A00 = userSession;
            if (EndToEnd.A05() || C20150ym.A07(AbstractC20100yh.A00(36314103106636188L))) {
                AbstractC24641Ih.A02.Ep8(new AbstractC18280vF() { // from class: X.1L6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super("FIXIE_INIT_POST_APP_START", 1610596229);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v2, types: [X.0h9, java.lang.Object] */
                    @Override // X.AbstractC18280vF
                    public final void loggedRun() {
                        C10410h9 c10410h9;
                        C10420hA c10420hA3 = C10420hA.this;
                        C211511r c211511r = this.A00;
                        C211511r c211511r2 = c211511r;
                        if (c211511r == null) {
                            c211511r2 = new Object();
                        }
                        synchronized (C10410h9.class) {
                            C10410h9 c10410h92 = C10410h9.A04;
                            c10410h9 = c10410h92;
                            if (c10410h92 == null) {
                                ?? obj = new Object();
                                obj.A03 = false;
                                obj.A01 = c10420hA3;
                                obj.A00 = c211511r2;
                                C10410h9.A04 = obj;
                                c10410h9 = obj;
                            }
                        }
                        c10410h9.A03(C05F.A01);
                        if (c10410h9.A03 && C10410h9.A00(c10410h9) != null) {
                            C10410h9.A00(c10410h9).markerEnd(157825012, (short) 2);
                        }
                        C006802i c006802i = C006802i.A0p;
                        C05730Rz c05730Rz = c10410h9.A02;
                        if (c05730Rz != null) {
                            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) c05730Rz.A00.get();
                            if (lightweightQuickPerformanceLogger instanceof C0k4) {
                                ((C0k4) lightweightQuickPerformanceLogger).A01(c006802i);
                            }
                        }
                    }
                });
            }
        }
    }
}
