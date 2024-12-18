package X;

import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FUd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34779FUd {
    public static C1ON A00(UserSession userSession, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, boolean z) {
        String str5;
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0B("direct_v2/ranked_recipients/");
        A0N.A0F = str4;
        A0N.A0S(C32214EDn.class, C34792FUu.class);
        if (str != null && !str.isEmpty()) {
            A0N.A9s("query", str);
        }
        A0N.A9s(DatePickerDialogModule.ARG_MODE, str2);
        if (z) {
            str5 = "true";
        } else {
            str5 = "false";
        }
        A0N.A9s("show_threads", str5);
        A0N.A0D("max_ig_results", i);
        A0N.A0D("max_fb_results", 0);
        A0N.A0D("max_ig_bus_results", i2);
        if (i3 > 0) {
            A0N.A0D("max_ibc_results", i3);
        }
        A0N.A0D("max_ai_bot_results", i4);
        if (str3 != null) {
            A0N.A9s("poster_id", str3);
        }
        return A0N.A0N();
    }

    public static String A01(List list) {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0c();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0A.A0u(AbstractC166987dD.A1B(it));
            }
            A0A.A0Z();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            C0w9.A06("DirectRecipientsApi", AbstractC111324zv.A00(155), e);
            return null;
        }
    }
}
