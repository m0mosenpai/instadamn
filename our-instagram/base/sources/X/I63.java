package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.feed.widget.IgProgressImageView;

/* loaded from: classes7.dex */
public abstract class I63 {
    public static final void A00(ReboundHorizontalScrollView reboundHorizontalScrollView, INQ inq, EnumC39541HdD enumC39541HdD, Integer num, Integer num2) {
        View childAt;
        IFC ifc;
        View childAt2;
        IgProgressImageView igProgressImageView;
        IFC ifc2;
        AbstractC37302Gc3.A1U(enumC39541HdD, inq);
        if (num != null && (childAt2 = reboundHorizontalScrollView.getChildAt(num.intValue())) != null) {
            Object tag = childAt2.getTag();
            if ((tag instanceof IFC) && (ifc2 = (IFC) tag) != null) {
                igProgressImageView = ifc2.A00;
            } else {
                igProgressImageView = null;
            }
            View[] viewArr = {igProgressImageView};
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le.A04(null, viewArr, false);
        }
        if (num2 != null && (childAt = reboundHorizontalScrollView.getChildAt(num2.intValue())) != null) {
            Object tag2 = childAt.getTag();
            if ((tag2 instanceof IFC) && (ifc = (IFC) tag2) != null) {
                AbstractC37304Gc5.A0v(ifc.A00, enumC39541HdD, EnumC39541HdD.A03, true);
                if (enumC39541HdD != EnumC39541HdD.A02) {
                    inq.A01(ifc.A01);
                }
            }
        }
    }
}
