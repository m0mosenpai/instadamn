package X;

import android.content.Context;
import android.text.format.DateFormat;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.user.model.Product;
import java.text.SimpleDateFormat;
import java.util.List;

/* renamed from: X.IeC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41740IeC {
    public static final C41740IeC A00 = new Object();
    public static final SimpleDateFormat A01 = new SimpleDateFormat(DateFormat.getBestDateTimePattern(C1Q2.A02(), "MMM d"), C1Q2.A02());

    public static final void A01(C38512GwX c38512GwX, C42824Ix0 c42824Ix0, C41730Ie1 c41730Ie1, boolean z) {
        ViewGroup viewGroup = c38512GwX.A04;
        Context context = viewGroup.getContext();
        viewGroup.setVisibility(0);
        viewGroup.setEnabled(z);
        TextView textView = c38512GwX.A09;
        textView.setEnabled(z);
        IgSimpleImageView igSimpleImageView = c38512GwX.A0E;
        igSimpleImageView.setEnabled(z);
        igSimpleImageView.setSelected(z);
        textView.setText(AbstractC13670mt.A06("%d", AbstractC25228BEl.A1Y(c41730Ie1.A03())));
        viewGroup.setContentDescription(AbstractC166997dE.A0r(context.getResources(), Integer.valueOf(c41730Ie1.A03()), 2131971216));
        ViewOnClickListenerC42034Ik3.A00(viewGroup, 59, c41730Ie1, c42824Ix0);
    }

    public static final void A00(C38512GwX c38512GwX, C42824Ix0 c42824Ix0, C41730Ie1 c41730Ie1) {
        Product A04 = c41730Ie1.A04();
        if (A04 != null) {
            List list = A04.A0O;
            if (list != null && !list.isEmpty()) {
                TextView textView = c38512GwX.A07;
                textView.setVisibility(0);
                c38512GwX.A01.setVisibility(0);
                ViewOnClickListenerC42034Ik3.A00(textView, 56, c41730Ie1, c42824Ix0);
                return;
            }
            c38512GwX.A07.setVisibility(8);
            c38512GwX.A01.setVisibility(8);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A02(C38512GwX c38512GwX, C41730Ie1 c41730Ie1, StringBuilder sb) {
        Product A04 = c41730Ie1.A04();
        if (A04 != null) {
            List<ProductVariantPossibleValueDictIntf> list = A04.A0O;
            if (list != null && !list.isEmpty()) {
                TextView textView = c38512GwX.A0C;
                textView.setVisibility(0);
                if (!list.isEmpty()) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        A1C.append(((ProductVariantPossibleValueDictIntf) list.get(i)).getValue());
                        if (i < size - 1) {
                            A1C.append(" · ");
                        }
                    }
                    textView.setText(AbstractC166987dD.A19(A1C));
                    sb.append(" ");
                    if (!list.isEmpty()) {
                        StringBuilder A1C2 = AbstractC166987dD.A1C();
                        for (ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf : list) {
                            A1C2.append(productVariantPossibleValueDictIntf.getName());
                            A1C2.append(" ");
                            A1C2.append(productVariantPossibleValueDictIntf.getValue());
                            A1C2.append(" ");
                        }
                        sb.append(AbstractC166987dD.A19(A1C2));
                        return;
                    }
                    throw AbstractC31172DnG.A0u();
                }
                throw AbstractC31172DnG.A0u();
            }
            c38512GwX.A0C.setVisibility(8);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
