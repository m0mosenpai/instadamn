package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CCY {
    public static final void A00(Activity activity, InterfaceC31032DkW interfaceC31032DkW, UserSession userSession, String str, List list) {
        AbstractC167007dF.A1D(userSession, 1, list);
        C26866BtS c26866BtS = new C26866BtS();
        c26866BtS.A00 = interfaceC31032DkW;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putStringArrayList("arg_audience_list", AbstractC166987dD.A1F(list));
        A0b.putString("arg_entry_point", str);
        c26866BtS.setArguments(A0b);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC25226BEj.A1M(activity, A0y, 2131952725);
        A0y.A0g = activity.getString(2131961124);
        A0y.A1J = true;
        A0y.A0v = true;
        C189478aR A00 = A0y.A00();
        c26866BtS.A01 = new C50253MHi(A00, userSession, str, 10);
        A00.A02(activity, c26866BtS);
    }
}
