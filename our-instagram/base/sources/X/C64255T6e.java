package X;

import java.nio.charset.Charset;

/* renamed from: X.T6e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64255T6e implements InterfaceC65422Tjt {
    public static final InterfaceC65516Tll A01 = new T6X();
    public final InterfaceC65516Tll A00;

    public C64255T6e() {
        InterfaceC65516Tll interfaceC65516Tll;
        T6Z A00 = T6Z.A00();
        try {
            interfaceC65516Tll = (InterfaceC65516Tll) AbstractC58321PtD.A0q("com.google.protobuf.DescriptorMessageInfoFactory");
        } catch (Exception unused) {
            interfaceC65516Tll = A01;
        }
        T6Y t6y = new T6Y(A00, interfaceC65516Tll);
        Charset charset = AbstractC63328Shc.A02;
        this.A00 = t6y;
    }

    public static boolean A00(TmQ tmQ) {
        if (tmQ.FFy() - 1 != 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC65422Tjt
    public final InterfaceC65591TnW FFa(Class cls) {
        C62221S2r A00;
        AbstractC63296Sgx A002;
        C63031Sb3 A0C;
        SZR szr;
        SSO A003;
        C63031Sb3 A0C2;
        SZR A004;
        AbstractC63410Sjl.A0U(cls);
        TmQ FFp = this.A00.FFp(cls);
        if (FFp.FFw()) {
            if (RO8.class.isAssignableFrom(cls)) {
                A0C2 = AbstractC63410Sjl.A0D();
                A004 = AbstractC63106SdA.A01();
            } else {
                A0C2 = AbstractC63410Sjl.A0C();
                A004 = AbstractC63106SdA.A00();
            }
            return C64253T6c.A00(A004, FFp.FFZ(), A0C2);
        }
        boolean isAssignableFrom = RO8.class.isAssignableFrom(cls);
        boolean A005 = A00(FFp);
        if (isAssignableFrom) {
            A00 = AbstractC63108SdC.A01();
            A002 = AbstractC63296Sgx.A01();
            A0C = AbstractC63410Sjl.A0D();
            if (A005) {
                szr = AbstractC63106SdA.A01();
                A003 = AbstractC63107SdB.A01();
            } else {
                szr = null;
                A003 = AbstractC63107SdB.A01();
            }
        } else {
            A00 = AbstractC63108SdC.A00();
            A002 = AbstractC63296Sgx.A00();
            A0C = AbstractC63410Sjl.A0C();
            if (A005) {
                szr = AbstractC63106SdA.A00();
                A003 = AbstractC63107SdB.A00();
            } else {
                szr = null;
                A003 = AbstractC63107SdB.A00();
            }
        }
        return C64254T6d.A09(szr, A002, A003, FFp, A00, A0C);
    }
}
