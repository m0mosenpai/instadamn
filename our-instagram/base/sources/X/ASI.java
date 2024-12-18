package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class ASI implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C79723hN A01;
    public final /* synthetic */ C81303k0 A02;

    public ASI(C79723hN c79723hN, C81303k0 c81303k0, int i) {
        this.A01 = c79723hN;
        this.A00 = i;
        this.A02 = c81303k0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(579619497);
        this.A01.A0A.A0X.invoke(Integer.valueOf(this.A00), this.A02);
        C0f9.A0C(1813807531, A05);
    }
}
