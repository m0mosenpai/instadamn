package X;

import android.os.Bundle;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class F3M {
    public static EMY A00(Bundle bundle, GXX gxx, User user) {
        EMY emy = new EMY();
        AbstractC153636vY.A01(bundle, "IgSessionManager.SESSION_TOKEN_KEY");
        AbstractC153636vY.A01(bundle, AbstractC111324zv.A00(146));
        emy.setArguments(bundle);
        emy.A04 = gxx;
        emy.A05 = user;
        return emy;
    }
}
