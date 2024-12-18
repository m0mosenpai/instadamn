package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LJU {
    public static final LJU A00 = new Object();

    public static final L4K A00(Context context, UserSession userSession, InterfaceC82343lw interfaceC82343lw, Integer num, String str, String str2, String str3, String str4, String str5) {
        SpannableString A07;
        SpannableString A072;
        if (C18U.A06(C06090Tz.A05, userSession, 36314034387224961L)) {
            if (str4 != null && str4.length() != 0) {
                A072 = AbstractC43592JPx.A07(AbstractC31174DnI.A0t(context, str4, str3, 2131960369));
            } else {
                A072 = AbstractC43592JPx.A07(str3);
            }
            int A01 = AbstractC31174DnI.A01(context);
            String A0X = AbstractC37303Gc4.A0X(AbstractC166987dD.A19(A072));
            int A08 = AbstractC001900j.A08(A0X, AbstractC37303Gc4.A0X(str), 0, false);
            if (A08 > -1) {
                A072.setSpan(new ForegroundColorSpan(A01), A08, str.length() + A08, 0);
            } else if (C18U.A06(C06090Tz.A06, userSession, 36316173281267806L)) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (Character.isLetterOrDigit(charAt) || charAt == ' ') {
                        A1C.append(charAt);
                    }
                }
                Iterator it = AbstractC001900j.A0Q(AbstractC166987dD.A19(A1C), new char[]{' '}, 0).iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    int A082 = AbstractC001900j.A08(A0X, AbstractC37303Gc4.A0X(A1B), 0, false);
                    if (A082 > -1) {
                        A072.setSpan(new ForegroundColorSpan(A01), A082, A1B.length() + A082, 0);
                    }
                }
            }
            return new L4K(A072, interfaceC82343lw, num, str2, str3, str5);
        }
        if (str4 != null && str4.length() != 0) {
            A07 = AbstractC43592JPx.A07(AbstractC31174DnI.A0t(context, str4, str3, 2131960369));
            C13680mu.A02(A07, str4, AbstractC31174DnI.A01(context));
        } else {
            A07 = AbstractC43592JPx.A07(str3);
        }
        return new L4K(A07, interfaceC82343lw, num, str2, str3, null);
    }

    public static final ArrayList A01(Context context, UserSession userSession, String str, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C44178Jfh c44178Jfh = (C44178Jfh) it.next();
            EnumC82333lv enumC82333lv = EnumC82333lv.A08;
            String str2 = c44178Jfh.A02;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = c44178Jfh.A03;
            if (str3 == null) {
                str3 = "";
            }
            Integer num = c44178Jfh.A00;
            C14360o3.A07(num);
            A1E.add(A00(context, userSession, enumC82333lv, num, str, "sayt", str2, str3, c44178Jfh.A00()));
        }
        return A1E;
    }
}
