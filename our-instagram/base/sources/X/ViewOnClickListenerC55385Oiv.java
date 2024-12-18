package X;

import android.view.View;

/* renamed from: X.Oiv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55385Oiv implements View.OnClickListener {
    public final /* synthetic */ InterfaceC58151PqG A00;
    public final /* synthetic */ IKG A01;
    public final /* synthetic */ C3O0 A02;

    public ViewOnClickListenerC55385Oiv(InterfaceC58151PqG interfaceC58151PqG, IKG ikg, C3O0 c3o0) {
        this.A00 = interfaceC58151PqG;
        this.A02 = c3o0;
        this.A01 = ikg;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(731718841);
        this.A00.Dar();
        C3O0 c3o0 = this.A02;
        C3O0.A03(c3o0, true);
        c3o0.A0J.remove(this.A01);
        C0f9.A0C(-1550291391, A05);
    }
}
