package X;

import android.text.InputFilter;
import android.widget.TextView;

/* renamed from: X.3WM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WM extends C3WN {
    public final C3WO A00;

    @Override // X.C3WN
    public final void A02(boolean z) {
        boolean z2 = false;
        if (C58341Ptc.A09 != null) {
            z2 = true;
        }
        boolean z3 = !z2;
        C3WO c3wo = this.A00;
        if (z3) {
            c3wo.A00 = z;
        } else {
            c3wo.A02(z);
        }
    }

    @Override // X.C3WN
    public final InputFilter[] A04(InputFilter[] inputFilterArr) {
        if (C58341Ptc.A09 != null) {
            return this.A00.A04(inputFilterArr);
        }
        return inputFilterArr;
    }

    public C3WM(TextView textView) {
        this.A00 = new C3WO(textView);
    }
}
