package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.7PN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7PN implements C7P8 {
    @Override // X.C7P8
    public final boolean ABK() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C7P8
    public final boolean AFT(UserSession userSession, C83403nh c83403nh) {
        Boolean bool;
        C910143t c910143t;
        C14360o3.A0B(c83403nh, 0);
        C2EY c2ey = c83403nh.A10;
        if (c2ey == C2EY.A20 || c2ey == C2EY.A1z) {
            ImmutableList A0H = c83403nh.A0H();
            if (A0H != null && (c910143t = (C910143t) A0H.get(0)) != null) {
                bool = Boolean.valueOf(c910143t.A1l);
            } else {
                bool = null;
            }
            if (!C14360o3.A0K(bool, true)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C7P8
    public final boolean AFc(UserSession userSession, C83403nh c83403nh, int i) {
        return false;
    }

    @Override // X.C7P8
    public final boolean AFi(C83403nh c83403nh) {
        return true;
    }

    @Override // X.C7P8
    public final boolean AFu(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 1);
        if (c83403nh.A0h() == null) {
            return false;
        }
        return true;
    }

    @Override // X.C7P8
    public final boolean AFv(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 1);
        C2EY c2ey = c83403nh.A10;
        AbstractC1578776w abstractC1578776w = AbstractC1578776w.$redex_init_class;
        int ordinal = c2ey.ordinal();
        if (ordinal != 22) {
            if (ordinal != 23) {
                if (ordinal != 24) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid content type: ");
                    sb.append(c2ey);
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                C2EY c2ey2 = c83403nh.A0z;
                if (c2ey2 == null) {
                    C0w9.A03("DirectReelShareMessagePresenter", "message type should not be null");
                } else {
                    int ordinal2 = c2ey2.ordinal();
                    if (ordinal2 == 2 || ordinal2 == 54) {
                        return true;
                    }
                    if (ordinal2 != 9 && ordinal2 != 10) {
                        if (ordinal2 == 12) {
                            return true;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid message content type: ");
                        sb2.append(c2ey2);
                        throw new IllegalStateException(sb2.toString());
                    }
                }
            }
        } else {
            Object obj = c83403nh.A1T;
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia");
            if (C7O9.REPLY.equals(((C7QR) obj).A01)) {
                return true;
            }
            Object obj2 = c83403nh.A1T;
            C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia");
            if (((C7QR) obj2).A01 == C7O9.REPLY_GIF) {
                return true;
            }
        }
        return false;
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
    public final boolean AGC(UserSession userSession, C83403nh c83403nh, int i) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c83403nh, 1);
        return AbstractC163297So.A00(c83403nh, userSession.userId);
    }

    @Override // X.C7P8
    public final String C2p(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(c83403nh, 1);
        C2EY c2ey = c83403nh.A10;
        AbstractC1578776w abstractC1578776w = AbstractC1578776w.$redex_init_class;
        int ordinal = c2ey.ordinal();
        if (ordinal != 22) {
            if (ordinal != 23) {
                if (ordinal == 24) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid content type: ");
                sb.append(c2ey);
                throw new IllegalStateException(sb.toString());
            }
            C2EY c2ey2 = c83403nh.A0z;
            if (c2ey2 != null) {
                int ordinal2 = c2ey2.ordinal();
                if (ordinal2 != 2) {
                    if (ordinal2 == 54) {
                        return null;
                    }
                    if (ordinal2 != 9) {
                        if (ordinal2 == 10 || ordinal2 == 12) {
                            return null;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid message content type: ");
                        sb2.append(c2ey2);
                        throw new IllegalStateException(sb2.toString());
                    }
                }
                return c83403nh.A1q;
            }
            throw new IllegalStateException("Required value was null.");
        }
        Object obj = c83403nh.A1T;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectReelMedia");
        return ((C7QR) obj).A0A;
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
    public final boolean CTC(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        return AbstractC1576275w.A00(AbstractC23021Ah.A00(userSession));
    }

    @Override // X.C7P8
    public final boolean CTE(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        return AbstractC1576275w.A01(AbstractC23021Ah.A00(userSession));
    }

    @Override // X.C7P8
    public final boolean CTQ(UserSession userSession, C83403nh c83403nh) {
        C14360o3.A0B(userSession, 0);
        return AbstractC1576275w.A02(AbstractC23021Ah.A00(userSession));
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
        return false;
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
