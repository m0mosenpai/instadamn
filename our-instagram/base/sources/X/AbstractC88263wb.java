package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC88263wb {
    public static C88523xA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C39531sa c39531sa = null;
            Boolean bool = null;
            Integer num = null;
            ArrayList arrayList = null;
            String str = null;
            Integer num2 = null;
            String str2 = null;
            String str3 = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            C39561sd c39561sd = null;
            C38321qM c38321qM = null;
            C38321qM c38321qM2 = null;
            String str4 = null;
            String str5 = null;
            Integer num3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("ad".equals(A0q)) {
                    c39531sa = AbstractC39241s1.parseFromJson(c16l);
                } else if ("allow_feedback".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("brs_severity".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("feed_recs_hide_reasons".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            H3M parseFromJson = AbstractC39925HnG.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("feed_survey_integration_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("global_position".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("inventory_source".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("is_eof".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("is_seen".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("item_client_gap_rules".equals(A0q)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                } else if ("media".equals(A0q)) {
                    c38321qM = C38321qM.A0h.A0C(c16l, true, false);
                } else if ("media_or_ad".equals(A0q)) {
                    c38321qM2 = C38321qM.A0h.A0C(c16l, true, false);
                } else if ("mezql_token".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (CacheBehaviorLogger.SOURCE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("view_state_item_type".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C88523xA(c39561sd, c38321qM, c38321qM2, c39531sa, bool, bool2, bool3, num, num2, num3, str, str2, str3, str4, str5, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
