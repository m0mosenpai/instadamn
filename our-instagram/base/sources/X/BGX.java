package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BGX extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BGX(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, int i) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A0C = obj2;
        this.A0A = obj3;
        this.A04 = obj4;
        this.A09 = obj5;
        this.A05 = obj6;
        this.A01 = obj7;
        this.A02 = obj8;
        this.A08 = obj9;
        this.A06 = obj10;
        this.A07 = obj11;
        this.A0B = obj12;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            CTE cte = (CTE) obj;
            TextView textView = (TextView) this.A03;
            if (!textView.isFocused()) {
                textView.setText(cte.A04);
            }
            ((View) this.A0C).setClickable(true);
            TextView textView2 = (TextView) this.A0A;
            N6P n6p = (N6P) this.A04;
            AbstractC166987dD.A1O(n6p.requireContext(), textView2, R.color.igds_primary_text);
            ImageView imageView = (ImageView) this.A09;
            imageView.setClickable(true);
            Date date = cte.A05;
            int i = 0;
            if (date != null) {
                TextView textView3 = (TextView) this.A0B;
                textView3.setText(MX0.A02(n6p.requireContext(), AbstractC166987dD.A0r(n6p.A01), date.getTime()));
                textView3.setVisibility(0);
            } else {
                ((View) this.A0B).setVisibility(8);
            }
            AbstractC166997dE.A19(n6p.requireContext(), imageView, cte.A03);
            ((View) this.A05).setVisibility(AbstractC167007dF.A05(cte.A06 ? 1 : 0));
            AbstractC166997dE.A19(n6p.requireContext(), (ImageView) this.A01, cte.A00);
            AbstractC25227BEk.A12((TextView) this.A02, n6p, cte.A01);
            ((View) this.A08).setVisibility(AbstractC167007dF.A05(cte.A0A ? 1 : 0));
            View view = (View) this.A06;
            if (!cte.A07) {
                i = 8;
            }
            view.setVisibility(i);
            IgdsButton igdsButton = (IgdsButton) this.A07;
            igdsButton.setText(cte.A02);
            igdsButton.setLoading(cte.A09);
            igdsButton.setEnabled(cte.A08);
        } else {
            C6Nu A0T = AbstractC25228BEl.A0T(obj);
            Object obj2 = this.A03;
            if (obj2 != null) {
                A0T.CgG("megaphone", "megaphone", C5UA.A03(new C30713DfB(14, this.A04, obj2), 1201741658));
            }
            List list = (List) this.A02;
            BGO bgo = BGO.A00;
            C25244BFd c25244BFd = C25244BFd.A00;
            InterfaceC16600sD interfaceC16600sD = (InterfaceC16600sD) this.A0A;
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
            InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A0B;
            Map map = (Map) this.A01;
            Integer num = (Integer) this.A05;
            InterfaceC16600sD interfaceC16600sD2 = (InterfaceC16600sD) this.A08;
            InterfaceC16610sE interfaceC16610sE = (InterfaceC16610sE) this.A07;
            InterfaceC16600sD interfaceC16600sD3 = (InterfaceC16600sD) this.A0C;
            InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A09;
            int size = list.size();
            AbstractC25227BEk.A15(A0T, new C25247BFg(num, list, map, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16620sF, interfaceC16610sE, interfaceC16600sD, interfaceC16600sD2, interfaceC16600sD3), new C50362MLo(40, list, (InterfaceC16660sJ) bgo), new C50362MLo(41, list, (InterfaceC16660sJ) c25244BFd), size);
        }
        return C0eB.A00;
    }
}
