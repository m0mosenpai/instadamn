package X;

import android.view.animation.Interpolator;

/* renamed from: X.3zM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89803zM implements InterfaceC89793zL {
    public final int A00;
    public final Interpolator A01;

    public C89803zM(int i) {
        this(AbstractC51432Xq.A00, i);
    }

    @Override // X.InterfaceC89793zL
    public final AbstractC107464sr ALd(C107444sp c107444sp) {
        return new C107454sq(this.A01, c107444sp, this.A00);
    }

    public C89803zM(Interpolator interpolator, int i) {
        this.A00 = i;
        this.A01 = interpolator;
    }
}
