package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UHB extends AbstractC70653Fc {
    public int A00;
    public Drawable A01;
    public boolean A02 = true;
    public final /* synthetic */ UEz A03;

    public UHB(UEz uEz) {
        this.A03 = uEz;
    }

    @Override // X.AbstractC70653Fc
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C3F5 c3f5) {
        if (this.A01 != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (A00(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.A01.setBounds(0, y, width, this.A00 + y);
                    this.A01.draw(canvas);
                }
            }
        }
    }

    private boolean A00(View view, RecyclerView recyclerView) {
        C3OO A0Y = recyclerView.A0Y(view);
        if (!(A0Y instanceof C66482UJh) || !((C66482UJh) A0Y).A02) {
            return false;
        }
        boolean z = this.A02;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild < recyclerView.getChildCount() - 1) {
            C3OO A0Y2 = recyclerView.A0Y(recyclerView.getChildAt(indexOfChild + 1));
            if (!(A0Y2 instanceof C66482UJh) || !((C66482UJh) A0Y2).A01) {
                return false;
            }
            return true;
        }
        return z;
    }

    @Override // X.AbstractC70653Fc
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3F5 c3f5) {
        if (A00(view, recyclerView)) {
            rect.bottom = this.A00;
        }
    }
}
