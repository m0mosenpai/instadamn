package X;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class CFZ {
    public static final void A00(C5Tl c5Tl, EnumC76383bi enumC76383bi, String str, int i, boolean z) {
        int i2;
        String A17;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(enumC76383bi, 2);
        c5Tl.Enr(-1400862943);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 896) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, enumC76383bi);
        }
        if ((i2 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(347130377, "com.instagram.comments.mvvm.view.compose.AudienceDisclaimer (AudienceDisclaimer.kt:23)");
            }
            int ordinal = enumC76383bi.ordinal();
            if (ordinal != 1) {
                if (ordinal == 11) {
                    c5Tl.Eno(1917479639);
                    AbstractC151756sL.A00().A03();
                    Context A0K = AbstractC25228BEl.A0K(c5Tl);
                    C14360o3.A0B(A0K, 2);
                    if (z) {
                        A17 = A0K.getString(2131969028);
                    } else {
                        A17 = AbstractC167007dF.A0f(A0K, str, 2131969027);
                    }
                    C14360o3.A07(A17);
                } else {
                    c5Tl.Eno(1917657300);
                    AbstractC25225BEi.A1T(c5Tl);
                    throw AbstractC166987dD.A12("Unsupported MediaAudience in AudienceDisclaimer");
                }
            } else {
                c5Tl.Eno(1917171840);
                if (z) {
                    c5Tl.Eno(1308771421);
                    A17 = C5YD.A00(c5Tl, 2131955372);
                } else {
                    c5Tl.Eno(1308775161);
                    A17 = AbstractC25228BEl.A17(c5Tl, str, 2131955373);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
            }
            AbstractC25228BEl.A1O(c5Tl);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            C5WR.A0Z(c5Tl, AbstractC118175Wb.A0C(AbstractC25228BEl.A0W(), 32.0f, 32.0f, 0.0f), AbstractC25225BEi.A0Y(c5Tl), A17, A0M);
            if (C0fH.A02()) {
                C0fH.A00(1239593301);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT3(enumC76383bi, str, i, 0, z);
        }
    }
}
