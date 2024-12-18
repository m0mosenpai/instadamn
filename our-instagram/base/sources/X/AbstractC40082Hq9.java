package X;

import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardOverlayType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hq9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40082Hq9 {
    public static C26133BhK parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            MidCardClipsClickedAction midCardClipsClickedAction = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            MidCardOverlayType midCardOverlayType = null;
            ArrayList arrayList5 = null;
            C26135BhM c26135BhM = null;
            C26134BhL c26134BhL = null;
            C26134BhL c26134BhL2 = null;
            C26134BhL c26134BhL3 = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("clips_clicked_action".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    midCardClipsClickedAction = (MidCardClipsClickedAction) MidCardClipsClickedAction.A01.get(A1P2);
                    if (midCardClipsClickedAction == null) {
                        midCardClipsClickedAction = MidCardClipsClickedAction.A09;
                    }
                } else if ("clips_clicked_actions_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C26132BhJ parseFromJson = AbstractC33716Ev4.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("clips_items".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1K(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("labels_on_clips".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C26134BhL parseFromJson2 = AbstractC40083HqA.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("overlay_clicked_actions_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C26134BhL parseFromJson3 = AbstractC40083HqA.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList4.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("overlay_on_clips".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    midCardOverlayType = (MidCardOverlayType) MidCardOverlayType.A01.get(A1P);
                    if (midCardOverlayType == null) {
                        midCardOverlayType = MidCardOverlayType.A0A;
                    }
                } else if ("overlay_on_clips_text_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList5);
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("preview_media_target".equals(A0s)) {
                    c26135BhM = AbstractC33717Ev5.parseFromJson(c16l);
                } else if ("primary_cta".equals(A0s)) {
                    c26134BhL = AbstractC40083HqA.parseFromJson(c16l);
                } else if ("seconary_cta".equals(A0s)) {
                    c26134BhL2 = AbstractC40083HqA.parseFromJson(c16l);
                } else if ("secondary_cta".equals(A0s)) {
                    c26134BhL3 = AbstractC40083HqA.parseFromJson(c16l);
                } else if ("title_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (midCardClipsClickedAction == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("clips_clicked_action", c16l, "MidCardCommonData");
            } else if (arrayList != null || !(c16l instanceof C07950bF)) {
                if (arrayList2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("clips_items", c16l, "MidCardCommonData");
                } else if (arrayList3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("labels_on_clips", c16l, "MidCardCommonData");
                } else if (c26134BhL == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("primary_cta", c16l, "MidCardCommonData");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("title_text", c16l, "MidCardCommonData");
                } else {
                    return new C26133BhK(midCardClipsClickedAction, c26134BhL, c26134BhL2, c26134BhL3, c26135BhM, midCardOverlayType, str, str2, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
                }
            } else {
                AbstractC166997dE.A1V("clips_clicked_actions_info", c16l, "MidCardCommonData");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
