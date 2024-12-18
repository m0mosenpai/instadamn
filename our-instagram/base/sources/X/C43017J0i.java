package X;

import java.util.Map;

/* renamed from: X.J0i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43017J0i implements InterfaceC1119153d {
    public final /* synthetic */ EnumC39589Hdz A00;
    public final /* synthetic */ OLM A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public C43017J0i(EnumC39589Hdz enumC39589Hdz, OLM olm, String str, Map map) {
        this.A01 = olm;
        this.A02 = str;
        this.A00 = enumC39589Hdz;
        this.A03 = map;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        OLM olm = this.A01;
        String str = this.A02;
        EnumC39589Hdz enumC39589Hdz = this.A00;
        Integer num = C05F.A01;
        olm.A00(enumC39589Hdz, EnumC72375XcB.A0A, num, num, str, this.A03);
    }
}
