package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UHR extends C1I4 implements C7LD {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = -1;
    public int A05;

    @Override // X.C7LD
    public final boolean DMd(MotionEvent motionEvent, RecyclerView recyclerView) {
        float y;
        C14360o3.A0B(motionEvent, 1);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.A04 = motionEvent.getPointerId(actionIndex);
                    this.A02 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    y = motionEvent.getY(actionIndex);
                }
            } else {
                int findPointerIndex = motionEvent.findPointerIndex(this.A04);
                if (findPointerIndex >= 0 && this.A05 != 1) {
                    int x = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    this.A00 = x - this.A02;
                    this.A01 = y2 - this.A03;
                    return false;
                }
            }
            return false;
        }
        this.A04 = motionEvent.getPointerId(0);
        this.A02 = (int) (motionEvent.getX() + 0.5f);
        y = motionEvent.getY();
        this.A03 = (int) (y + 0.5f);
        return false;
    }

    @Override // X.C7LD
    public final void Dfm(boolean z) {
    }

    @Override // X.C7LD
    public final void Du8(MotionEvent motionEvent, RecyclerView recyclerView) {
    }

    @Override // X.C1I4
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        AbstractC70663Fe abstractC70663Fe;
        boolean A1X;
        boolean A1Y;
        int A0N = AbstractC167017dG.A0N(recyclerView, 755970129);
        int i2 = this.A05;
        this.A05 = i;
        if (i2 == 0 && i == 1 && (abstractC70663Fe = recyclerView.A0D) != null && (A1X = abstractC70663Fe.A1X()) != (A1Y = abstractC70663Fe.A1Y()) && ((A1X && Math.abs(this.A01) > Math.abs(this.A00)) || (A1Y && Math.abs(this.A00) > Math.abs(this.A01)))) {
            recyclerView.A0k();
        }
        C0f9.A0A(2028388739, A0N);
    }
}
