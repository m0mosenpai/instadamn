package X;

import android.content.Intent;
import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* loaded from: classes7.dex */
public final class HJE extends C42H {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ReboundViewPager A02;
    public final /* synthetic */ HCB A03;

    public HJE(View view, View view2, ReboundViewPager reboundViewPager, HCB hcb) {
        this.A03 = hcb;
        this.A02 = reboundViewPager;
        this.A00 = view;
        this.A01 = view2;
    }

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        HCB hcb = this.A03;
        View A0D = this.A02.A0D(i);
        hcb.A07 = false;
        if (A0D != null) {
            hcb.A06(A0D, false);
        }
        hcb.A00 = i;
        C41082IGz c41082IGz = (C41082IGz) hcb.A0F.getValue();
        IN1 in1 = (IN1) hcb.A04.get(hcb.A00);
        C14360o3.A0B(in1, 0);
        if (in1 instanceof C39352HZr) {
            C39352HZr c39352HZr = (C39352HZr) in1;
            c41082IGz.A01.A06(c39352HZr.A01.getId(), c41082IGz.A00, c39352HZr.A00);
        }
        HCB.A02(this.A00, this.A01, hcb);
        HCB.A03(hcb);
        Intent intent = new Intent();
        intent.putExtra("item_id", ((IN1) hcb.A04.get(hcb.A00)).A01());
        intent.putExtra("source_id", AbstractC37300Gc1.A0H(hcb.A0A).A0C);
        AbstractC31176DnK.A18(intent, hcb);
    }
}
