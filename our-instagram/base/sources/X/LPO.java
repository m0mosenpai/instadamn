package X;

import android.view.View;

/* loaded from: classes8.dex */
public final class LPO implements View.OnClickListener {
    public final /* synthetic */ C7F3 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ InterfaceC16820sZ A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public LPO(C7F3 c7f3, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        this.A00 = c7f3;
        this.A04 = z;
        this.A03 = z2;
        this.A01 = str;
        this.A02 = interfaceC16820sZ;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-536688125);
        C7F3 c7f3 = this.A00;
        boolean z = this.A04;
        boolean z2 = this.A03;
        String str = this.A01;
        C25531Mh A0H = AbstractC31172DnG.A0H(c7f3);
        EnumC72433Xdd A00 = C7F3.A00(z2, z);
        if (AbstractC25226BEj.A1Z(A0H)) {
            A0H.A0Z(24);
            A0H.A0R("selected_item", "write_with_ai_icon");
            A0H.A0X(0);
            JQ0.A15(A00, A0H, str, z2);
            A0H.Cht();
        }
        this.A02.invoke();
        C0f9.A0C(-1881968513, A05);
    }
}
