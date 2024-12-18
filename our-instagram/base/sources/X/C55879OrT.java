package X;

import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.OrT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55879OrT implements InterfaceC57926PmW {
    public final /* synthetic */ C54722OEz A00;
    public final /* synthetic */ ENZ A01;

    @Override // X.InterfaceC57926PmW
    public final void Dlm(EnumC76753cN enumC76753cN) {
        C14360o3.A0B(enumC76753cN, 0);
        if (enumC76753cN == EnumC76753cN.A06) {
            IgdsButton igdsButton = this.A00.A06;
            igdsButton.setLoading(true);
            igdsButton.setEnabled(false);
        } else if (enumC76753cN == EnumC76753cN.A05) {
            this.A00.A00.setVisibility(8);
            this.A01.A04();
        } else {
            if (enumC76753cN != EnumC76753cN.A04) {
                return;
            }
            MSY.A1F(this.A00.A06);
        }
    }

    public C55879OrT(C54722OEz c54722OEz, ENZ enz) {
        this.A00 = c54722OEz;
        this.A01 = enz;
    }
}
