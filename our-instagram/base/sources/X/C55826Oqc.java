package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.Oqc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55826Oqc implements InterfaceC156146zi {
    public final /* synthetic */ C52162N6o A00;

    @Override // X.InterfaceC61272qp
    public final void AVA() {
    }

    @Override // X.InterfaceC61272qp
    public final boolean CKt() {
        return false;
    }

    @Override // X.InterfaceC61272qp
    public final boolean CLh() {
        return false;
    }

    @Override // X.InterfaceC64002vL
    public final void CMu(String str) {
    }

    @Override // X.InterfaceC156146zi
    public final boolean CfC(Reel reel) {
        return false;
    }

    @Override // X.InterfaceC61272qp
    public final void Co4() {
    }

    @Override // X.InterfaceC64002vL
    public final void D1e(Reel reel) {
    }

    @Override // X.InterfaceC156146zi
    public final void DDO() {
    }

    @Override // X.InterfaceC64002vL
    public final void DJt() {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void DSa() {
    }

    @Override // X.InterfaceC156146zi
    public final void DUx(Reel reel) {
    }

    @Override // X.InterfaceC64002vL
    public final void DVW() {
    }

    @Override // X.InterfaceC64002vL
    public final void DXO() {
    }

    @Override // X.InterfaceC64002vL
    public final void De5(EnumC53202Nfy enumC53202Nfy, String str) {
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De6(Reel reel, C70873Fz c70873Fz, int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void De7(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, List list, int i, boolean z) {
        C14360o3.A0B(str, 0);
        C52162N6o c52162N6o = this.A00;
        Reel A0G = AbstractC50523MSb.A0G(str, c52162N6o.A02);
        if (A0G != null) {
            AbstractC166987dD.A1Z(new MC5(A0G, c52162N6o, (InterfaceC23621Ds) null, 11), AbstractC25235BEs.A0S(c52162N6o));
        }
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ void De8(C3OO c3oo, InterfaceC73233Pz interfaceC73233Pz, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC64002vL
    public final void DeA(Reel reel, C70873Fz c70873Fz, Integer num, int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void DeF(String str) {
    }

    @Override // X.InterfaceC64002vL
    public final void Dvg(int i) {
    }

    @Override // X.InterfaceC64002vL
    public final void E1q(C3OO c3oo, Reel reel, Integer num, String str, String str2, List list) {
    }

    public C55826Oqc(C52162N6o c52162N6o) {
        this.A00 = c52162N6o;
    }

    @Override // X.InterfaceC64002vL
    public final /* synthetic */ int C9u() {
        return 0;
    }

    @Override // X.InterfaceC61272qp
    public final /* synthetic */ boolean CLg() {
        return false;
    }

    @Override // X.InterfaceC156156zj
    public final void D8A(View view) {
        C52162N6o c52162N6o = this.A00;
        InterfaceC09390do interfaceC09390do = c52162N6o.A02;
        C1571673v.A05(c52162N6o, AbstractC166987dD.A0r(interfaceC09390do), EnumC1571773w.A05, "highlight_creation_tap", AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do).getId());
        AbstractC50558MTp.A06(c52162N6o.requireActivity(), EnumC53243Ngg.A07, AbstractC166987dD.A0r(interfaceC09390do), false);
    }

    @Override // X.InterfaceC64002vL
    public final void DeC(List list, int i, String str) {
        AbstractC167017dG.A1O(str, list);
        C52162N6o c52162N6o = this.A00;
        InterfaceC09390do interfaceC09390do = c52162N6o.A02;
        Reel A0G = AbstractC50523MSb.A0G(str, interfaceC09390do);
        if (A0G != null && A0G.A0W != null) {
            new C55173Odc(c52162N6o.requireActivity(), c52162N6o, c52162N6o, AbstractC166987dD.A0r(interfaceC09390do), A0G).A04(new C55847Oqx(c52162N6o), C05F.A00);
        }
    }

    @Override // X.InterfaceC61272qp
    public final /* synthetic */ boolean Eib(Integer num, int i, int i2) {
        return false;
    }

    public C55826Oqc() {
    }
}
