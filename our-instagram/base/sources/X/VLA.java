package X;

/* loaded from: classes11.dex */
public abstract class VLA {
    public static final Integer A00(C6FQ c6fq, C6FW c6fw) {
        int A00;
        Object A0a = MSY.A0a(c6fw);
        C14360o3.A0C(A0a, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A0a;
        String A002 = C6AN.A00(c6fw.A02());
        C6FG A003 = C103064kh.A00(c6fq, c6fw, 2);
        if (c102884kP.A0D() == null) {
            AbstractC25241Le.A02("index_of_child_without_id", "bk.action.bloks.IndexOfChild called on a container without an ID");
        } else {
            AnonymousClass630 A02 = AnonymousClass634.A02(A003);
            if (c102884kP.A0D() != null) {
                C102884kP A004 = U5O.A00(A02.A07(), new U5I(c102884kP.A0D()));
                if (A004 != null) {
                    A00 = AbstractC66263U6h.A00(new U5I(A002), A004.A0M());
                    return Integer.valueOf(A00);
                }
            }
        }
        A00 = -1;
        return Integer.valueOf(A00);
    }
}
