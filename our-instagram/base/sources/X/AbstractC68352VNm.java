package X;

import com.facebookpay.form.cell.label.LabelCellParams;
import com.fbpay.hub.common.link.LinkParams;

/* renamed from: X.VNm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68352VNm {
    public static LabelCellParams A00() {
        int i;
        String str;
        C67663Uuv c67663Uuv = new C67663Uuv(16);
        if (C2FP.A0D().A05()) {
            i = 2131966612;
        } else {
            i = 2131954865;
            if (C18U.A06(C06090Tz.A05, C2FP.A0D().A00, 36315503265844580L)) {
                i = 2131966606;
            }
        }
        c67663Uuv.A03 = i;
        boolean A05 = C2FP.A0D().A05();
        W4W w4w = new W4W();
        if (A05) {
            w4w.A01(AbstractC111324zv.A00(981));
            w4w.A05 = true;
            w4w.A01 = 2131969387;
            str = "[[learn_more_token]]";
        } else {
            w4w.A01(AbstractC111324zv.A00(980));
            w4w.A01 = 2131969409;
            str = "[[payment_terms_token]]";
        }
        w4w.A03 = str;
        c67663Uuv.A08.add((Object) new LinkParams(w4w));
        return c67663Uuv.A00();
    }
}
