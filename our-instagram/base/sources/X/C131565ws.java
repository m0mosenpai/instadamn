package X;

import android.content.Context;

/* renamed from: X.5ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C131565ws extends C126555nq implements InterfaceC131575wt {
    public C79243gV A00;
    public final C51092Wf A01;

    public final C79243gV getCurrentRenderTree() {
        return this.A00;
    }

    public C51092Wf getMountState() {
        return this.A01;
    }

    @Override // android.view.View
    public final void offsetLeftAndRight(int i) {
        if (i != 0) {
            super.offsetLeftAndRight(i);
            Ctb();
        }
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        if (i != 0) {
            super.offsetTopAndBottom(i);
            Ctb();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C79243gV c79243gV = this.A00;
        if (c79243gV == null) {
            setMeasuredDimension(0, 0);
        } else {
            setMeasuredDimension(c79243gV.A01(), c79243gV.A00());
        }
    }

    @Override // X.InterfaceC131575wt
    public void setRenderTree(C79243gV c79243gV) {
        if (this.A00 != c79243gV) {
            if (c79243gV == null) {
                getMountState().A0C();
            }
            this.A00 = c79243gV;
            requestLayout();
        }
    }

    public C131565ws(Context context) {
        super(context);
        this.A01 = new C51092Wf(this, C1LN.A01);
    }

    @Override // X.InterfaceC51052Wb
    public final void Ctb() {
        AbstractC87343us.A00(this, getMountState());
    }

    @Override // X.InterfaceC51052Wb
    public final void DeQ(Long l) {
        AbstractC87343us.A02(getMountState(), l);
    }

    @Override // X.InterfaceC51052Wb
    public final void Dwi() {
        AbstractC87343us.A01(getMountState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1115170156);
        super.onAttachedToWindow();
        getMountState().A0A();
        C0f9.A0D(-1519291372, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-2004419988);
        super.onDetachedFromWindow();
        getMountState().A0B();
        C0f9.A0D(1180704309, A06);
    }

    @Override // X.InterfaceC51052Wb
    public void setRenderTreeUpdateListener(InterfaceC66812zy interfaceC66812zy) {
        getMountState().A0H(interfaceC66812zy);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            Ctb();
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            Ctb();
        }
    }
}
