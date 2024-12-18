package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: X.KmB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46754KmB {
    public static final void A00(KKE kke, EnumC46130KbU enumC46130KbU) {
        float f;
        AbstractC167007dF.A1K(kke, enumC46130KbU);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        int A07 = AbstractC166997dE.A07(kke.getResources());
        layoutParams.setMarginStart(A07);
        layoutParams.setMarginEnd(A07);
        if (enumC46130KbU == EnumC46130KbU.A02) {
            ((ViewGroup.LayoutParams) layoutParams).width = 0;
            f = 1.0f;
        } else {
            ((ViewGroup.LayoutParams) layoutParams).width = -2;
            f = 0.0f;
        }
        layoutParams.weight = f;
        kke.setLayoutParams(layoutParams);
    }
}
