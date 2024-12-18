package X;

import com.instagram.api.schemas.TextEntityType;
import java.io.IOException;

/* renamed from: X.Hvr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40404Hvr {
    public static C38794H6j parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            TextEntityType textEntityType = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("display_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("entity_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    textEntityType = (TextEntityType) TextEntityType.A01.get(A1P);
                    if (textEntityType == null) {
                        textEntityType = TextEntityType.A04;
                    }
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1C(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("display_text", c16l, "TextEntity");
            } else if (textEntityType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("entity_type", c16l, "TextEntity");
            } else {
                return new C38794H6j(textEntityType, str, str2, str3);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
