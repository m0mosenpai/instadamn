package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.FeedItemType;
import com.instagram.api.schemas.TIXUDesignTypeEnum;
import com.instagram.api.schemas.ThreadsInFeedUnitTypeEnum;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4cn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99224cn {
    public static C99534dT parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C4dL c4dL = null;
            C99514dR c99514dR = null;
            FeedItemType feedItemType = null;
            Integer num = null;
            C4dL c4dL2 = null;
            String str = null;
            C39561sd c39561sd = null;
            ArrayList arrayList = null;
            String str2 = null;
            ArrayList arrayList2 = null;
            String str3 = null;
            ThreadsInFeedUnitTypeEnum threadsInFeedUnitTypeEnum = null;
            String str4 = null;
            String str5 = null;
            TIXUDesignTypeEnum tIXUDesignTypeEnum = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("end_card_destination".equals(A0q)) {
                    c4dL = AbstractC99434dG.parseFromJson(c16l);
                } else if ("feature_flags".equals(A0q)) {
                    c99514dR = AbstractC99504dQ.parseFromJson(c16l);
                } else if ("feed_item_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P4 = null;
                    } else {
                        A1P4 = c16l.A1P();
                    }
                    feedItemType = (FeedItemType) FeedItemType.A01.get(A1P4);
                    if (feedItemType == null) {
                        feedItemType = FeedItemType.A2e;
                    }
                } else if ("global_position".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("header_cta_destination".equals(A0q)) {
                    c4dL2 = AbstractC99434dG.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A0q)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                } else if ("media_dicts".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38321qM A0C = C38321qM.A0h.A0C(c16l, true, false);
                            if (A0C != null) {
                                arrayList.add(A0C);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("netego_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("profile_pic_uris_for_facepile".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                arrayList2.add(A1P3);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("quick_promotion_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("tifu_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    threadsInFeedUnitTypeEnum = (ThreadsInFeedUnitTypeEnum) ThreadsInFeedUnitTypeEnum.A01.get(A1P2);
                    if (threadsInFeedUnitTypeEnum == null) {
                        threadsInFeedUnitTypeEnum = ThreadsInFeedUnitTypeEnum.A06;
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("tracking_token".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("unit_design_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    tIXUDesignTypeEnum = (TIXUDesignTypeEnum) TIXUDesignTypeEnum.A01.get(A1P);
                    if (tIXUDesignTypeEnum == null) {
                        tIXUDesignTypeEnum = TIXUDesignTypeEnum.A05;
                    }
                } else if ("view_state_item_type".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C99534dT(feedItemType, c39561sd, c4dL, c4dL2, c99514dR, tIXUDesignTypeEnum, threadsInFeedUnitTypeEnum, num, num2, str, str2, str3, str4, str5, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
