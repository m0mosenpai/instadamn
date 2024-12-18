package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class AQP implements View.OnClickListener {
    public final /* synthetic */ Runnable A00;

    public AQP(Runnable runnable) {
        this.A00 = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(473416034);
        this.A00.run();
        C0f9.A0C(-1961029550, A05);
    }
}
