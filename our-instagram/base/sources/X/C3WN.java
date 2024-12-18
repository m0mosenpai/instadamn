package X;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* renamed from: X.3WN, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3WN {
    public TransformationMethod A00(TransformationMethod transformationMethod) {
        C3WM c3wm = (C3WM) this;
        if (C58341Ptc.A09 != null) {
            return c3wm.A00.A00(transformationMethod);
        }
        return transformationMethod;
    }

    public abstract void A02(boolean z);

    public final boolean A03() {
        return ((C3WM) this).A00.A00;
    }

    public abstract InputFilter[] A04(InputFilter[] inputFilterArr);

    public final void A01(boolean z) {
        if (this instanceof C3WM) {
            C3WM c3wm = (C3WM) this;
            if (C58341Ptc.A09 != null) {
                c3wm.A00.A01(z);
                return;
            }
            return;
        }
        C3WO c3wo = (C3WO) this;
        if (!z) {
            return;
        }
        TextView textView = c3wo.A01;
        textView.setTransformationMethod(c3wo.A00(textView.getTransformationMethod()));
    }
}
