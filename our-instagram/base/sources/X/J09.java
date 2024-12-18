package X;

import java.util.EnumSet;

/* loaded from: classes7.dex */
public final class J09 implements JIE {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C75113Zb A01;
    public final /* synthetic */ C81063jb A02;
    public final /* synthetic */ InterfaceC61432r6 A03;

    @Override // X.JIE
    public final void CvC(String str, String str2) {
        C75113Zb c75113Zb;
        EnumC75193Zm enumC75193Zm;
        C14360o3.A0B(str, 0);
        int hashCode = str.hashCode();
        if (hashCode != -1222030179) {
            if (hashCode != -454281009) {
                if (hashCode == -402433807 && str.equals("remove_from_ad_activity")) {
                    c75113Zb = this.A01;
                    enumC75193Zm = EnumC75193Zm.A04;
                    c75113Zb.A0m = enumC75193Zm;
                }
            } else if (str.equals("hide_button")) {
                c75113Zb = this.A01;
                enumC75193Zm = EnumC75193Zm.A0A;
                c75113Zb.A0m = enumC75193Zm;
            }
        } else if (str.equals("report_button")) {
            c75113Zb = this.A01;
            enumC75193Zm = EnumC75193Zm.A0B;
            c75113Zb.A0m = enumC75193Zm;
        }
        C81063jb c81063jb = this.A02;
        if (c81063jb != null && c81063jb.A08(this.A00, false)) {
            c81063jb.A03();
            C81063jb.A00(c81063jb, C05F.A0j, "report_or_hide");
        }
        InterfaceC61432r6 interfaceC61432r6 = this.A03;
        C38321qM c38321qM = this.A00;
        C75113Zb c75113Zb2 = this.A01;
        EnumC75193Zm enumC75193Zm2 = c75113Zb2.A0m;
        EnumSet enumSet = AbstractC41573IaM.A00;
        if (enumC75193Zm2 == EnumC75193Zm.A0A) {
            interfaceC61432r6.DVi(new C6T6(null, null, str2, ""), AnonymousClass317.A0Y, c38321qM, c75113Zb2);
        }
    }

    @Override // X.JIE
    public final /* synthetic */ void CvD() {
    }

    @Override // X.JIE
    public final /* synthetic */ void CvE() {
    }

    @Override // X.JIE
    public final /* synthetic */ void CvG() {
    }

    @Override // X.JIE
    public final /* synthetic */ void Cvx() {
    }

    @Override // X.JIE
    public final /* synthetic */ void Cvy() {
    }

    @Override // X.JIE
    public final /* synthetic */ void Cvz() {
    }

    @Override // X.JIE
    public final /* synthetic */ void DWz(String str) {
    }

    public J09(C38321qM c38321qM, C75113Zb c75113Zb, C81063jb c81063jb, InterfaceC61432r6 interfaceC61432r6) {
        this.A01 = c75113Zb;
        this.A02 = c81063jb;
        this.A00 = c38321qM;
        this.A03 = interfaceC61432r6;
    }
}
