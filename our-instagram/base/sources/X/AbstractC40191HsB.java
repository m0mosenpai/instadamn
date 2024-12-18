package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HsB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40191HsB {
    public static C38749H4p parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("clips_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1K(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("facepile_top_participants".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("participating_media_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("participating_media_count_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("prompt_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("prompt_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("clips_items", c16l, "PromptMidCardMetadata");
            } else if (arrayList2 != null || !(c16l instanceof C07950bF)) {
                if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("participating_media_count", c16l, "PromptMidCardMetadata");
                } else if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("participating_media_count_text", c16l, "PromptMidCardMetadata");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("prompt_id", c16l, "PromptMidCardMetadata");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("prompt_text", c16l, "PromptMidCardMetadata");
                } else {
                    return new C38749H4p(str, str2, str3, arrayList, arrayList2, num.intValue());
                }
            } else {
                AbstractC166997dE.A1V("facepile_top_participants", c16l, "PromptMidCardMetadata");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
