package com.instagram.user.follow.mvvm.data;

import X.AbstractC07080Za;
import X.AbstractC129875tr;
import X.AbstractC25651Mw;
import X.C129885ts;
import X.C14360o3;
import X.C15750qV;
import X.C24721Ip;
import X.C25671My;
import X.C57582kX;
import X.InterfaceC166227br;
import X.InterfaceC168017ew;
import X.InterfaceC19390xP;
import X.InterfaceC24731Iq;
import com.instagram.common.session.UserSession;

/* loaded from: classes3.dex */
public final class FollowUserDataSourceImpl implements InterfaceC166227br {
    public final C25671My A00;
    public final UserSession A01;
    public final C15750qV A02;
    public final C57582kX A03;
    public final C129885ts A04;
    public final InterfaceC168017ew A05;
    public final InterfaceC24731Iq A06;
    public final InterfaceC19390xP A07;

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // X.InterfaceC166227br
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Cmj(com.instagram.user.model.FollowStatus r10, X.EnumC33402EpZ r11, com.instagram.user.model.User r12, X.InterfaceC23621Ds r13, X.InterfaceC16820sZ r14) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl.Cmj(com.instagram.user.model.FollowStatus, X.EpZ, com.instagram.user.model.User, X.1Ds, X.0sZ):java.lang.Object");
    }

    public /* synthetic */ FollowUserDataSourceImpl(UserSession userSession, C15750qV c15750qV, InterfaceC168017ew interfaceC168017ew) {
        C57582kX A00 = C57582kX.A00(userSession);
        C129885ts A002 = AbstractC129875tr.A00(userSession);
        C25671My A003 = AbstractC25651Mw.A00(userSession);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(A002, 5);
        C14360o3.A0B(A003, 6);
        this.A01 = userSession;
        this.A05 = interfaceC168017ew;
        this.A02 = c15750qV;
        this.A03 = A00;
        this.A04 = A002;
        this.A00 = A003;
        C24721Ip c24721Ip = new C24721Ip(Integer.MAX_VALUE);
        this.A06 = c24721Ip;
        this.A07 = AbstractC07080Za.A03(c24721Ip);
    }
}
