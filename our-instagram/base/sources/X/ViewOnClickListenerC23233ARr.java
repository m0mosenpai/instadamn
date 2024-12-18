package X;

import android.view.View;

/* renamed from: X.ARr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23233ARr implements View.OnClickListener {
    public final /* synthetic */ C199968t0 A00;
    public final /* synthetic */ C199208rN A01;

    public ViewOnClickListenerC23233ARr(C199968t0 c199968t0, C199208rN c199208rN) {
        this.A00 = c199968t0;
        this.A01 = c199208rN;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1261848226);
        this.A00.A02.onClick();
        this.A01.A01.dismiss();
        C0f9.A0C(1149547620, A05);
    }
}
