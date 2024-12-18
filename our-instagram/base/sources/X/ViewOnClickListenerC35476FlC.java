package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.FlC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35476FlC implements View.OnClickListener {
    public final /* synthetic */ Activity A00;

    public ViewOnClickListenerC35476FlC(Activity activity) {
        this.A00 = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1756883811);
        this.A00.onBackPressed();
        C0f9.A0C(-581889520, A05);
    }
}
