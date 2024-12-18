package X;

import android.view.View;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;

/* renamed from: X.Fo3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35612Fo3 implements View.OnClickListener {
    public final /* synthetic */ EnumC33473Er8 A00;
    public final /* synthetic */ C7I9 A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC35612Fo3(EnumC33473Er8 enumC33473Er8, C7I9 c7i9, User user, String str, String str2) {
        this.A01 = c7i9;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = enumC33473Er8;
        this.A02 = user;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-15583841);
        C7I9 c7i9 = this.A01;
        C7I9.A00(this.A00, c7i9, this.A04, this.A03);
        F3L.A00(c7i9.A01, c7i9.A02, c7i9.A03, MessagingUser.A00(this.A02), "business_chat_action_bar", null, false, false);
        C0f9.A0C(58484293, A05);
    }
}
