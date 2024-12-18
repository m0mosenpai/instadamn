package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Gp3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38074Gp3 {
    public static C38071Gp0 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38071Gp0 c38071Gp0 = new C38071Gp0();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                ArrayList arrayList = null;
                String str2 = null;
                if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C38061Goo parseFromJson = AbstractC38073Gp2.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c38071Gp0.A05 = arrayList;
                } else if ("page_info".equals(A0q)) {
                    c38071Gp0.A02 = AbstractC40099HqR.parseFromJson(c16l);
                } else if ("alacorn_session_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c38071Gp0.A04 = str2;
                } else if ("licensed_music_eligibility_state".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c38071Gp0.A03 = str;
                } else if ("dark_banner_message".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        c16l.A1P();
                    }
                } else {
                    C55702hA.A01(c16l, c38071Gp0, A0q);
                }
                c16l.A0z();
            }
            String str3 = c38071Gp0.A04;
            if (str3 != null) {
                AbstractC38076Gp5.A00(c38071Gp0.A05, str3);
                return c38071Gp0;
            }
            return c38071Gp0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
