package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.Fo5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35614Fo5 implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ E06 A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ boolean A04;

    public ViewOnClickListenerC35614Fo5(E06 e06, User user, Object obj, int i, boolean z) {
        this.A04 = z;
        this.A01 = e06;
        this.A02 = user;
        this.A00 = i;
        this.A03 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int A05 = C0f9.A05(-621790861);
        boolean z = this.A04;
        E06 e06 = this.A01;
        if (z) {
            C32260EIu c32260EIu = e06.A0A;
            User user = this.A02;
            String id = user.getId();
            Object A0r = AbstractC31174DnI.A0r(user, e06.A0C);
            E06.A00(e06, this.A00);
            C32260EIu.A01(c32260EIu, id);
            if (A0r != null && c32260EIu.A01 == null) {
                str = "discoverAccountsLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            C0f9.A0C(2102832540, A05);
        }
        C32260EIu c32260EIu2 = e06.A0A;
        Object obj = this.A03;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.api.schemas.SuggestedUserItem");
        E8F e8f = (E8F) obj;
        int A00 = E06.A00(e06, this.A00);
        String A01 = E06.A01(e06, this.A02.getId());
        C14360o3.A0B(e8f, 0);
        User user2 = e8f.A00;
        if (user2 != null) {
            C32260EIu.A01(c32260EIu2, user2.getId());
        }
        String str2 = e8f.A05;
        if (user2 != null) {
            C63702ur c63702ur = c32260EIu2.A02;
            if (c63702ur == null) {
                str = "recommendedUserLogger";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            c63702ur.A0B(new C6PH(C32260EIu.A00(e8f, user2, str2, A01, A00)));
        }
        C0f9.A0C(2102832540, A05);
    }
}
