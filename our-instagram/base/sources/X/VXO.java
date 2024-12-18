package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public abstract class VXO {
    public static final C68107VBl A00(UserSession userSession, String str, String str2, String str3, int i, boolean z) {
        AbstractC167017dG.A1R(str2, str3);
        C68107VBl c68107VBl = new C68107VBl();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("SelfRemediationBottomSheetFragment.COMMENTER_USER_ID", str);
        A05.putString("SelfRemediationBottomSheetFragment.ARG_COMMENT_ID", str2);
        A05.putString("SelfRemediationBottomSheetFragment.COMMENT_MEDIA_ID", str3);
        A05.putInt("SelfRemediationBottomSheetFragment.AGR_COMMENT_HOST_SURFACE_TYPE", i);
        A05.putBoolean("SelfRemediationBottomSheetFragment.ARG_SHOW_RESTRICT_ACTIONS", z);
        A05.putBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED", true);
        A05.putBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD", false);
        A05.putFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO", 0.7f);
        A05.putBoolean("SelfRemediationBottomSheetFragment.ARG_KEEP_OPEN_AFTER_ACTION", false);
        c68107VBl.setArguments(A05);
        return c68107VBl;
    }
}
