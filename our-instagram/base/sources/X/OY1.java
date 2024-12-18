package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class OY1 {
    public static NewFundraiserInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            ArrayList arrayList = null;
            String str7 = null;
            String str8 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("charity_user_igid".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("goal_amount".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("goal_currency".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("is_test".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("source_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("charity_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("selected_users_to_be_invited".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("fundraiser_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("beneficiary_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("goal_amount", c16l, "NewFundraiserInfo");
            } else if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("is_test", c16l, "NewFundraiserInfo");
            } else {
                return new NewFundraiserInfo(str, str2, str3, str4, str5, str6, str7, str8, arrayList, num.intValue(), bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static String A00(NewFundraiserInfo newFundraiserInfo) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0O2 = MSW.A0O(A0O);
        A01(A0O2, newFundraiserInfo);
        return MSX.A0e(A0O2, A0O);
    }

    public static void A01(AnonymousClass182 anonymousClass182, NewFundraiserInfo newFundraiserInfo) {
        anonymousClass182.A0d();
        String str = newFundraiserInfo.A02;
        if (str != null) {
            anonymousClass182.A0S("charity_user_igid", str);
        }
        anonymousClass182.A0Q("goal_amount", newFundraiserInfo.A00);
        String str2 = newFundraiserInfo.A05;
        if (str2 != null) {
            anonymousClass182.A0S("goal_currency", str2);
        }
        String str3 = newFundraiserInfo.A07;
        if (str3 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str3);
        }
        anonymousClass182.A0T("is_test", newFundraiserInfo.A09);
        String str4 = newFundraiserInfo.A03;
        if (str4 != null) {
            anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str4);
        }
        String str5 = newFundraiserInfo.A06;
        if (str5 != null) {
            anonymousClass182.A0S("source_name", str5);
        }
        String str6 = newFundraiserInfo.A01;
        if (str6 != null) {
            anonymousClass182.A0S("charity_id", str6);
        }
        List list = newFundraiserInfo.A08;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "selected_users_to_be_invited", list);
            while (A0q.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q);
            }
            anonymousClass182.A0Z();
        }
        String str7 = newFundraiserInfo.A04;
        if (str7 != null) {
            anonymousClass182.A0S("fundraiser_type", str7);
        }
        String str8 = newFundraiserInfo.A0A;
        if (str8 != null) {
            anonymousClass182.A0S("beneficiary_type", str8);
        }
        anonymousClass182.A0a();
    }
}
