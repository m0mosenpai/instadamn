package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CgL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28415CgL {
    public static C1NJ A00;

    /* JADX WARN: Multi-variable type inference failed */
    public static final String A00(UserSession userSession, String str, List list, boolean z) {
        String str2 = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C14360o3.A0K(next, str) == z) {
                    str2 = next;
                    break;
                }
            }
            str2 = str2;
        }
        User A02 = AnonymousClass189.A00(userSession).A02(str2);
        if (A02 != null) {
            String shortName = A02.getShortName();
            if (shortName == null) {
                String A08 = AbstractC101904i3.A08(A02);
                C14360o3.A07(A08);
                return A08;
            }
            return shortName;
        }
        return null;
    }

    public static final String A01(String str, List list, boolean z) {
        Object obj;
        C14360o3.A0B(str, 1);
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((User) obj).getId(), str) == z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        User user = (User) obj;
        if (user != null) {
            String shortName = user.getShortName();
            if (shortName == null) {
                String A08 = AbstractC101904i3.A08(user);
                C14360o3.A07(A08);
                return A08;
            }
            return shortName;
        }
        return null;
    }

    public static final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        AbstractC25228BEl.A1G(fragmentActivity, AbstractC61636Rr0.A00(AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str), AbstractC166987dD.A1L("blend_id", str2), AbstractC166987dD.A1L("target_media_igid", null), AbstractC166987dD.A1L("blend_inviter_id", str3), AbstractC166987dD.A1L("blend_inviter_name", str4), AbstractC166987dD.A1L("blend_receiver_name", str5), AbstractC166987dD.A1L("blend_membership_checked_status", Boolean.valueOf(z)), AbstractC166987dD.A1L("blend_is_eligible_to_reinvite", Boolean.valueOf(z2))), userSession, ModalActivity.class, AbstractC111324zv.A00(1518));
    }

    public static final boolean A03(UserSession userSession) {
        return AbstractC2056998t.A00(userSession).booleanValue();
    }
}
