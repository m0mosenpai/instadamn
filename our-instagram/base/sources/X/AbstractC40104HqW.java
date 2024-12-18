package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HqW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40104HqW {
    public static H4O parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Long l = null;
            C38321qM c38321qM = null;
            Long l2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            C38011pl c38011pl = null;
            ArrayList arrayList = null;
            Boolean bool2 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            C38237Grg c38237Grg = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("background_media".equals(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                } else if ("brs_threshold".equals(A0s)) {
                    l2 = AbstractC31173DnH.A0h(c16l);
                } else if ("button_bloks_action".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("button_bloks_params".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("client_gap_rules".equals(A0s)) {
                    c38011pl = AbstractC38761r8.parseFromJson(c16l);
                } else if ("clips".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1K(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("has_dismiss".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("has_dismiss_v2".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("icon_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("item_type".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("media_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("netego_service_client_dict".equals(A0s)) {
                    c38237Grg = AbstractC40105HqX.parseFromJson(c16l);
                } else if ("netego_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("tracking_token".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (c38011pl == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("client_gap_rules", c16l, "NetEgoMediaItem");
            } else if (bool != null || !(c16l instanceof C07950bF)) {
                if (l == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("item_type", c16l, "NetEgoMediaItem");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("media_id", c16l, "NetEgoMediaItem");
                } else if (str7 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("netego_type", c16l, "NetEgoMediaItem");
                } else if (str9 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("tracking_token", c16l, "NetEgoMediaItem");
                } else {
                    return new H4O(c38237Grg, c38321qM, c38011pl, bool2, l2, str, str2, str3, str4, str5, str6, str7, str8, str9, arrayList, l.longValue(), bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("has_dismiss_v2", c16l, "NetEgoMediaItem");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
