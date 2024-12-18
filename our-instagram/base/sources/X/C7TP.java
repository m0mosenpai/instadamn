package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.user.model.User;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7TP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7TP implements C7TQ {
    public final UserSession A00;
    public final InterfaceC163847Uy A01;
    public final C7TR A02;
    public final C2DS A03;

    public C7TP(UserSession userSession, InterfaceC163847Uy interfaceC163847Uy, C2DS c2ds) {
        C14360o3.A0B(c2ds, 1);
        C14360o3.A0B(userSession, 3);
        this.A03 = c2ds;
        this.A01 = interfaceC163847Uy;
        this.A00 = userSession;
        this.A02 = new C7TR(userSession);
    }

    @Override // X.C7TQ
    public final C42221xC AGy(C3o9 c3o9, String str) {
        return C42221xC.A09(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1gR, X.1OW] */
    @Override // X.C7TQ
    public final void AGz(Context context, InterfaceC83733oI interfaceC83733oI, String str, boolean z) {
        C14360o3.A0B(str, 1);
        UserSession userSession = this.A00;
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        if (!AbstractC34195F6t.A00(context, str, false, z)) {
            A00.E4s(new C7MH(interfaceC83733oI, C05F.A0C));
            return;
        }
        JTa A08 = AbstractC31277Doz.A08(userSession, C32411gR.class);
        String str2 = AbstractC1345466e.A01(interfaceC83733oI).A00;
        C14360o3.A0B(A08, 1);
        C14360o3.A0B(str2, 2);
        ?? c1ow = new C1OW(A08);
        c1ow.A01 = str2;
        c1ow.A00 = str;
        C26141Ov.A01(userSession).A0B(c1ow);
    }

    @Override // X.C7TQ
    public final C42221xC APY(InterfaceC83733oI interfaceC83733oI) {
        C14360o3.A0B(interfaceC83733oI, 0);
        return C42221xC.A06(new C36248Fz1(this, interfaceC83733oI));
    }

    @Override // X.C7TQ
    public final C42221xC ARs(InterfaceC83733oI interfaceC83733oI) {
        C14360o3.A0B(interfaceC83733oI, 0);
        return C42221xC.A06(new C36249Fz2(this, interfaceC83733oI));
    }

    @Override // X.C7TQ
    public final C42221xC Ch5(Context context, C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        return C42221xC.A06(new C36250Fz3(this, c3o9));
    }

    @Override // X.C7TQ
    public final void CnG(C206259Bi c206259Bi, InterfaceC83733oI interfaceC83733oI, boolean z) {
        Integer num;
        long j;
        C80993jT BsB;
        C81703kf c81703kf;
        C9CG c9cg;
        C80993jT BsB2;
        C9CG c9cg2;
        C83403nh c83403nh;
        String A0h;
        InterfaceC163847Uy interfaceC163847Uy;
        C80993jT BsB3;
        C1118752z Ay9;
        String str;
        if (c206259Bi != null && C206259Bi.A00(c206259Bi, 2)) {
            String str2 = AbstractC1345466e.A01(interfaceC83733oI).A00;
            C2DU c2du = (C2DU) this.A03;
            C14360o3.A0B(str2, 0);
            C81663kb A0N = c2du.A0N(str2);
            if (A0N != null) {
                C83403nh c83403nh2 = (C83403nh) c206259Bi.A03;
                C83403nh c83403nh3 = (C83403nh) c206259Bi.A04;
                C50679MYx c50679MYx = (C50679MYx) c206259Bi.A02;
                UserSession userSession = this.A00;
                String str3 = userSession.userId;
                String A00 = A00(c83403nh2);
                if (A00 != null) {
                    String str4 = c83403nh2.A1u;
                    C14360o3.A07(str4);
                    if (c50679MYx != null && c50679MYx.A01 != null && (str = c50679MYx.A00) != null && AbstractC93414Gu.A00.compare(str, A00) > 0) {
                        A00 = c50679MYx.A00;
                        if (A00 != null) {
                            str4 = c50679MYx.A01;
                            if (str4 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 2342163292781551917L) && (Ay9 = A0N.Ay9()) != null) {
                        Long l = Ay9.A05;
                        if (l != null) {
                            String A02 = C4H6.A02(l.longValue(), Ay9.A08);
                            if (AbstractC93414Gu.A00.compare(A02, A00) > 0) {
                                str4 = Ay9.A07;
                                if (str4 != null) {
                                    A00 = A02;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    boolean A06 = C18U.A06(c06090Tz, userSession, 2342168601358841020L);
                    boolean z2 = false;
                    if (A06 && (c83403nh = (C83403nh) c206259Bi.A01) != null && (A0h = c83403nh.A0h()) != null && (interfaceC163847Uy = this.A01) != null && (BsB3 = interfaceC163847Uy.BsB(true)) != null) {
                        C9CG c9cg3 = BsB3.A01;
                        if (c9cg3 == null) {
                            c9cg3 = new C9CG();
                        }
                        String str5 = c9cg3.A02;
                        if (str5 == null || A0h.compareTo(str5) > 0) {
                            BsB3.A01 = new C9CG(Long.valueOf(c83403nh.C8i()), true, A00(c83403nh), c83403nh.A1j, 2);
                            z2 = true;
                        }
                    }
                    if (!z && A0N.Ccc(str3, A00, str4) && !z2) {
                        if (c83403nh3 != null) {
                            String A002 = A00(c83403nh3);
                            C14360o3.A0B(str3, 0);
                            if (C4GQ.A0A(A0N, str3, A002)) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (c83403nh2.A10 == C2EY.A0q) {
                        C3J1.A00().A02.A04(userSession, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AbstractC162167Oa.A02(str3, str2, "ds"));
                    }
                    C7BW c7bw = c83403nh2.A0Q;
                    String str6 = null;
                    if (c7bw != null) {
                        num = c7bw.A02;
                    } else {
                        num = null;
                    }
                    if (num != C05F.A01) {
                        if (c83403nh2.A1S() && c83403nh2.A10 == C2EY.A1O) {
                            return;
                        }
                        String A0h2 = c83403nh2.A0h();
                        if (c83403nh3 != null && A0h2 != null) {
                            c83403nh3.A1o(A0h2);
                        }
                        if (c83403nh3 != null) {
                            str6 = A00(c83403nh3);
                            j = c83403nh3.C8i();
                        } else {
                            InterfaceC163847Uy interfaceC163847Uy2 = this.A01;
                            if (interfaceC163847Uy2 != null && (BsB = interfaceC163847Uy2.BsB(true)) != null && (c81703kf = BsB.A02) != null) {
                                str6 = c81703kf.A01;
                                j = c81703kf.A00;
                            } else {
                                j = 0;
                            }
                        }
                        if (c2du.A0C.A02.equals(str2)) {
                            C2DU.A00(A0N, c2du).A0K(false);
                            c2du.ELj();
                            AbstractC31278Dp0.A0I(userSession, str2, true);
                            InterfaceC19610xo ARD = AbstractC2056298m.A00(userSession).A00.ARD();
                            ARD.E7D("direct_dimiss_nudge_count", 0);
                            ARD.apply();
                        }
                        C83403nh c83403nh4 = (C83403nh) c206259Bi.A01;
                        if (c83403nh4 != null) {
                            c9cg = new C9CG(Long.valueOf(c83403nh4.C8i()), true, A00(c83403nh4), c83403nh4.A1j, 2);
                        } else {
                            InterfaceC163847Uy interfaceC163847Uy3 = this.A01;
                            if (interfaceC163847Uy3 != null && (BsB2 = interfaceC163847Uy3.BsB(true)) != null && (c9cg2 = BsB2.A01) != null) {
                                c9cg = new C9CG(c9cg2.A01, false, c9cg2.A02, c9cg2.A03, 2);
                            } else {
                                c9cg = new C9CG();
                            }
                        }
                        boolean z3 = false;
                        if (c83403nh3 != null) {
                            z3 = true;
                        }
                        AbstractC31278Dp0.A00(c9cg, userSession, str2, A00, str4, str6, j, z3);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    @Override // X.C7TQ
    public final void CnH(InterfaceC83733oI interfaceC83733oI) {
        C83693oE A01 = AbstractC1345466e.A01(interfaceC83733oI);
        UserSession userSession = this.A00;
        AbstractC31278Dp0.A0C(userSession, C7P4.A00(A01), false);
        String str = A01.A00;
        C14360o3.A0B(str, 1);
        C12210kP c12210kP = new C12210kP(userSession);
        c12210kP.A01 = "direct_inbox";
        C18920wW A00 = c12210kP.A00();
        InterfaceC02590Ai A002 = A00.A00(A00.A00, "direct_inbox_action");
        A002.AAP("action", "thread_clear_unread");
        A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
        A002.Cht();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.1fH, X.1OW] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.3jU, X.KVa] */
    @Override // X.C7TQ
    public final void CnP(DirectMessageIdentifier directMessageIdentifier) {
        C3o9 c3o9;
        C2DS c2ds;
        C83403nh BSh;
        C2Io c2Io;
        C4G2 c4g2;
        String A0g;
        C14360o3.A0B(directMessageIdentifier, 0);
        InterfaceC163847Uy interfaceC163847Uy = this.A01;
        if (interfaceC163847Uy != null) {
            c3o9 = interfaceC163847Uy.Afi();
        } else {
            c3o9 = null;
        }
        C14360o3.A0C(c3o9, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey");
        DirectThreadKey directThreadKey = (DirectThreadKey) c3o9;
        String str = directMessageIdentifier.A02;
        if (str != null && (BSh = (c2ds = this.A03).BSh(directThreadKey, str)) != null) {
            C08730cb c08730cb = C17060sy.A01;
            UserSession userSession = this.A00;
            User A01 = c08730cb.A01(userSession);
            C18C.A07(BSh.A0g, "Callers must have non-null voice message");
            if (BSh.A10 == C2EY.A1m && !C14360o3.A0K(A01.getId(), BSh.BtE()) && BSh.A0g.A00 == 0) {
                C2DU c2du = (C2DU) c2ds;
                synchronized (c2du) {
                    C14360o3.A0B(directThreadKey, 0);
                    C4GV A0P = c2du.A0P(directThreadKey);
                    if (A0P == null) {
                        C0w9.A03("Null thread entry", "Entry should exist before function call");
                    } else {
                        synchronized (A0P) {
                            C83403nh A0I = A0P.A0I(str);
                            if (A0I != null && (c4g2 = A0I.A0g) != null) {
                                int i = c4g2.A00;
                                int i2 = i + 1;
                                if (i2 != i) {
                                    c4g2.A00 = Math.max(i2, i);
                                    A0I.A2C = true;
                                }
                                c2Io = new C2Io(A0P.A0I.BKb(), C05F.A04, null, null, Collections.singletonList(A0I), true);
                            } else {
                                C18950wb.A01.AEp("Voice message is missing from thread entry", 20134884).report();
                                c2Io = null;
                            }
                        }
                        C2DU.A0F(c2du, A0P);
                        if (c2Io != null) {
                            c2du.A06.E4s(c2Io);
                            c2du.A09.accept(c2Io);
                        }
                    }
                }
                String A0h = BSh.A0h();
                if (A0h != null) {
                    String A0g2 = BSh.A0g();
                    boolean z = BSh.A2P;
                    L1W A0M = BSh.A0M();
                    if (BSh.A1S()) {
                        A0g = null;
                    } else {
                        A0g = BSh.A0g();
                    }
                    JTa A04 = AbstractC31277Doz.A04(userSession, A0M, C31741fH.class, null, A0g, z);
                    EnumC159397Cz A00 = AbstractC1586079v.A00(BSh);
                    ?? abstractC81003jU = new AbstractC81003jU(directThreadKey.A00, A0h, A0g2);
                    boolean z2 = A04.A07;
                    ?? c1ow = new C1OW(A04);
                    c1ow.A01 = abstractC81003jU;
                    c1ow.A03 = z2;
                    c1ow.A00 = A00;
                    C26141Ov.A01(userSession).A0B(c1ow);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.1km, X.1OW] */
    @Override // X.C7TQ
    public final void Co1(InterfaceC83733oI interfaceC83733oI) {
        if (interfaceC83733oI instanceof C83693oE) {
            C83693oE A01 = AbstractC1345466e.A01(interfaceC83733oI);
            UserSession userSession = this.A00;
            C44016Jd3 c44016Jd3 = (C44016Jd3) userSession.A01(C44016Jd3.class, new MHM(userSession, 43));
            String str = A01.A00;
            if (str != null && str.length() != 0) {
                java.util.Set set = c44016Jd3.A01;
                if (set.contains(str)) {
                    DirectThreadKey A00 = C7P4.A00(A01);
                    C9BO c9bo = new C9BO(0, 7, Long.valueOf(System.currentTimeMillis()));
                    JTa A08 = AbstractC31277Doz.A08(userSession, C35071km.class);
                    C14360o3.A0B(A08, 1);
                    ?? c1ow = new C1OW(A08);
                    C14360o3.A0B(A00, 0);
                    c1ow.A01 = A00;
                    c1ow.A00 = c9bo;
                    C26141Ov.A01(userSession).A0B(c1ow);
                    C15500q5.A00(set).remove(str);
                    AbstractC47003KqM.A00(EnumC46272Ke4.IGD_NUDGE_THREAD_CLICK, c44016Jd3.A00, str);
                }
            }
        }
    }

    @Override // X.C7TQ
    public final C42221xC CqC(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, boolean z) {
        C14360o3.A0B(interfaceC83733oI, 0);
        return C42221xC.A06(new C36258FzB(interfaceC11380iw, this, interfaceC83733oI, z));
    }

    @Override // X.C7TQ
    public final void CqJ(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, int i) {
        C14360o3.A0B(interfaceC83733oI, 0);
        AbstractC31278Dp0.A02(interfaceC11380iw, this.A00, AbstractC1345466e.A01(interfaceC83733oI).A00, i);
    }

    @Override // X.C7TQ
    public final void CqK(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI) {
        C14360o3.A0B(interfaceC83733oI, 0);
        AbstractC31278Dp0.A04(interfaceC11380iw, this.A00, AbstractC1345466e.A01(interfaceC83733oI).A00, true);
    }

    @Override // X.C7TQ
    public final void D9t(InterfaceC83713oG interfaceC83713oG) {
    }

    @Override // X.C7TQ
    public final C42221xC EF9(InterfaceC83733oI interfaceC83733oI, List list) {
        C14360o3.A0B(interfaceC83733oI, 0);
        return C42221xC.A06(new C36254Fz7(this, interfaceC83733oI, list));
    }

    @Override // X.C7TQ
    public final C42221xC EFn(InterfaceC83733oI interfaceC83733oI, List list) {
        C14360o3.A0B(interfaceC83733oI, 0);
        return C42221xC.A06(new C36255Fz8(this, interfaceC83733oI, list));
    }

    @Override // X.C7TQ
    public final C42221xC EGS(C3o9 c3o9) {
        return C42221xC.A09(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1ha, X.1OW] */
    @Override // X.C7TQ
    public final void EI8(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        UserSession userSession = this.A00;
        DirectThreadKey A01 = JRE.A01(c3o9);
        C14360o3.A0B(A01, 1);
        ?? c1ow = new C1OW(AbstractC31277Doz.A08(userSession, C33121ha.class));
        c1ow.A00 = A01;
        C26141Ov.A01(userSession).A0B(c1ow);
    }

    @Override // X.C7TQ
    public final C42221xC ELf(C3o9 c3o9, String str, String str2, boolean z) {
        C14360o3.A0B(c3o9, 1);
        if (str2 == null) {
            str2 = JRE.A01(c3o9).A00;
        }
        if (str.length() == 0) {
            AbstractC22714A0k.A00(this.A00, str2);
        } else {
            UserSession userSession = this.A00;
            if (str2 != null) {
                InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7K(AnonymousClass001.A0R(AbstractC43591JPw.A00(341), str2), str);
                ARD.apply();
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7G(AnonymousClass001.A0R("direct_thread_draft_timestamp_", str2), System.currentTimeMillis());
                ARD2.apply();
            }
        }
        return C42221xC.A09(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1jF, X.1OW] */
    @Override // X.C7TQ
    public final void EpG(String str, String str2) {
        UserSession userSession = this.A00;
        JTa A08 = AbstractC31277Doz.A08(userSession, C34151jF.class);
        C14360o3.A0B(A08, 1);
        ?? c1ow = new C1OW(A08);
        c1ow.A01 = str;
        c1ow.A00 = str2;
        C26141Ov.A01(userSession).A0B(c1ow);
    }

    @Override // X.C7TQ
    public final void F7t(UserSession userSession, C81613kW c81613kW, InterfaceC83733oI interfaceC83733oI, int i, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        AbstractC31278Dp0.A08(userSession, c81613kW, AbstractC1345466e.A01(interfaceC83733oI).A00, i, z, z2);
    }

    @Override // X.C7TQ
    public final void F7z(InterfaceC83733oI interfaceC83733oI, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC83733oI, 0);
        UserSession userSession = this.A00;
        AbstractC25651Mw.A00(userSession).E4s(new C7LO(z));
        AbstractC31278Dp0.A0B(userSession, AbstractC1345466e.A01(interfaceC83733oI), AnonymousClass001.A1D("DirectThreadActionsManager ", false), z);
    }

    @Override // X.C7TQ
    public final void F9J(InterfaceC11380iw interfaceC11380iw, C3o9 c3o9) {
        String str = JRE.A01(c3o9).A00;
        if (str != null) {
            AbstractC31278Dp0.A06(interfaceC11380iw, this.A00, str, false);
        }
    }

    @Override // X.C7TQ
    public final C42221xC F9L(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, boolean z) {
        C14360o3.A0B(interfaceC83733oI, 0);
        return C42221xC.A06(new C36259FzC(interfaceC11380iw, this, interfaceC83733oI, z));
    }

    @Override // X.C7TQ
    public final C42221xC F9Q(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI) {
        C14360o3.A0B(interfaceC83733oI, 0);
        return C42221xC.A06(new C36257FzA(interfaceC11380iw, this, interfaceC83733oI));
    }

    @Override // X.C7TQ
    public final void FBU(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        this.A03.FBU(str, str2, str3);
    }

    @Override // X.C7TQ
    public final void FBV(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        C14360o3.A0B(str3, 2);
        this.A03.FBV(str, str2, str3);
    }

    public static final String A00(C83403nh c83403nh) {
        if (c83403nh.A2G) {
            BigInteger valueOf = BigInteger.valueOf(c83403nh.C8i());
            C14360o3.A07(valueOf);
            return valueOf.shiftLeft(64).toString();
        }
        return c83403nh.A0h();
    }

    @Override // X.C7TQ
    public final C42221xC A9t(Context context, InterfaceC83733oI interfaceC83733oI, EnumC31337Dq2 enumC31337Dq2, List list, List list2, int i) {
        return C42221xC.A06(new C36261FzE(this, interfaceC83733oI, enumC31337Dq2, list2, i));
    }

    @Override // X.C7TQ
    public final C42221xC AGX(InterfaceC83733oI interfaceC83733oI, List list) {
        return C42221xC.A06(new C36251Fz4(this, interfaceC83733oI, list));
    }

    @Override // X.C7TQ
    public final C42221xC AOp(InterfaceC83733oI interfaceC83733oI, User user) {
        return C42221xC.A06(new C36252Fz5(this, interfaceC83733oI, user)).A0K(C36239Fys.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1mB, X.1OW] */
    @Override // X.C7TQ
    public final void Cmu(C34583FLs c34583FLs) {
        UserSession userSession = this.A00;
        JTa A08 = AbstractC31277Doz.A08(userSession, C35911mB.class);
        String str = c34583FLs.A01;
        if (str != null) {
            C14360o3.A0B(A08, 1);
            ?? c1ow = new C1OW(A08);
            c1ow.A01 = str;
            c1ow.A00 = c34583FLs;
            C26141Ov.A01(userSession).A0B(c1ow);
            return;
        }
        C14360o3.A0F("igThreadIgid");
        throw C00O.createAndThrow();
    }

    @Override // X.C7TQ
    public final void Cmy(InterfaceC83733oI interfaceC83733oI, String str, String str2, int i) {
        UserSession userSession = this.A00;
        C36268FzL c36268FzL = (C36268FzL) userSession.A01(C36268FzL.class, new C37052GUi(userSession, 9));
        AbstractC34065F1s.A00(c36268FzL.A00, AbstractC1345466e.A01(interfaceC83733oI).A00, str, "capture_screenshot_in_channel", "impression", "system_capture", "thread_view", AbstractC06930Yk.A02(new C09530e4("channel_type", str2)), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.1hX, X.1OW] */
    @Override // X.C7TQ
    public final void Cmz(InterfaceC83733oI interfaceC83733oI) {
        L1W l1w;
        if (interfaceC83733oI != null) {
            UserSession userSession = this.A00;
            String str = AbstractC1345466e.A01(interfaceC83733oI).A00;
            C14360o3.A0B(str, 1);
            C81663kb A0N = ((C2DU) AbstractC28761aE.A00(userSession)).A0N(str);
            if (A0N != null) {
                l1w = A0N.B2W();
            } else {
                l1w = null;
            }
            ?? c1ow = new C1OW(AbstractC31277Doz.A02(userSession, l1w, C33091hX.class));
            c1ow.A00 = str;
            C26141Ov.A01(userSession).A0B(c1ow);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1hU, X.1OW] */
    @Override // X.C7TQ
    public final void CnL(InterfaceC83733oI interfaceC83733oI, String str, boolean z) {
        if (interfaceC83733oI != null) {
            UserSession userSession = this.A00;
            C3o9 A05 = AbstractC1345466e.A05(interfaceC83733oI);
            C14360o3.A0C(A05, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey");
            DirectThreadKey directThreadKey = (DirectThreadKey) A05;
            C14360o3.A0B(directThreadKey, 1);
            ?? c1ow = new C1OW(AbstractC31277Doz.A04(userSession, LCT.A00(userSession, directThreadKey), C32851h9.class, null, null, z));
            c1ow.A00 = directThreadKey;
            C26141Ov.A01(userSession).A0B(c1ow);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.C7TQ
    public final C42221xC E6K(InterfaceC83733oI interfaceC83733oI, User user) {
        return C42221xC.A06(new C36253Fz6(this, interfaceC83733oI, user)).A0K(C36240Fyt.A00);
    }

    @Override // X.C7TQ
    public final C42221xC EG6(InterfaceC83733oI interfaceC83733oI, List list) {
        return C42221xC.A06(new C36256Fz9(this, interfaceC83733oI, list));
    }

    @Override // X.C7TQ
    public final void CqA(InterfaceC11380iw interfaceC11380iw, C3o9 c3o9, int i) {
        String str = JRE.A01(c3o9).A00;
        if (str != null) {
            AbstractC31278Dp0.A03(interfaceC11380iw, this.A00, str, i);
        }
    }

    @Override // X.C7TQ
    public final void F7u(UserSession userSession, InterfaceC83733oI interfaceC83733oI, Integer num, int i, int i2) {
        AbstractC31278Dp0.A0F(userSession, num, AbstractC1345466e.A01(interfaceC83733oI).A00, i, i2);
    }
}
