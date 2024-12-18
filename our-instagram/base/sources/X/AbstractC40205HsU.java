package X;

import com.instagram.api.schemas.ClipsRSAMidCardSubType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HsU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40205HsU {
    public static C26143BhU parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            ArrayList arrayList = null;
            ClipsRSAMidCardSubType clipsRSAMidCardSubType = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("clips_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1K(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("is_clips_media_template".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("rsa_mid_card_sub_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipsRSAMidCardSubType = (ClipsRSAMidCardSubType) ClipsRSAMidCardSubType.A01.get(A1P);
                    if (clipsRSAMidCardSubType == null) {
                        clipsRSAMidCardSubType = ClipsRSAMidCardSubType.A06;
                    }
                } else if ("title_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("body_text", c16l, "RecentlySavedAudioMidCardMetadata");
            } else if (arrayList != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_clips_media_template", c16l, "RecentlySavedAudioMidCardMetadata");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("title_text", c16l, "RecentlySavedAudioMidCardMetadata");
                } else {
                    return new C26143BhU(clipsRSAMidCardSubType, str, str2, arrayList, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("clips_items", c16l, "RecentlySavedAudioMidCardMetadata");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
