package X;

import android.content.Context;
import android.content.DialogInterface;

/* loaded from: classes9.dex */
public final class Og8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ OJ6 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public Og8(Context context, OJ6 oj6, String str, String str2, int i) {
        this.A01 = context;
        this.A02 = oj6;
        this.A03 = str;
        this.A00 = i;
        this.A04 = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC41776Ies.A03(this.A01, "https://help.instagram.com/1052265019655889");
        C28179CbR c28179CbR = this.A02.A02;
        String str = this.A03;
        int i2 = this.A00;
        String str2 = this.A04;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c28179CbR.A00, "instagram_clips_viewer_link_tap");
        Long A00 = C28179CbR.A00(str);
        if (A0f.isSampled() && A00 != null) {
            A0f.AAP("containermodule", "add_spin_nux");
            AbstractC37300Gc1.A0h(A0f, A00);
            AbstractC25229BEm.A19(A0f, i2);
            AbstractC25225BEi.A1P(A0f, str2);
            AbstractC37300Gc1.A0e(BQL.A1F, A0f);
            AbstractC25225BEi.A1M(EnumC120795dP.A0E, A0f);
            AbstractC167017dG.A1C(A0f);
        }
    }
}
