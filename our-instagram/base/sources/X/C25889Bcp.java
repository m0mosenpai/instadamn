package X;

import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Bcp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25889Bcp extends AbstractC51163Mj6 {
    public final Integer A00;
    public final Integer A01;

    @Override // X.AbstractC51163Mj6
    public final /* bridge */ /* synthetic */ C3OO A00(ViewGroup viewGroup, O1E o1e) {
        return new C25932BdZ(AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.clips_template_browser_placeholder_item_layout, false));
    }

    @Override // X.AbstractC51163Mj6
    public final /* bridge */ /* synthetic */ void A02(O1E o1e, C3OO c3oo) {
        C25932BdZ c25932BdZ = (C25932BdZ) c3oo;
        C14360o3.A0B(c25932BdZ, 0);
        Integer num = this.A00;
        Integer num2 = this.A01;
        if (num != null) {
            c25932BdZ.A01.setCornerRadius(num.intValue());
        }
        if (num2 != null) {
            c25932BdZ.A00.setBackgroundColor(num2.intValue());
        }
    }

    public C25889Bcp(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }

    public C25889Bcp() {
        this(null, null);
    }
}
