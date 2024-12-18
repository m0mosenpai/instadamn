package X;

/* renamed from: X.CBz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27504CBz {
    public static final String A00(C6FQ c6fq, C6FW c6fw) {
        CharSequence A00;
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A03;
        C6FG A002 = C103064kh.A00(c6fq, c6fw, 1);
        String str = null;
        if (!c102884kP.A0S(99, false)) {
            Object A06 = AnonymousClass634.A06(A002, c102884kP);
            if ((A06 instanceof BX7) && ((A00 = ((BX7) A06).A00()) == null || (str = A00.toString()) == null)) {
                return "";
            }
        }
        return str;
    }
}
