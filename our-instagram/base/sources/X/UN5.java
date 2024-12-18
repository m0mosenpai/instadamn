package X;

import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public final class UN5 extends AbstractC139766Uf {
    public final /* synthetic */ W1l A00;

    public UN5(W1l w1l) {
        this.A00 = w1l;
    }

    @Override // X.C5GG
    public final void DH1(Drawable drawable, C3QB c3qb, int i, long j) {
        if (!(drawable instanceof UMO)) {
            AbstractC25241Le.A02(AbstractC111324zv.A00(289), "Can only use BKBloksComponentsKeyframeBinderUtil with AnimatableKeyframesDrawable");
            return;
        }
        W1l w1l = this.A00;
        InterfaceC58682mR interfaceC58682mR = ((UMO) drawable).A01;
        C14360o3.A07(interfaceC58682mR);
        if (C14360o3.A0K(w1l.A00, interfaceC58682mR)) {
            return;
        }
        w1l.A00 = interfaceC58682mR;
        W1l.A00(w1l);
    }
}
