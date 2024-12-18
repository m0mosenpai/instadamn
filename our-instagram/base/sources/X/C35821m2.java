package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1m2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C35821m2 implements InterfaceC14180ni, C0KV {
    public static final C35821m2 A00 = new C35821m2();

    public final boolean equals(Object obj) {
        if ((obj instanceof C0KV) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, C35811m1.class, "<init>", "<init>(Lcom/instagram/common/session/UserSession;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(-1039629658);
        int A032 = C0f9.A03(-902028930);
        C14360o3.A0B(userSession, 0);
        C35811m1 c35811m1 = new C35811m1(userSession);
        C0f9.A0A(636083617, A032);
        C0f9.A0A(263628568, A03);
        return c35811m1;
    }
}
