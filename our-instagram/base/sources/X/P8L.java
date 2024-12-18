package X;

import com.instagram.model.reels.Reel;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P8L implements InterfaceC147106jm {
    public final /* synthetic */ C51039Mgp A00;
    public final /* synthetic */ InterfaceC71543Iw A01;

    @Override // X.InterfaceC147106jm
    public final void DRJ(String str, String str2) {
    }

    @Override // X.InterfaceC147106jm
    public final void DSI(String str, String str2) {
    }

    @Override // X.InterfaceC147106jm
    public final void DSL(String str, String str2) {
    }

    public P8L(C51039Mgp c51039Mgp, InterfaceC71543Iw interfaceC71543Iw) {
        this.A00 = c51039Mgp;
        this.A01 = interfaceC71543Iw;
    }

    @Override // X.InterfaceC147106jm
    public final void DOA(String str) {
        this.A00.A03.A05(str, C05F.A00);
    }

    @Override // X.InterfaceC147106jm
    public final void DOB(String str) {
        this.A00.A03.A03(str);
    }

    @Override // X.InterfaceC147106jm
    public final void DOC(String str, boolean z) {
        Reel A0R;
        C51039Mgp c51039Mgp = this.A00;
        if (((Map) ((C26078Bg7) c51039Mgp.A08.getValue()).A02).containsKey(str) && !z && (A0R = MSY.A0R(c51039Mgp.A05, str)) != null) {
            InterfaceC71543Iw interfaceC71543Iw = this.A01;
            OMj oMj = c51039Mgp.A03;
            oMj.A02(str);
            interfaceC71543Iw.F8s(A0R);
            oMj.A01(str);
        }
    }

    @Override // X.InterfaceC147106jm
    public final void DRW(String str, String str2) {
        this.A00.A03.A05(str, C05F.A01);
    }
}
