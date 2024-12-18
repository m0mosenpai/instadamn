package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class FAB {
    public static final C32363ENk A00(UserSession userSession, InterfaceC151446rm interfaceC151446rm, String str, ArrayList arrayList, boolean z) {
        AbstractC167017dG.A1N(userSession, str);
        Bundle A0b = AbstractC166987dD.A0b();
        C32363ENk c32363ENk = new C32363ENk();
        AbstractC31173DnH.A1C(A0b, userSession);
        A0b.putString("ContactOptionsFragment.USER_ID", str);
        A0b.putIntegerArrayList("ContactOptionsFragment.ACTION_ID_LIST", arrayList);
        A0b.putBoolean("ContactOptionsFragment.REQUEST_CONTACT_ENABLED", z);
        c32363ENk.setArguments(A0b);
        c32363ENk.A00 = interfaceC151446rm;
        return c32363ENk;
    }
}
