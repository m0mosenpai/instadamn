package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import com.facebook.common.draggableview.DraggableViewContainer;
import java.util.Iterator;

/* renamed from: X.MoK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51473MoK extends C5SZ {
    public Scroller A00;
    public final /* synthetic */ DraggableViewContainer A01;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        DraggableViewContainer draggableViewContainer = this.A01;
        draggableViewContainer.A03 = (int) motionEvent.getX();
        draggableViewContainer.A04 = (int) motionEvent.getY();
        return true;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        int x = (int) motionEvent2.getX();
        int y = (int) motionEvent2.getY();
        DraggableViewContainer draggableViewContainer = this.A01;
        if (draggableViewContainer.A09 != null) {
            double d = x - draggableViewContainer.A03;
            double d2 = y - draggableViewContainer.A04;
            draggableViewContainer.A03 = x;
            draggableViewContainer.A04 = y;
            C55982hj c55982hj = draggableViewContainer.A0K;
            double d3 = c55982hj.A09.A00 + d;
            C55982hj c55982hj2 = draggableViewContainer.A0L;
            double d4 = c55982hj2.A09.A00 + d2;
            c55982hj.A08(d3, true);
            c55982hj2.A08(d4, true);
            return false;
        }
        return false;
    }

    public C51473MoK(DraggableViewContainer draggableViewContainer) {
        this.A01 = draggableViewContainer;
        this.A00 = new Scroller(draggableViewContainer.getContext());
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        UQ7 centerBounds;
        DraggableViewContainer draggableViewContainer = this.A01;
        centerBounds = draggableViewContainer.getCenterBounds();
        Scroller scroller = this.A00;
        scroller.abortAnimation();
        View view = draggableViewContainer.A09;
        if (view != null) {
            int i = centerBounds.A01;
            int i2 = centerBounds.A02;
            int i3 = centerBounds.A03;
            int i4 = centerBounds.A00;
            scroller.fling(AbstractC50524MSc.A01(view), AbstractC50524MSc.A02(view), (int) f, (int) f2, i, i2, i3, i4);
            int i5 = i;
            if (scroller.getFinalX() > ((centerBounds.A01 + centerBounds.A02) >> 1)) {
                i5 = i2;
            }
            if (scroller.getFinalY() > ((centerBounds.A03 + centerBounds.A00) >> 1)) {
                i3 = i4;
            }
            boolean A1P = AbstractC167007dF.A1P(scroller.getFinalX(), i);
            if (DraggableViewContainer.A09(view, draggableViewContainer, A1P)) {
                i5 = DraggableViewContainer.A00(view, draggableViewContainer, A1P);
            }
            DraggableViewContainer.A06(draggableViewContainer, Double.valueOf(f), Double.valueOf(f2), i5, i3);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        Iterator it = this.A01.A0M.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        DraggableViewContainer draggableViewContainer = this.A01;
        View view = draggableViewContainer.A09;
        if (draggableViewContainer.A0C && view != null) {
            boolean z = false;
            int A01 = AbstractC50524MSc.A01(view);
            if (A01 < 0 || A01 > draggableViewContainer.getWidth()) {
                z = true;
            }
            DraggableViewContainer.A04(view, draggableViewContainer, AbstractC31172DnG.A0s(z));
            return true;
        }
        Iterator it = draggableViewContainer.A0M.iterator();
        while (it.hasNext()) {
            ((InterfaceC57897Pm1) it.next()).APJ();
        }
        return false;
    }
}
