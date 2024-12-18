package X;

import com.facebook.R;
import com.facebookpay.form.cell.label.LabelCellParams;
import com.facebookpay.logging.LoggingContext;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;

/* renamed from: X.VpV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69500VpV {
    public final LabelCellParams A00(LoggingContext loggingContext, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        Wap.A02(new C25531Mh(MSY.A0H(C2FP.A01().A04.A00, "client_load_terms_init"), 105), loggingContext, null, "nux_checkout", 49);
        if (z3) {
            C67663Uuv c67663Uuv = new C67663Uuv(16);
            c67663Uuv.A03 = 2131961510;
            W4W w4w = new W4W();
            w4w.A01("https://www.facebook.com/terms.php");
            w4w.A01 = 2131961555;
            w4w.A03 = "[[terms_token]]";
            LinkParams linkParams = new LinkParams(w4w);
            ImmutableList.Builder builder = c67663Uuv.A08;
            builder.add((Object) linkParams);
            W4W w4w2 = new W4W();
            w4w2.A01("https://www.facebook.com/privacy/explanation/");
            w4w2.A01 = 2131961504;
            w4w2.A03 = "[[data_terms_token]]";
            builder.add((Object) new LinkParams(w4w2));
            W4W w4w3 = new W4W();
            w4w3.A01("https://www.facebook.com/help/208622391741310?ref=learn_more");
            w4w3.A01 = 2131961407;
            w4w3.A03 = "[[learn_more_token]]";
            builder.add((Object) new LinkParams(w4w3));
            c67663Uuv.A04 = R.attr.fbpay_hub_header_item_margin_top;
            c67663Uuv.A05 = i;
            c67663Uuv.A01 = i2;
            return c67663Uuv.A00();
        }
        if (C2FP.A0D().A05()) {
            i3 = 2131961331;
        } else if (z) {
            i3 = 2131961512;
            if (z2) {
                i3 = 2131961511;
            }
        } else {
            i3 = 2131961509;
            if (z2) {
                i3 = 2131961507;
            }
        }
        return AbstractC69846VwW.A01(i3, R.attr.fbpay_hub_header_item_margin_top, i, i2);
    }
}
