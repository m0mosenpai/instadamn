package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.GrowthFrictionInterventionButton;
import com.instagram.api.schemas.GrowthFrictionInterventionButtonImpl;
import com.instagram.api.schemas.GrowthFrictionInterventionDetailImpl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IOK {
    public static GrowthFrictionInterventionDetailImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("buttons".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            GrowthFrictionInterventionButtonImpl parseFromJson = AbstractC39950Hnf.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("intervention_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1C(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("action", c16l, "GrowthFrictionInterventionDetailImpl");
            } else if (arrayList != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DevServerEntity.COLUMN_DESCRIPTION, c16l, "GrowthFrictionInterventionDetailImpl");
                } else if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("intervention_name", c16l, "GrowthFrictionInterventionDetailImpl");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "GrowthFrictionInterventionDetailImpl");
                } else {
                    return new GrowthFrictionInterventionDetailImpl(str, str2, str3, str4, str5, arrayList);
                }
            } else {
                AbstractC166997dE.A1V("buttons", c16l, "GrowthFrictionInterventionDetailImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl) {
        anonymousClass182.A0d();
        String str = growthFrictionInterventionDetailImpl.A00;
        if (str != null) {
            anonymousClass182.A0S("action", str);
        }
        List list = growthFrictionInterventionDetailImpl.A05;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "buttons", list);
            while (A0q.hasNext()) {
                GrowthFrictionInterventionButton growthFrictionInterventionButton = (GrowthFrictionInterventionButton) A0q.next();
                if (growthFrictionInterventionButton != null) {
                    GrowthFrictionInterventionButtonImpl Eu1 = growthFrictionInterventionButton.Eu1();
                    anonymousClass182.A0d();
                    String str2 = Eu1.A01;
                    if (str2 != null) {
                        anonymousClass182.A0S("action", str2);
                    }
                    Boolean bool = Eu1.A00;
                    if (bool != null) {
                        anonymousClass182.A0T("is_primary", bool.booleanValue());
                    }
                    AbstractC37301Gc2.A1E(anonymousClass182, Eu1.A02);
                    String str3 = Eu1.A03;
                    if (str3 != null) {
                        anonymousClass182.A0S("url", str3);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        String str4 = growthFrictionInterventionDetailImpl.A01;
        if (str4 != null) {
            anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str4);
        }
        String str5 = growthFrictionInterventionDetailImpl.A02;
        if (str5 != null) {
            anonymousClass182.A0S("intervention_name", str5);
        }
        AbstractC37301Gc2.A1F(anonymousClass182, growthFrictionInterventionDetailImpl.A03);
        String str6 = growthFrictionInterventionDetailImpl.A04;
        if (str6 != null) {
            anonymousClass182.A0S("url", str6);
        }
        anonymousClass182.A0a();
    }
}
