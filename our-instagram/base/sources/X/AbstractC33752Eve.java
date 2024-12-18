package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Eve, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33752Eve {
    public static E8D parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            Boolean bool3 = null;
            String str5 = null;
            String str6 = null;
            Integer num2 = null;
            String str7 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("creator_igid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("creator_username".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("group_image_uri".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("invite_link".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("is_creator_verified".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(1044).equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("is_member".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if ("number_of_members".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("subtitle".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("thread_igid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("thread_subtype".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("number_of_members", c16l, "SuggestedIGDChannelsNetEgoClientItemUnitImpl");
            } else if (str6 != null || !(c16l instanceof C07950bF)) {
                if (str7 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "SuggestedIGDChannelsNetEgoClientItemUnitImpl");
                } else {
                    return new E8D(bool, bool2, bool3, num2, str, str2, str3, str4, str5, str6, str7, num.intValue());
                }
            } else {
                AbstractC166997dE.A1V("thread_igid", c16l, "SuggestedIGDChannelsNetEgoClientItemUnitImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
