package X;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.5pD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC127345pD extends AbstractC115835Lx {
    public float A00;
    public float A01;
    public InterfaceC31031DkU A02;

    public void A02(View view, Integer num, String str, float f, float f2, int i, int i2) {
    }

    public void A03(View view, Integer num, String str, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        if (i != 0) {
            f = A00(view) + i;
            f2 = A01(view) + i2;
        } else {
            f = this.A00;
            f2 = this.A01;
        }
        A02(view, num, str, f, f2, i3, i4);
        InterfaceC31031DkU interfaceC31031DkU = this.A02;
        if (interfaceC31031DkU != null) {
            interfaceC31031DkU.D3M(new CUB(new PointF(f, f2), new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()), view, AbstractC68329VMp.A00(num), str));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (motionEvent.getAction() == 0) {
            this.A00 = motionEvent.getX();
            this.A01 = motionEvent.getY();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private final int A00(View view) {
        View view2;
        if (view == null) {
            C0w9.A03("BaseCompositionView#getRelativeLeft", "The view is not a child of IgShowreelCompositionView");
            return 0;
        }
        if (view.getParent() == this) {
            return view.getLeft();
        }
        int left = view.getLeft();
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        return A00(view2) + left;
    }

    private final int A01(View view) {
        View view2;
        if (view == null) {
            C0w9.A03("BaseCompositionView#getRelativeTop", "The view is not a child of IgShowreelCompositionView");
            return 0;
        }
        if (view.getParent() == this) {
            return view.getTop();
        }
        int top = view.getTop();
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        return A01(view2) + top;
    }

    public final void setInteractivityListener(InterfaceC31031DkU interfaceC31031DkU) {
        this.A02 = interfaceC31031DkU;
    }
}
