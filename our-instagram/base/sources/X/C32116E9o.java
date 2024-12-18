package X;

import android.view.animation.DecelerateInterpolator;

/* renamed from: X.E9o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32116E9o extends AbstractC82213li {
    public final InterfaceC16820sZ A00;

    @Override // X.C3F1
    public final long A06() {
        return 40L;
    }

    @Override // X.C3F1
    public final long A07() {
        return 80L;
    }

    @Override // X.C3F1
    public final long A08() {
        return 80L;
    }

    @Override // X.C3F1
    public final long A09() {
        return 40L;
    }

    @Override // X.C3F1
    public final void A0B(C3OO c3oo) {
        C14360o3.A0B(c3oo, 0);
        this.A00.invoke();
    }

    public C32116E9o(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
        this.A0B = new DecelerateInterpolator();
    }
}
