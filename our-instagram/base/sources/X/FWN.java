package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class FWN {
    public static final EIS A00(UserSession userSession, Boolean bool, Boolean bool2, Integer num, String str, String str2, String str3, ArrayList arrayList) {
        C14360o3.A0B(str, 1);
        EIS eis = new EIS();
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC60492pY.A04(A0b, userSession);
        A0b.putParcelableArrayList("argument_rows", arrayList);
        if (num != null) {
            A0b.putInt("argument_header_icon_id", num.intValue());
        }
        A0b.putString("argument_header_text", str2);
        A0b.putString(MSV.A00(179), str);
        A0b.putString("argument_footer_text", str3);
        if (bool != null) {
            A0b.putBoolean("argument_use_default_icon_size", bool.booleanValue());
        }
        if (bool2 != null) {
            A0b.putBoolean("argument_use_updated_header_font", bool2.booleanValue());
        }
        eis.setArguments(A0b);
        return eis;
    }

    public static final EIS A01(UserSession userSession, String str, ArrayList arrayList) {
        return A00(userSession, null, null, null, str, null, null, arrayList);
    }
}
