package X;

import com.facebookpay.form.cell.toggle.SwitchCellParams;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;

/* loaded from: classes11.dex */
public final class W4W {
    public int A00;
    public int A01;
    public int A02;
    public String A03 = "";
    public String A04 = "";
    public boolean A05;

    public static void A00(C67663Uuv c67663Uuv, ImmutableList.Builder builder, int i, boolean z) {
        c67663Uuv.A03 = i;
        W4W w4w = new W4W();
        w4w.A01(AbstractC111324zv.A00(2460));
        w4w.A01 = 2131957506;
        w4w.A03 = "[[data_policy_token]]";
        c67663Uuv.A08.add((Object) new LinkParams(w4w));
        builder.add((Object) c67663Uuv.A00());
        builder.add((Object) new SwitchCellParams(new C67660Uus(z, z)));
    }

    public final void A01(String str) {
        this.A04 = str;
        AbstractC63311ShH.A04(str, "url");
    }
}
