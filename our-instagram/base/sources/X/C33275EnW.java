package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.EnW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33275EnW extends AbstractC77473dX {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C31994E3w A01;
    public final /* synthetic */ E06 A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ boolean A04;

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        String str;
        C14360o3.A0B(user, 0);
        boolean z = this.A04;
        if (!z && user.B7L() != FollowStatus.A05 && user.B7L() != FollowStatus.A07) {
            this.A01.A02.setVisibility(0);
        } else {
            this.A01.A02.setVisibility(8);
        }
        E06 e06 = this.A02;
        if (z) {
            C32260EIu c32260EIu = e06.A0A;
            Object A0r = AbstractC31174DnI.A0r(user, e06.A0C);
            E06.A00(e06, this.A00);
            if (A0r != null) {
                if (c32260EIu.A01 == null) {
                    str = "discoverAccountsLogger";
                } else {
                    user.B7L();
                    return;
                }
            } else {
                return;
            }
        } else {
            C32260EIu c32260EIu2 = e06.A0A;
            Object obj = this.A03;
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.api.schemas.SuggestedUserItem");
            E8F e8f = (E8F) obj;
            int A00 = E06.A00(e06, this.A00);
            String A01 = E06.A01(e06, user.getId());
            C14360o3.A0B(e8f, 0);
            User user2 = e8f.A00;
            String str2 = e8f.A05;
            if (user2 != null) {
                Integer A002 = AbstractC37441GeL.A00(user2.B7L());
                String str3 = null;
                if (A002 != C05F.A00 && A002 != C05F.A0C) {
                    if (A002 == C05F.A01) {
                        str3 = "destroy";
                    }
                } else {
                    str3 = "create";
                }
                C63702ur c63702ur = c32260EIu2.A02;
                if (c63702ur == null) {
                    str = "recommendedUserLogger";
                } else {
                    C6PG A003 = C32260EIu.A00(e8f, user2, str2, A01, A00);
                    A003.A0A = str3;
                    c63702ur.A08(new C6PH(A003));
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void DHr(User user) {
        C14360o3.A0B(user, 0);
        if (!user.CQf()) {
            ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = this.A01.A09.A0J;
            E06 e06 = this.A02;
            viewOnAttachStateChangeListenerC110564yT.A04(e06.A07, e06.A08, user);
        }
    }

    public C33275EnW(C31994E3w c31994E3w, E06 e06, Object obj, int i, boolean z) {
        this.A04 = z;
        this.A01 = c31994E3w;
        this.A02 = e06;
        this.A00 = i;
        this.A03 = obj;
    }
}
