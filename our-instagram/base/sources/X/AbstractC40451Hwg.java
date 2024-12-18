package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Hwg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40451Hwg {
    public static H73 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            String str = null;
            HashMap hashMap = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            Integer num = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if ("bloks_app".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            str = null;
                        } else {
                            str = c16l.A1P();
                        }
                    } else if ("bloks_parameters".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            hashMap = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                AbstractC31179DnN.A1F(c16l, hashMap);
                            }
                        } else {
                            hashMap = null;
                        }
                    } else if (AbstractC31171DnF.A1Y(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            str2 = null;
                        } else {
                            str2 = c16l.A1P();
                        }
                    } else if ("nux_tooltip_text".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            str3 = null;
                        } else {
                            str3 = c16l.A1P();
                        }
                    } else if ("should_preload".equals(A0s)) {
                        bool = AbstractC166997dE.A0d(c16l);
                    } else {
                        num = AbstractC31178DnM.A0V(c16l, num, A0s, "show_tooltip_count");
                    }
                    c16l.A0z();
                } else {
                    return new H73(bool, num, str, str2, str3, hashMap);
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
