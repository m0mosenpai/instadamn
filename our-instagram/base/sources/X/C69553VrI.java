package X;

import android.view.View;

/* renamed from: X.VrI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69553VrI {
    public final View A00;
    public final C55982hj A01;

    public C69553VrI(View view) {
        this.A00 = view;
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A0A(new Ut1(this));
        A0R.A02();
        this.A01 = A0R;
    }

    public final void A00(float f) {
        if (C11T.A08()) {
            this.A01.A07(f);
        } else {
            this.A00.post(new RunnableC71490Wuq(this, f));
        }
    }
}
