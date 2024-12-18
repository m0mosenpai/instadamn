package X;

import java.util.Map;

/* loaded from: classes7.dex */
public final class J2P implements InterfaceC82443m8 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Map A04;
    public final boolean A05;

    @Override // X.InterfaceC82443m8
    public final EnumC39552HdO Epo() {
        return EnumC39552HdO.A05;
    }

    public final String toString() {
        C73803Sk c73803Sk = AbstractC73763Sg.A03.A02;
        C0YZ A1D = AbstractC25225BEi.A1D(J2P.class);
        c73803Sk.A00.get(A1D);
        AbstractC192728gE.A01(A1D);
        throw C00O.createAndThrow();
    }

    public J2P(Integer num, String str, String str2, String str3, Map map, boolean z) {
        this.A04 = map;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A05 = z;
        this.A00 = num;
    }
}
