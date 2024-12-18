package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HnB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39921HnB {
    public static C51785Mup parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ClipsACRMidCardSubType clipsACRMidCardSubType = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str4 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("acr_mid_card_sub_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipsACRMidCardSubType = (ClipsACRMidCardSubType) ClipsACRMidCardSubType.A01.get(A1P);
                    if (clipsACRMidCardSubType == null) {
                        clipsACRMidCardSubType = ClipsACRMidCardSubType.A0C;
                    }
                } else if ("cta_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("feed_collection_compound_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("feed_collection_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("media_dict".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sound_sync_infos".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C51797Mv1 parseFromJson = AbstractC40253HtJ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("cta_text", c16l, "FeedCollectionMidCardMetadata");
            } else if (arrayList != null || !(c16l instanceof C07950bF)) {
                if (arrayList2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("sound_sync_infos", c16l, "FeedCollectionMidCardMetadata");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("subtitle", c16l, "FeedCollectionMidCardMetadata");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "FeedCollectionMidCardMetadata");
                } else {
                    return new C51785Mup(clipsACRMidCardSubType, str, str2, str3, str4, str5, arrayList, arrayList2);
                }
            } else {
                AbstractC166997dE.A1V("media_dict", c16l, "FeedCollectionMidCardMetadata");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
