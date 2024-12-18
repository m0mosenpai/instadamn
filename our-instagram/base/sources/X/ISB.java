package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton;

/* loaded from: classes7.dex */
public abstract class ISB {
    /* JADX WARN: Type inference failed for: r2v1, types: [X.3OO, X.Guf] */
    public static final C38404Guf A00(ViewGroup viewGroup) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0R = AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.publishing_product_row, false);
        ?? c3oo = new C3OO(A0R);
        c3oo.A00 = A0R;
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) A0R.requireViewById(R.id.product_image);
        c3oo.A03 = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
        TextView A0T = AbstractC166997dE.A0T(c3oo.A00, R.id.product_name);
        c3oo.A02 = A0T;
        AbstractC37300Gc1.A0d(A0T, true);
        c3oo.A01 = AbstractC166987dD.A0e(c3oo.A00, R.id.product_details);
        c3oo.A05 = AbstractC31173DnH.A0U(c3oo.A00, R.id.product_sku_info);
        c3oo.A04 = AbstractC31173DnH.A0U(c3oo.A00, R.id.product_picker_checkbox);
        c3oo.A06 = (AutoWidthToggleButton) c3oo.A00.findViewById(R.id.product_action_button);
        return c3oo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:
    
        if (r6 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C38628GyV r16, X.C38052Gof r17, X.InterfaceC11380iw r18, X.InterfaceC43386JFb r19, X.C38404Guf r20, X.C41643IbZ r21, java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ISB.A01(X.GyV, X.Gof, X.0iw, X.JFb, X.Guf, X.IbZ, java.lang.String, boolean):void");
    }
}
