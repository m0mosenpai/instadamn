package X;

import com.instagram.api.schemas.ClipsMidCardType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HqC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40085HqC {
    public static H4H parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num2 = null;
            Integer num3 = null;
            String str = null;
            C26123Bh8 c26123Bh8 = null;
            C51785Mup c51785Mup = null;
            ArrayList arrayList = null;
            ClipsMidCardType clipsMidCardType = null;
            C38749H4p c38749H4p = null;
            C26143BhU c26143BhU = null;
            C38770H5k c38770H5k = null;
            C38771H5l c38771H5l = null;
            C38786H6b c38786H6b = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("blending_unit_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("brand_safety_severity".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("camera_roll_mid_card_metadata".equals(A0s)) {
                    c26123Bh8 = AbstractC39796Hl6.parseFromJson(c16l);
                } else if ("feed_collection_mid_card_metadata".equals(A0s)) {
                    c51785Mup = AbstractC39921HnB.parseFromJson(c16l);
                } else if ("linked_medias_with_position".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H4I parseFromJson = AbstractC40087HqE.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("mid_card_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipsMidCardType = (ClipsMidCardType) ClipsMidCardType.A01.get(A1P);
                    if (clipsMidCardType == null) {
                        clipsMidCardType = ClipsMidCardType.A0Y;
                    }
                } else if ("prompt_mid_card_metadata".equals(A0s)) {
                    c38749H4p = AbstractC40191HsB.parseFromJson(c16l);
                } else if ("recently_saved_audio_mid_card_metadata".equals(A0s)) {
                    c26143BhU = AbstractC40205HsU.parseFromJson(c16l);
                } else if ("stories_mid_card_metadata".equals(A0s)) {
                    c38770H5k = AbstractC40296Hu0.parseFromJson(c16l);
                } else if ("stories_mid_card_metadata_v2".equals(A0s)) {
                    c38771H5l = AbstractC40295Htz.parseFromJson(c16l);
                } else if ("target_insertion_position".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("template_mid_card_metadata".equals(A0s)) {
                    c38786H6b = AbstractC40385HvY.parseFromJson(c16l);
                } else {
                    num3 = AbstractC31178DnM.A0V(c16l, num3, A0s, "view_state_item_type");
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("brand_safety_severity", c16l, "MidCardInfo");
            } else if (clipsMidCardType != null || !(c16l instanceof C07950bF)) {
                if (num2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("target_insertion_position", c16l, "MidCardInfo");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("view_state_item_type", c16l, "MidCardInfo");
                } else {
                    return new H4H(c26123Bh8, clipsMidCardType, c51785Mup, c38749H4p, c26143BhU, c38770H5k, c38771H5l, c38786H6b, str, arrayList, num.intValue(), num2.intValue(), num3.intValue());
                }
            } else {
                AbstractC166997dE.A1V("mid_card_type", c16l, "MidCardInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
