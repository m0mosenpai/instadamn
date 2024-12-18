package X;

import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;

/* loaded from: classes6.dex */
public abstract class F1F {
    public static final String A00(String str) {
        UserMonetizationProductType userMonetizationProductType;
        C14360o3.A0B(str, 0);
        if (str.equals(ValuePropsFlow.A06.A00)) {
            userMonetizationProductType = UserMonetizationProductType.A0E;
        } else if (str.equals(ValuePropsFlow.A0B.A00)) {
            userMonetizationProductType = UserMonetizationProductType.A0C;
        } else if (str.equals(ValuePropsFlow.A05.A00)) {
            userMonetizationProductType = UserMonetizationProductType.A05;
        } else {
            if (!str.equals(ValuePropsFlow.A07.A00)) {
                return str;
            }
            userMonetizationProductType = UserMonetizationProductType.A08;
        }
        return userMonetizationProductType.A00;
    }
}
