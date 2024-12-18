package X;

import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonErrorException;
import java.io.IOException;

/* renamed from: X.4lp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103714lp {
    public static final String A01(TigonError tigonError) {
        C14360o3.A0B(tigonError, 0);
        int ordinal = tigonError.category.ordinal();
        if (ordinal != 1) {
            if (ordinal != 0) {
                return "error";
            }
            return "done";
        }
        return "cancelled";
    }

    public static final String A02(TigonError tigonError, String str) {
        C14360o3.A0B(tigonError, 0);
        C14360o3.A0B(str, 1);
        StringBuilder sb = new StringBuilder();
        sb.append("TigonError(");
        sb.append("error=");
        sb.append(tigonError.category.toString());
        sb.append(", ");
        sb.append("errorDomain=");
        sb.append(tigonError.errorDomain);
        sb.append(", ");
        sb.append("domainErrorCode=");
        sb.append(tigonError.domainErrorCode);
        if (str.length() != 0) {
            sb.append(", tigonErrorClassname=");
            sb.append(str);
        }
        String str2 = tigonError.analyticsDetail;
        if (str2.length() != 0) {
            sb.append(AbstractC58317Pt9.A00(419));
            sb.append(str2);
            sb.append("\"");
        }
        sb.append(")");
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public static final TigonError A00(Throwable th) {
        while (th instanceof IOException) {
            if (th instanceof TigonErrorException) {
                TigonErrorException tigonErrorException = (TigonErrorException) th;
                if (tigonErrorException == null) {
                    return null;
                }
                return tigonErrorException.tigonError;
            }
            th = th.getCause();
        }
        return null;
    }
}
