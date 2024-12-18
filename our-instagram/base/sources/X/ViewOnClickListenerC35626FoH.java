package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FoH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35626FoH implements View.OnClickListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ C72q A04;
    public final /* synthetic */ User A05;

    public ViewOnClickListenerC35626FoH(TextView textView, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, C72q c72q, User user) {
        this.A04 = c72q;
        this.A00 = textView;
        this.A05 = user;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = c38321qM;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int A05 = C0f9.A05(-1848831294);
        C72q c72q = this.A04;
        if (c72q != null) {
            String A0v = AbstractC31174DnI.A0v(this.A00);
            if (A0v.length() == 0) {
                i = 803871634;
                C0f9.A0C(i, A05);
            }
            User user = this.A05;
            long A08 = AbstractC31174DnI.A08(user);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A01, this.A02), AbstractC111324zv.A00(4686));
            A0f.A9K("authorid", Long.valueOf(A08));
            A0f.AAP(AbstractC111324zv.A00(4832), A0v);
            A0f.AAP("link_type", "profile");
            A0f.Cht();
            c72q.A02().A0C(this.A03, user, "user_profile_header");
        }
        i = 651647782;
        C0f9.A0C(i, A05);
    }
}
