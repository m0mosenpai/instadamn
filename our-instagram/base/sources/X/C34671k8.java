package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.1k8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C34671k8 implements InterfaceC14180ni, C0KV {
    public static final C34671k8 A00 = new C34671k8();

    public final boolean equals(Object obj) {
        if ((obj instanceof C0KV) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, C1k7.class, "<init>", "<init>(Lcom/instagram/common/session/UserSession;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(-283615798);
        int A032 = C0f9.A03(690179053);
        C14360o3.A0B(userSession, 0);
        C1k7 c1k7 = new C1k7(userSession);
        C0f9.A0A(1785762407, A032);
        C0f9.A0A(696790917, A03);
        return c1k7;
    }
}
