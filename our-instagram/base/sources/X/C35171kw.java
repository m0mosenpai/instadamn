package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1kw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C35171kw implements InterfaceC14180ni, C0KV {
    public static final C35171kw A00 = new C35171kw();

    public final boolean equals(Object obj) {
        if ((obj instanceof C0KV) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, C35161kv.class, "<init>", "<init>(Lcom/instagram/common/session/UserSession;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(1569495678);
        int A032 = C0f9.A03(1416029385);
        C14360o3.A0B(userSession, 0);
        C35161kv c35161kv = new C35161kv(userSession);
        C0f9.A0A(1819442101, A032);
        C0f9.A0A(796845325, A03);
        return c35161kv;
    }
}
