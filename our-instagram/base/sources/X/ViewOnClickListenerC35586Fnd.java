package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Fnd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35586Fnd implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;

    public ViewOnClickListenerC35586Fnd(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, int i) {
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = c38321qM;
        this.A00 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-564819025);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A02;
        C38321qM c38321qM = this.A03;
        int i = this.A00;
        if (c38321qM.A5P() && C18U.A06(C06090Tz.A05, userSession, 36327301541018097L)) {
            AbstractC25228BEl.A1G(fragmentActivity, AbstractC54312NzW.A00(userSession, c38321qM, null, null, 0, false), userSession, ModalActivity.class, "clips_editor");
        } else {
            OMV A01 = AbstractC69933Cc.A01();
            String id = c38321qM.getId();
            if (id != null) {
                AbstractC31178DnM.A0y(A01.A02(id, i, 0, 0, false), fragmentActivity, userSession);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C0f9.A0C(1343453649, A05);
    }
}
