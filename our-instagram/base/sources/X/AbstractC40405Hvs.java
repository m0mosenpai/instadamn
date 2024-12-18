package X;

import com.instagram.api.schemas.TextPostAppAYSFButton;
import com.instagram.api.schemas.TextPostAppAYSFStyle;
import java.io.IOException;

/* renamed from: X.Hvs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40405Hvs {
    public static C45097JxR parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            TextPostAppAYSFButton textPostAppAYSFButton = null;
            String str = null;
            String str2 = null;
            TextPostAppAYSFStyle textPostAppAYSFStyle = null;
            C45117Jxm c45117Jxm = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("button".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    textPostAppAYSFButton = (TextPostAppAYSFButton) TextPostAppAYSFButton.A01.get(A1P2);
                    if (textPostAppAYSFButton == null) {
                        textPostAppAYSFButton = TextPostAppAYSFButton.A05;
                    }
                } else if ("header".equals(A0s)) {
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
                } else if ("index".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    textPostAppAYSFStyle = (TextPostAppAYSFStyle) TextPostAppAYSFStyle.A01.get(A1P);
                    if (textPostAppAYSFStyle == null) {
                        textPostAppAYSFStyle = TextPostAppAYSFStyle.A07;
                    }
                } else if ("users".equals(A0s)) {
                    c45117Jxm = AbstractC40406Hvt.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("index", c16l, "TextPostAppAYSFOnActivityFeedImpl");
            } else if (textPostAppAYSFStyle != null || !(c16l instanceof C07950bF)) {
                if (c45117Jxm == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("users", c16l, "TextPostAppAYSFOnActivityFeedImpl");
                } else {
                    return new C45097JxR(c45117Jxm, textPostAppAYSFButton, textPostAppAYSFStyle, str, str2, num.intValue());
                }
            } else {
                AbstractC166997dE.A1V("style", c16l, "TextPostAppAYSFOnActivityFeedImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
