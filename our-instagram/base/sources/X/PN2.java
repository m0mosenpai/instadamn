package X;

import com.instagram.creation.base.ui.grid.GridLinesView;

/* loaded from: classes9.dex */
public final class PN2 implements Runnable {
    public final /* synthetic */ GridLinesView A00;

    public PN2(GridLinesView gridLinesView) {
        this.A00 = gridLinesView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GridLinesView gridLinesView = this.A00;
        C14360o3.A0A(gridLinesView);
        AbstractC13880nE.A0W(gridLinesView, (gridLinesView.getWidth() * 5) / 3);
    }
}
