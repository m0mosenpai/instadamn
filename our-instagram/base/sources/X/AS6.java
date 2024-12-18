package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class AS6 implements View.OnClickListener {
    public final /* synthetic */ C8JT A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ boolean A02;

    public AS6(C8JT c8jt, Runnable runnable, boolean z) {
        this.A00 = c8jt;
        this.A02 = z;
        this.A01 = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-818368816);
        C8JT.A17(this.A00, this.A01);
        C0f9.A0C(-682112950, A05);
    }
}
