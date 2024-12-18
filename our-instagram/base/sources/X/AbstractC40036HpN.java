package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.InterestPivotRedirect;
import com.instagram.api.schemas.InterestPivotStyle;
import java.io.IOException;

/* renamed from: X.HpN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40036HpN {
    public static H40 parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            InterestPivotRedirect interestPivotRedirect = null;
            String str2 = null;
            InterestPivotStyle interestPivotStyle = null;
            String str3 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ICON.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("redirect".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    interestPivotRedirect = (InterestPivotRedirect) InterestPivotRedirect.A01.get(A1P2);
                    if (interestPivotRedirect == null) {
                        interestPivotRedirect = InterestPivotRedirect.A05;
                    }
                } else if (AbstractC111324zv.A00(1250).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    interestPivotStyle = (InterestPivotStyle) InterestPivotStyle.A01.get(A1P);
                    if (interestPivotStyle == null) {
                        interestPivotStyle = InterestPivotStyle.A05;
                    }
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new H40(interestPivotRedirect, interestPivotStyle, str, str2, str3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
