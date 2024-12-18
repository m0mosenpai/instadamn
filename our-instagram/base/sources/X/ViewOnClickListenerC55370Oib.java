package X;

import android.view.View;

/* renamed from: X.Oib, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55370Oib implements View.OnClickListener {
    public final /* synthetic */ C56161OwT A00;

    public ViewOnClickListenerC55370Oib(C56161OwT c56161OwT) {
        this.A00 = c56161OwT;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C105824pt c105824pt;
        int A05 = C0f9.A05(446700222);
        C50947MfG c50947MfG = this.A00.A00;
        if (c50947MfG == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        C41551w4 c41551w4 = c50947MfG.A01.A00;
        if (c41551w4 != null && (c105824pt = c41551w4.A0H.A0H) != null) {
            PZ1.A01(c50947MfG, MSX.A0g(c105824pt), AbstractC141776au.A00(c50947MfG), 42);
        }
        C0f9.A0C(136781804, A05);
    }
}
