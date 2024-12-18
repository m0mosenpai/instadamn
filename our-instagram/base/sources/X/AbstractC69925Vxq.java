package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Vxq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69925Vxq {
    public static final int A00(Context context, W4H w4h) {
        float f;
        int intValue = w4h.A01.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                f = 0.0f;
            } else {
                f = AbstractC13880nE.A00(context, w4h.A00);
            }
        } else {
            f = w4h.A00;
        }
        return C1H4.A01(f);
    }

    public static final void A01(View view, W4P w4p) {
        AbstractC167017dG.A1N(view, w4p);
        W4H w4h = w4p.A01;
        Context context = view.getContext();
        C14360o3.A07(context);
        int A00 = A00(context, w4h);
        W4H w4h2 = w4p.A02;
        C14360o3.A07(context);
        view.setPadding(A00, A00(context, w4p.A03), A00(context, w4h2), A00(context, w4p.A00));
    }
}
