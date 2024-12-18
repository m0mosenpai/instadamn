package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class HsG {
    public static C38721r4 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            Long l = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayList = null;
            Long l2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("cursor".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("is_shuffle".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_unit_dismissable".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("netego_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("netego_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1X(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1350).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H6F parseFromJson = AbstractC40345Hup.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else {
                    l2 = AbstractC37303Gc4.A0O(c16l, l2, A0s, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                }
                c16l.A0z();
            }
            return new C38721r4(bool, bool2, l, l2, str, str2, str3, str4, str5, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
