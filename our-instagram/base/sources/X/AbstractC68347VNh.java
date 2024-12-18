package X;

import android.content.res.TypedArray;
import android.widget.Button;

/* renamed from: X.VNh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68347VNh {
    public static final void A00(Button button, int i) {
        TypedArray obtainStyledAttributes = button.getContext().obtainStyledAttributes(C2FP.A0A().A01(i), AbstractC55922hc.A0j);
        C14360o3.A07(obtainStyledAttributes);
        button.setGravity(obtainStyledAttributes.getInt(0, 0));
        obtainStyledAttributes.recycle();
    }
}
