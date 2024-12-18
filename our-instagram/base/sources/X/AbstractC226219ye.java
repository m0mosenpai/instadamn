package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9ye, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226219ye {
    public static L2U parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            AA8 aa8 = null;
            EnumC150226pU enumC150226pU = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("stickers".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C148286ly parseFromJson = AbstractC201088uq.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("images".equals(A0s)) {
                    aa8 = A11.parseFromJson(c16l);
                } else if ("sticker_type".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    EnumC150226pU[] values = EnumC150226pU.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC150226pU = values[i];
                            if (!C14360o3.A0K(enumC150226pU.A00, A1Q)) {
                                i++;
                            }
                        } else {
                            enumC150226pU = null;
                            break;
                        }
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "TemplateStickerItem");
                throw C00O.createAndThrow();
            }
            return new L2U(enumC150226pU, aa8, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
