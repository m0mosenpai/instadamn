package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1lw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C35761lw implements InterfaceC14180ni, C0KV {
    public static final C35761lw A00 = new C35761lw();

    public final boolean equals(Object obj) {
        if ((obj instanceof C0KV) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, C35751lv.class, "<init>", "<init>(Lcom/instagram/common/session/UserSession;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(-1186859415);
        int A032 = C0f9.A03(705348212);
        C14360o3.A0B(userSession, 0);
        C35751lv c35751lv = new C35751lv(userSession);
        C0f9.A0A(-2101801612, A032);
        C0f9.A0A(1435601331, A03);
        return c35751lv;
    }
}
