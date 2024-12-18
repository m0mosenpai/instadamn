package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;

/* loaded from: classes11.dex */
public abstract class VWE {
    public static final void A00(Activity activity, Fragment fragment, C22P c22p, UserSession userSession, Long l, String str, String str2, String str3, int i) {
        C14360o3.A0B(userSession, 0);
        Bundle bundle = new Bundle();
        bundle.putSerializable("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_KEY_ENTRY_POINT", c22p);
        bundle.putString("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_KEY_MEDIA_INSIGHTS_ID", str);
        bundle.putString("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_KEY_MEDIA_ID", str2);
        bundle.putInt("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_NUM_SUPPORTERS", i);
        bundle.putString("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_INSIGHTS_TITLE", str3);
        if (l != null) {
            bundle.putLong("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_INSIGHTS_CREATION_DATE", l.longValue());
        }
        C6XJ.A02(activity, bundle, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(3718)).A0D(fragment, 1);
    }
}
