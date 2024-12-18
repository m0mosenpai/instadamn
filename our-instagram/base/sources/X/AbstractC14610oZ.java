package X;

import java.util.ArrayList;

/* renamed from: X.0oZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14610oZ {
    public static C18160v1 parseFromJson(C16L c16l) {
        return (C18160v1) C16V.A01(c16l, new C1EH() { // from class: X.0oY
            @Override // X.C1EH
            public final /* bridge */ /* synthetic */ Object invoke(C16L c16l2) {
                C18160v1 c18160v1 = new C18160v1();
                if (c16l2.A11() != C16R.A0D) {
                    c16l2.A0z();
                    return null;
                }
                while (c16l2.A1J() != C16R.A09) {
                    String A0q = c16l2.A0q();
                    c16l2.A1J();
                    String str = null;
                    ArrayList arrayList = null;
                    if ("colors".equals(A0q)) {
                        if (c16l2.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l2.A1J() != C16R.A08) {
                                Integer valueOf = Integer.valueOf(c16l2.A1D());
                                if (valueOf != null) {
                                    arrayList.add(valueOf);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c18160v1.A02 = arrayList;
                    } else if ("orientation".equals(A0q)) {
                        c18160v1.A00 = c16l2.A1D();
                    } else if ("background_gradient_enum".equals(A0q)) {
                        if (c16l2.A11() != C16R.A0G) {
                            str = c16l2.A1P();
                        }
                        c18160v1.A01 = str;
                    }
                    c16l2.A0z();
                }
                return c18160v1;
            }
        });
    }

    public static void A00(AnonymousClass182 anonymousClass182, C18160v1 c18160v1) {
        anonymousClass182.A0d();
        if (c18160v1.A02 != null) {
            C16V.A03(anonymousClass182, "colors");
            for (Number number : c18160v1.A02) {
                if (number != null) {
                    anonymousClass182.A0h(number.intValue());
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0Q("orientation", c18160v1.A00);
        String str = c18160v1.A01;
        if (str != null) {
            anonymousClass182.A0S("background_gradient_enum", str);
        }
        anonymousClass182.A0a();
    }
}
