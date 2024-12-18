package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1jA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C34101jA implements InterfaceC14180ni, C0KV {
    public static final C34101jA A00 = new C34101jA();

    public final boolean equals(Object obj) {
        if ((obj instanceof C0KV) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, C34091j9.class, "<init>", "<init>(Lcom/instagram/common/session/UserSession;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(34566346);
        int A032 = C0f9.A03(942558852);
        C14360o3.A0B(userSession, 0);
        C34091j9 c34091j9 = new C34091j9(userSession);
        C0f9.A0A(194427331, A032);
        C0f9.A0A(780535791, A03);
        return c34091j9;
    }
}
