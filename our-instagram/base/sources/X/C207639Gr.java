package X;

import android.view.View;

/* renamed from: X.9Gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207639Gr implements InterfaceC25200BCy {
    public final /* synthetic */ C146036i0 A00;

    public C207639Gr(C146036i0 c146036i0) {
        this.A00 = c146036i0;
    }

    @Override // X.InterfaceC25200BCy
    public final void Dci() {
        View view;
        C146036i0 c146036i0 = this.A00;
        c146036i0.A0F.EJJ();
        C150286pc c150286pc = c146036i0.A01;
        if (c150286pc != null && (view = ((ViewOnFocusChangeListenerC207619Gp) c150286pc.get()).A01) != null && view.getVisibility() == 0) {
            ViewOnFocusChangeListenerC207619Gp.A01((ViewOnFocusChangeListenerC207619Gp) c146036i0.A01.get(), true);
        }
    }

    @Override // X.InterfaceC25200BCy
    public final void Dcj() {
        this.A00.A0F.EJE("tapped");
    }
}
