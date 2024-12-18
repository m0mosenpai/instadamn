package X;

import java.util.Map;

/* renamed from: X.BcD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25858BcD extends AbstractC52922bZ {
    public final C4F0 A00;
    public final String A01;
    public final C0UO A02;
    public final C51740MtP A03;
    public final C4F2 A04;

    public static final C51740MtP A00(C25858BcD c25858BcD, Map map) {
        C103514lR c103514lR;
        String str;
        C9BR c9br = (C9BR) map.get(c25858BcD.A01);
        if (c9br != null && (c103514lR = (C103514lR) c9br.A01) != null && (str = c103514lR.A07) != null) {
            return new C51740MtP(str, c9br.A02, 3);
        }
        return c25858BcD.A03;
    }

    public C25858BcD(C4F0 c4f0, C4F2 c4f2, String str, String str2) {
        this.A01 = str;
        this.A00 = c4f0;
        this.A04 = c4f2;
        this.A03 = new C51740MtP(str2, c4f2.A01(str2), 3);
        C0UO c0uo = c4f2.A01;
        MWG mwg = new MWG(17, this, c0uo);
        this.A02 = AbstractC208910l.A01(A00(this, (Map) c0uo.getValue()), AbstractC141776au.A00(this), mwg, C10I.A01);
    }
}
