package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.76h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1577376h {
    public static final void A00(View view) {
        AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
        A01.A0G();
        A01.A0P(1.0f, -1.0f);
        A01.A0Q(1.0f, -1.0f);
        A01.A03 = 0;
        A01.A0E(C55942hf.A04(60.0d, 5.0d)).A0F(true).A0H();
    }

    public static final void A01(View view, ViewGroup viewGroup, boolean z) {
        C14360o3.A0B(viewGroup, 2);
        boolean z2 = false;
        if (view.getLayoutDirection() == 1) {
            z2 = true;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        if (z) {
            f2 = 1.0f;
            viewGroup.setVisibility(0);
        }
        AbstractC125325le A01 = AbstractC125325le.A01(viewGroup, 0);
        A01.A0G();
        if (z2) {
            f = viewGroup.getWidth();
        }
        A01.A0P(f2, f);
        A01.A0Q(f2, viewGroup.getHeight() / 2.0f);
        AbstractC125325le A0F = A01.A0F(true);
        A0F.A05 = new C24092Amd(viewGroup, z);
        A0F.A0H();
    }
}
