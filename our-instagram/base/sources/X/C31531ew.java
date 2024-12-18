package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1ew, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C31531ew implements InterfaceC14180ni, C0KV {
    public static final C31531ew A00 = new C31531ew();

    public final boolean equals(Object obj) {
        if ((obj instanceof C0KV) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, C31521ev.class, "<init>", "<init>(Lcom/instagram/common/session/UserSession;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(524169262);
        int A032 = C0f9.A03(1110691774);
        C14360o3.A0B(userSession, 0);
        C31521ev c31521ev = new C31521ev(userSession);
        C0f9.A0A(96574520, A032);
        C0f9.A0A(1698945819, A03);
        return c31521ev;
    }
}
