package X;

import android.view.View;

/* renamed from: X.Fmr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35539Fmr implements View.OnClickListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ InterfaceC148366m6 A01;

    public ViewOnClickListenerC35539Fmr(View view, InterfaceC148366m6 interfaceC148366m6) {
        this.A00 = view;
        this.A01 = interfaceC148366m6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1148191898);
        View view2 = this.A00;
        C14360o3.A0A(view2);
        InterfaceC148366m6 interfaceC148366m6 = this.A01;
        view2.setVisibility(8);
        interfaceC148366m6.DWL();
        C0f9.A0C(151601121, A05);
    }
}