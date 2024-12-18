package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.fx.access.constants.FxcalAccountType;
import java.io.IOException;
import kotlin.enums.EnumEntries;

/* renamed from: X.F7d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34205F7d {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.EsX] */
    public static C33559EsX parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("account_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    EnumEntries enumEntries = FxcalAccountType.A02;
                    C14360o3.A0B(A1P, 0);
                    FxcalAccountType.A01.get(A1P);
                } else if ("fbid".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if (AbstractC31187DnW.A01().equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("first_name".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("last_name".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("profile_pic_url".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                }
                c16l.A0z();
            }
            return new Object();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
