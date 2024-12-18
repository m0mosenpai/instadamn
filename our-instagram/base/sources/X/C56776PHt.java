package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.PHt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56776PHt implements InterfaceC149626oF {
    public float A00;
    public boolean A01;
    public final O3Z A02;
    public final C56779PHw A03;
    public final C50546MTb A04;
    public final GestureDetector A05;

    public C56776PHt(Context context, O3Z o3z) {
        C14360o3.A0B(o3z, 2);
        this.A02 = o3z;
        this.A00 = -1.0f;
        this.A03 = new C56779PHw(this);
        this.A04 = new C50546MTb(context);
        this.A05 = new GestureDetector(context, new C51471MoI(this, 0));
    }

    @Override // X.InterfaceC149626oF
    public final boolean DMc(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A05.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            this.A00 = motionEvent.getRawY();
            this.A01 = false;
        } else if (actionMasked == 2) {
            if (this.A00 - motionEvent.getRawY() < 0.0f) {
                z = true;
            }
            this.A01 = z;
        }
        return this.A01;
    }

    @Override // X.InterfaceC149626oF
    public final boolean Du7(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 2) {
            O3Z o3z = this.A02;
            if (this.A00 - motionEvent.getRawY() < 0.0f) {
                C55558Ols c55558Ols = o3z.A00;
                if (AbstractC43593JPy.A0D(c55558Ols.A06) != null) {
                    c55558Ols.A01.A08(1.0f + MSX.A00(r2, r0), true);
                }
            }
        } else if (actionMasked == 1 && this.A01) {
            C55982hj c55982hj = this.A02.A00.A01;
            c55982hj.A08(c55982hj.A09.A00, true);
            c55982hj.A03();
        }
        return this.A05.onTouchEvent(motionEvent);
    }

    @Override // X.InterfaceC149626oF
    public final void EJW(float f, float f2) {
    }

    @Override // X.InterfaceC149626oF
    public final void destroy() {
    }
}
