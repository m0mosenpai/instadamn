package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1XC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1XC {
    public static final ArrayList A00 = new ArrayList();

    public static boolean A00(Context context, UserSession userSession) {
        Iterator it = new ArrayList(A00).iterator();
        while (it.hasNext()) {
            if (!((C1XB) it.next()).CPL(context, userSession)) {
                return false;
            }
        }
        return true;
    }
}
