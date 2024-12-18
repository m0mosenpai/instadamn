package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;

/* renamed from: X.1WE, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1WE {
    public String A03(C116155Nu c116155Nu, UserSession userSession) {
        return null;
    }

    public void A04(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, String str) {
    }

    public void A05(C116155Nu c116155Nu, UserSession userSession, String str) {
    }

    public void A06(C116155Nu c116155Nu, UserSession userSession, String str) {
    }

    public boolean A07(C116155Nu c116155Nu) {
        return false;
    }

    public boolean A08(C116155Nu c116155Nu) {
        return false;
    }

    public boolean A09(C116155Nu c116155Nu, UserSession userSession, String str) {
        return false;
    }

    public void A0B(C116155Nu c116155Nu, UserSession userSession, String str, boolean z) {
    }

    public abstract String A0C();

    public abstract void A0D(C116155Nu c116155Nu, AbstractC12990ll abstractC12990ll, L85 l85, String str);

    public String A0A(C116155Nu c116155Nu, UserSession userSession) {
        String str;
        String str2;
        if (C1AD.A06(C06090Tz.A05, 18308006768814298L) && (str2 = c116155Nu.A0y) != null && !TextUtils.isEmpty(str2)) {
            str = c116155Nu.A0y;
        } else {
            str = c116155Nu.A12;
        }
        if (str == null) {
            String str3 = c116155Nu.A0j;
            String str4 = c116155Nu.A0X;
            C14360o3.A0B(str3, 0);
            C14360o3.A0B(str4, 1);
            return AnonymousClass001.A0T(str3, str4, '_');
        }
        String str5 = c116155Nu.A0j;
        String str6 = c116155Nu.A0X;
        C14360o3.A0B(str5, 0);
        C14360o3.A0B(str6, 1);
        return AnonymousClass001.A0j(str5, str6, str, '_', '&');
    }
}
