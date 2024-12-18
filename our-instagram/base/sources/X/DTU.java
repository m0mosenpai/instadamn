package X;

import android.view.View;
import android.widget.PopupWindow;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DTU extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTU(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        super(2);
        this.A00 = i4;
        this.A05 = obj;
        this.A03 = i;
        this.A04 = obj2;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                AbstractC136596Gn.A04(AbstractC25226BEj.A0S(obj, obj2), (Modifier) this.A04, (InterfaceC16820sZ) this.A05, this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 1:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                BGP.A01((LazyListState) this.A05, A0S, (InterfaceC16820sZ) this.A04, this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 2:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                BGP.A03((LazyGridState) this.A05, A0S2, (InterfaceC16820sZ) this.A04, this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            case 3:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                BGP.A04((LazyStaggeredGridState) this.A05, A0S3, (InterfaceC16820sZ) this.A04, this.A03, AbstractC25225BEi.A04(this.A01), this.A02);
                break;
            default:
                View view = (View) obj;
                C14360o3.A0B(view, 0);
                View findViewWithTag = view.findViewWithTag(((CVV) this.A04).A01);
                if (findViewWithTag != null) {
                    view = findViewWithTag;
                }
                ((PopupWindow) this.A05).showAsDropDown(view, this.A02, this.A03, this.A01);
                break;
        }
        return C0eB.A00;
    }
}
