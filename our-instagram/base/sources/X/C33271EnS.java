package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.EnS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33271EnS extends AbstractC77473dX {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C33271EnS(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        String str;
        C25531Mh c25531Mh;
        String str2;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(user, 0);
                C31636Dv2 c31636Dv2 = (C31636Dv2) this.A02;
                c31636Dv2.A02.A00.A02 = -1;
                if (user.B7L() != FollowStatus.A05 && user.B7L() != FollowStatus.A07) {
                    str = "destroy";
                } else {
                    str = "create";
                }
                C63702ur A01 = c31636Dv2.A01();
                if (A01 == null) {
                    return;
                }
                C6PG A00 = C31636Dv2.A00((C31462Ds6) this.A01, c31636Dv2.A00.getModuleName());
                A00.A0A = str;
                A00.A06 = AbstractC38851rI.A06(user.B7L());
                A01.A08(new C6PH(A00));
                return;
            case 1:
                FPO fpo = ((C32640EYo) this.A02).A03;
                User user2 = ((C36198FyC) this.A01).A00;
                if (user2.B7L() == FollowStatus.A05) {
                    c25531Mh = fpo.A00.A00;
                    if (c25531Mh == null) {
                        return;
                    }
                    c25531Mh.A0R("container_module", "clickable_profile_category");
                    str2 = "recommended_follow_button_click";
                } else {
                    if (user2.B7L() != FollowStatus.A06 || (c25531Mh = fpo.A00.A00) == null) {
                        return;
                    }
                    c25531Mh.A0R("container_module", "clickable_profile_category");
                    str2 = "recommended_unfollow_button_click";
                }
                c25531Mh.A0R("entry_module", str2);
                c25531Mh.A0R("target_id", user2.getId());
                c25531Mh.Cht();
                return;
            case 2:
                ((FOT) this.A01).A0B.DHp(user, AbstractC166987dD.A0H(this.A02));
                return;
            default:
                super.D3u(followStatus, user);
                return;
        }
    }
}
