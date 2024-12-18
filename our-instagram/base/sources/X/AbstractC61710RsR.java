package X;

import android.content.Context;
import android.os.BaseBundle;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.RsR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61710RsR {
    public static void A00(Context context, C63193Sev c63193Sev, InterfaceC172717mh interfaceC172717mh, InterfaceC172727mi interfaceC172727mi, ArrayList arrayList, HashSet hashSet) {
        C63193Sev A02;
        if (interfaceC172727mi.canGoBack() || interfaceC172727mi.canGoForward()) {
            C58875QDy.A00(c63193Sev, interfaceC172727mi);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            BaseBundle baseBundle = (BaseBundle) it.next();
            String string = baseBundle.getString("action");
            if (!hashSet.contains(string)) {
                String string2 = baseBundle.getString("KEY_LABEL");
                QF6 C9a = ((BrowserLiteFragment) interfaceC172727mi).C9a();
                if (C9a == null || !C9a.A0b || S8V.A00.contains(string)) {
                    int i = baseBundle.getInt("KEY_ICON_RES");
                    if (string == null) {
                        if (string2.equals("MENU_OPEN_WITH") && (A02 = C58876QDz.A01(context, interfaceC172717mh, interfaceC172727mi, i)) != null) {
                        }
                    } else {
                        A02 = C63193Sev.A02(string);
                        A02.A03 = string2;
                        if (i > 0) {
                            A02.A00 = i;
                        }
                    }
                    if ("ACTION_REPORT".equals(string)) {
                        A02.A01 = R.style.IgDestructiveText;
                    }
                    c63193Sev.A04(A02);
                }
            }
        }
    }
}
