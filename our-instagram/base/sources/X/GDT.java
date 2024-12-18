package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.profile.fragment.UserDetailFragment;

/* loaded from: classes6.dex */
public final class GDT implements GYB {
    public final Fragment A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        RectF rectF;
        Fragment fragment = this.A00;
        FragmentActivity activity = fragment.getActivity();
        if (fragment instanceof UserDetailFragment) {
            C14360o3.A0C(fragment, "null cannot be cast to non-null type com.instagram.arlink.intf.NametagLauncherAnimationAnchorProvider");
            View view = ((UserDetailFragment) fragment).A11.A01;
            if (view != null) {
                rectF = new RectF();
                AbstractC13880nE.A0M(rectF, view);
                AbstractC31178DnM.A0j(activity, AbstractC177607uu.A00(rectF, EnumC33405Epc.A0A, false), this.A01, TransparentModalActivity.class, "nametag");
            }
        }
        rectF = null;
        AbstractC31178DnM.A0j(activity, AbstractC177607uu.A00(rectF, EnumC33405Epc.A0A, false), this.A01, TransparentModalActivity.class, "nametag");
    }

    public GDT(Fragment fragment, UserSession userSession) {
        this.A00 = fragment;
        this.A01 = userSession;
    }
}
