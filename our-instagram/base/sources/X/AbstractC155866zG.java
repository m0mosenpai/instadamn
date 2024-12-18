package X;

import android.transition.Scene;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.profile.fragment.UserDetailTabController;

/* renamed from: X.6zG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC155866zG implements InterfaceC155836zD {
    public Integer A00 = C05F.A0C;

    public void A00(AppBarLayout appBarLayout, Integer num) {
        UserDetailTabController userDetailTabController = ((C155856zF) this).A00;
        AnonymousClass715 anonymousClass715 = userDetailTabController.mViewHolder;
        if (anonymousClass715 != null && !userDetailTabController.A0X.equals("creator_inspiration_signals_playground_test_user_list")) {
            Scene scene = new Scene(anonymousClass715.A08, anonymousClass715.A05);
            Scene sceneForLayout = Scene.getSceneForLayout(userDetailTabController.mViewHolder.A08, R.layout.layout_use_in_camera_button_scrolling, userDetailTabController.A0H);
            sceneForLayout.getClass();
            if (num == C05F.A00) {
                AbstractC1566871q.A00(sceneForLayout);
            } else {
                AbstractC1566871q.A00(scene);
            }
        }
    }

    @Override // X.InterfaceC155846zE
    public final void DWT(AppBarLayout appBarLayout, int i) {
        Integer num;
        C14360o3.A0B(appBarLayout, 0);
        int totalScrollRange = appBarLayout.getTotalScrollRange();
        if (i == 0) {
            num = C05F.A01;
        } else if (Math.abs(i) >= totalScrollRange) {
            num = C05F.A00;
        } else {
            num = C05F.A0C;
        }
        if (this.A00 != num) {
            A00(appBarLayout, num);
        }
        this.A00 = num;
    }
}
