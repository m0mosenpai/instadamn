package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: X.Kr8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47051Kr8 {
    public static final void A00(EnumC46131KbV enumC46131KbV, C44435Jko c44435Jko) {
        float f;
        AbstractC167007dF.A1K(c44435Jko, enumC46131KbV);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (enumC46131KbV == EnumC46131KbV.A02) {
            ((ViewGroup.LayoutParams) layoutParams).width = 0;
            f = 1.0f;
        } else {
            ((ViewGroup.LayoutParams) layoutParams).width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
        c44435Jko.setLayoutParams(layoutParams);
    }
}
