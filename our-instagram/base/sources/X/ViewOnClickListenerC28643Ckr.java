package X;

import android.view.View;

/* renamed from: X.Ckr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28643Ckr implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ InterfaceC145486h7 A02;

    public ViewOnClickListenerC28643Ckr(View view, C84823qW c84823qW, InterfaceC145486h7 interfaceC145486h7) {
        this.A00 = view;
        this.A02 = interfaceC145486h7;
        this.A01 = c84823qW;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-326289917);
        View view2 = this.A00;
        this.A02.Ddl(this.A01, (int) (AbstractC166987dD.A07(view2) * 0.5f), (int) (AbstractC166987dD.A08(view2) * 0.5f));
        C0f9.A0C(-355053575, A05);
    }
}
