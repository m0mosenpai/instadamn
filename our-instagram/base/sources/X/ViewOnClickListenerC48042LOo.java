package X;

import android.view.View;

/* renamed from: X.LOo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48042LOo implements View.OnClickListener {
    public final /* synthetic */ L8B A00;
    public final /* synthetic */ String A01;

    public ViewOnClickListenerC48042LOo(L8B l8b, String str) {
        this.A00 = l8b;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(838542482);
        C159807Es c159807Es = this.A00.A05;
        String str = this.A01;
        C159737El c159737El = c159807Es.A00;
        C7FS c7fs = c159737El.A1c;
        InterfaceC83713oG interfaceC83713oG = c159737El.A1z;
        C14360o3.A0B(interfaceC83713oG, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c7fs.A00, "direct_edit_message_cancel");
        if (A0f.isSampled()) {
            AbstractC31175DnJ.A1A(A0f, AbstractC140946Yw.A07(interfaceC83713oG));
            AbstractC31171DnF.A1C(A0f, "cancel");
            A0f.AAP("message_type", C2EY.A1i.toString());
            A0f.AAP("message_id", str);
            AbstractC31171DnF.A1H(A0f, AbstractC92784Dr.A02(interfaceC83713oG));
            A0f.A9K("occamadillo_thread_id", AbstractC92784Dr.A01(interfaceC83713oG));
            A0f.Cht();
        }
        c159737El.A18();
        C0f9.A0C(-1087883518, A05);
    }
}
