package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CUe {
    public final C23031Ai A00;
    public final UserSession A01;

    public final void A00(EnumC193878i8 enumC193878i8, boolean z) {
        C23031Ai c23031Ai;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        int A05 = AbstractC25227BEk.A05(enumC193878i8, 0);
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 == 2) {
                    c23031Ai = this.A00;
                    interfaceC16530ry = c23031Ai.A1h;
                    c0yrArr = C23031Ai.A8c;
                    i = 463;
                } else {
                    throw B4Z.A00();
                }
            } else {
                c23031Ai = this.A00;
                interfaceC16530ry = c23031Ai.A1i;
                c0yrArr = C23031Ai.A8c;
                i = 464;
            }
        } else {
            c23031Ai = this.A00;
            interfaceC16530ry = c23031Ai.A1g;
            c0yrArr = C23031Ai.A8c;
            i = 462;
        }
        AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, i, z);
    }

    public final boolean A01(EnumC193878i8 enumC193878i8) {
        C23031Ai c23031Ai;
        InterfaceC16530ry interfaceC16530ry;
        C0YR[] c0yrArr;
        int i;
        if (!enumC193878i8.A06) {
            return true;
        }
        int ordinal = enumC193878i8.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    c23031Ai = this.A00;
                    interfaceC16530ry = c23031Ai.A1h;
                    c0yrArr = C23031Ai.A8c;
                    i = 463;
                } else {
                    throw B4Z.A00();
                }
            } else {
                c23031Ai = this.A00;
                interfaceC16530ry = c23031Ai.A1i;
                c0yrArr = C23031Ai.A8c;
                i = 464;
            }
        } else {
            c23031Ai = this.A00;
            interfaceC16530ry = c23031Ai.A1g;
            c0yrArr = C23031Ai.A8c;
            i = 462;
        }
        return AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, i);
    }

    public CUe(C23031Ai c23031Ai, UserSession userSession) {
        AbstractC167017dG.A1P(userSession, c23031Ai);
        this.A01 = userSession;
        this.A00 = c23031Ai;
    }
}
