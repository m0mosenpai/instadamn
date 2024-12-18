package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.INLINE_SURVEY_QUESTION_TYPES;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IPL {
    public static H6V parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            String str5 = null;
            String str6 = null;
            INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("answers".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H6Q parseFromJson = AbstractC40367HvD.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("disclaimer_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("next_question_id_on_skip".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("placeholder".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("submit_optional".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("submit_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1E(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    inline_survey_question_types = (INLINE_SURVEY_QUESTION_TYPES) INLINE_SURVEY_QUESTION_TYPES.A01.get(A1P);
                    if (inline_survey_question_types == null) {
                        inline_survey_question_types = INLINE_SURVEY_QUESTION_TYPES.A07;
                    }
                }
                c16l.A0z();
            }
            return new H6V(inline_survey_question_types, bool, str, str2, str3, str4, str5, str6, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H6V h6v) {
        anonymousClass182.A0d();
        List list = h6v.A08;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "answers", list);
            while (A0q.hasNext()) {
                InterfaceC43563JLx interfaceC43563JLx = (InterfaceC43563JLx) A0q.next();
                if (interfaceC43563JLx != null) {
                    H6Q F2g = interfaceC43563JLx.F2g();
                    anonymousClass182.A0d();
                    AbstractC37301Gc2.A1D(anonymousClass182, F2g.A02);
                    Boolean bool = F2g.A00;
                    if (bool != null) {
                        anonymousClass182.A0T("is_exclusive", bool.booleanValue());
                    }
                    String str = F2g.A03;
                    if (str != null) {
                        anonymousClass182.A0S("next_id", str);
                    }
                    Boolean bool2 = F2g.A01;
                    if (bool2 != null) {
                        anonymousClass182.A0T("single_choice_answer", bool2.booleanValue());
                    }
                    AbstractC37301Gc2.A1E(anonymousClass182, F2g.A04);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        String str2 = h6v.A02;
        if (str2 != null) {
            anonymousClass182.A0S("disclaimer_text", str2);
        }
        AbstractC37301Gc2.A1D(anonymousClass182, h6v.A03);
        String str3 = h6v.A04;
        if (str3 != null) {
            anonymousClass182.A0S("next_question_id_on_skip", str3);
        }
        String str4 = h6v.A05;
        if (str4 != null) {
            anonymousClass182.A0S("placeholder", str4);
        }
        Boolean bool3 = h6v.A01;
        if (bool3 != null) {
            anonymousClass182.A0T("submit_optional", bool3.booleanValue());
        }
        String str5 = h6v.A06;
        if (str5 != null) {
            anonymousClass182.A0S("submit_text", str5);
        }
        AbstractC37301Gc2.A1F(anonymousClass182, h6v.A07);
        INLINE_SURVEY_QUESTION_TYPES inline_survey_question_types = h6v.A00;
        if (inline_survey_question_types != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, inline_survey_question_types.A00);
        }
        anonymousClass182.A0a();
    }
}
