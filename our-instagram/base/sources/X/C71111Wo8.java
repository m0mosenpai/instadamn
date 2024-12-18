package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;

/* renamed from: X.Wo8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71111Wo8 implements C7K9 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C71111Wo8(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A01 = obj;
        this.A05 = obj5;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A02 = obj2;
    }

    @Override // X.C7K9
    public final void onFail(AbstractC115105If abstractC115105If) {
        if (this.A00 != 0) {
            C131845xK.A00((C6FQ) this.A02, C6FW.A01, (InterfaceC103384lE) this.A03);
        }
    }

    @Override // X.C7K9
    public final void onSuccess(User user) {
        if (this.A00 != 0) {
            C14360o3.A0B(user, 0);
            Activity activity = (Activity) this.A01;
            UserSession userSession = (UserSession) this.A05;
            Object obj = this.A04;
            Object obj2 = this.A03;
            Object obj3 = this.A02;
            AbstractC167007dF.A1K(activity, userSession);
            AbstractC129875tr.A00(userSession).A08(activity, new Tx4(9, obj2, obj, obj3), userSession, user);
            return;
        }
        C14360o3.A0B(user, 0);
        ((C69339Vll) this.A04).A01 = user;
        FollowButton followButton = (FollowButton) this.A03;
        WEJ.A00((C6FG) this.A01, (C102884kP) this.A02, (UserSession) this.A05, followButton, user);
    }
}
