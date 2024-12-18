package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.F3n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34111F3n {
    public static final String A00(UserSession userSession, C31990E3s c31990E3s, C36204FyI c36204FyI) {
        Context context;
        int i;
        SavedCollection savedCollection = c36204FyI.A00;
        if (savedCollection != null && savedCollection.A06() && AbstractC35085Fcw.A01(userSession)) {
            Integer A0M = AbstractC166997dE.A0Y(userSession).A0M();
            Integer num = C05F.A0C;
            context = c31990E3s.A00;
            i = 2131968438;
            if (A0M == num) {
                i = 2131968442;
            }
        } else {
            context = c31990E3s.A00;
            i = 2131969949;
            if (AbstractC35085Fcw.A01(userSession)) {
                i = 2131969950;
            }
        }
        return AbstractC166997dE.A0p(context, i);
    }
}
