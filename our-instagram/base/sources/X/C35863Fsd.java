package X;

import java.util.Map;

/* renamed from: X.Fsd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35863Fsd implements InterfaceC65347TiU {
    public final /* synthetic */ C6FQ A00;
    public final /* synthetic */ InterfaceC103384lE A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ String A03;

    public C35863Fsd(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, String str) {
        this.A02 = interfaceC103384lE;
        this.A03 = str;
        this.A00 = c6fq;
        this.A01 = interfaceC103384lE2;
    }

    @Override // X.InterfaceC65347TiU
    public final void Dge(SYG syg, Map map) {
        C11T.A02(new RunnableC36975GQs(syg, this.A00, this.A02, this.A01, this.A03, map));
    }
}
