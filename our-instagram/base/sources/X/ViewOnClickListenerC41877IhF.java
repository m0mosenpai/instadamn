package X;

import android.view.View;

/* renamed from: X.IhF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41877IhF implements View.OnClickListener {
    public final /* synthetic */ C86803ts A00;

    public ViewOnClickListenerC41877IhF(C86803ts c86803ts) {
        this.A00 = c86803ts;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(540310708);
        J19 j19 = this.A00.A04.A00;
        if (j19 != null) {
            j19.A00(5.0f);
            C0f9.A0C(63217928, A05);
        } else {
            C14360o3.A0F("animationController");
            throw C00O.createAndThrow();
        }
    }
}
