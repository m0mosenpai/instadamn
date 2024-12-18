package X;

import java.util.Map;

/* renamed from: X.P6k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56494P6k implements InterfaceC100484fC {
    public final InterfaceC100484fC A00;
    public final Map A01;
    public final InterfaceC09390do A02;

    public C56494P6k(InterfaceC100484fC interfaceC100484fC, Map map) {
        C14360o3.A0B(interfaceC100484fC, 1);
        this.A00 = interfaceC100484fC;
        this.A01 = map;
        this.A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new GSw(this, 10));
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP BP4(String str, long j) {
        C14360o3.A0B(str, 0);
        return new PVF(str, Aaz(), j);
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP C2m(String str, String str2) {
        C14360o3.A0B(str, 0);
        return new PVG(str, str2, Aaz());
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC105054oL ARC() {
        return this.A00.ARC();
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP Aaz() {
        return (InterfaceC19390xP) this.A02.getValue();
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP AJg(String str) {
        return new M9S(Aaz(), 19);
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP Ah9(String str, boolean z) {
        return new PVI(this, str, Aaz(), z);
    }

    @Override // X.InterfaceC100484fC
    public final InterfaceC19390xP BIg(String str, int i) {
        return new PVH(this, Aaz(), str, 0);
    }
}
