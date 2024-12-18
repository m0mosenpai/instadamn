package X;

import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.4mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC104314mu {
    public static final UserMonetizationProductType A00(String str) {
        UserMonetizationProductType userMonetizationProductType = (UserMonetizationProductType) UserMonetizationProductType.A01.get(str);
        if (userMonetizationProductType == null) {
            return UserMonetizationProductType.A0I;
        }
        return userMonetizationProductType;
    }
}
