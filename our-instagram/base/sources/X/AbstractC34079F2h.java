package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.F2h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34079F2h {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, EnumC33357Eoq enumC33357Eoq, String str, String str2, String str3, String str4, boolean z) {
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A05.putString("thread_v2_id", str2);
        A05.putString("creator_id", str4);
        A05.putString("entrypoint", str3);
        A05.putSerializable("nux_type", enumC33357Eoq);
        A05.putBoolean("is_followed_by_user", z);
        AbstractC31175DnJ.A0s(A05, new EKS(), AbstractC25225BEi.A0r(fragmentActivity, userSession));
    }
}
