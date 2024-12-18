package X;

import android.content.Context;

/* loaded from: classes11.dex */
public final class Ut3 extends C126555nq implements InterfaceC51052Wb {
    public X9M A00;
    public C135266Ab A01;
    public final C51092Wf A02;
    public final C51092Wf A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ut3(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A02 = new C51092Wf(this, C1LN.A01);
        this.A03 = new C51092Wf(this, C1LN.A01);
    }

    @Override // X.C126555nq
    public final void A0P(boolean z, int i, int i2, int i3, int i4) {
        X9M x9m = this.A00;
        if (x9m != null) {
            C135266Ab c135266Ab = this.A01;
            if (c135266Ab != null) {
                this.A03.A0F(c135266Ab.A01);
            }
            int i5 = 0;
            while (true) {
                if (x9m.equals(this.A00) && this.A01 != null) {
                    break;
                }
                if (i5 > 4) {
                    C50662Um.A03("LazyMeasureHostView", AbstractC111324zv.A00(3681));
                    return;
                }
                int i6 = i3 - i;
                int i7 = i4 - i2;
                C135266Ab Bmg = x9m.Bmg(this.A01, C78443fA.A00.A00(i6, i6, i7, i7));
                this.A03.A0F(Bmg.A01);
                this.A01 = Bmg;
                i5++;
            }
        }
        AbstractC131835xJ.A00(this);
    }

    @Override // X.InterfaceC51052Wb
    public final void Ctb() {
        AbstractC87343us.A00(this, this.A03);
    }

    @Override // X.InterfaceC51052Wb
    public final void DeQ(Long l) {
        AbstractC87343us.A02(this.A03, l);
    }

    @Override // X.InterfaceC51052Wb
    public final void Dwi() {
        AbstractC87343us.A01(this.A03);
    }

    public C51092Wf getMountState() {
        return this.A03;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C135266Ab Bmg;
        X9M x9m = this.A00;
        if (x9m == null) {
            setMeasuredDimension(0, 0);
            Bmg = null;
        } else {
            Bmg = x9m.Bmg(this.A01, AbstractC78403f6.A00(i, i2));
            C79243gV c79243gV = Bmg.A01;
            setMeasuredDimension(c79243gV.A01(), c79243gV.A00());
        }
        this.A01 = Bmg;
    }

    public final void setLazyRenderTreeProvider(X9M x9m) {
        if (!C14360o3.A0K(this.A00, x9m)) {
            if (x9m == null) {
                this.A01 = null;
                this.A03.A0C();
            }
            this.A00 = x9m;
            requestLayout();
        }
    }

    @Override // X.InterfaceC51052Wb
    public void setRenderTreeUpdateListener(InterfaceC66812zy interfaceC66812zy) {
        this.A03.A0H(interfaceC66812zy);
    }

    @Override // android.view.View
    public final void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
        Ctb();
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
        Ctb();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1835842661);
        super.onAttachedToWindow();
        this.A03.A0A();
        C0f9.A0D(1150753886, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1018701990);
        super.onDetachedFromWindow();
        this.A03.A0B();
        C0f9.A0D(134985777, A06);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        Ctb();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        Ctb();
    }
}
