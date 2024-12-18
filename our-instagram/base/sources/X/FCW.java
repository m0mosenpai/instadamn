package X;

import android.content.Context;
import java.security.InvalidParameterException;

/* loaded from: classes6.dex */
public abstract class FCW {
    public static final String A00(Context context, EnumC33389EpM enumC33389EpM) {
        int i;
        boolean A1R = AbstractC167007dF.A1R(0, context, enumC33389EpM);
        int ordinal = enumC33389EpM.ordinal();
        if (ordinal != 0) {
            if (ordinal != A1R) {
                if (ordinal == 2) {
                    i = 2131962712;
                } else {
                    throw new InvalidParameterException(AbstractC167017dG.A0n(enumC33389EpM, "Invalid sorting option in FollowFragment", AbstractC166987dD.A1C()));
                }
            } else {
                i = 2131962713;
            }
        } else {
            i = 2131962714;
        }
        return AbstractC166997dE.A0p(context, i);
    }
}
