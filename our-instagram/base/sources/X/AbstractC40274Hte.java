package X;

import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Hte, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40274Hte {
    public static H5R parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            HashMap hashMap = null;
            String str4 = null;
            String str5 = null;
            Boolean bool = null;
            Integer num = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if ("accessibility_hint".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            str = null;
                        } else {
                            str = c16l.A1P();
                        }
                    } else if ("action_tooltip_text".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            str2 = null;
                        } else {
                            str2 = c16l.A1P();
                        }
                    } else if ("bloks_app".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            str3 = null;
                        } else {
                            str3 = c16l.A1P();
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
                            str4 = null;
                        } else {
                            str4 = c16l.A1P();
                        }
                    } else if ("nux_tooltip_text".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            str5 = null;
                        } else {
                            str5 = c16l.A1P();
                        }
                    } else if ("should_preload".equals(A0s)) {
                        bool = AbstractC166997dE.A0d(c16l);
                    } else {
                        num = AbstractC31178DnM.A0V(c16l, num, A0s, "show_tooltip_count");
                    }
                    c16l.A0z();
                } else {
                    return new H5R(bool, num, str, str2, str3, str4, str5, hashMap);
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
