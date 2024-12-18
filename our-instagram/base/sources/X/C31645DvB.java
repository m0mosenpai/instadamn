package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;

/* renamed from: X.DvB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31645DvB implements InterfaceC37234Gaj {
    public final UserSession A00;
    public final C31603DuV A01;
    public final InterfaceC37234Gaj A02;
    public final Context A03;

    public C31645DvB(Context context, UserSession userSession, C31603DuV c31603DuV, InterfaceC37234Gaj interfaceC37234Gaj) {
        AbstractC167007dF.A1F(c31603DuV, 3, interfaceC37234Gaj);
        this.A03 = context;
        this.A00 = userSession;
        this.A01 = c31603DuV;
        this.A02 = interfaceC37234Gaj;
    }

    @Override // X.InterfaceC37234Gaj
    public final void ANk(DirectThreadKey directThreadKey) {
        C14360o3.A0B(directThreadKey, 0);
        this.A01.ANk(directThreadKey);
    }

    @Override // X.InterfaceC37234Gaj
    public final void A7B(InterfaceC37158GYv interfaceC37158GYv, C2EC c2ec, C3o9 c3o9, boolean z) {
        if (c3o9 instanceof DirectThreadKey) {
            this.A01.A7B(interfaceC37158GYv, c2ec, c3o9, z);
        } else {
            if (!(c3o9 instanceof MsysThreadId)) {
                return;
            }
            this.A02.A7B(interfaceC37158GYv, c2ec, c3o9, z);
        }
    }

    @Override // X.InterfaceC37234Gaj
    public final void AE5(C2EC c2ec) {
        this.A01.AE5(c2ec);
    }

    @Override // X.InterfaceC37234Gaj
    public final void AOl(InterfaceC37158GYv interfaceC37158GYv, C3o9 c3o9, boolean z) {
        if (c3o9 instanceof DirectThreadKey) {
            this.A01.AOl(interfaceC37158GYv, c3o9, z);
            return;
        }
        if (c3o9 instanceof MsysThreadId) {
            UserSession userSession = this.A00;
            if (C18U.A06(C06090Tz.A06, userSession, 2342156051466094224L)) {
                AbstractC34188F6m.A00(this.A03, userSession, new G6W(0, this, c3o9), c3o9, C05F.A00);
                return;
            } else {
                this.A02.AOl(interfaceC37158GYv, c3o9, z);
                return;
            }
        }
        if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
            return;
        }
        AbstractC34188F6m.A00(this.A03, this.A00, new G6W(1, this, c3o9), ((DirectMsysMixedThreadKey) c3o9).A00, C05F.A00);
    }

    @Override // X.InterfaceC37234Gaj
    public final void APj(C2EC c2ec) {
        this.A01.APj(c2ec);
    }

    @Override // X.InterfaceC37234Gaj
    public final void AVy(C3o9 c3o9, boolean z) {
        C31603DuV c31603DuV;
        if (c3o9 instanceof DirectThreadKey) {
            c31603DuV = this.A01;
        } else if (c3o9 instanceof MsysThreadId) {
            this.A02.AVy(c3o9, z);
            return;
        } else {
            if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
                return;
            }
            c31603DuV = this.A01;
            c3o9 = ((DirectMsysMixedThreadKey) c3o9).A00;
        }
        c31603DuV.AVy(c3o9, z);
    }

    @Override // X.InterfaceC37234Gaj
    public final void CMQ(C3o9 c3o9, boolean z) {
        this.A01.CMQ(c3o9, z);
    }

    @Override // X.InterfaceC37234Gaj
    public final void CnI(C3o9 c3o9, Integer num, boolean z) {
        C31603DuV c31603DuV;
        if (c3o9 instanceof DirectThreadKey) {
            c31603DuV = this.A01;
        } else if (c3o9 instanceof MsysThreadId) {
            this.A02.CnI(c3o9, num, z);
            return;
        } else {
            if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
                return;
            }
            c31603DuV = this.A01;
            c3o9 = ((DirectMsysMixedThreadKey) c3o9).A00;
        }
        c31603DuV.CnI(c3o9, num, z);
    }

    @Override // X.InterfaceC37234Gaj
    public final void CoH(C32071E6x c32071E6x, C3o9 c3o9, Integer num, boolean z) {
        C31603DuV c31603DuV;
        if (c3o9 instanceof DirectThreadKey) {
            c31603DuV = this.A01;
        } else if (c3o9 instanceof MsysThreadId) {
            this.A02.CoH(c32071E6x, c3o9, num, z);
            return;
        } else {
            if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
                return;
            }
            c31603DuV = this.A01;
            c3o9 = ((DirectMsysMixedThreadKey) c3o9).A00;
        }
        c31603DuV.CoH(c32071E6x, c3o9, num, z);
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqB(C3o9 c3o9) {
        C31603DuV c31603DuV;
        if (c3o9 instanceof DirectThreadKey) {
            c31603DuV = this.A01;
        } else if (c3o9 instanceof MsysThreadId) {
            this.A02.CqB(c3o9);
            return;
        } else {
            if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
                return;
            }
            c31603DuV = this.A01;
            c3o9 = ((DirectMsysMixedThreadKey) c3o9).A00;
        }
        c31603DuV.CqB(c3o9);
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqD(C3o9 c3o9) {
        C31603DuV c31603DuV;
        if (c3o9 instanceof DirectThreadKey) {
            c31603DuV = this.A01;
        } else if (c3o9 instanceof MsysThreadId) {
            this.A02.CqD(c3o9);
            return;
        } else {
            if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
                return;
            }
            c31603DuV = this.A01;
            c3o9 = ((DirectMsysMixedThreadKey) c3o9).A00;
        }
        c31603DuV.CqD(c3o9);
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqE(C3o9 c3o9, int i) {
        C31603DuV c31603DuV;
        if (c3o9 instanceof DirectThreadKey) {
            c31603DuV = this.A01;
        } else if (c3o9 instanceof MsysThreadId) {
            this.A02.CqE(c3o9, i);
            return;
        } else {
            if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
                return;
            }
            c31603DuV = this.A01;
            c3o9 = ((DirectMsysMixedThreadKey) c3o9).A00;
        }
        c31603DuV.CqE(c3o9, i);
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqH(C3o9 c3o9) {
        if (c3o9 instanceof DirectThreadKey) {
            this.A01.CqH(c3o9);
            return;
        }
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqM(C3o9 c3o9, int i) {
        C31603DuV c31603DuV;
        if (c3o9 instanceof DirectThreadKey) {
            c31603DuV = this.A01;
        } else if (c3o9 instanceof MsysThreadId) {
            this.A02.CqM(c3o9, i);
            return;
        } else {
            if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
                return;
            }
            c31603DuV = this.A01;
            c3o9 = ((DirectMsysMixedThreadKey) c3o9).A00;
        }
        c31603DuV.CqM(c3o9, i);
    }

    @Override // X.InterfaceC37234Gaj
    public final void E2y(C2EC c2ec) {
        this.A01.E2y(c2ec);
    }

    @Override // X.InterfaceC37234Gaj
    public final void E31(C3o9 c3o9, boolean z) {
        C31603DuV c31603DuV;
        if (c3o9 instanceof DirectThreadKey) {
            c31603DuV = this.A01;
        } else if (c3o9 instanceof MsysThreadId) {
            this.A02.E31(c3o9, z);
            return;
        } else if (c3o9 instanceof DirectMsysMixedThreadKey) {
            c31603DuV = this.A01;
            c3o9 = ((DirectMsysMixedThreadKey) c3o9).A00;
        } else {
            throw AbstractC166987dD.A12(AbstractC167017dG.A0n(c3o9, "Debug info don't support ", AbstractC166987dD.A1C()));
        }
        c31603DuV.E31(c3o9, z);
    }

    @Override // X.InterfaceC37234Gaj
    public final void E4M(C2EC c2ec) {
        this.A01.E4M(c2ec);
    }

    @Override // X.InterfaceC37234Gaj
    public final void EGA(C2EC c2ec) {
        this.A01.EGA(c2ec);
    }

    @Override // X.InterfaceC37234Gaj
    public final void EGQ(C2EC c2ec, Integer num) {
        this.A01.EGQ(c2ec, num);
    }

    @Override // X.InterfaceC37234Gaj
    public final void EI0(C2EC c2ec) {
        this.A01.EI0(c2ec);
    }

    @Override // X.InterfaceC37234Gaj
    public final void EKc(C2EC c2ec) {
        this.A01.EKc(c2ec);
    }

    @Override // X.InterfaceC37234Gaj
    public final void ElU(C2EC c2ec) {
        this.A01.ElU(c2ec);
    }

    @Override // X.InterfaceC37234Gaj
    public final void F7x(C2EC c2ec, boolean z) {
        this.A01.F7x(c2ec, z);
    }

    @Override // X.InterfaceC37234Gaj
    public final void F99(C3o9 c3o9, boolean z) {
        C31603DuV c31603DuV;
        if (c3o9 instanceof DirectThreadKey) {
            c31603DuV = this.A01;
        } else if (c3o9 instanceof MsysThreadId) {
            this.A02.F99(c3o9, z);
            return;
        } else {
            if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
                return;
            }
            c31603DuV = this.A01;
            c3o9 = ((DirectMsysMixedThreadKey) c3o9).A00;
        }
        c31603DuV.F99(c3o9, z);
    }

    @Override // X.InterfaceC37234Gaj
    public final void F9K(C3o9 c3o9) {
        C31603DuV c31603DuV;
        if (c3o9 instanceof DirectThreadKey) {
            c31603DuV = this.A01;
        } else if (c3o9 instanceof MsysThreadId) {
            this.A02.F9K(c3o9);
            return;
        } else {
            if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
                return;
            }
            c31603DuV = this.A01;
            c3o9 = ((DirectMsysMixedThreadKey) c3o9).A00;
        }
        c31603DuV.F9K(c3o9);
    }

    @Override // X.InterfaceC37234Gaj
    public final void F9M(C3o9 c3o9) {
        C31603DuV c31603DuV;
        if (c3o9 instanceof DirectThreadKey) {
            c31603DuV = this.A01;
        } else if (c3o9 instanceof MsysThreadId) {
            this.A02.F9M(c3o9);
            return;
        } else {
            if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
                return;
            }
            c31603DuV = this.A01;
            c3o9 = ((DirectMsysMixedThreadKey) c3o9).A00;
        }
        c31603DuV.F9M(c3o9);
    }

    @Override // X.InterfaceC37234Gaj
    public final void F9O(C3o9 c3o9) {
        if (c3o9 instanceof DirectThreadKey) {
            this.A01.F9O(c3o9);
            return;
        }
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void F9R(C3o9 c3o9) {
        C31603DuV c31603DuV;
        if (c3o9 instanceof DirectThreadKey) {
            c31603DuV = this.A01;
        } else if (c3o9 instanceof MsysThreadId) {
            this.A02.F9R(c3o9);
            return;
        } else {
            if (!(c3o9 instanceof DirectMsysMixedThreadKey)) {
                return;
            }
            c31603DuV = this.A01;
            c3o9 = ((DirectMsysMixedThreadKey) c3o9).A00;
        }
        c31603DuV.F9R(c3o9);
    }

    @Override // X.InterfaceC37234Gaj
    public final void AOm(C3o9 c3o9) {
        throw AbstractC31179DnN.A0V();
    }
}
