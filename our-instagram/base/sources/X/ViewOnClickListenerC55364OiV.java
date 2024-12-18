package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.OiV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55364OiV implements View.OnClickListener {
    public final /* synthetic */ C156096zd A00;

    public ViewOnClickListenerC55364OiV(C156096zd c156096zd) {
        this.A00 = c156096zd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1790711653);
        C156096zd c156096zd = this.A00;
        UserDetailFragment userDetailFragment = c156096zd.A01;
        FragmentActivity requireActivity = userDetailFragment.requireActivity();
        UserSession userSession = c156096zd.A00;
        AbstractC31174DnI.A0a(requireActivity, AbstractC166987dD.A0b(), userSession, ModalActivity.class, AbstractC111324zv.A00(4575)).A0C(requireActivity);
        C1571673v.A05(userDetailFragment, userSession, EnumC1571773w.A05, "tap_edit_highlights", AbstractC166987dD.A10(userSession).getId());
        C0f9.A0C(2082923309, A05);
    }
}
