package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.AfiInterestsRecoStyle;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3vL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87533vL {
    public static H2G parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            ArrayList arrayList = null;
            Integer num2 = null;
            H2E h2e = null;
            AfiInterestsRecoStyle afiInterestsRecoStyle = null;
            String str2 = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("expand_button_label".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("expanded_num_rows".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("interests".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            H2D parseFromJson = Hk8.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("num_rows".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("post_selection_cta".equals(A0q)) {
                    h2e = AbstractC39739HkB.parseFromJson(c16l);
                } else if ("style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    afiInterestsRecoStyle = (AfiInterestsRecoStyle) AfiInterestsRecoStyle.A01.get(A1P);
                    if (afiInterestsRecoStyle == null) {
                        afiInterestsRecoStyle = AfiInterestsRecoStyle.A05;
                    }
                } else if ("subtitle".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new H2G(h2e, afiInterestsRecoStyle, num, num2, str, str2, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
