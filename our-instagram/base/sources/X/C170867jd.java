package X;

/* renamed from: X.7jd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170867jd implements C2VK {
    public C2VK A00;

    @Override // X.C2VK
    public final boolean AG3(Object obj, String str, int i, boolean z) {
        return ((Boolean) A00(new C9G0(obj, str, i, 0, z))).booleanValue();
    }

    @Override // X.C2VK
    public final boolean AG4(String str, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        return ((Boolean) A00(new C9G0(interfaceC16660sJ, str, i, 1, z))).booleanValue();
    }

    @Override // X.C2VK
    public final Object Ajj(Object obj, String str, int i, boolean z) {
        C14360o3.A0B(obj, 2);
        return A00(new C9G0(obj, str, i, 2, z));
    }

    @Override // X.C2VK
    public final void EG7(String str, boolean z) {
        C14360o3.A0B(str, 0);
        A00(new C43211J8i(str, z, 0));
    }

    @Override // X.C2VK
    public final void EUa(boolean z) {
        A00(new C206799Dk(z, 0));
    }

    @Override // X.C2VK
    public final void FBB(InterfaceC1124255u interfaceC1124255u, String str, String str2, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(interfaceC1124255u, 1);
        A00(new C9GE(interfaceC1124255u, str, str2, 0, z));
    }

    @Override // X.C2VK
    public final void FBC(InterfaceC1124255u interfaceC1124255u, String str, String str2, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(interfaceC1124255u, 1);
        A00(new C9GE(interfaceC1124255u, str, str2, 1, z));
    }

    @Override // X.C2VK
    public final void FCI(C125975mo c125975mo, String str, String str2, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c125975mo, 1);
        A00(new C29926DHo(c125975mo, str, str2, 0, z));
    }

    @Override // X.C2VK
    public final void FCJ(C125975mo c125975mo, String str, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c125975mo, 1);
        A00(new C207459Fy(c125975mo, str, 0, z));
    }

    @Override // X.C2VK
    public final void FCK(C125975mo c125975mo, String str, String str2, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c125975mo, 1);
        A00(new C29926DHo(c125975mo, str, str2, 1, z));
    }

    private final Object A00(InterfaceC16660sJ interfaceC16660sJ) {
        C2VK c2vk = this.A00;
        if (c2vk != null) {
            return interfaceC16660sJ.invoke(c2vk);
        }
        throw new IllegalStateException("Delegate StateUpdater not set");
    }

    @Override // X.C2VK
    public final boolean CUq() {
        return ((Boolean) A00(C170927jj.A00)).booleanValue();
    }

    @Override // X.C2VK
    public final void E78(Object obj, Object obj2, String str, int i, boolean z) {
        A00(new C170877je(obj, obj2, str, i, z));
    }
}
