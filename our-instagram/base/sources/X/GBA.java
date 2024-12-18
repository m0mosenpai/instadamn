package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class GBA implements InterfaceC71983XDs {
    public final /* synthetic */ InterfaceC37164GZb A00;
    public final /* synthetic */ C35233FgQ A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public GBA(InterfaceC37164GZb interfaceC37164GZb, C35233FgQ c35233FgQ, Integer num, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = c35233FgQ;
        this.A03 = str;
        this.A06 = z;
        this.A02 = num;
        this.A07 = z2;
        this.A04 = str2;
        this.A00 = interfaceC37164GZb;
        this.A08 = z3;
        this.A09 = z4;
        this.A05 = str3;
    }

    @Override // X.InterfaceC71983XDs
    public final void Dat() {
        C35233FgQ c35233FgQ = this.A01;
        C147036jf c147036jf = c35233FgQ.A03;
        String str = this.A03;
        Boolean valueOf = Boolean.valueOf(this.A06);
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c147036jf.A02, "ci_settings_modal_settings_tapped");
        AbstractC31171DnF.A1G(A0f, str);
        A0f.A7v("is_partial_ci", valueOf);
        A0f.Cht();
        if (this.A02 != null) {
            InterfaceC11380iw interfaceC11380iw = c35233FgQ.A01;
            Fragment fragment = c35233FgQ.A00;
            InterfaceC37264GbH interfaceC37264GbH = c35233FgQ.A04;
            FJT fjt = c35233FgQ.A05;
            FEZ.A02 = interfaceC11380iw;
            FEZ.A07 = AbstractC25225BEi.A16(fragment);
            FEZ.A04 = interfaceC37264GbH;
            FEZ.A05 = fjt;
            boolean z = this.A07;
            String str2 = this.A04;
            InterfaceC37164GZb interfaceC37164GZb = this.A00;
            boolean z2 = this.A08;
            FEZ.A08 = z;
            FEZ.A00 = str;
            FEZ.A06 = str2;
            FEZ.A03 = interfaceC37164GZb;
            FEZ.A09 = z2;
            boolean z3 = this.A09;
            String str3 = this.A05;
            FEZ.A0A = z3;
            FEZ.A01 = str3;
        }
    }

    @Override // X.InterfaceC71983XDs
    public final void onCancel() {
        C147036jf c147036jf = this.A01.A03;
        String str = this.A03;
        Boolean valueOf = Boolean.valueOf(this.A06);
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c147036jf.A02, "ci_settings_modal_cancelled");
        AbstractC31171DnF.A1G(A0f, str);
        A0f.A7v("is_partial_ci", valueOf);
        A0f.Cht();
    }

    @Override // X.InterfaceC71983XDs
    public final void onDismiss() {
        InterfaceC37164GZb interfaceC37164GZb = this.A00;
        if (interfaceC37164GZb != null) {
            interfaceC37164GZb.onDismiss();
        }
    }

    @Override // X.InterfaceC71983XDs
    public final void onShow() {
        InterfaceC37164GZb interfaceC37164GZb = this.A00;
        if (interfaceC37164GZb != null) {
            interfaceC37164GZb.onShow();
        }
    }
}
