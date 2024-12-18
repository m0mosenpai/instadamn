package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1gi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C32581gi implements InterfaceC14180ni, C0KV {
    public static final C32581gi A00 = new C32581gi();

    public final boolean equals(Object obj) {
        if ((obj instanceof C0KV) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, C32571gh.class, "<init>", "<init>(Lcom/instagram/common/session/UserSession;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(-1527636919);
        int A032 = C0f9.A03(1777681319);
        C14360o3.A0B(userSession, 0);
        C32571gh c32571gh = new C32571gh(userSession);
        C0f9.A0A(475321720, A032);
        C0f9.A0A(1256646454, A03);
        return c32571gh;
    }
}
