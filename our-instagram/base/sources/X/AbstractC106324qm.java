package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4qm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC106324qm {
    public static C106364qq parseFromJson(C16L c16l) {
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
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("answers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C106344qo parseFromJson = AbstractC106334qn.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("question_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("sub_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("answers", "AdsFeedbackInterfaceQuestionImpl");
            } else if (str != null || !(c16l instanceof C07950bF)) {
                if (str2 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("text", "AdsFeedbackInterfaceQuestionImpl");
                } else {
                    return new C106364qq(str, str3, str2, arrayList);
                }
            } else {
                ((C07950bF) c16l).A03.A00("question_id", "AdsFeedbackInterfaceQuestionImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C106364qq c106364qq) {
        anonymousClass182.A0d();
        List<InterfaceC106354qp> list = c106364qq.A03;
        if (list != null) {
            C16V.A03(anonymousClass182, "answers");
            for (InterfaceC106354qp interfaceC106354qp : list) {
                if (interfaceC106354qp != null) {
                    AbstractC106334qn.A00(anonymousClass182, interfaceC106354qp.Eqd());
                }
            }
            anonymousClass182.A0Z();
        }
        String str = c106364qq.A00;
        if (str != null) {
            anonymousClass182.A0S("question_id", str);
        }
        String str2 = c106364qq.A01;
        if (str2 != null) {
            anonymousClass182.A0S("sub_text", str2);
        }
        String str3 = c106364qq.A02;
        if (str3 != null) {
            anonymousClass182.A0S("text", str3);
        }
        anonymousClass182.A0a();
    }
}
