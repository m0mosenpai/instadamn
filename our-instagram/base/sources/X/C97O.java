package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.97O, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C97O {
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final Integer A02;

    public C97O(UserSession userSession, Integer num) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = num;
        this.A01 = AbstractC09440dt.A01(new C206879Ds(this, 8));
    }

    public final void A00(C9CN c9cn, C97K c97k) {
        AKJ.A01(c9cn, (AKJ) this.A01.getValue(), c97k, this.A02);
    }

    public final void A01(C97K c97k, String str) {
        Integer num = this.A02;
        if (num != null) {
            ((AKJ) this.A01.getValue()).A02(c97k, num, str);
        }
    }
}
