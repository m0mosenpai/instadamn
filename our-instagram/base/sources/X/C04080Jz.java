package X;

import android.content.Context;
import com.instagram.process.instagram.InstagramApplicationForMainProcess;
import java.util.Map;

/* renamed from: X.0Jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04080Jz extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ InstagramApplicationForMainProcess A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04080Jz(InstagramApplicationForMainProcess instagramApplicationForMainProcess) {
        super(0);
        this.A00 = instagramApplicationForMainProcess;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        final Context context = this.A00.appContext;
        return new AbstractC211911v(context) { // from class: X.11w
            public final Context A00;

            {
                C14360o3.A0B(context, 1);
                this.A00 = context;
            }

            @Override // X.AbstractC211911v
            public final String A06() {
                return "EarlyCpuBoostInitializer";
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [X.15E, java.lang.Object] */
            @Override // X.AbstractC211911v
            public final void A07() {
                try {
                    C15E c15e = new C219614w().A03;
                    C14360o3.A07(c15e);
                    c15e.A04(this.A00);
                    C15P c15p = new C15P();
                    c15p.A00 = 5000;
                    c15e.A01(c15p, 0).EJ2(null, 0);
                } catch (Exception e) {
                    Map map = C0YZ.A03;
                    C0K8.A0H(AbstractC13230m9.A01(C212011w.class), "Early CPU Boost failed to execute.", e);
                } catch (Throwable th) {
                    Map map2 = C0YZ.A03;
                    C0K8.A0H(AbstractC13230m9.A01(C212011w.class), "Early CPU Boost failed to execute.", th);
                }
                try {
                    ?? obj = new Object();
                    obj.A04(this.A00);
                    C15P c15p2 = new C15P();
                    c15p2.A00 = 5000;
                    c15p2.A02 = 3;
                    obj.A01(c15p2, 0).EJ2(null, 0);
                } catch (Throwable th2) {
                    Map map3 = C0YZ.A03;
                    C0K8.A0H(AbstractC13230m9.A01(C212011w.class), "Early Thread Affinity failed to execute.", th2);
                }
            }
        };
    }
}
