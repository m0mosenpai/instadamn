package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BLa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25383BLa implements InterfaceC31020DkJ {
    public InterfaceC16660sJ A00;
    public final UserSession A01;
    public final C37522Gfe A02;

    public C25383BLa(UserSession userSession, C37522Gfe c37522Gfe) {
        this.A01 = userSession;
        this.A02 = c37522Gfe;
    }

    @Override // X.InterfaceC31020DkJ
    public final void Cxt(C120985dq c120985dq, C37644Ghd c37644Ghd, boolean z) {
        AbstractC167017dG.A1P(c120985dq, c37644Ghd);
        if (!z && !c120985dq.CdW()) {
            C51759Mti c51759Mti = new C51759Mti(c120985dq, c37644Ghd);
            InterfaceC16660sJ interfaceC16660sJ = this.A00;
            if (interfaceC16660sJ != null) {
                interfaceC16660sJ.invoke(c51759Mti);
            }
        }
    }

    @Override // X.InterfaceC31020DkJ
    public final void EX8(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
