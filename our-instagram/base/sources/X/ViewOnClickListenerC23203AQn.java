package X;

import android.view.View;

/* renamed from: X.AQn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23203AQn implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass983 A00;

    public ViewOnClickListenerC23203AQn(AnonymousClass983 anonymousClass983) {
        this.A00 = anonymousClass983;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(2098584769);
        this.A00.A0u.requireActivity().onBackPressed();
        C0f9.A0C(-2099953391, A05);
    }
}
