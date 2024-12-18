package X;

import java.util.List;

/* renamed from: X.Gqp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38184Gqp implements InterfaceC62242sP {
    public static final boolean A00(C206259Bi c206259Bi) {
        C130455uq c130455uq;
        C38321qM A00;
        return (c206259Bi == null || (c130455uq = (C130455uq) c206259Bi.A02) == null || (A00 = c130455uq.A00()) == null || !A00.CdW()) ? false : true;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CX8(Object obj) {
        C14360o3.A0B(obj, 0);
        return obj instanceof C37931GmT;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ C5I4 AMc(Object obj) {
        C206259Bi c206259Bi = (C206259Bi) obj;
        C14360o3.A0B(c206259Bi, 0);
        return new C38185Gqq(c206259Bi);
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ int Aa7(Object obj) {
        return A00((C206259Bi) obj) ? 1 : 0;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ String BF8(Object obj) {
        String A2W;
        C206259Bi c206259Bi = (C206259Bi) obj;
        C14360o3.A0B(c206259Bi, 0);
        C130455uq c130455uq = (C130455uq) c206259Bi.A02;
        C14360o3.A0B(c130455uq, 1);
        C38321qM A00 = c130455uq.A00();
        if (A00 == null || (A2W = A00.A2W()) == null) {
            return "";
        }
        return A2W;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ String BFA(Object obj) {
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) obj;
        C14360o3.A0B(abstractC127945qN, 0);
        if (abstractC127945qN instanceof C37931GmT) {
            String A2W = ((C37931GmT) abstractC127945qN).BQN().A2W();
            if (A2W == null) {
                return "";
            }
            return A2W;
        }
        return "n/a";
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ String BK4(Object obj) {
        AbstractC127945qN abstractC127945qN = (AbstractC127945qN) obj;
        C14360o3.A0B(abstractC127945qN, 0);
        if (abstractC127945qN instanceof C37931GmT) {
            String A2W = ((C37931GmT) abstractC127945qN).BQN().A2W();
            if (A2W == null) {
                return "";
            }
            return A2W;
        }
        return "n/a";
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CdX(Object obj) {
        return A00((C206259Bi) obj);
    }

    @Override // X.InterfaceC62242sP
    public final /* synthetic */ boolean ACQ(Object obj, Object obj2) {
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* synthetic */ boolean ACU(Object obj, Object obj2) {
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* synthetic */ int AZN(Object obj) {
        return -1;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ Integer Ahy(Object obj) {
        return null;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ Integer Ai1(Object obj) {
        return null;
    }

    @Override // X.InterfaceC62242sP
    public final /* synthetic */ List BV9(Object obj) {
        return C16930sl.A00;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ Integer BVE(Object obj) {
        return null;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ EnumC26291Pk BYX(Object obj) {
        return null;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CX6(Object obj) {
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CX7(Object obj) {
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CYw(Object obj) {
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CZK(Object obj) {
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CdY(Object obj) {
        return false;
    }
}
