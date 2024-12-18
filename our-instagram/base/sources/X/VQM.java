package X;

/* loaded from: classes11.dex */
public abstract class VQM {
    public static final Object A00(C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        int A0D = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C147466kW A002 = AbstractC147456kV.A00((C62862tP) ((C6FG) A01).A02);
        String A0E = ((C102884kP) A00).A0E();
        if (A0E != null) {
            C138276Oi A003 = A002.A00(A0E);
            if (A003 != null) {
                Object obj = A002.A03.get(A003);
                if (obj != null) {
                    C68106VBk c68106VBk = (C68106VBk) obj;
                    C4QW c4qw = c68106VBk.A02;
                    if (c4qw != null && c68106VBk.A01 != null) {
                        c68106VBk.A02.EMg(AbstractC13600mm.A03(A0D, 0, c4qw.Azm()), true);
                        return null;
                    }
                    return null;
                }
                throw AbstractC166997dE.A0g();
            }
            return null;
        }
        throw AbstractC166997dE.A0g();
    }
}
