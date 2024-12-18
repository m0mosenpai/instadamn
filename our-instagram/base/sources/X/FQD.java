package X;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public final /* synthetic */ class FQD {
    public final /* synthetic */ AbstractC115105If A00;
    public final /* synthetic */ C34691FQc A01;
    public final /* synthetic */ C32547EUx A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ AtomicBoolean A04;

    public /* synthetic */ FQD(AbstractC115105If abstractC115105If, C34691FQc c34691FQc, C32547EUx c32547EUx, String str, AtomicBoolean atomicBoolean) {
        this.A02 = c32547EUx;
        this.A04 = atomicBoolean;
        this.A01 = c34691FQc;
        this.A00 = abstractC115105If;
        this.A03 = str;
    }

    public final void A00(boolean z) {
        C32547EUx c32547EUx = this.A02;
        AtomicBoolean atomicBoolean = this.A04;
        C34691FQc c34691FQc = this.A01;
        AbstractC115105If abstractC115105If = this.A00;
        String str = this.A03;
        c32547EUx.A02.removeCallbacksAndMessages(atomicBoolean);
        if (!z && !atomicBoolean.get()) {
            String str2 = c32547EUx.A0A;
            InterfaceC37227Gac interfaceC37227Gac = c32547EUx.A06;
            C07270a1 c07270a1 = c32547EUx.A05;
            Activity activity = c32547EUx.A01;
            activity.getClass();
            EfU efU = (EfU) abstractC115105If.A00();
            if (efU != null) {
                AbstractC34818FVu.A01(activity, c07270a1, c34691FQc, efU, interfaceC37227Gac, str2, str);
            }
        }
    }
}
