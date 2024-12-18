package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.fragment.thread.infra.open.DirectThreadHeaderRepository$updateViewModel$1;
import com.instagram.user.model.User;

/* renamed from: X.7Uu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163807Uu extends C4A7 implements InterfaceC163817Uv {
    public C160847Is A00;
    public C2EC A01;
    public int A02;
    public C7IH A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final UserSession A0A;
    public final InterfaceC09390do A0B;
    public final C05A A0C;
    public final Capabilities A0D;
    public final String A0E;
    public final C0UO A0F;
    public final boolean A0G;
    public final boolean A0H;

    public C163807Uu(UserSession userSession, Capabilities capabilities, String str, boolean z, boolean z2) {
        super("DirectThreadHeaderRepository", C4A8.A01(1806075965, 3));
        this.A0A = userSession;
        this.A0D = capabilities;
        this.A0G = z;
        this.A0H = z2;
        this.A0E = str;
        C008002u A00 = C10E.A00(null);
        this.A0C = A00;
        this.A0F = AbstractC208910l.A02(A00);
        this.A04 = true;
        this.A0B = AbstractC09440dt.A00(EnumC09460dv.A03, new C206949Dz(this, 45));
    }

    public static final void A01(C163807Uu c163807Uu, boolean z) {
        C2EC c2ec;
        C7IH c7ih;
        if (C18U.A06(C06090Tz.A05, c163807Uu.A0A, 36328959398395803L) && (c2ec = c163807Uu.A01) != null && (c7ih = c163807Uu.A03) != null) {
            if (z) {
                c163807Uu.A00 = A00(c163807Uu, c7ih, c2ec);
            }
            C19L c19l = ((C4A7) c163807Uu).A01;
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new DirectThreadHeaderRepository$updateViewModel$1(c163807Uu, c7ih, c2ec, null, z), c19l);
        }
    }

    @Override // X.InterfaceC163817Uv
    public final void DB2() {
        A01(this, false);
    }

    @Override // X.InterfaceC163817Uv
    public final void Dsm(C7IH c7ih) {
        if (!C14360o3.A0K(this.A03, c7ih)) {
            this.A03 = c7ih;
            A01(this, false);
        }
    }

    public static final C160847Is A00(C163807Uu c163807Uu, C7IH c7ih, C2EC c2ec) {
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        UserSession userSession = c163807Uu.A0A;
        Capabilities capabilities = c163807Uu.A0D;
        boolean isPending = c2ec.isPending();
        boolean CVQ = c2ec.CVQ();
        boolean A02 = AbstractC31224Do7.A02(c2ec.BSH(), c2ec.BT2(), isPending, CVQ);
        boolean booleanValue = ((Boolean) c163807Uu.A0B.getValue()).booleanValue();
        boolean z = c163807Uu.A06;
        int i = c163807Uu.A02;
        boolean z2 = true;
        if (c2ec.CVQ() || c2ec.BSH().size() != 1 || !((User) c2ec.BSH().get(0)).A2O()) {
            z2 = false;
        }
        return C160837Ir.A00(context, userSession, capabilities, c7ih, c2ec, c163807Uu.A0E, i, A02, booleanValue, z, z2, c163807Uu.A05, c163807Uu.A07, c163807Uu.A0G, c163807Uu.A0H, c163807Uu.A08, c163807Uu.A09, c163807Uu.A04);
    }

    @Override // X.InterfaceC163817Uv
    public final C0UO Avf() {
        return this.A0F;
    }

    @Override // X.InterfaceC163817Uv
    public final C160847Is BHl() {
        return this.A00;
    }

    @Override // X.InterfaceC163817Uv
    public final void Czf(boolean z, boolean z2, boolean z3) {
        boolean z4;
        if (this.A08 != z) {
            this.A08 = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.A09 != z2) {
            this.A09 = z2;
            z4 = true;
        }
        if (this.A04 != z3) {
            this.A04 = z3;
        } else if (!z4) {
            return;
        }
        A01(this, false);
    }

    @Override // X.InterfaceC163817Uv
    public final void D0c(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            A01(this, false);
        }
    }

    @Override // X.InterfaceC163817Uv
    public final void DGQ(boolean z) {
        if (this.A06 != z) {
            this.A06 = z;
            A01(this, false);
        }
    }

    @Override // X.InterfaceC163817Uv
    public final void DO8(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            A01(this, false);
        }
    }

    @Override // X.InterfaceC163817Uv
    public final void DPO(boolean z) {
        if (this.A07 != z) {
            this.A07 = z;
            A01(this, false);
        }
    }
}
