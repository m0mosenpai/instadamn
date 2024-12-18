package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import com.instagram.common.ui.widget.calendar.CalendarRecyclerView;
import com.instagram.model.reels.Reel;

/* loaded from: classes9.dex */
public final class NS8 extends AbstractC140596Xn {
    public final GridLayoutManager A00;
    public final C52375NFr A01;
    public final CalendarRecyclerView A02;
    public final RectF A03;

    @Override // X.AbstractC140596Xn
    public final void A08(Reel reel) {
    }

    @Override // X.AbstractC140596Xn
    public final void A09(Reel reel, C41181vS c41181vS) {
        C3OO A0W;
        C52375NFr c52375NFr = this.A01;
        int A02 = c52375NFr.A02(reel);
        if (A02 != -1) {
            GridLayoutManager gridLayoutManager = this.A00;
            int A1c = gridLayoutManager.A1c();
            int A1d = gridLayoutManager.A1d();
            if (A02 < A1c || A02 > A1d) {
                gridLayoutManager.A1O(A02);
            }
        }
        int A022 = c52375NFr.A02(reel);
        if (A022 != -1 && (A0W = this.A02.A0W(A022, false)) != null) {
            A0W.itemView.setAlpha(0.0f);
            A0W.itemView.setScaleX(0.7f);
            A0W.itemView.setScaleY(0.7f);
        }
    }

    @Override // X.AbstractC140596Xn
    public final void A0B(Reel reel, C41181vS c41181vS) {
        int A02 = this.A01.A02(reel);
        if (A02 != -1) {
            GridLayoutManager gridLayoutManager = this.A00;
            int A1c = gridLayoutManager.A1c();
            int A1d = gridLayoutManager.A1d();
            if (A02 < A1c || A02 > A1d) {
                gridLayoutManager.A1O(A02);
            }
        }
    }

    public NS8(Activity activity, C52375NFr c52375NFr, CalendarRecyclerView calendarRecyclerView, InterfaceC63982vJ interfaceC63982vJ) {
        super(activity, interfaceC63982vJ);
        this.A03 = AbstractC166987dD.A0X();
        this.A02 = calendarRecyclerView;
        AbstractC70663Fe abstractC70663Fe = calendarRecyclerView.A0D;
        abstractC70663Fe.getClass();
        this.A00 = (GridLayoutManager) abstractC70663Fe;
        this.A01 = c52375NFr;
    }

    @Override // X.AbstractC140596Xn
    public final C6PN A07(Reel reel, C41181vS c41181vS) {
        C3OO A0W;
        C6PN A00 = C6PN.A00();
        int A02 = this.A01.A02(reel);
        if (A02 != -1 && (A0W = this.A02.A0W(A02, false)) != null) {
            View view = A0W.itemView;
            RectF rectF = this.A03;
            AbstractC13880nE.A0M(rectF, view);
            rectF.set(rectF.centerX(), rectF.centerY(), rectF.centerX(), rectF.centerY());
            return C6PN.A03(rectF);
        }
        return A00;
    }

    @Override // X.AbstractC140596Xn
    public final void A0A(Reel reel, C41181vS c41181vS) {
        C3OO A0W;
        super.A0A(reel, c41181vS);
        C52375NFr c52375NFr = this.A01;
        c52375NFr.A00 = reel.getId();
        int A02 = c52375NFr.A02(reel);
        if (A02 != -1 && (A0W = this.A02.A0W(A02, false)) != null) {
            A0W.itemView.setVisibility(0);
            View view = A0W.itemView;
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
            AbstractC50523MSb.A1K(A01);
            PHM.A00(A01, this, 0);
        }
    }
}
