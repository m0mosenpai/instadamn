package X;

import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.NsF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53883NsF {
    public static final void A00(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167017dG.A1N(userSession, fragmentActivity);
        if (bundle.getBoolean("open_in_direct")) {
            Intent putExtra = MSW.A08(fragmentActivity, ModalActivity.class).putExtra(AbstractC111324zv.A00(2402), "CLIPS_MEDIA_NOTES").putExtra(AbstractC111324zv.A00(213), bundle);
            putExtra.setFlags(268435456);
            TaskStackBuilder.create(fragmentActivity).addNextIntentWithParentStack(AbstractC34770FTt.A00(fragmentActivity, "all", "direct-inbox", null, 268435456)).addNextIntent(putExtra).startActivities();
            return;
        }
        AbstractC25228BEl.A1G(fragmentActivity, bundle, userSession, ModalActivity.class, "CLIPS_MEDIA_NOTES");
    }
}
