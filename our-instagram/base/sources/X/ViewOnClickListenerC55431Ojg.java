package X;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: X.Ojg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55431Ojg implements View.OnClickListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ InterfaceC145276gm A02;
    public final /* synthetic */ C55909Os0 A03;
    public final /* synthetic */ C145236gi A04;
    public final /* synthetic */ O9W A05;
    public final /* synthetic */ O6R A06;
    public final /* synthetic */ CharSequence A07;

    public ViewOnClickListenerC55431Ojg(DialogInterface.OnDismissListener onDismissListener, InterfaceC11380iw interfaceC11380iw, InterfaceC145276gm interfaceC145276gm, C55909Os0 c55909Os0, C145236gi c145236gi, O9W o9w, O6R o6r, CharSequence charSequence) {
        this.A03 = c55909Os0;
        this.A07 = charSequence;
        this.A00 = onDismissListener;
        this.A02 = interfaceC145276gm;
        this.A04 = c145236gi;
        this.A05 = o9w;
        this.A06 = o6r;
        this.A01 = interfaceC11380iw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1318577099);
        C55909Os0 c55909Os0 = this.A03;
        CharSequence charSequence = this.A07;
        C55909Os0.A03(this.A00, this.A01, this.A02, c55909Os0, this.A04, this.A05, this.A06, charSequence);
        C0f9.A0C(-1440760694, A05);
    }
}
