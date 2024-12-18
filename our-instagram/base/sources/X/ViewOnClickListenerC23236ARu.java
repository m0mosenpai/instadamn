package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

/* renamed from: X.ARu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23236ARu implements View.OnClickListener {
    public final /* synthetic */ C72q A00;
    public final /* synthetic */ User A01;

    public ViewOnClickListenerC23236ARu(C72q c72q, User user) {
        this.A00 = c72q;
        this.A01 = user;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1434839867);
        C72q c72q = this.A00;
        User user = this.A01;
        UserSession userSession = c72q.A03;
        UserDetailFragment userDetailFragment = c72q.A07;
        C1571673v.A08(userDetailFragment, userSession, C72q.A01(c72q), "tap_remembering", c72q.A09.A02(), c72q.A0C, c72q.A0D, AbstractC111324zv.A00(79));
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC111324zv.A00(1492), user.B8y());
        C26718Bqz c26718Bqz = new C26718Bqz();
        c26718Bqz.setArguments(A0b);
        new C189448aO(userSession).A00().A03(userDetailFragment.requireContext(), c26718Bqz);
        C0f9.A0C(1922296954, A05);
    }
}
