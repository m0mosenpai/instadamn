package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1kD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C34721kD implements InterfaceC14180ni, C0KV {
    public static final C34721kD A00 = new C34721kD();

    public final boolean equals(Object obj) {
        if ((obj instanceof C0KV) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, C34711kC.class, "<init>", "<init>(Lcom/instagram/common/session/UserSession;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(-471431300);
        int A032 = C0f9.A03(-1714480728);
        C14360o3.A0B(userSession, 0);
        C34711kC c34711kC = new C34711kC(userSession);
        C0f9.A0A(-673122560, A032);
        C0f9.A0A(307974646, A03);
        return c34711kC;
    }
}
