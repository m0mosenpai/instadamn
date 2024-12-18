package X;

import com.facebookpay.form.cell.label.LabelCellParams;
import com.fbpay.hub.common.link.LinkParams;

/* renamed from: X.VwW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract /* synthetic */ class AbstractC69846VwW {
    public static LabelCellParams A00(int i) {
        C67663Uuv c67663Uuv = new C67663Uuv(16);
        c67663Uuv.A03 = i;
        W4W w4w = new W4W();
        w4w.A01("https://www.facebook.com/privacy/explanation/");
        w4w.A01 = 2131961406;
        w4w.A03 = "[[data_terms_token]]";
        c67663Uuv.A08.add((Object) new LinkParams(w4w));
        c67663Uuv.A04 = 0;
        return c67663Uuv.A00();
    }

    public static LabelCellParams A01(int i, int i2, int i3, int i4) {
        String str;
        C67663Uuv c67663Uuv = new C67663Uuv(16);
        c67663Uuv.A03 = i;
        c67663Uuv.A04 = i2;
        c67663Uuv.A05 = i3;
        c67663Uuv.A01 = i4;
        boolean A05 = C2FP.A0D().A05();
        W4W w4w = new W4W();
        if (A05) {
            w4w.A01(AbstractC111324zv.A00(981));
            w4w.A05 = true;
            w4w.A01 = 2131961407;
            str = "[[learn_more_token]]";
        } else {
            w4w.A01("https://www.facebook.com/payments_terms/");
            w4w.A01 = 2131961505;
            w4w.A03 = "[[payment_terms_token]]";
            c67663Uuv.A08.add((Object) new LinkParams(w4w));
            w4w = new W4W();
            w4w.A01("https://www.facebook.com/privacy/explanation/");
            w4w.A01 = 2131961504;
            str = "[[data_terms_token]]";
        }
        w4w.A03 = str;
        c67663Uuv.A08.add((Object) new LinkParams(w4w));
        return c67663Uuv.A00();
    }
}
