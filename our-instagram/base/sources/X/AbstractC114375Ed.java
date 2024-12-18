package X;

import com.instagram.api.schemas.SuggestedUsersStyle;

/* renamed from: X.5Ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114375Ed {
    public static final SuggestedUsersStyle A00(C47K c47k) {
        int intValue;
        Integer num = c47k.A09;
        if (num != null && (intValue = num.intValue()) != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    return SuggestedUsersStyle.A04;
                }
            } else {
                return SuggestedUsersStyle.A07;
            }
        }
        return SuggestedUsersStyle.A05;
    }
}
