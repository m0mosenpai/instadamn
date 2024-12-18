package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hl6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39796Hl6 {
    public static C26123Bh8 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("caption_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("cta_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("default_medias".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1K(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("rbs_folder_midcard_clips_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1K(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("title_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("body_text", c16l, "CameraRollMidCardMetadata");
            } else if (str2 != null || !(c16l instanceof C07950bF)) {
                if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("title_text", c16l, "CameraRollMidCardMetadata");
                } else {
                    return new C26123Bh8(str, str2, str3, str4, arrayList, arrayList2);
                }
            } else {
                AbstractC166997dE.A1V("caption_text", c16l, "CameraRollMidCardMetadata");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
