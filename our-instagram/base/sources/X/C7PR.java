package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelType;

/* renamed from: X.7PR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7PR implements C7P8 {
    @Override // X.C7P8
    public final boolean ABK() {
        return false;
    }

    @Override // X.C7P8
    public final boolean AFi(C83403nh c83403nh) {
        return true;
    }

    @Override // X.C7P8
    public final boolean AFw(UserSession userSession, C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final boolean AFx(UserSession userSession, C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final String CGv() {
        return null;
    }

    @Override // X.C7P8
    public final boolean CQP() {
        return true;
    }

    @Override // X.C7P8
    public final boolean CT9(UserSession userSession) {
        return false;
    }

    @Override // X.C7P8
    public final boolean CWd(UserSession userSession, C83403nh c83403nh) {
        return true;
    }

    @Override // X.C7P8
    public final boolean Cea() {
        return true;
    }

    @Override // X.C7P8
    public final boolean CfJ(InterfaceC83433nk interfaceC83433nk) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7P8
    public final boolean AFT(UserSession userSession, C83403nh c83403nh) {
        Boolean bool;
        C910143t c910143t;
        AbstractC34141F4r abstractC34141F4r = AbstractC34141F4r.$redex_init_class;
        C2EY c2ey = c83403nh.A10;
        int ordinal = c2ey.ordinal();
        if (ordinal != 28) {
            if (ordinal == 29) {
                ImmutableList A0H = c83403nh.A0H();
                if (A0H != null && (c910143t = (C910143t) A0H.get(0)) != null) {
                    bool = Boolean.valueOf(c910143t.A1l);
                } else {
                    bool = null;
                }
                if (!C14360o3.A0K(bool, true)) {
                    return !C18U.A06(C06090Tz.A05, userSession, 36325841252136372L);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid content type: ");
                sb.append(c2ey);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            Object obj = c83403nh.A1T;
            if (obj == null || ((C7QP) obj).A01 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C7P8
    public final boolean AFc(UserSession userSession, C83403nh c83403nh, int i) {
        boolean equals;
        C910143t c910143t;
        if (c83403nh.A2P) {
            return false;
        }
        AbstractC34141F4r abstractC34141F4r = AbstractC34141F4r.$redex_init_class;
        C2EY c2ey = c83403nh.A10;
        int ordinal = c2ey.ordinal();
        if (ordinal != 28) {
            if (ordinal == 29) {
                ImmutableList A0H = c83403nh.A0H();
                if (A0H == null || (c910143t = (C910143t) A0H.iterator().next()) == null) {
                    return false;
                }
                equals = c910143t.A04();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid content type: ");
                sb.append(c2ey);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            Object obj = c83403nh.A1T;
            obj.getClass();
            C7QP c7qp = (C7QP) obj;
            C38321qM c38321qM = c7qp.A01;
            if (c38321qM == null) {
                return false;
            }
            if (c38321qM.A5V()) {
                ReelType reelType = c7qp.A02;
                if (reelType == null) {
                    return false;
                }
                equals = reelType.equals(ReelType.A0P);
            }
            return true;
        }
        if (!equals) {
            return false;
        }
        return true;
    }

    @Override // X.C7P8
    public final boolean AFu(UserSession userSession, C83403nh c83403nh) {
        C2EY c2ey = c83403nh.A10;
        if (c2ey == C2EY.A1g) {
            C7QP c7qp = (C7QP) c83403nh.A1T;
            if (c7qp != null && c7qp.A04 == C05F.A00) {
                return true;
            }
            return false;
        }
        if (c2ey == C2EY.A22) {
            return true;
        }
        return false;
    }

    @Override // X.C7P8
    public final boolean AFv(UserSession userSession, C83403nh c83403nh) {
        return C18U.A06(C06090Tz.A05, userSession, 36311272723382754L);
    }

    @Override // X.C7P8
    public final boolean AGC(UserSession userSession, C83403nh c83403nh, int i) {
        return AbstractC163297So.A00(c83403nh, userSession.userId);
    }

    @Override // X.C7P8
    public final String C2p(UserSession userSession, C83403nh c83403nh) {
        AbstractC34141F4r abstractC34141F4r = AbstractC34141F4r.$redex_init_class;
        C2EY c2ey = c83403nh.A10;
        int ordinal = c2ey.ordinal();
        if (ordinal != 28) {
            if (ordinal == 29) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid content type: ");
            sb.append(c2ey);
            throw new IllegalStateException(sb.toString());
        }
        Object obj = c83403nh.A1T;
        if (obj == null) {
            return null;
        }
        return ((C7QP) obj).A08;
    }

    @Override // X.C7P8
    public final boolean CTC(UserSession userSession, C83403nh c83403nh) {
        return AbstractC1576275w.A00(AbstractC23021Ah.A00(userSession));
    }

    @Override // X.C7P8
    public final boolean CTE(UserSession userSession, C83403nh c83403nh) {
        return AbstractC1576275w.A01(AbstractC23021Ah.A00(userSession));
    }

    @Override // X.C7P8
    public final boolean CTQ(UserSession userSession, C83403nh c83403nh) {
        return AbstractC1576275w.A02(AbstractC23021Ah.A00(userSession));
    }

    @Override // X.C7P8
    public final /* synthetic */ boolean AFY(C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final /* synthetic */ boolean AFz(C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final /* synthetic */ boolean AGD(C83403nh c83403nh) {
        return false;
    }

    @Override // X.C7P8
    public final /* synthetic */ boolean AG0(UserSession userSession, C83403nh c83403nh) {
        return false;
    }
}
