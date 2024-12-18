package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WQP implements C03L {
    public final /* synthetic */ boolean A00;

    public WQP(boolean z) {
        this.A00 = z;
    }

    @Override // X.C03L
    public final C011504d Cx7(View view, C011504d c011504d) {
        int A03;
        AbstractC167017dG.A1N(view, c011504d);
        C011504d A05 = AbstractC010103p.A05(view, c011504d);
        AbstractC56402iY.A00 = A05.A03();
        C011304b c011304b = A05.A00;
        int i = c011304b.A03().A01;
        if (this.A00) {
            A03 = 0;
        } else {
            A03 = A05.A03();
        }
        return A05.A05(i, A03, c011304b.A03().A02, A05.A02());
    }
}
