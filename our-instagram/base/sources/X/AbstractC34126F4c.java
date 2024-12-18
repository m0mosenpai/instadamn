package X;

import com.instagram.direct.model.textformatting.FormattedText;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.F4c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34126F4c {
    public static C45127Jxw parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("formatted_text_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            FormattedText parseFromJson = AbstractC34127F4d.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("draft_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("formatted_text_list", c16l, "ComposerText");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("draft_text", c16l, "ComposerText");
            } else {
                return new C45127Jxw(arrayList, str, 45);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
