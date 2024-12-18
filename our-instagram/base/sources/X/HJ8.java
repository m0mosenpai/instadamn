package X;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.profile.fragment.UserDetailTabController;

/* loaded from: classes7.dex */
public final class HJ8 extends C3PD {
    public final /* synthetic */ UserDetailTabController A00;

    public HJ8(UserDetailTabController userDetailTabController) {
        this.A00 = userDetailTabController;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        Intent intent = new Intent();
        UserDetailTabController userDetailTabController = this.A00;
        intent.putExtra(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userDetailTabController.A0Y);
        FragmentActivity fragmentActivity = userDetailTabController.A0H;
        fragmentActivity.setResult(-1, intent);
        fragmentActivity.finish();
        return true;
    }
}
