package X;

import java.util.List;

/* renamed from: X.Iyq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42938Iyq implements InterfaceC62242sP {
    @Override // X.InterfaceC62242sP
    public final Integer Ahy(Object obj) {
        C38321qM c38321qM;
        C14360o3.A0B(obj, 0);
        if (obj instanceof C37469Gen) {
            c38321qM = ((C40971v4) obj).A0K;
        } else if (obj instanceof C38321qM) {
            c38321qM = (C38321qM) obj;
        } else {
            return null;
        }
        return c38321qM.A2M();
    }

    @Override // X.InterfaceC62242sP
    public final Integer Ai1(Object obj) {
        C38321qM c38321qM;
        C14360o3.A0B(obj, 0);
        if (obj instanceof C37469Gen) {
            c38321qM = ((C40971v4) obj).A0K;
        } else if (obj instanceof C38321qM) {
            c38321qM = (C38321qM) obj;
        } else {
            return null;
        }
        return c38321qM.A2N();
    }

    @Override // X.InterfaceC62242sP
    public final String BFA(Object obj) {
        String A0V;
        C14360o3.A0B(obj, 0);
        if (obj instanceof C37469Gen) {
            A0V = ((C40971v4) obj).A0K.getId();
            if (A0V == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else if (obj instanceof C38321qM) {
            A0V = AbstractC37300Gc1.A0V(obj);
            if (A0V == null) {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        } else {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Failed to getIdFromItem due to unsupported type: ");
            Class<?> cls = obj.getClass();
            C0w9.A03("DiscoveryChainingModelIdentifier", AbstractC166997dE.A0v(AbstractC25225BEi.A1D(cls), A1C));
            throw AbstractC166987dD.A1D(AbstractC166997dE.A0v(AbstractC25225BEi.A1D(cls), AbstractC166997dE.A11("Failed to getIdFromItem due to unsupported type: ")));
        }
        return A0V;
    }

    @Override // X.InterfaceC62242sP
    public final String BK4(Object obj) {
        C14360o3.A0B(obj, 0);
        return BFA(obj);
    }

    @Override // X.InterfaceC62242sP
    public final boolean CX6(Object obj) {
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final boolean CX7(Object obj) {
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final boolean CX8(Object obj) {
        C14360o3.A0B(obj, 0);
        if (obj instanceof C37469Gen) {
            return true;
        }
        if (obj instanceof C38321qM) {
            return ((C38321qM) obj).CdW();
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Failed to check isItemSponsored due to unsupported type: ");
        C0w9.A03("DiscoveryChainingModelIdentifier", AbstractC166997dE.A0v(AbstractC25225BEi.A1D(obj.getClass()), A1C));
        return false;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ C5I4 AMc(Object obj) {
        C37469Gen c37469Gen = (C37469Gen) obj;
        C14360o3.A0B(c37469Gen, 0);
        return new C39366Ha6(c37469Gen);
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ int Aa7(Object obj) {
        return AbstractC167007dF.A1W(obj) ? 1 : 0;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ String BF8(Object obj) {
        return AbstractC37301Gc2.A0J(obj).A0S;
    }

    @Override // X.InterfaceC62242sP
    public final /* bridge */ /* synthetic */ boolean CdX(Object obj) {
        return AbstractC167007dF.A1W(obj);
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
