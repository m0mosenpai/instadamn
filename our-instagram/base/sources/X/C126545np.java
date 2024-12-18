package X;

import android.content.Context;

/* renamed from: X.5np, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C126545np extends C126555nq implements InterfaceC51052Wb {
    public static final int[] A01 = new int[2];
    public final C65743TtI A00;

    public C65743TtI getRootHostDelegate() {
        return this.A00;
    }

    public C126545np(Context context) {
        super(context);
        this.A00 = new C65743TtI(this);
    }

    @Override // X.InterfaceC51052Wb
    public final void Ctb() {
        getRootHostDelegate().Ctb();
    }

    @Override // X.InterfaceC51052Wb
    public final void DeQ(Long l) {
        getRootHostDelegate().DeQ(l);
    }

    @Override // X.InterfaceC51052Wb
    public final void Dwi() {
        getRootHostDelegate().Dwi();
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
        int A06 = C0f9.A06(1522178918);
        super.onAttachedToWindow();
        getRootHostDelegate().A00().A0A();
        C0f9.A0D(-2142187806, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1729796356);
        super.onDetachedFromWindow();
        getRootHostDelegate().A00().A0B();
        C0f9.A0D(1596863422, A06);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C65743TtI rootHostDelegate = getRootHostDelegate();
        long A00 = AbstractC78403f6.A00(i, i2);
        int[] iArr = A01;
        C14360o3.A0B(iArr, 1);
        if (C78613fT.A08(A00) && C78613fT.A07(A00)) {
            rootHostDelegate.A02 = true;
            iArr[0] = C78613fT.A01(A00);
            iArr[1] = C78613fT.A00(A00);
        } else {
            C6TH c6th = rootHostDelegate.A00;
            if (c6th != null) {
                c6th.A04(A00, iArr);
                rootHostDelegate.A02 = false;
            } else {
                super.onMeasure(i, i2);
                return;
            }
        }
        setMeasuredDimension(iArr[0], iArr[1]);
    }

    public void setRenderState(C6TH c6th) {
        C79243gV c79243gV;
        C65743TtI rootHostDelegate = getRootHostDelegate();
        if (!C14360o3.A0K(rootHostDelegate.A00, c6th)) {
            C6TH c6th2 = rootHostDelegate.A00;
            if (c6th2 != null) {
                c6th2.A02 = null;
            }
            rootHostDelegate.A00 = c6th;
            if (c6th != null) {
                C65743TtI c65743TtI = c6th.A02;
                if (c65743TtI != null && !c65743TtI.equals(rootHostDelegate)) {
                    throw new RuntimeException("Must detach from previous host listener first");
                }
                c6th.A02 = rootHostDelegate;
                c79243gV = c6th.A01;
            } else {
                c79243gV = null;
            }
            rootHostDelegate.A01(c79243gV);
        }
    }

    @Override // X.InterfaceC51052Wb
    public void setRenderTreeUpdateListener(InterfaceC66812zy interfaceC66812zy) {
        getRootHostDelegate().setRenderTreeUpdateListener(interfaceC66812zy);
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
