package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;

/* loaded from: classes11.dex */
public final class UMD extends C5SZ implements View.OnTouchListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C68742VbL A04;
    public Integer A05;
    public Integer A06;
    public int A07;
    public int A08;
    public boolean A09;
    public final View A0A;
    public final Ut2 A0B;
    public final C55982hj A0C;
    public final C55982hj A0D;
    public final Handler A0E;
    public final GestureDetector A0F;
    public final Scroller A0G;
    public final C55952hg A0H;

    public UMD(View view) {
        C14360o3.A0B(view, 1);
        this.A0A = view;
        this.A05 = C05F.A01;
        this.A06 = C05F.A00;
        Handler A0J = AbstractC167007dF.A0J();
        this.A0E = A0J;
        Context context = view.getContext();
        this.A0F = new GestureDetector(context, this, A0J);
        this.A0G = new Scroller(context);
        C55952hg A00 = AbstractC13560mi.A00();
        this.A0H = A00;
        this.A0C = A00.A02();
        this.A0D = A00.A02();
        this.A0B = new Ut2(this, 4);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A07 = (int) motionEvent.getRawX();
        this.A08 = (int) motionEvent.getRawY();
        return false;
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14360o3.A0B(motionEvent2, 1);
        this.A09 = true;
        int rawX = (int) motionEvent2.getRawX();
        int rawY = (int) motionEvent2.getRawY();
        double d = rawX - this.A07;
        double d2 = rawY - this.A08;
        C55982hj c55982hj = this.A0C;
        double d3 = c55982hj.A09.A00 + d;
        C55982hj c55982hj2 = this.A0D;
        double d4 = c55982hj2.A09.A00 + d2;
        c55982hj.A08(d3, true);
        c55982hj2.A08(d4, true);
        this.A07 = rawX;
        this.A08 = rawY;
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 1);
        if (motionEvent.getActionMasked() == 1 && this.A09) {
            A01(null, null, this.A07, this.A08);
            this.A09 = false;
        }
        return this.A0F.onTouchEvent(motionEvent);
    }

    public static final UQ7 A00(UMD umd) {
        int i = umd.A01;
        View view = umd.A0A;
        return new UQ7(i + (view.getWidth() / 2), umd.A03 + (view.getHeight() / 2), umd.A02 - (view.getWidth() / 2), umd.A00 - (view.getHeight() / 2), 0);
    }

    private final void A01(Double d, Double d2, int i, int i2) {
        Integer num;
        Integer num2;
        int i3;
        int i4;
        UQ7 A00 = A00(this);
        if (i > ((A00.A01 + A00.A02) >> 1)) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        if (i2 > ((A00.A03 + A00.A00) >> 1)) {
            num2 = C05F.A01;
        } else {
            num2 = C05F.A00;
        }
        if (d != null) {
            this.A0C.A07(d.doubleValue());
        }
        if (d2 != null) {
            this.A0D.A07(d2.doubleValue());
        }
        this.A05 = num;
        this.A06 = num2;
        Integer num3 = C05F.A00;
        if (num == num3) {
            i3 = A00.A01;
        } else {
            i3 = A00.A02;
        }
        if (num2 == num3) {
            i4 = A00.A03;
        } else {
            i4 = A00.A00;
        }
        View view = this.A0A;
        this.A0C.A06(view.getTranslationX() + (i3 - AbstractC50524MSc.A01(view)));
        this.A0D.A06(view.getTranslationY() + (i4 - AbstractC50524MSc.A02(view)));
    }

    @Override // X.C5SZ, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        UQ7 A00 = A00(this);
        Scroller scroller = this.A0G;
        scroller.abortAnimation();
        View view = this.A0A;
        scroller.fling(AbstractC50524MSc.A01(view), AbstractC50524MSc.A02(view), (int) f, (int) f2, A00.A01, A00.A02, A00.A03, A00.A00);
        A01(Double.valueOf(f), Double.valueOf(f2), scroller.getFinalX(), scroller.getFinalY());
        return true;
    }
}
