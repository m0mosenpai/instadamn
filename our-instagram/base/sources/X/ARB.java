package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class ARB implements View.OnClickListener {
    public final /* synthetic */ C171497kf A00;

    public ARB(C171497kf c171497kf) {
        this.A00 = c171497kf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1679238055);
        C3DO c3do = C3DN.A00;
        C171497kf c171497kf = this.A00;
        AbstractC167017dG.A0y(c171497kf.requireActivity(), c3do);
        InterfaceC171487ke interfaceC171487ke = c171497kf.A00;
        if (interfaceC171487ke == null) {
            C14360o3.A0F("delegate");
            throw C00O.createAndThrow();
        }
        interfaceC171487ke.Dpe();
        C0f9.A0C(-582403662, A05);
    }
}
