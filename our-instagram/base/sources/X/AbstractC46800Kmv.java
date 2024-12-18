package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Kmv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46800Kmv {
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, X.4zl] */
    public static final KVT A00(Context context, UserSession userSession, L4W l4w) {
        String str;
        String str2;
        Object obj;
        String str3;
        String A00 = l4w.A00.A00(context);
        Integer num = l4w.A02;
        if (num != null && (str2 = l4w.A04) != null && AbstractC25231BEo.A1a(userSession, l4w.A05)) {
            String A0p = AbstractC166997dE.A0p(context, num.intValue());
            boolean z = l4w.A06;
            String A10 = AbstractC43592JPx.A10(A00, A0p);
            int A0A = AbstractC167007dF.A0A(A00) + " ".length();
            int length = A0A + A0p.length();
            List list = null;
            if (z) {
                ?? obj2 = new Object();
                obj2.A01 = A0A;
                obj2.A00 = length;
                obj = obj2;
            } else {
                obj = null;
            }
            C909943r c909943r = new C909943r(C05F.A00, "#999999", str2, A0A, length, z);
            if (obj != null) {
                list = AbstractC166987dD.A1J(obj);
            }
            switch (l4w.A01.intValue()) {
                case 0:
                    str3 = "disappearing_mode_on_client_admin_message";
                    break;
                case 1:
                    str3 = "disappearing_mode_off_client_admin_message";
                    break;
                case 2:
                    str3 = "disappearing_mode_duration_change_client_admin_message";
                    break;
                case 3:
                    str3 = "disappearing_mode_upgrade_from_vanish_mode_swipe_up";
                    break;
                case 4:
                    str3 = "disappearing_mode_upgrade_from_vanish_mode_update_app";
                    break;
                case 5:
                    str3 = "disappearing_mode_rollback";
                    break;
                default:
                    str3 = AbstractC111324zv.A00(2284);
                    break;
            }
            return new KVT(null, l4w.A03, A10, str3, list, AbstractC166987dD.A1J(c909943r));
        }
        switch (l4w.A01.intValue()) {
            case 0:
                str = "disappearing_mode_on_client_admin_message";
                break;
            case 1:
                str = "disappearing_mode_off_client_admin_message";
                break;
            case 2:
                str = "disappearing_mode_duration_change_client_admin_message";
                break;
            case 3:
                str = "disappearing_mode_upgrade_from_vanish_mode_swipe_up";
                break;
            case 4:
                str = "disappearing_mode_upgrade_from_vanish_mode_update_app";
                break;
            case 5:
                str = "disappearing_mode_rollback";
                break;
            default:
                str = AbstractC111324zv.A00(2284);
                break;
        }
        return new KVT(null, null, A00, str, null, null);
    }
}
