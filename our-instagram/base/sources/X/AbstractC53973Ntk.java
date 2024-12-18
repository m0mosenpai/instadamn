package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebookpay.msc.logging.LoggingData;
import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.Ntk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53973Ntk {
    public static final Fragment A00(UserMonetizationProductType userMonetizationProductType, EnumC33407Epe enumC33407Epe, String str, String str2) {
        Bundle A0E = AbstractC31174DnI.A0E(enumC33407Epe, 3);
        A0E.putString(AbstractC111324zv.A00(2999), enumC33407Epe.toString());
        if (str2 != null && str2.length() != 0) {
            if (!AbstractC002300n.A0h(str2, "upl", false)) {
                str2 = StringFormatUtil.formatStrLocaleSafe("%s_%s_%s", "upl", String.valueOf(System.currentTimeMillis()), str2);
                C14360o3.A0A(str2);
            }
        } else {
            str2 = AbstractC58442PvL.A02();
        }
        A0E.putParcelable(AbstractC111324zv.A00(1083), new LoggingData(str2));
        if (str != null) {
            A0E.putString("financial_entity_id", str);
        }
        if (userMonetizationProductType != null) {
            A0E.putString("payout_subtype", OY3.A00(userMonetizationProductType, false).A00);
        }
        return C2FP.A02().A04(A0E, "settings_fragment");
    }
}
