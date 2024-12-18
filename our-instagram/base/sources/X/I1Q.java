package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I1Q {
    public static C41162IKb parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C41162IKb c41162IKb = new C41162IKb();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (!"is_demo".equals(A0s)) {
                    ArrayList arrayList = null;
                    if ("label".equals(A0s)) {
                        c41162IKb.A05 = AbstractC167017dG.A0m(c16l);
                    } else if ("hide_label".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if (AbstractC37300Gc1.A1X(A0s)) {
                        c41162IKb.A07 = AbstractC167017dG.A0m(c16l);
                    } else if ("hide_reasons_v2".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C39321sD parseFromJson = AbstractC39311sC.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c41162IKb.A0B = arrayList;
                    } else if ("ad_title".equals(A0s)) {
                        c41162IKb.A03 = AbstractC167017dG.A0m(c16l);
                    } else if ("hide_flow_type".equals(A0s)) {
                        c16l.A1D();
                    } else if ("ad_id".equals(A0s)) {
                        c41162IKb.A02 = AbstractC167017dG.A0m(c16l);
                    } else if (!"show_ad_choices".equals(A0s)) {
                        if ("ad_action".equals(A0s)) {
                            if (c16l.A11() == C16R.A0G) {
                            }
                            c16l.A1P();
                        } else if ("link_text".equals(A0s)) {
                            c41162IKb.A06 = AbstractC167017dG.A0m(c16l);
                        } else if ("link_hint_text".equals(A0s)) {
                            if (c16l.A11() == C16R.A0G) {
                            }
                            c16l.A1P();
                        } else if ("android_links".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC37302Gc3.A1I(c16l, arrayList);
                                }
                            }
                            c41162IKb.A08 = arrayList;
                        } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC37302Gc3.A1J(c16l, arrayList);
                                }
                            }
                            c41162IKb.A0A = arrayList;
                        } else if ("interaction_timestamp".equals(A0s)) {
                            c41162IKb.A04 = AbstractC167017dG.A0m(c16l);
                        } else if ("cookies".equals(A0s)) {
                            if (c16l.A11() == C16R.A0C) {
                                arrayList = AbstractC166987dD.A1E();
                                while (c16l.A1J() != C16R.A08) {
                                    AbstractC167027dH.A0w(c16l, arrayList);
                                }
                            }
                            c41162IKb.A09 = arrayList;
                        } else if ("client_gap_rules".equals(A0s)) {
                            c41162IKb.A01 = AbstractC38761r8.parseFromJson(c16l);
                        } else if (AbstractC111324zv.A00(1002).equals(A0s)) {
                            c41162IKb.A00 = AbstractC102684k5.parseFromJson(c16l);
                        }
                    }
                    c16l.A0z();
                }
                c16l.A0d();
                c16l.A0z();
            }
            return c41162IKb;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
