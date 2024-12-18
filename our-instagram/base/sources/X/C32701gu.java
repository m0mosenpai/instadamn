package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C32701gu implements InterfaceC14180ni, C0KV {
    public static final C32701gu A00 = new C32701gu();

    public final boolean equals(Object obj) {
        if ((obj instanceof C0KV) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, C32691gt.class, "<init>", "<init>(Lcom/instagram/common/session/UserSession;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(830959811);
        int A032 = C0f9.A03(-619390353);
        C14360o3.A0B(userSession, 0);
        C32691gt c32691gt = new C32691gt(userSession);
        C0f9.A0A(1633394187, A032);
        C0f9.A0A(896099040, A03);
        return c32691gt;
    }
}
