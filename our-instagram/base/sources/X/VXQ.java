package X;

import android.os.Bundle;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public abstract class VXQ {
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.fragment.app.Fragment, X.V1f, X.38K] */
    public static C67897V1f A00(Bundle bundle, C189478aR c189478aR, User user, C70155WDf c70155WDf, EnumC65855TvH enumC65855TvH, C67844UzI c67844UzI) {
        ?? c38k = new C38K();
        bundle.getString("IgSessionManager.SESSION_TOKEN_KEY").getClass();
        bundle.getString("ReportingConstants.ARG_CONTENT_ID").getClass();
        c38k.setArguments(bundle);
        c38k.A04 = user;
        c38k.A02 = c189478aR;
        c38k.A09 = c67844UzI;
        c38k.A08 = enumC65855TvH;
        c38k.A06 = c70155WDf;
        return c38k;
    }
}
