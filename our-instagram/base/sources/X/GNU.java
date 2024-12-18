package X;

import com.instagram.business.fragment.OnboardingCheckListFragment;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class GNU implements Runnable {
    public final /* synthetic */ C31650DvG A00;
    public final /* synthetic */ C155046xt A01;

    public GNU(C31650DvG c31650DvG, C155046xt c155046xt) {
        this.A00 = c31650DvG;
        this.A01 = c155046xt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C34716FRb c34716FRb = ((OnboardingCheckListFragment) this.A00.A01).A04;
        Integer num = this.A01.A00;
        C14360o3.A0B(num, 0);
        List list = c34716FRb.A03;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                FRF frf = (FRF) it.next();
                String str = frf.A05;
                C14360o3.A07(str);
                if (F0R.A00(str) == num) {
                    frf.A03 = "complete";
                    break;
                }
            }
            c34716FRb.A00();
        }
    }
}
