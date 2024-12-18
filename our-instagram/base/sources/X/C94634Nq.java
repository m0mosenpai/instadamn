package X;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* renamed from: X.4Nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94634Nq extends C0YY implements InterfaceC16820sZ {
    public static final C94634Nq A00 = new C94634Nq();

    public C94634Nq() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        WindowLayoutComponent A002;
        InterfaceC94694Nw interfaceC94694Nw = null;
        try {
            ClassLoader classLoader = InterfaceC94614No.class.getClassLoader();
            if (classLoader != null && (A002 = new C94674Nu(new C94664Nt(classLoader), classLoader).A00()) != null) {
                interfaceC94694Nw = VKl.A00(new C94664Nt(classLoader), A002);
                return interfaceC94694Nw;
            }
        } catch (Throwable unused) {
            C94624Np c94624Np = C94624Np.A02;
        }
        return interfaceC94694Nw;
    }
}
