package X;

import android.graphics.Color;
import com.instagram.common.session.UserSession;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136566Gk {
    public List A00;
    public List A01;
    public C11L A02;
    public Date A03;
    public Date A04;
    public final UserSession A05;

    public static final List A00(List list) {
        try {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C1132359l(Color.parseColor((String) it.next()) << 32));
            }
            return arrayList;
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public final boolean A01() {
        Date date;
        Date date2;
        UserSession userSession = this.A05;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36322525537511729L)) {
            return false;
        }
        if (this.A04 == null || (date2 = this.A03) == null) {
            String A04 = C18U.A04(c06090Tz, userSession, 36885475491054201L);
            String A042 = C18U.A04(c06090Tz, userSession, 36885475491119738L);
            try {
                date = AbstractC34372FDo.A00.parse(A04);
            } catch (ParseException unused) {
                date = null;
            }
            this.A04 = date;
            try {
                date2 = AbstractC34372FDo.A00.parse(A042);
            } catch (ParseException unused2) {
                date2 = null;
            }
            this.A03 = date2;
        }
        Date date3 = this.A04;
        if (date3 == null || date2 == null) {
            return false;
        }
        Date date4 = new Date();
        if (date3.compareTo(date4) > 0 || date4.compareTo(date2) >= 0) {
            return false;
        }
        return true;
    }

    public C136566Gk(UserSession userSession) {
        this.A05 = userSession;
    }
}
