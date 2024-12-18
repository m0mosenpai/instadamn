package X;

/* renamed from: X.CBy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27503CBy {
    public static final C62653SKm A00(C6FQ c6fq, C6FW c6fw) {
        String obj;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C102884kP c102884kP = (C102884kP) A01;
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
            String str = "";
            if (!(A06 instanceof BX7)) {
                return null;
            }
            CharSequence A00 = ((BX7) A06).A00();
            if (A00 != null && (obj = A00.toString()) != null) {
                str = obj;
            }
            return new C62653SKm(str);
        }
        throw AbstractC25227BEk.A0n();
    }
}
