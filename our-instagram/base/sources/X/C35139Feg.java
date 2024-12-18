package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.facebook.R;

/* renamed from: X.Feg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35139Feg {
    public static final C35139Feg A00 = new Object();

    public static final boolean A00(View view, View view2, float f, float f2, int i) {
        if (view == null) {
            return false;
        }
        if (view2 != null) {
            RectF A0A = AbstractC31174DnI.A0A(view2);
            f += A0A.left;
            f2 += A0A.top;
        }
        RectF A0A2 = AbstractC31174DnI.A0A(view);
        float f3 = i;
        return f >= A0A2.left - f3 && f <= A0A2.right + f3 && f2 >= A0A2.top - f3 && f2 <= A0A2.bottom + f3;
    }

    public final C09530e4 A01(Activity activity, Context context, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, float f, boolean z, boolean z2) {
        int A01;
        int i;
        int A002;
        if (z2) {
            A01 = context.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height);
        } else if (interfaceC08830cm2 != null && AbstractC166997dE.A1Z(interfaceC08830cm2.get(), false)) {
            A01 = AbstractC13890nF.A01(context) - (AbstractC167017dG.A0E(context) * 2);
        } else {
            A01 = AbstractC13890nF.A01(context);
        }
        if (z) {
            i = activity.getResources().getDimensionPixelSize(R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
        } else {
            i = 0;
        }
        if (z2) {
            A002 = context.getResources().getDimensionPixelSize(R.dimen.ar_effect_picker_background_height);
        } else if (interfaceC08830cm != null && interfaceC08830cm2 != null && AbstractC166997dE.A1Z(interfaceC08830cm2.get(), false)) {
            A002 = AbstractC166987dD.A0H(interfaceC08830cm.get()) - i;
        } else {
            A002 = AbstractC13890nF.A00(context);
        }
        float f2 = A01;
        float f3 = A002;
        if (f > f2 / f3) {
            f3 = f2 / f;
        } else {
            f2 = f3 * f;
        }
        return AbstractC166987dD.A1L(Float.valueOf(f3), Float.valueOf(f2));
    }
}
