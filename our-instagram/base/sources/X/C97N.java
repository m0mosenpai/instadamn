package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.97N, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C97N {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    public C97N(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = AbstractC09440dt.A01(new C206879Ds(userSession, 6));
        this.A02 = AbstractC09440dt.A01(new C206879Ds(userSession, 7));
        this.A01 = AbstractC09440dt.A01(new C206879Ds(userSession, 5));
        this.A00 = AbstractC09440dt.A01(new C206879Ds(userSession, 4));
    }

    public static final C97Q A00(C97N c97n) {
        return (C97Q) c97n.A03.getValue();
    }
}
