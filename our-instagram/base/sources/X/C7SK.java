package X;

import android.view.View;

/* renamed from: X.7SK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SK implements C7QD {
    public final C57012jc A00;

    @Override // X.C7QD
    public final View BKF() {
        View view;
        C57012jc c57012jc = this.A00;
        if (c57012jc.A00 != null) {
            view = c57012jc.A01();
        } else {
            view = c57012jc.A01;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C7SK(C57012jc c57012jc) {
        this.A00 = c57012jc;
    }
}
