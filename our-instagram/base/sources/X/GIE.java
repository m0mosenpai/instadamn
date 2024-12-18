package X;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GIE implements InterfaceC37185GZw {
    @Override // X.InterfaceC37185GZw
    public final boolean EJT() {
        return false;
    }

    public static String A00(BaseBundle baseBundle, String str) {
        return baseBundle.getString(str) != null ? baseBundle.getString(str) : "deep_link";
    }

    public static void A01(FragmentActivity fragmentActivity, UserSession userSession, GIE gie, User user, String str) {
        C41749IeN A0N = C1XJ.A00.A0N(fragmentActivity, user.A0A(), userSession, new C36478G7c(gie, "shop_url"), null, str, "shop_url", user.getId(), user.getUsername());
        A0N.A0M = true;
        A0N.A05();
    }

    @Override // X.InterfaceC37185GZw
    public final Bundle AFg(AbstractC18680vv abstractC18680vv, String str) {
        return C1XJ.A00.A02(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (r11.equals("recent") == false) goto L20;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x003c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03b6  */
    @Override // X.InterfaceC37185GZw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CJ9(android.os.Bundle r22, androidx.fragment.app.FragmentActivity r23, X.AbstractC18680vv r24) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GIE.CJ9(android.os.Bundle, androidx.fragment.app.FragmentActivity, X.0vv):void");
    }
}
