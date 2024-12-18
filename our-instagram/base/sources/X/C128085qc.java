package X;

/* renamed from: X.5qc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C128085qc {
    public static final C120985dq A01(C9C2 c9c2, C40971v4 c40971v4) {
        C14360o3.A0B(c40971v4, 1);
        return new C120985dq(new C42159Im7(c9c2, c40971v4));
    }

    public static final C120985dq A02(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return new C120985dq(new C128075qb(c38321qM, null));
    }

    public static final C120985dq A03(C40971v4 c40971v4) {
        C14360o3.A0B(c40971v4, 0);
        return new C120985dq(new C37899Glv(EnumC129395t1.A02, c40971v4));
    }

    public final C120985dq A04(InterfaceC38371qR interfaceC38371qR) {
        C40971v4 A00;
        C14360o3.A0B(interfaceC38371qR, 0);
        if (interfaceC38371qR instanceof C40971v4) {
            A00 = (C40971v4) interfaceC38371qR;
        } else if (interfaceC38371qR instanceof C38321qM) {
            boolean CdW = interfaceC38371qR.BQN().CdW();
            C38321qM BQN = interfaceC38371qR.BQN();
            if (CdW) {
                A00 = AbstractC40881uv.A00(BQN);
            } else {
                return A02(BQN);
            }
        } else {
            throw new IllegalArgumentException("Unsupported ModelWithMedia type");
        }
        return A03(A00);
    }

    public static final C120985dq A00() {
        return new C120985dq(new C37683GiK(EnumC129395t1.A08, null));
    }
}
