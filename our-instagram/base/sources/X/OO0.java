package X;

import java.util.List;

/* loaded from: classes9.dex */
public abstract class OO0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.1vN] */
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        List list = c6fw.A00;
        if (list.size() >= 2) {
            Object obj = list.get(1);
            C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
            if (AbstractC166987dD.A1a(obj)) {
                AbstractC25651Mw.A00(AbstractC31175DnJ.A0J(c6fq)).E4s(new Object());
                return null;
            }
        }
        A01(c6fq);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.1vN] */
    public static final void A01(C6FQ c6fq) {
        AbstractC25651Mw.A00(AbstractC31175DnJ.A0J(c6fq)).E4s(new Object());
    }
}
