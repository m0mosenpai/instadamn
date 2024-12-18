package X;

import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Dr2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31398Dr2 implements InterfaceC42271xH {
    public final /* synthetic */ UserDetailFragment A00;

    public C31398Dr2(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    @Override // X.InterfaceC42271xH
    public final /* bridge */ /* synthetic */ boolean A79(Object obj) {
        User user = ((C70073Cr) obj).A00;
        String id = user.getId();
        UserDetailFragment userDetailFragment = this.A00;
        if (AbstractC31177DnL.A1Y(userDetailFragment, id)) {
            return true;
        }
        List list = userDetailFragment.A30.A00;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (Object obj2 : list) {
            if ((obj2 instanceof User) && C14360o3.A0K(user.getId(), ((User) obj2).getId())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r1.A27() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
    
        if (r3 != null) goto L34;
     */
    @Override // X.InterfaceC41501vz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 1763735889(0x69207951, float:1.2125064E25)
            int r6 = X.C0f9.A03(r0)
            X.3Cr r10 = (X.C70073Cr) r10
            r0 = 492498350(0x1d5aedae, float:2.8974937E-21)
            int r5 = X.C0f9.A03(r0)
            com.instagram.profile.fragment.UserDetailFragment r4 = r9.A00
            X.MUB r0 = r4.A10
            com.instagram.user.model.User r3 = r0.A03
            com.instagram.user.model.User r1 = r10.A00
            java.lang.String r0 = r1.getId()
            boolean r0 = X.AbstractC31177DnL.A1Y(r4, r0)
            if (r0 == 0) goto Le1
            if (r3 == 0) goto Lab
            boolean r0 = r4.A12()
            r7 = 0
            if (r0 != 0) goto Lc0
            boolean r0 = r3.CQf()
            if (r0 != 0) goto Lc0
            X.MUB r0 = r4.A10
            com.instagram.user.model.User r1 = r0.A03
            if (r1 == 0) goto L56
            X.6yu r0 = r4.A13
            X.6yv r8 = r0.A00
            boolean r0 = r4.A1Y
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r1.A26()
            if (r0 == 0) goto L4e
            boolean r1 = r1.A27()
            r0 = 1
            if (r1 != 0) goto L4f
        L4e:
            r0 = 0
        L4f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A02(r2, r0)
        L56:
            boolean r0 = r4.isResumed()
            if (r0 == 0) goto L69
            X.2iT r0 = com.instagram.profile.fragment.UserDetailFragment.A00(r4)
            if (r0 == 0) goto L69
            X.2iT r0 = com.instagram.profile.fragment.UserDetailFragment.A00(r4)
            r0.A0T()
        L69:
            boolean r0 = r4.isResumed()
            if (r0 == 0) goto L7e
            boolean r0 = r10.A03
            if (r0 == 0) goto L7e
            X.70r r2 = r4.A17
            android.view.View r1 = r4.mView
            android.content.Context r0 = r4.getContext()
            r2.A01(r0, r1, r7)
        L7e:
            com.instagram.common.session.UserSession r0 = r4.A0I
            X.2kX r0 = X.C57582kX.A00(r0)
            boolean r0 = r0.A0Q(r3)
            if (r0 == 0) goto Lb8
            android.content.Context r0 = r4.getContext()
            boolean r0 = X.AbstractC15820qc.A0E(r0)
            if (r0 == 0) goto La5
            java.lang.Integer r1 = r3.A0M()
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto La5
            com.instagram.profile.fragment.UserDetailTabController r0 = r4.A0z
            X.5mR r0 = r0.A0B()
            r4.A0u(r0, r7)
        La5:
            com.instagram.profile.fragment.UserDetailTabController r1 = r4.A0z
            r0 = 1
            r1.A0S(r3, r0)
        Lab:
            r0 = -1048863312(0xffffffffc17b9db0, float:-15.725998)
            X.C0f9.A0A(r0, r5)
            r0 = 1430711348(0x5546ec34, float:1.3669862E13)
            X.C0f9.A0A(r0, r6)
            return
        Lb8:
            com.instagram.profile.fragment.UserDetailTabController r0 = r4.A0z
            X.6yv r0 = r0.A0O
            r0.A00()
            goto La5
        Lc0:
            java.lang.Integer r1 = r1.A0M()
            java.lang.Integer r0 = X.C05F.A0C
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7e
            r0 = 0
            r4.A0f = r0
            r4.A0e = r0
            r0 = 1
            com.instagram.profile.fragment.UserDetailFragment.A01(r4, r0)
            X.6zh r0 = r4.A0r
            X.6yJ r2 = r0.A07
            X.0sl r1 = X.C16930sl.A00
            com.instagram.common.session.UserSession r0 = r0.A0A
            r2.EcN(r1, r7, r0)
            goto L7e
        Le1:
            if (r3 == 0) goto Lab
            goto La5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31398Dr2.onEvent(java.lang.Object):void");
    }
}
