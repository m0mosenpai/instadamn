package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4gh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101254gh {
    public static C101264gi parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            C5IU c5iu = null;
            String str = null;
            Integer num2 = null;
            Boolean bool = null;
            String str2 = null;
            C39561sd c39561sd = null;
            Boolean bool2 = null;
            C37771pE c37771pE = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            String str3 = null;
            String str4 = null;
            Integer num3 = null;
            Integer num4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("client_position".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("end_card_model".equals(A0q)) {
                    c5iu = AbstractC40262HtS.parseFromJson(c16l);
                } else if ("filtering_tag".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("global_position".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("hide_unit_if_seen".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A0q)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                } else if ("netego_unit".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("reel".equals(A0q)) {
                    c37771pE = AbstractC38741r6.parseFromJson(c16l);
                } else if ("reel_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("reels".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C37771pE parseFromJson = AbstractC38741r6.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("tracking_token".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("view_state_item_type".equals(A0q)) {
                    num4 = Integer.valueOf(c16l.A1D());
                }
                c16l.A0z();
            }
            return new C101264gi(c39561sd, c5iu, c37771pE, bool, bool2, num, num2, num3, num4, str, str2, str3, str4, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
