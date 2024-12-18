package X;

import android.view.View;

/* renamed from: X.72E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C72E {
    public int A00;
    public int A01;
    public int A02;
    public final View A03;

    public final void A00() {
        View view = this.A03;
        view.offsetTopAndBottom(this.A02 - (view.getTop() - this.A01));
        view.offsetLeftAndRight(-(view.getLeft() - this.A00));
    }

    public C72E(View view) {
        this.A03 = view;
    }
}
