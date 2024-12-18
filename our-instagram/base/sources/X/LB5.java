package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import libraries.access.src.main.base.common.FXDeviceItem;

/* loaded from: classes8.dex */
public abstract class LB5 {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        C14360o3.A0C(A03, MSV.A00(10));
        C102884kP c102884kP = (C102884kP) A03;
        String A0G = c102884kP.A0G();
        UserSession userSession = (UserSession) C6BQ.A0B(c6fq);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            Context context = c6fg.A00;
            if (C14360o3.A0K(A0G, "SSO_Cache")) {
                C14360o3.A0B(userSession, 0);
                AbstractC2054097l.A00(userSession).A03(new C50094M9i(C1U4.A00(context).A00("XE_ACCESS_LIBRARY_DATA"), c6fq, c102884kP.A0A()), true);
            } else if (C14360o3.A0K(A0G, "Device_Library")) {
                InterfaceC103384lE A0A = c102884kP.A0A();
                String A0I = c102884kP.A0I();
                if (A0I == null) {
                    A0I = "";
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                AbstractC23641Du.A05(C12L.A00.A04, new D54(userSession, A0A, c6fq, A1E, A0I, null, 2), C07Y.A00(C6BQ.A04(c6fq)));
                return null;
            }
        }
        return null;
    }

    public static final ArrayList A01(String str, List list) {
        String str2;
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(str);
        if (list != null) {
            A1E.add("");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FXDeviceItem fXDeviceItem = (FXDeviceItem) it.next();
                EnumC46133KbX enumC46133KbX = fXDeviceItem.A03;
                if (enumC46133KbX == null || (str2 = enumC46133KbX.name()) == null) {
                    str2 = "No Data Found";
                }
                A1E.add(str2);
                String str3 = fXDeviceItem.A02;
                if (str3 != null && str3.length() != 0) {
                    A1E.add(str3);
                } else {
                    A1E.add("No Data Found");
                }
                Long l = fXDeviceItem.A01;
                if (l != null) {
                    A1E.add("CREATED_TIMESTAMP");
                    A1E.add(String.valueOf(l));
                }
            }
        } else {
            A1E.add("No Data Found");
        }
        return A1E;
    }
}
