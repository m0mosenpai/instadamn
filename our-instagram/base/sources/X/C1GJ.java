package X;

import android.content.Context;
import android.os.Looper;
import kotlin.Deprecated;

/* renamed from: X.1GJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1GJ {
    public static final C1GJ A00 = new Object();

    public static final int A00(Context context, AbstractC018607g abstractC018607g, C11R c11r) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(abstractC018607g, 1);
        C14360o3.A0B(c11r, 2);
        return AbstractC62382sd.A00(context, abstractC018607g, c11r, null);
    }

    @Deprecated(message = "Use overload method to provide a runnableId & priority")
    public static final void A03(C11R c11r) {
        C14360o3.A0B(c11r, 0);
        InterfaceC14020nS A002 = C14120nc.A00();
        C14360o3.A07(A002);
        C1GR.A00(c11r, A002, -5, 3, true, true);
    }

    public static final void A04(C11R c11r, int i) {
        A06(c11r, i, 3, true, false);
    }

    public static final void A05(final C11R c11r, final int i, final int i2, int i3, final boolean z, final boolean z2) {
        C14360o3.A0B(c11r, 0);
        final InterfaceC14020nS A002 = C14120nc.A00();
        C14360o3.A07(A002);
        C14270nr A003 = C14270nr.A00();
        final int runnableId = c11r.getRunnableId();
        A003.A01(new AbstractRunnableC14200nk(runnableId) { // from class: X.2AL
            @Override // java.lang.Runnable
            public final void run() {
                C1GR.A00(C11R.this, A002, i, i2, z, z2);
            }
        }, i3);
    }

    public static final void A07(C14090nZ c14090nZ, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(c14090nZ, 0);
        C19K A03 = AnonymousClass194.A03(c14090nZ, AbstractC24771Iv.A00);
        C206639Cu c206639Cu = new C206639Cu(interfaceC16660sJ, null, 13);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, A03);
    }

    public static final void A02(C11R c11r) {
        if (AbstractC15930qn.A02.A0R && !(!C14360o3.A0K(Looper.getMainLooper(), Looper.myLooper()))) {
            throw new IllegalStateException(AnonymousClass001.A0R("Schedulers.scheduleInline() called on main thread: task=", c11r.getName()));
        }
        C5LD.A00.schedule(c11r);
    }

    public static final C1GK A01() {
        C0o0 A002 = AbstractC14350nz.A00();
        A002.A01 = "SerialScheduler";
        return new C1GK(new C18240vB(A002));
    }

    public static final void A06(C11R c11r, int i, int i2, boolean z, boolean z2) {
        InterfaceC14020nS A002 = C14120nc.A00();
        C14360o3.A07(A002);
        C1GR.A00(c11r, A002, i, i2, z, z2);
    }
}
