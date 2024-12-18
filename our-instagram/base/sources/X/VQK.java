package X;

/* loaded from: classes11.dex */
public abstract class VQK {
    public static final Integer A00(C6FW c6fw) {
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C147466kW A00 = AbstractC147456kV.A00((C62862tP) ((C6FG) A01).A02);
        String A0E = ((C102884kP) A02).A0E();
        if (A0E != null) {
            int i = 0;
            C138276Oi A002 = A00.A00(A0E);
            if (A002 != null) {
                Object obj = A00.A03.get(A002);
                if (obj != null) {
                    C4QW c4qw = ((C68106VBk) obj).A02;
                    if (c4qw != null) {
                        i = c4qw.getCurrentPositionMs();
                    } else {
                        i = 0;
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            return Integer.valueOf(i);
        }
        throw AbstractC166997dE.A0g();
    }
}
