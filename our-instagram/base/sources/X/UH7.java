package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class UH7 extends AbstractC70653Fc {
    public final /* synthetic */ UEx A02;
    public final Calendar A01 = AbstractC65702TsY.A0l();
    public final Calendar A00 = AbstractC65702TsY.A0l();

    public UH7(UEx uEx) {
        this.A02 = uEx;
    }

    @Override // X.AbstractC70653Fc
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        Object obj;
        int i;
        int width;
        C2UU c2uu = recyclerView.A0A;
        if (c2uu instanceof UGV) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            if (abstractC70663Fe instanceof GridLayoutManager) {
                UGV ugv = (UGV) c2uu;
                GridLayoutManager gridLayoutManager = (GridLayoutManager) abstractC70663Fe;
                UEx uEx = this.A02;
                Iterator it = uEx.A06.Bsm().iterator();
                while (it.hasNext()) {
                    C3AY c3ay = (C3AY) it.next();
                    Object obj2 = c3ay.A00;
                    if (obj2 != null && (obj = c3ay.A01) != null) {
                        Calendar calendar = this.A01;
                        calendar.setTimeInMillis(((Number) obj2).longValue());
                        Calendar calendar2 = this.A00;
                        calendar2.setTimeInMillis(((Number) obj).longValue());
                        int i2 = calendar.get(1);
                        UEx uEx2 = ugv.A00;
                        int i3 = i2 - uEx2.A04.A05.A04;
                        int i4 = calendar2.get(1) - uEx2.A04.A05.A04;
                        View A0d = gridLayoutManager.A0d(i3);
                        View A0d2 = gridLayoutManager.A0d(i4);
                        int i5 = gridLayoutManager.A00;
                        int i6 = i3 / i5;
                        int i7 = i4 / i5;
                        for (int i8 = i6; i8 <= i7; i8++) {
                            View A0d3 = gridLayoutManager.A0d(gridLayoutManager.A00 * i8);
                            if (A0d3 != null) {
                                int top = A0d3.getTop() + uEx.A05.A07.A00.top;
                                int bottom = A0d3.getBottom() - uEx.A05.A07.A00.bottom;
                                if (i8 == i6) {
                                    i = A0d.getLeft() + (A0d.getWidth() / 2);
                                } else {
                                    i = 0;
                                }
                                if (i8 == i7) {
                                    width = A0d2.getLeft() + (A0d2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(i, top, width, bottom, uEx.A05.A00);
                            }
                        }
                    }
                }
            }
        }
    }
}
