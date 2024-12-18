package X;

import android.content.Context;
import android.os.Handler;
import java.util.Map;

/* renamed from: X.SaT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63005SaT {
    public static final Handler A08 = AbstractC167007dF.A0J();
    public Context A00;
    public C51740MtP A01;
    public InterfaceC65597Tng A02;
    public InterfaceC65346TiT A03;
    public boolean A04;
    public final C63222SfT A05;
    public final AbstractC61290Rl1 A06;
    public final OHA A07;

    public final void A01(SYG syg, EnumC61185Rgl enumC61185Rgl, Map map) {
        String str;
        C14360o3.A0B(enumC61185Rgl, 0);
        C63222SfT c63222SfT = this.A05;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Setup complete: ");
        A1C.append(enumC61185Rgl);
        A1C.append(", billing result: ");
        A1C.append(syg);
        C0K8.A0C("DCP", AbstractC167017dG.A0n(map, ", extras: ", A1C));
        boolean z = enumC61185Rgl.A01;
        InterfaceC65615To6 interfaceC65615To6 = c63222SfT.A00;
        if (z) {
            str = "client_load_dcpiap_init";
        } else {
            str = "client_load_dcpiap_success";
        }
        interfaceC65615To6.Ci3(map, null, str);
        InterfaceC65346TiT interfaceC65346TiT = this.A03;
        if (interfaceC65346TiT != null) {
            interfaceC65346TiT.Dl7(enumC61185Rgl);
        }
    }

    public final String A00() {
        String str;
        C51740MtP c51740MtP = this.A01;
        if (c51740MtP == null || (str = c51740MtP.A00) == null) {
            return "";
        }
        return str;
    }

    public final boolean A02() {
        InterfaceC65597Tng interfaceC65597Tng = this.A02;
        if ((interfaceC65597Tng != null && interfaceC65597Tng.CbZ()) || this.A04) {
            return true;
        }
        return false;
    }

    public C63005SaT(C63222SfT c63222SfT, AbstractC61290Rl1 abstractC61290Rl1, OHA oha) {
        this.A06 = abstractC61290Rl1;
        this.A05 = c63222SfT;
        this.A07 = oha;
    }
}
