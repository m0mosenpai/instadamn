package X;

import java.util.ArrayList;

/* renamed from: X.0ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16290ra {
    public static C16270rY parseFromJson(C16L c16l) {
        return (C16270rY) C16V.A01(c16l, new C1EH() { // from class: X.0rZ
            @Override // X.C1EH
            public final /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                C16270rY c16270rY = new C16270rY();
                if (c16l2.A11() != C16R.A0D) {
                    c16l2.A0z();
                    return null;
                }
                while (c16l2.A1J() != C16R.A09) {
                    String A0q = c16l2.A0q();
                    c16l2.A1J();
                    if ("objects".equals(A0q)) {
                        ArrayList arrayList = null;
                        if (c16l2.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l2.A1J() != C16R.A08) {
                                C17530to parseFromJson = AbstractC17550tq.parseFromJson(c16l2);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c16270rY.A00 = arrayList;
                    }
                    c16l2.A0z();
                }
                return c16270rY;
            }
        });
    }

    public static void A00(AnonymousClass182 anonymousClass182, C16270rY c16270rY) {
        anonymousClass182.A0d();
        if (c16270rY.A00 != null) {
            C16V.A03(anonymousClass182, "objects");
            for (C17530to c17530to : c16270rY.A00) {
                if (c17530to != null) {
                    AbstractC17550tq.A00(anonymousClass182, c17530to);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
