package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4i3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC101904i3 {
    public static String A00(Context context, UserSession userSession, List list) {
        return A02(context, C17060sy.A01.A01(userSession), list);
    }

    public static String A01(Context context, AnonymousClass172 anonymousClass172) {
        String fullName = anonymousClass172.getFullName();
        String username = anonymousClass172.getUsername();
        int BJ8 = anonymousClass172.BJ8();
        boolean CQw = anonymousClass172.CQw();
        boolean CPk = anonymousClass172.CPk();
        if (BJ8 != 0) {
            if (BJ8 != 1) {
                return null;
            }
            return context.getString(2131962025);
        }
        if (!A09(fullName, CQw, CPk) || username.equals(fullName)) {
            return null;
        }
        return username;
    }

    public static String A02(Context context, User user, List list) {
        AnonymousClass172 anonymousClass172 = user;
        if (!list.isEmpty()) {
            int size = list.size();
            AnonymousClass172 anonymousClass1722 = (AnonymousClass172) list.get(0);
            anonymousClass172 = anonymousClass1722;
            if (size != 1) {
                String A04 = A04(anonymousClass1722);
                String A042 = A04((AnonymousClass172) list.get(1));
                if (list.size() == 2) {
                    return context.getString(2131975509, A04, A042);
                }
                int size2 = list.size() - 2;
                return context.getResources().getQuantityString(R.plurals.thread_title_x_y_and_n_others, size2, A04, A042, NumberFormat.getInstance(C1Q2.A02()).format(size2));
            }
        }
        return A04(anonymousClass172);
    }

    public static String A03(DirectShareTarget directShareTarget, AnonymousClass172 anonymousClass172) {
        if ((!(directShareTarget.A01() instanceof InterfaceC2056098k) || directShareTarget.A0T) && directShareTarget.A04 == null) {
            if (Collections.unmodifiableList(directShareTarget.A0Q).size() == 1 && directShareTarget.A0R) {
                PendingRecipient pendingRecipient = (PendingRecipient) Collections.unmodifiableList(directShareTarget.A0Q).get(0);
                if (!pendingRecipient.A0H && pendingRecipient.A01 != 1) {
                    if (A09(pendingRecipient.A0A, pendingRecipient.A0K, false)) {
                        return pendingRecipient.A0A;
                    }
                } else {
                    String str = pendingRecipient.A0A;
                    if (!TextUtils.isEmpty(str)) {
                        return str;
                    }
                }
                return pendingRecipient.A0C;
            }
            if (directShareTarget.A0S()) {
                return A07(anonymousClass172);
            }
        }
        String str2 = directShareTarget.A0I;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static String A04(AnonymousClass172 anonymousClass172) {
        String fullName = anonymousClass172.getFullName();
        if (fullName != null && (anonymousClass172.BJ8() == 1 || A09(fullName, anonymousClass172.CQw(), anonymousClass172.CPk()))) {
            return fullName;
        }
        return anonymousClass172.getUsername();
    }

    public static String A05(AnonymousClass172 anonymousClass172) {
        String fullName = anonymousClass172.getFullName();
        if (fullName != null && anonymousClass172.BJ8() == 1) {
            return fullName;
        }
        return anonymousClass172.getUsername();
    }

    public static String A06(AnonymousClass172 anonymousClass172) {
        String fullName = anonymousClass172.getFullName();
        String username = anonymousClass172.getUsername();
        int BJ8 = anonymousClass172.BJ8();
        boolean CQw = anonymousClass172.CQw();
        boolean CPk = anonymousClass172.CPk();
        if (BJ8 != 0 || !A09(fullName, CQw, CPk) || username.equals(fullName)) {
            return null;
        }
        return username;
    }

    public static String A07(AnonymousClass179 anonymousClass179) {
        String fullName = anonymousClass179.getFullName();
        String username = anonymousClass179.getUsername();
        boolean CQw = anonymousClass179.CQw();
        boolean CPk = anonymousClass179.CPk();
        if (fullName == null || fullName.isEmpty() || !A09(fullName, CQw, CPk)) {
            return username;
        }
        return fullName;
    }

    public static String A08(AnonymousClass179 anonymousClass179) {
        if (anonymousClass179.BJ8() == 1 && anonymousClass179.getShortName() != null) {
            return anonymousClass179.getShortName();
        }
        return A07(anonymousClass179);
    }

    public static boolean A09(String str, boolean z, boolean z2) {
        if (!TextUtils.isEmpty(str)) {
            if (str == null || str.length() <= 30) {
                if (!z || z2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
