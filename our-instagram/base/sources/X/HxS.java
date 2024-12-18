package X;

/* loaded from: classes7.dex */
public abstract class HxS {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        Object obj = c6fw.A00.get(0);
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return null;
        }
        boolean A01 = C6DZ.A01(c6fw.A02());
        C6FG A00 = C103064kh.A00(c6fq, c6fw, 2);
        C6BQ.A04(c6fq);
        AbstractC70200WGp.A0D(A00, null);
        C38321qM A0h = AbstractC25229BEm.A0h(AbstractC31177DnL.A0S(c6fq), str);
        if (A0h == null) {
            return null;
        }
        JLR BGK = A0h.A0C.BGK();
        if (BGK != null) {
            IGF AKN = BGK.AKN();
            A0h.A0C.EVz(new C38734H3x(Boolean.valueOf(A01), AKN.A00, AKN.A01));
        }
        JLV BpH = A0h.A0C.BpH();
        if (BpH != null) {
            IGG AKX = BpH.AKX();
            A0h.A0C.Ecs(new H53(Boolean.valueOf(A01), AKX.A00, AKX.A01));
        }
        return null;
    }
}
