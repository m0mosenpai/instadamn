package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class N0u extends C69734VuU {
    public final OI3 A00;

    @Override // X.C69734VuU
    public final Map A00(W63 w63, C68232VIs c68232VIs, W62 w62) {
        LinkedHashMap A03 = AbstractC06930Yk.A03(super.A00(null, c68232VIs, w62));
        A03.putAll(this.A00.A00(false));
        return A03;
    }

    @Override // X.C69734VuU
    public final Map A02(C68232VIs c68232VIs) {
        LinkedHashMap A03 = AbstractC06930Yk.A03(super.A02(c68232VIs));
        A03.putAll(this.A00.A00(false));
        return A03;
    }

    public N0u(OI3 oi3) {
        super(EnumC53327Ni6.A0j);
        this.A00 = oi3;
    }

    @Override // X.C69734VuU
    public final Map A01(MYB myb) {
        return this.A00.A00(true);
    }
}
