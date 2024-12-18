package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.GroupUserStoryTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.Collections;

/* loaded from: classes9.dex */
public abstract class OP5 {
    public static final C51690MsL A00(DirectShareTarget directShareTarget) {
        String str;
        C14360o3.A0B(directShareTarget, 0);
        InterfaceC83713oG A01 = directShareTarget.A01();
        C51690MsL c51690MsL = C51690MsL.A02;
        if (Collections.unmodifiableList(directShareTarget.A0Q).size() == 1) {
            str = "direct_user";
        } else {
            str = "direct_thread";
        }
        return new C51690MsL(str, A01);
    }

    public static final C51690MsL A01(UserStoryTarget userStoryTarget) {
        String CBn;
        String str;
        C14360o3.A0B(userStoryTarget, 0);
        boolean z = userStoryTarget instanceof GroupUserStoryTarget;
        C51690MsL c51690MsL = C51690MsL.A02;
        if (z) {
            DirectThreadKey directThreadKey = ((GroupUserStoryTarget) userStoryTarget).A00;
            if (directThreadKey != null) {
                CBn = directThreadKey.A00;
            } else {
                CBn = null;
            }
            str = "group_story";
        } else {
            CBn = userStoryTarget.CBn();
            str = "story";
        }
        return new C51690MsL(str, CBn);
    }
}
