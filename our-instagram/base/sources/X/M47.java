package X;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes8.dex */
public final class M47 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ KBL A01;

    public M47(KBL kbl, int i) {
        this.A00 = i;
        this.A01 = kbl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A00;
        KBL kbl = this.A01;
        if (i < kbl.A00 - 1) {
            ViewPager2 viewPager2 = kbl.A02;
            if (viewPager2 != null) {
                viewPager2.A03(i + 1, true);
                return;
            }
        } else {
            kbl.A06 = false;
            ViewPager2 viewPager22 = kbl.A02;
            if (viewPager22 != null) {
                viewPager22.A03(0, true);
                String str = kbl.A04;
                if (str == null) {
                    return;
                }
                InterfaceC09390do interfaceC09390do = kbl.A08;
                AbstractC31177DnL.A1M(AbstractC166987dD.A0w(AbstractC25230BEn.A0l(interfaceC09390do)), AbstractC111324zv.A00(4531), str, true);
                AbstractC31176DnK.A0Q(interfaceC09390do).E4s(new C23610Ad5(str));
                return;
            }
        }
        C14360o3.A0F("viewPager");
        throw C00O.createAndThrow();
    }
}
