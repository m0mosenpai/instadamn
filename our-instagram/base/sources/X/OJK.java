package X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.creation.base.ui.grid.GridLinesView;

/* loaded from: classes9.dex */
public final class OJK {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ GridLinesView A03;
    public final /* synthetic */ C50724MaP A04;

    public OJK(View view, View view2, View view3, GridLinesView gridLinesView, C50724MaP c50724MaP) {
        this.A04 = c50724MaP;
        this.A03 = gridLinesView;
        this.A01 = view;
        this.A02 = view2;
        this.A00 = view3;
    }

    public final void A00(int i, int i2) {
        C50724MaP c50724MaP = this.A04;
        Integer num = c50724MaP.A0U;
        if (num != null) {
            GridLinesView gridLinesView = this.A03;
            View view = this.A01;
            View view2 = this.A02;
            View view3 = this.A00;
            int intValue = num.intValue();
            int i3 = (intValue - i) / 2;
            int i4 = (intValue - i2) / 2;
            if (C2J9.A02(AbstractC166987dD.A0r(c50724MaP.A0i))) {
                C11T.A03(new RunnableC57080PTt(view, view2, view3, gridLinesView, c50724MaP, i3, i4));
                return;
            }
            Rect rect = new Rect(0, 0, intValue, intValue);
            if (i < intValue) {
                rect.left = i3;
                rect.right -= i3;
            }
            if (i2 < intValue) {
                rect.top = i4;
                rect.bottom -= i4;
            }
            gridLinesView.setGridlinesRect(rect);
            gridLinesView.invalidate();
            C11T.A02(new PTE(view, c50724MaP, i3, i4));
        }
    }
}
