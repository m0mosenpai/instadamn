package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class AS5 implements View.OnClickListener {
    public final /* synthetic */ C8JT A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ boolean A02;

    public AS5(C8JT c8jt, Runnable runnable, boolean z) {
        this.A00 = c8jt;
        this.A02 = z;
        this.A01 = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-960484522);
        C8JT.A19(this.A00, this.A01, this.A02);
        C0f9.A0C(-2069587995, A05);
    }
}