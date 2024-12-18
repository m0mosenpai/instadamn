package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.5M8, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5M8 {
    public static final void A00(UserSession userSession, String str, int i) {
        int i2;
        if (C5M9.A00(userSession).booleanValue()) {
            C1QT A00 = C1QS.A00(userSession);
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            A00.flowAnnotate(A00.generateFlowId(i, i2), "has_responsiveness", true);
        }
    }

    public static final void A05(UserSession userSession, String str, String str2, String str3, int i) {
        int i2;
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        if (C5M9.A00(userSession).booleanValue()) {
            C1QT A00 = C1QS.A00(userSession);
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            A00.flowAnnotate(A00.generateFlowId(i, i2), str2, str3);
        }
    }

    public static final void A06(String str, UserSession userSession, C38321qM c38321qM) {
        String str2;
        boolean z;
        int i;
        String str3;
        User CDj;
        User CDj2;
        if (c38321qM != null && (CDj2 = c38321qM.A0C.CDj()) != null) {
            str2 = CDj2.getId();
        } else {
            str2 = null;
        }
        A03(userSession, str2, str, 766842320);
        if (c38321qM != null) {
            z = c38321qM.A5M();
        } else {
            z = false;
        }
        C09530e4 c09530e4 = new C09530e4("is_carousel", Boolean.valueOf(z));
        int i2 = -1;
        if (c38321qM != null) {
            i = c38321qM.A0w();
        } else {
            i = -1;
        }
        C09530e4 c09530e42 = new C09530e4("number_of_likes", Integer.valueOf(i));
        if (c38321qM != null) {
            i2 = c38321qM.A0s();
        }
        for (C09530e4 c09530e43 : AbstractC16960so.A1Q(c09530e4, c09530e42, new C09530e4("number_of_comments", Integer.valueOf(i2)))) {
            String str4 = (String) c09530e43.A00;
            Object obj = c09530e43.A01;
            if (c38321qM != null && (CDj = c38321qM.A0C.CDj()) != null) {
                str3 = CDj.getId();
            } else {
                str3 = null;
            }
            A05(userSession, str3, str4, obj.toString(), 766842320);
        }
    }

    public static final void A01(UserSession userSession, String str, int i) {
        int i2;
        if (C5M9.A00(userSession).booleanValue()) {
            C1QT A00 = C1QS.A00(userSession);
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            A00.flowEndSuccess(A00.generateFlowId(i, i2));
        }
    }

    public static final void A02(UserSession userSession, String str, String str2) {
        int i;
        if (C5M9.A00(userSession).booleanValue()) {
            C1QT A00 = C1QS.A00(userSession);
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            A00.flowMarkPoint(A00.generateFlowId(766842320, i), str2);
        }
    }

    public static final void A03(UserSession userSession, String str, String str2, int i) {
        int i2;
        if (C5M9.A00(userSession).booleanValue()) {
            C1QT A00 = C1QS.A00(userSession);
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            A00.flowStart(A00.generateFlowId(i, i2), new UserFlowConfig(str2, false));
        }
    }

    public static final void A04(UserSession userSession, String str, String str2, int i, int i2) {
        int i3;
        if (C5M9.A00(userSession).booleanValue()) {
            C1QT A00 = C1QS.A00(userSession);
            if (str != null) {
                i3 = str.hashCode();
            } else {
                i3 = 0;
            }
            A00.flowAnnotate(A00.generateFlowId(i, i3), str2, i2);
        }
    }
}
