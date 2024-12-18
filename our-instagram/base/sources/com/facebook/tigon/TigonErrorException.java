package com.facebook.tigon;

import X.AbstractC002300n;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25227BEk;
import X.AbstractC31173DnH;
import X.AbstractC58318PtA;
import X.AnonymousClass001;
import X.C103714lp;
import X.C14360o3;
import java.io.IOException;

/* loaded from: classes10.dex */
public class TigonErrorException extends IOException {
    public static final C103714lp Companion = new Object();
    public final TigonError tigonError;

    public static final String convertErrorToRequestStatus(TigonError tigonError) {
        return C103714lp.A01(tigonError);
    }

    public static final String formatTigonError(TigonError tigonError, String str) {
        return C103714lp.A02(tigonError, str);
    }

    public static final String formatTigonException(IOException iOException) {
        if (iOException == null) {
            return null;
        }
        TigonError A00 = C103714lp.A00(iOException);
        if (A00 != null) {
            String str = A00.errorDomain;
            if (AbstractC002300n.A0h(str, "Tigon", false) && AbstractC002300n.A0f(str, "Domain", false)) {
                str = AbstractC25227BEk.A0w(str, 5, str.length() - 6);
            }
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(A00.category);
            A1C.append(':');
            A1C.append(str);
            A1C.append(':');
            return AbstractC58318PtA.A0l(A1C, A00.domainErrorCode);
        }
        String A0q = AbstractC31173DnH.A0q(iOException);
        Throwable cause = iOException.getCause();
        if (cause == null) {
            return A0q;
        }
        return AnonymousClass001.A0T(A0q, AbstractC31173DnH.A0q(cause), '|');
    }

    public static final TigonError getUnderlyingTigonError(Throwable th) {
        return C103714lp.A00(th);
    }

    public static final String convertExceptionToRequestStatus(IOException iOException) {
        if (iOException == null) {
            return "done";
        }
        TigonError A00 = C103714lp.A00(iOException);
        if (A00 == null) {
            return "error";
        }
        return C103714lp.A01(A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonErrorException(TigonError tigonError, String str) {
        super(C103714lp.A02(tigonError, str));
        AbstractC167017dG.A1P(tigonError, str);
        this.tigonError = tigonError;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TigonErrorException(TigonError tigonError) {
        super(C103714lp.A02(tigonError, ""));
        C14360o3.A0B(tigonError, 1);
        this.tigonError = tigonError;
    }
}
