package X;

import android.text.Editable;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Ci, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159227Ci {
    public static final C159227Ci A00 = new Object();

    public static final void A00(Editable editable) {
        C14360o3.A0B(editable, 0);
        int i = 1;
        for (int length = editable.length() - 1; -1 < length; length--) {
            boolean A01 = C11K.A01(editable.charAt(length));
            if (length == 0) {
                if (A01) {
                    editable.delete(length, i);
                    return;
                }
            } else if (A01 && C11K.A01(editable.charAt(length - 1))) {
                i = length + 1;
                editable.delete(length, i);
                return;
            }
            if (editable.charAt(length) == '\n') {
                i = length + 1;
                editable.delete(length, i);
                return;
            }
        }
    }

    public static final boolean A01(UserSession userSession, DirectThreadKey directThreadKey, String str) {
        String str2;
        Long l;
        C14360o3.A0B(directThreadKey, 2);
        if (str != null) {
            ArrayList Ab7 = C2JD.A00(userSession).Ab7(directThreadKey, true);
            ArrayList arrayList = new ArrayList();
            Iterator it = Ab7.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C83403nh c83403nh = (C83403nh) next;
                ImmutableList A0H = c83403nh.A0H();
                if (c83403nh.A10 == C2EY.A0z && A0H != null && !A0H.isEmpty()) {
                    C910143t c910143t = (C910143t) AbstractC001800i.A0J(A0H);
                    if (c910143t != null && (l = c910143t.A0o) != null) {
                        str2 = l.toString();
                    } else {
                        str2 = null;
                    }
                    if (C14360o3.A0K(str2, str)) {
                        arrayList.add(next);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean A02(UserSession userSession, E6W e6w, DirectThreadKey directThreadKey) {
        long j;
        C14360o3.A0B(directThreadKey, 1);
        if (e6w != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Long l = e6w.A01;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (timeUnit.toMillis(j) > System.currentTimeMillis()) {
                return true;
            }
        }
        String str = directThreadKey.A00;
        if (str != null) {
            return A01(userSession, directThreadKey, (String) ((C36270FzN) userSession.A01(C36270FzN.class, C37039GTv.A00)).A00.get(str));
        }
        return false;
    }
}
