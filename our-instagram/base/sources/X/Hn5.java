package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class Hn5 {
    public static H3G parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            Long l = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f = null;
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            Integer num = null;
            String str3 = null;
            C39561sd c39561sd = null;
            SimpleImageUrl simpleImageUrl = null;
            String str4 = null;
            SimpleImageUrl simpleImageUrl2 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Integer num2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(1094);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("facepile_outline_color_hex".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("facepile_photo_urls".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            SimpleImageUrl A002 = AbstractC222616c.A00(c16l);
                            if (A002 != null) {
                                arrayList.add(A002);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("fb_app_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("global_position".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("item_client_gap_rules".equals(A0s)) {
                    c39561sd = AbstractC39551sc.parseFromJson(c16l);
                } else if (A00.equals(A0s)) {
                    f = AbstractC167007dF.A0b(c16l);
                } else if ("media_url".equals(A0s)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("message_background_media_url".equals(A0s)) {
                    simpleImageUrl2 = AbstractC222616c.A00(c16l);
                } else if ("msite_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("tracking_token".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "view_state_item_type");
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("action_text", c16l, "FamilyBridgesBasicNetegoItemImpl");
            } else if (l != null || !(c16l instanceof C07950bF)) {
                if (arrayList == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("facepile_photo_urls", c16l, "FamilyBridgesBasicNetegoItemImpl");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("fb_app_url", c16l, "FamilyBridgesBasicNetegoItemImpl");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "FamilyBridgesBasicNetegoItemImpl");
                } else if (f == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "FamilyBridgesBasicNetegoItemImpl");
                } else if (simpleImageUrl == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("media_url", c16l, "FamilyBridgesBasicNetegoItemImpl");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_MESSAGE, c16l, "FamilyBridgesBasicNetegoItemImpl");
                } else if (simpleImageUrl2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("message_background_media_url", c16l, "FamilyBridgesBasicNetegoItemImpl");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("msite_url", c16l, "FamilyBridgesBasicNetegoItemImpl");
                } else if (str6 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "FamilyBridgesBasicNetegoItemImpl");
                } else if (str7 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("tracking_token", c16l, "FamilyBridgesBasicNetegoItemImpl");
                } else {
                    return new H3G(c39561sd, simpleImageUrl, simpleImageUrl2, num, num2, str, str2, str3, str4, str5, str6, str7, arrayList, f.floatValue(), l.longValue());
                }
            } else {
                AbstractC166997dE.A1V("facepile_outline_color_hex", c16l, "FamilyBridgesBasicNetegoItemImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
