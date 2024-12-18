package X;

import java.io.IOException;

/* renamed from: X.Hva, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40387Hva {
    public static C51751Mta parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C51756Mtf c51756Mtf = null;
            C111074zO c111074zO = null;
            String str = null;
            Boolean bool = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = MSV.A00(573);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("data".equals(A0s)) {
                    c51756Mtf = AbstractC40386HvZ.parseFromJson(c16l);
                } else if ("paging_info".equals(A0s)) {
                    c111074zO = AbstractC111064zN.parseFromJson(c16l);
                } else if ("section_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else {
                    bool = AbstractC37303Gc4.A0K(c16l, bool, A0s, A00);
                }
                c16l.A0z();
            }
            if (c51756Mtf == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("data", c16l, "TemplatesBrowserSectionContent");
            } else if (c111074zO != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("section_id", c16l, "TemplatesBrowserSectionContent");
                } else if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "TemplatesBrowserSectionContent");
                } else {
                    return new C51751Mta(c51756Mtf, c111074zO, str, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("paging_info", c16l, "TemplatesBrowserSectionContent");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
