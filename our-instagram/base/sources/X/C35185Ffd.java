package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.url.UrlHandlerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

/* renamed from: X.Ffd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35185Ffd {
    public static final boolean A01(AbstractC18680vv abstractC18680vv, boolean z, boolean z2) {
        C14360o3.A0B(abstractC18680vv, 0);
        if (!(abstractC18680vv instanceof UserSession)) {
            return false;
        }
        if ((!z || !C18U.A06(C06090Tz.A05, abstractC18680vv, 36318591348250958L)) && (!z2 || !C18U.A06(C06090Tz.A05, abstractC18680vv, 36329371715518766L))) {
            return false;
        }
        return true;
    }

    public static final boolean A02(String str) {
        String path;
        List list;
        C14360o3.A0B(str, 0);
        android.net.Uri A01 = AbstractC08820cl.A01(UrlHandlerActivity.A05, str);
        if (A01 != null && (path = A01.getPath()) != null && AbstractC002300n.A0h(path, "/share/", false)) {
            List A0h = AbstractC31175DnJ.A0h(path, "/");
            if (!A0h.isEmpty()) {
                ListIterator listIterator = A0h.listIterator(A0h.size());
                while (listIterator.hasPrevious()) {
                    if (AbstractC31176DnK.A02(listIterator) != 0) {
                        list = AbstractC31177DnL.A0k(A0h, listIterator);
                        break;
                    }
                }
            }
            list = C16930sl.A00;
            if (list.toArray(new String[0]).length > 3) {
                return true;
            }
        }
        return false;
    }

    public static final String A00(String str) {
        Locale locale = Locale.getDefault();
        C14360o3.A07(locale);
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC25227BEk.A0B(AbstractC31172DnG.A16(locale, str)).getQueryParameterNames());
        Iterator it = AbstractC34917Fa3.A01.iterator();
        while (it.hasNext()) {
            if (A1F.contains(it.next())) {
                return AbstractC166987dD.A19(AbstractC31175DnJ.A04(str).clearQuery().build());
            }
        }
        if (!AbstractC31173DnH.A1a(str, "invites/contact")) {
            return str;
        }
        android.net.Uri A0B = AbstractC25227BEk.A0B(str);
        ArrayList A1F2 = AbstractC166987dD.A1F(A0B.getQueryParameterNames());
        if (!A1F2.contains("utm_content")) {
            return str;
        }
        Uri.Builder clearQuery = AbstractC31175DnJ.A04(str).clearQuery();
        Iterator it2 = A1F2.iterator();
        while (it2.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it2);
            if (!C14360o3.A0K(A1B, "utm_content")) {
                clearQuery.appendQueryParameter(A1B, A0B.getQueryParameter(A1B));
            }
        }
        return AbstractC166987dD.A19(clearQuery.build());
    }
}
