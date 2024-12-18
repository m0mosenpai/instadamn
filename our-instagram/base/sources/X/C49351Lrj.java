package X;

import java.util.Map;

/* renamed from: X.Lrj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49351Lrj implements InterfaceC50483MQl {
    public final /* synthetic */ InterfaceC37261GbE A00;
    public final /* synthetic */ C47971LIf A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ InterfaceC16820sZ A04;

    public C49351Lrj(InterfaceC37261GbE interfaceC37261GbE, C47971LIf c47971LIf, String str, String str2, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = c47971LIf;
        this.A03 = str;
        this.A00 = interfaceC37261GbE;
        this.A04 = interfaceC16820sZ;
        this.A02 = str2;
    }

    @Override // X.InterfaceC50483MQl
    public final void DFf() {
        this.A04.invoke();
    }

    @Override // X.InterfaceC50483MQl
    public final void DLt() {
        this.A04.invoke();
    }

    @Override // X.InterfaceC50483MQl
    public final void DqJ(boolean z) {
        C47971LIf c47971LIf = this.A01;
        String str = this.A03;
        Integer valueOf = Integer.valueOf(z ? 1 : 0);
        Map map = c47971LIf.A05;
        map.put(str, valueOf);
        if (z) {
            InterfaceC37261GbE interfaceC37261GbE = this.A00;
            C114675Fx c114675Fx = new C114675Fx(EnumC46247KdO.A0C, "800", "na", "message sending paused for confirmation from user on sensitive content", false, true);
            c114675Fx.A08 = map;
            interfaceC37261GbE.DUq(c114675Fx, null);
            String str2 = c47971LIf.A00;
            if (str2 != null) {
                c47971LIf.A03.E4s(new C7ME(str2, this.A02));
                return;
            }
            return;
        }
        this.A04.invoke();
    }
}
