package X;

import com.instagram.api.schemas.ClipsMidCardType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IAg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40908IAg {
    public static C54734OFl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            C38770H5k c38770H5k = null;
            C38771H5l c38771H5l = null;
            C38786H6b c38786H6b = null;
            IHY ihy = null;
            C26123Bh8 c26123Bh8 = null;
            C51785Mup c51785Mup = null;
            C26143BhU c26143BhU = null;
            C38749H4p c38749H4p = null;
            C111034zF c111034zF = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ClipsMidCardType clipsMidCardType = null;
            Integer num2 = null;
            Integer num3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("target_insertion_position".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("stories_mid_card_metadata".equals(A0s)) {
                    c38770H5k = AbstractC40296Hu0.parseFromJson(c16l);
                } else if ("stories_mid_card_metadata_v2".equals(A0s)) {
                    c38771H5l = AbstractC40295Htz.parseFromJson(c16l);
                } else if ("template_mid_card_metadata".equals(A0s)) {
                    c38786H6b = AbstractC40385HvY.parseFromJson(c16l);
                } else if ("mid_card_metadata".equals(A0s)) {
                    ihy = AbstractC40910IAi.parseFromJson(c16l);
                } else if ("camera_roll_mid_card_metadata".equals(A0s)) {
                    c26123Bh8 = AbstractC39796Hl6.parseFromJson(c16l);
                } else if ("feed_collection_mid_card_metadata".equals(A0s)) {
                    c51785Mup = AbstractC39921HnB.parseFromJson(c16l);
                } else if ("recently_saved_audio_mid_card_metadata".equals(A0s)) {
                    c26143BhU = AbstractC40205HsU.parseFromJson(c16l);
                } else if ("prompt_mid_card_metadata".equals(A0s)) {
                    c38749H4p = AbstractC40191HsB.parseFromJson(c16l);
                } else if ("stitched_media".equals(A0s)) {
                    c111034zF = AbstractC111024zE.parseFromJson(c16l);
                } else if ("linked_medias_with_position".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            HAH parseFromJson = AbstractC40909IAh.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("top_following_creator_usernames".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
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
                } else if ("view_state_item_type".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else {
                    num3 = AbstractC31178DnM.A0V(c16l, num3, A0s, "brand_safety_severity");
                }
                c16l.A0z();
            }
            if (clipsMidCardType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("mid_card_type", c16l, "ClipsMidcardItem");
                throw C00O.createAndThrow();
            }
            return new C54734OFl(c26123Bh8, c111034zF, clipsMidCardType, c51785Mup, c38749H4p, c26143BhU, c38770H5k, c38771H5l, c38786H6b, ihy, num, num2, num3, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
