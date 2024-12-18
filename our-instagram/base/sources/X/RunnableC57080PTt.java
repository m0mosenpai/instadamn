package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.PTt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57080PTt implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ GridLinesView A05;
    public final /* synthetic */ C50724MaP A06;

    public RunnableC57080PTt(View view, View view2, View view3, GridLinesView gridLinesView, C50724MaP c50724MaP, int i, int i2) {
        this.A05 = gridLinesView;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = view;
        this.A06 = c50724MaP;
        this.A04 = view2;
        this.A02 = view3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        GridLinesView gridLinesView = this.A05;
        gridLinesView.A02 = false;
        int i2 = this.A00;
        int i3 = this.A01;
        AbstractC13880nE.A0k(gridLinesView, i2, i3, i2, i3);
        View view = this.A03;
        if (view != null) {
            AbstractC13880nE.A0k(view, i2, i3, i2, i3);
        }
        C50724MaP c50724MaP = this.A06;
        UserSession A0r = AbstractC166987dD.A0r(c50724MaP.A0i);
        if (C18U.A06(AbstractC25225BEi.A0j(A0r, 0), A0r, 36315451727613171L)) {
            View view2 = this.A04;
            View view3 = this.A02;
            if (i2 <= 0 && i3 <= 0) {
                view2.setVisibility(8);
                view3.setVisibility(8);
            } else {
                view2.setVisibility(0);
                view3.setVisibility(0);
                if (i2 > 0) {
                    AbstractC13880nE.A0g(view2, i2);
                    AbstractC13880nE.A0W(view2, -1);
                    AbstractC13880nE.A0X(view2, 8388611);
                    AbstractC13880nE.A0g(view3, i2);
                    AbstractC13880nE.A0W(view3, -1);
                    i = 8388613;
                } else {
                    AbstractC13880nE.A0g(view2, -1);
                    AbstractC13880nE.A0W(view2, i3);
                    AbstractC13880nE.A0X(view2, 48);
                    AbstractC13880nE.A0g(view3, -1);
                    AbstractC13880nE.A0W(view3, i3);
                    i = 80;
                }
                AbstractC13880nE.A0X(view3, i);
            }
        }
        InteractiveDrawableContainer interactiveDrawableContainer = c50724MaP.A0T;
        if (interactiveDrawableContainer != null) {
            AbstractC13880nE.A0k(interactiveDrawableContainer, i2, i3, i2, i3);
        }
    }
}
