package X;

import android.app.Activity;
import android.os.Build;

/* renamed from: X.CcB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28213CcB {
    public boolean A00;
    public final Activity A01;
    public final InterfaceC09390do A02;
    public final boolean A03;

    public C28213CcB(Activity activity, boolean z) {
        C14360o3.A0B(activity, 1);
        this.A01 = activity;
        this.A03 = z;
        this.A02 = C1XM.A00(AbstractC25225BEi.A1E(this, 21));
    }

    public static final boolean A00(C28213CcB c28213CcB) {
        if (c28213CcB.A03 && Build.VERSION.SDK_INT < 35) {
            return true;
        }
        return false;
    }

    public final void A01(float f) {
        if (A00(this)) {
            InterfaceC09390do interfaceC09390do = this.A02;
            if (interfaceC09390do.getValue() != null) {
                C169367hA c169367hA = C169367hA.A00;
                C14360o3.A07(c169367hA);
                Number number = (Number) c169367hA.evaluate(f, interfaceC09390do.getValue(), AbstractC25227BEk.A0o());
                if (number != null) {
                    this.A01.getWindow().setStatusBarColor(number.intValue());
                }
                if (f > 0.5d && !this.A00) {
                    AbstractC56402iY.A06(this.A01, true);
                    this.A00 = true;
                }
            }
        }
    }
}
