package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class AGT {
    public final C194808jg A01(Context context, UserSession userSession, C148276lx c148276lx, String str, String str2, long j) {
        String str3;
        AbstractC167027dH.A12(c148276lx, context, userSession);
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = c148276lx.A0O.iterator();
        while (it.hasNext()) {
            String str4 = ((C148286ly) it.next()).A0S;
            int hashCode = str4.hashCode();
            if (hashCode != -715403045) {
                if (hashCode == -637054625 && str4.equals("memories")) {
                    str3 = "memories_with_date";
                    A1E.add(new C202288x8(context, str3, str, str2, j));
                }
                throw AbstractC166987dD.A12("Sticker does not exist.");
            }
            if (str4.equals("on_this_day")) {
                if (A00(j)) {
                    str3 = "on_this_day_with_year";
                    A1E.add(new C202288x8(context, str3, str, str2, j));
                }
            } else {
                throw AbstractC166987dD.A12("Sticker does not exist.");
            }
        }
        return new C194808jg(context, userSession, A1E);
    }

    public static final boolean A00(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        if (calendar.get(5) == calendar2.get(5) && calendar.get(2) == calendar2.get(2)) {
            return true;
        }
        return false;
    }
}
