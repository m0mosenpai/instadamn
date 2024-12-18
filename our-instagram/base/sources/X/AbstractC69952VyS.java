package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;

/* renamed from: X.VyS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69952VyS {
    public static C69127ViI parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69127ViI c69127ViI = new C69127ViI();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("flow_type".equals(A0s)) {
                    c69127ViI.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("initial_control_node".equals(A0s)) {
                    c69127ViI.A00 = AbstractC69951VyR.parseFromJson(c16l);
                } else if ("structured_survey_flow_pages".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69008Vfk parseFromJson = VV4.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c69127ViI.A02 = arrayList;
                }
                c16l.A0z();
            }
            return c69127ViI;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(C69127ViI c69127ViI) {
        StringWriter stringWriter = new StringWriter();
        C17z A0S = AbstractC167007dF.A0S(stringWriter);
        String str = c69127ViI.A01;
        if (str != null) {
            A0S.A0S("flow_type", str);
        }
        if (c69127ViI.A00 != null) {
            A0S.A0r("initial_control_node");
            AbstractC69951VyR.A00(A0S, c69127ViI.A00);
        }
        if (c69127ViI.A02 != null) {
            C16V.A03(A0S, "structured_survey_flow_pages");
            for (C69008Vfk c69008Vfk : c69127ViI.A02) {
                if (c69008Vfk != null) {
                    A0S.A0d();
                    if (c69008Vfk.A00 != null) {
                        A0S.A0r("control_node");
                        AbstractC69951VyR.A00(A0S, c69008Vfk.A00);
                    }
                    if (c69008Vfk.A01 != null) {
                        C16V.A03(A0S, "buckets");
                        for (C68807VcO c68807VcO : c69008Vfk.A01) {
                            if (c68807VcO != null) {
                                A0S.A0d();
                                if (c68807VcO.A00 != null) {
                                    C16V.A03(A0S, "configured_questions");
                                    for (C69423Vn8 c69423Vn8 : c68807VcO.A00) {
                                        if (c69423Vn8 != null) {
                                            A0S.A0d();
                                            A0S.A0T("allow_write_in_response", c69423Vn8.A07);
                                            A0S.A0T("is_required", c69423Vn8.A08);
                                            String str2 = c69423Vn8.A03;
                                            if (str2 != null) {
                                                A0S.A0S("question_id", str2);
                                            }
                                            VFT vft = c69423Vn8.A02;
                                            if (vft != null) {
                                                A0S.A0S("question_class", vft.toString());
                                            }
                                            if (c69423Vn8.A00 != null) {
                                                A0S.A0r("body");
                                                AbstractC69950VyQ.A00(A0S, c69423Vn8.A00);
                                            }
                                            if (c69423Vn8.A01 != null) {
                                                A0S.A0r(DialogModule.KEY_MESSAGE);
                                                AbstractC69950VyQ.A00(A0S, c69423Vn8.A01);
                                            }
                                            if (c69423Vn8.A05 != null) {
                                                C16V.A03(A0S, "subquestion_labels");
                                                for (C69006Vfi c69006Vfi : c69423Vn8.A05) {
                                                    if (c69006Vfi != null) {
                                                        AbstractC69950VyQ.A00(A0S, c69006Vfi);
                                                    }
                                                }
                                                A0S.A0Z();
                                            }
                                            if (c69423Vn8.A06 != null) {
                                                C16V.A03(A0S, "survey_token_params");
                                                for (C69010Vfm c69010Vfm : c69423Vn8.A06) {
                                                    if (c69010Vfm != null) {
                                                        A0S.A0d();
                                                        String str3 = c69010Vfm.A01;
                                                        if (str3 != null) {
                                                            A0S.A0S("param_name", str3);
                                                        }
                                                        VF1 vf1 = c69010Vfm.A00;
                                                        if (vf1 != null) {
                                                            A0S.A0S("survey_param_type", vf1.toString());
                                                        }
                                                        A0S.A0a();
                                                    }
                                                }
                                                A0S.A0Z();
                                            }
                                            if (c69423Vn8.A04 != null) {
                                                C16V.A03(A0S, "response_options");
                                                for (C69128ViJ c69128ViJ : c69423Vn8.A04) {
                                                    if (c69128ViJ != null) {
                                                        A0S.A0d();
                                                        A0S.A0Q("option_numeric_value", c69128ViJ.A00);
                                                        String str4 = c69128ViJ.A02;
                                                        if (str4 != null) {
                                                            A0S.A0S("option_value", str4);
                                                        }
                                                        if (c69128ViJ.A01 != null) {
                                                            A0S.A0r("option_text");
                                                            AbstractC69950VyQ.A00(A0S, c69128ViJ.A01);
                                                        }
                                                        A0S.A0a();
                                                    }
                                                }
                                                A0S.A0Z();
                                            }
                                            A0S.A0a();
                                        }
                                    }
                                    A0S.A0Z();
                                }
                                A0S.A0a();
                            }
                        }
                        A0S.A0Z();
                    }
                    A0S.A0a();
                }
            }
            A0S.A0Z();
        }
        return AbstractC167017dG.A0l(A0S, stringWriter);
    }
}
