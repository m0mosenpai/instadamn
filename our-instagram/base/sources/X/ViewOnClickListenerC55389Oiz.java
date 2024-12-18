package X;

import android.view.View;

/* renamed from: X.Oiz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55389Oiz implements View.OnClickListener {
    public final /* synthetic */ InterfaceC58152PqH A00;
    public final /* synthetic */ C31349DqE A01;
    public final /* synthetic */ C3O0 A02;

    public ViewOnClickListenerC55389Oiz(InterfaceC58152PqH interfaceC58152PqH, C31349DqE c31349DqE, C3O0 c3o0) {
        this.A00 = interfaceC58152PqH;
        this.A02 = c3o0;
        this.A01 = c31349DqE;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1582178086);
        InterfaceC58152PqH interfaceC58152PqH = this.A00;
        C14360o3.A0A(view);
        interfaceC58152PqH.onButtonClick(view);
        C3O0 c3o0 = this.A02;
        C3O0.A03(c3o0, true);
        C31349DqE c31349DqE = this.A01;
        int i = c31349DqE.A00;
        if (i == 0) {
            i = AbstractC31372Dqc.A01();
        }
        if (i == -1) {
            c3o0.A0K.remove(c31349DqE);
        }
        C0f9.A0C(1045739836, A05);
    }
}
