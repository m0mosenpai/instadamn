package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ErrorHandlingResponseType;
import com.instagram.api.schemas.ErrorLevel;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hmw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39909Hmw {
    public static UPI parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            ErrorLevel errorLevel = null;
            String str3 = null;
            String str4 = null;
            ErrorHandlingResponseType errorHandlingResponseType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ad_account_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("admined_pages".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38671GzC parseFromJson = AbstractC39726Hjw.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("display_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("error_level".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    errorLevel = (ErrorLevel) ErrorLevel.A01.get(A1P2);
                    if (errorLevel == null) {
                        errorLevel = ErrorLevel.A05;
                    }
                } else if ("page_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("payment_method_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    errorHandlingResponseType = (ErrorHandlingResponseType) ErrorHandlingResponseType.A01.get(A1P);
                    if (errorHandlingResponseType == null) {
                        errorHandlingResponseType = ErrorHandlingResponseType.A0A;
                    }
                }
                c16l.A0z();
            }
            if (errorHandlingResponseType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c16l, "ErrorHandlingResponse");
                throw C00O.createAndThrow();
            }
            return new UPI(errorHandlingResponseType, errorLevel, str, str2, str3, str4, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
