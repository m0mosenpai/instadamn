package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;
import androidx.activity.ComponentActivity;

/* renamed from: X.MoL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51474MoL extends C5SZ {
    public static int A0E;
    public static Float A0F;
    public static Float A0G;
    public int A00;
    public Rect A01;
    public boolean A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public final Activity A07;
    public final View.OnTouchListener A08;
    public final View A09;
    public final Scroller A0A;
    public final C55982hj A0B;
    public final C55982hj A0C;
    public final InterfaceC16820sZ A0D;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A03 = (int) motionEvent.getRawX();
        this.A04 = (int) motionEvent.getRawY();
        C55982hj c55982hj = this.A0B;
        View view = this.A09;
        c55982hj.A08(view.getX(), true);
        C55982hj c55982hj2 = this.A0C;
        c55982hj2.A08(view.getY(), true);
        this.A05 = this.A03 - ((int) c55982hj.A09.A00);
        this.A06 = this.A04 - ((int) c55982hj2.A09.A00);
        return true;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        this.A03 = (int) motionEvent2.getRawX();
        this.A04 = (int) motionEvent2.getRawY();
        this.A0B.A08(this.A03 - this.A05, true);
        this.A0C.A08(this.A04 - this.A06, true);
        return false;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        int i2;
        Rect A00 = A00(this);
        Scroller scroller = this.A0A;
        scroller.abortAnimation();
        scroller.fling(this.A03, this.A04, (int) f, (int) f2, A00.left, A00.right, A00.top, A00.bottom);
        float f3 = (A00.top + A00.bottom) / 2.0f;
        if (scroller.getFinalX() > (A00.left + A00.right) / 2.0f) {
            i = A00.right;
        } else {
            i = A00.left;
        }
        if (scroller.getFinalY() > f3) {
            i2 = A00.bottom;
        } else {
            i2 = A00.top;
        }
        C55982hj c55982hj = this.A0B;
        c55982hj.A07(f);
        c55982hj.A06(i);
        C55982hj c55982hj2 = this.A0C;
        c55982hj2.A07(f2);
        c55982hj2.A06(i2);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View view = this.A09;
        if (view.hasOnClickListeners()) {
            return view.performClick();
        }
        this.A0D.invoke();
        return true;
    }

    public /* synthetic */ C51474MoL(Activity activity, View view, InterfaceC16820sZ interfaceC16820sZ) {
        Context context = view.getContext();
        Scroller scroller = new Scroller(context);
        C14360o3.A0B(interfaceC16820sZ, 4);
        this.A09 = view;
        this.A07 = activity;
        this.A0A = scroller;
        this.A0D = interfaceC16820sZ;
        C55952hg A00 = AbstractC13560mi.A00();
        C51977MyL c51977MyL = new C51977MyL(this);
        C55942hf c55942hf = C55942hf.A02;
        C55982hj A02 = A00.A02();
        A02.A09(c55942hf);
        A02.A0A(c51977MyL);
        this.A0B = A02;
        C55982hj A022 = A00.A02();
        A022.A09(c55942hf);
        A022.A0A(c51977MyL);
        this.A0C = A022;
        this.A08 = new ViewOnTouchListenerC55485Oke(new GestureDetector(context, this), this);
        if (activity instanceof ComponentActivity) {
            new C55557Olr((ComponentActivity) activity, MSW.A1E(this, 44));
        }
    }

    public static final Rect A00(C51474MoL c51474MoL) {
        int i;
        int width;
        Rect A0U;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Rect A0U2 = AbstractC166987dD.A0U();
        Rect rect = c51474MoL.A01;
        if (rect == null) {
            View view = c51474MoL.A09;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                A0U = AbstractC166987dD.A0V(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            } else {
                A0U = AbstractC166987dD.A0U();
            }
            A0U2.top = A0U.top;
            A0U2.bottom = ((AbstractC124845kp.A01(view).getHeight() - view.getHeight()) - A0U.bottom) - c51474MoL.A00;
            A0U2.left = A0U.left;
            i = AbstractC124845kp.A01(view).getWidth() - view.getWidth();
            width = A0U.right;
        } else {
            A0U2.top = rect.top;
            int i2 = rect.bottom;
            View view2 = c51474MoL.A09;
            A0U2.bottom = (i2 - view2.getHeight()) - c51474MoL.A00;
            A0U2.left = rect.left;
            i = rect.right;
            width = view2.getWidth();
        }
        A0U2.right = i - width;
        return A0U2;
    }

    public final void A01() {
        Rect A00 = A00(this);
        View view = this.A09;
        int x = (int) view.getX();
        int y = (int) view.getY();
        Point point = new Point();
        int i = A00.left;
        point.x = AbstractC50522MSa.A05(x, i, A00.right, i);
        int i2 = A00.top;
        point.y = AbstractC50522MSa.A05(y, i2, A00.bottom, i2);
        C55982hj c55982hj = this.A0B;
        c55982hj.A08(x, true);
        c55982hj.A06(point.x);
        C55982hj c55982hj2 = this.A0C;
        c55982hj2.A08(y, true);
        c55982hj2.A06(point.y);
    }
}
