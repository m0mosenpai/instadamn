package X;

import java.io.IOException;

/* renamed from: X.4qn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC106334qn {
    public static C106344qo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("clickable_icon_resource_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("clickable_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("end_message".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("end_message_icon_resource_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("clickable_id", "AdsFeedbackInterfaceClickableImpl");
            } else if (str5 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("text", "AdsFeedbackInterfaceClickableImpl");
            } else {
                return new C106344qo(str, str2, str3, str4, str5);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C106344qo c106344qo) {
        anonymousClass182.A0d();
        String str = c106344qo.A00;
        if (str != null) {
            anonymousClass182.A0S("clickable_icon_resource_name", str);
        }
        String str2 = c106344qo.A01;
        if (str2 != null) {
            anonymousClass182.A0S("clickable_id", str2);
        }
        String str3 = c106344qo.A02;
        if (str3 != null) {
            anonymousClass182.A0S("end_message", str3);
        }
        String str4 = c106344qo.A03;
        if (str4 != null) {
            anonymousClass182.A0S("end_message_icon_resource_name", str4);
        }
        String str5 = c106344qo.A04;
        if (str5 != null) {
            anonymousClass182.A0S("text", str5);
        }
        anonymousClass182.A0a();
    }
}
