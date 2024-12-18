package X;

import java.util.List;

/* renamed from: X.LVd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48205LVd implements InterfaceC65490TlB {
    public final /* synthetic */ L97 A00;
    public final /* synthetic */ InterfaceC71543Iw A01;

    public C48205LVd(L97 l97, InterfaceC71543Iw interfaceC71543Iw) {
        this.A01 = interfaceC71543Iw;
        this.A00 = l97;
    }

    @Override // X.InterfaceC65490TlB
    public final void DcW(EnumC61185Rgl enumC61185Rgl) {
        InterfaceC71543Iw interfaceC71543Iw = this.A01;
        interfaceC71543Iw.F8s(new C45154Jyu(enumC61185Rgl, enumC61185Rgl.A00));
        interfaceC71543Iw.AID(null);
    }

    @Override // X.InterfaceC65490TlB
    public final void DcY(C45126Jxv c45126Jxv) {
        InterfaceC71543Iw interfaceC71543Iw = this.A01;
        interfaceC71543Iw.F8s(C48228LWd.A00);
        C45125Jxu c45125Jxu = C47931LFa.A01;
        ((List) c45125Jxu.A04).clear();
        c45125Jxu.A02 = true;
        c45125Jxu.A01 = null;
        c45125Jxu.A00 = C05F.A00;
        interfaceC71543Iw.AID(null);
    }
}
