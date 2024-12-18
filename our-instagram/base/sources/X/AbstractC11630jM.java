package X;

/* renamed from: X.0jM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11630jM {
    public static C11610jK parseFromJson(C16L c16l) {
        return (C11610jK) C16V.A01(c16l, new C1EH() { // from class: X.0jL
            /* JADX WARN: Type inference failed for: r2v0, types: [X.0jK, java.lang.Object] */
            @Override // X.C1EH
            public final /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                ?? obj = new Object();
                if (c16l2.A11() != C16R.A0D) {
                    c16l2.A0z();
                    return null;
                }
                while (c16l2.A1J() != C16R.A09) {
                    String A0q = c16l2.A0q();
                    c16l2.A1J();
                    if ("instagram_ad".equals(A0q)) {
                        obj.A00 = AbstractC11690jS.parseFromJson(c16l2);
                    } else if ("instagram_validation".equals(A0q)) {
                        obj.A01 = AbstractC11710jU.parseFromJson(c16l2);
                    }
                    c16l2.A0z();
                }
                return obj;
            }
        });
    }
}
