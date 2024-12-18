package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Ola, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55540Ola implements C03L {
    @Override // X.C03L
    public final C011504d Cx7(View view, C011504d c011504d) {
        AbstractC167017dG.A1N(view, c011504d);
        C02I A05 = c011504d.A00.A05(7);
        C14360o3.A07(A05);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = A05.A03;
            marginLayoutParams.bottomMargin = A05.A00;
            view.setLayoutParams(marginLayoutParams);
            return C011504d.A01;
        }
        throw AbstractC166987dD.A15(AbstractC111324zv.A00(20));
    }
}
