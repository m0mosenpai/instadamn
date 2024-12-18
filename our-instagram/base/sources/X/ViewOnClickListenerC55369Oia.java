package X;

import android.view.View;

/* renamed from: X.Oia, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55369Oia implements View.OnClickListener {
    public final /* synthetic */ C52692NTd A00;

    public ViewOnClickListenerC55369Oia(C52692NTd c52692NTd) {
        this.A00 = c52692NTd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int A05 = C0f9.A05(1166300108);
        C52692NTd c52692NTd = this.A00;
        InterfaceC09390do interfaceC09390do = c52692NTd.A0f;
        if (!((C189698ao) interfaceC09390do.getValue()).A04.A00()) {
            ((C189698ao) interfaceC09390do.getValue()).A05(C05F.A0N, AbstractC167017dG.A0j());
            i = 275607062;
        } else {
            c52692NTd.A0H.A05(new PDW(((C189698ao) interfaceC09390do.getValue()).A04.A00(), false));
            i = -1483007275;
        }
        C0f9.A0C(i, A05);
    }
}
