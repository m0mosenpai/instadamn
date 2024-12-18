package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HzR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40607HzR {
    public static C38657Gyy parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool2 = null;
            ArrayList arrayList = null;
            String str6 = null;
            Integer num = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str7 = null;
            String str8 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action_emphasized".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("action_link".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("action_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("body_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("category_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("category_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("enable_sensitivity_screen".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("inform_module_actions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            UR1 parseFromJson = AbstractC40029HpG.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("inform_module_actions_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("inform_module_behavior".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("priority_inform_module_actions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            URD parseFromJson2 = AbstractC40158HrS.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("resources".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167017dG.A1H(c16l, arrayList3);
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("see_results_button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("title_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("action_emphasized", c16l, "InformMessage");
            } else if (str3 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("body_text", c16l, "InformMessage");
            } else {
                return new C38657Gyy(bool2, num, str, str2, str3, str4, str5, str6, str7, str8, arrayList, arrayList2, arrayList3, bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
