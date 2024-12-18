package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.LdG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48518LdG implements InterfaceC13000lm {
    public long A00;
    public final InterfaceC41501vz A01;
    public final UserSession A02;
    public final C47970LIe A03;
    public final C47912LEg A04;
    public final C47913LEh A05;
    public final L5E A06;
    public final LAB A07;
    public final Object A08;
    public final L7X A09;
    public final C2DS A0A;
    public final L8o A0B;
    public final C132515ya A0C;

    public static final void A00(C48518LdG c48518LdG) {
        long j;
        UserSession userSession = c48518LdG.A02;
        AbstractC25651Mw.A00(userSession).A02(c48518LdG.A01, C2Im.class);
        synchronized (c48518LdG.A08) {
            C46922Dg c46922Dg = ((C2DU) c48518LdG.A0A).A0C;
            ReentrantReadWriteLock reentrantReadWriteLock = c46922Dg.A0G;
            if (c46922Dg.A0L) {
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                readLock.lock();
                try {
                    j = c46922Dg.A00.A05;
                    c48518LdG.A00 = j;
                } finally {
                    readLock.unlock();
                }
            } else {
                synchronized (c46922Dg.A0D) {
                    try {
                        j = c46922Dg.A00.A05;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c48518LdG.A00 = j;
            }
        }
        if (j != -1 && C18U.A06(C06090Tz.A05, userSession, 36327572124220097L)) {
            C99Q.A01("ArmadilloExpressSyncManager.performCursorRewinding").execute(new M4M(c48518LdG, j));
        }
    }

    public static final void A01(C48518LdG c48518LdG, long j) {
        int i;
        synchronized (c48518LdG.A08) {
            c48518LdG.A00 = j;
            C46922Dg c46922Dg = ((C2DU) c48518LdG.A0A).A0C;
            ReentrantReadWriteLock reentrantReadWriteLock = c46922Dg.A0G;
            if (c46922Dg.A0L) {
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                int i2 = 0;
                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                    i = reentrantReadWriteLock.getReadHoldCount();
                    for (int i3 = 0; i3 < i; i3++) {
                        readLock.unlock();
                    }
                } else {
                    i = 0;
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    c46922Dg.A00.A05 = j;
                } finally {
                    while (i2 < i) {
                        readLock.lock();
                        i2++;
                    }
                    writeLock.unlock();
                }
            } else {
                synchronized (c46922Dg.A0D) {
                    try {
                        c46922Dg.A00.A05 = j;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [X.1OW, X.1jr] */
    public static final void A02(C48518LdG c48518LdG, String str, List list, long j) {
        C81663kb c81663kb;
        ArrayList arrayList;
        C83403nh c83403nh;
        String str2;
        String A0h;
        String str3;
        LJA lja = c48518LdG.A07.A01;
        lja.A03(str, "process_start");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC46461KhL abstractC46461KhL = (AbstractC46461KhL) it.next();
            if (abstractC46461KhL instanceof KX1) {
                L5E l5e = c48518LdG.A06;
                KX1 kx1 = (KX1) abstractC46461KhL;
                C14360o3.A0B(kx1, 0);
                UserSession userSession = l5e.A01;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A01(c06090Tz, userSession, 36600336915042172L) != 0 && C18U.A01(c06090Tz, userSession, 36600336915107709L) != 0) {
                    List list2 = l5e.A0A;
                    list2.add(AbstractC31173DnH.A0g());
                    if (list2.size() > C18U.A01(c06090Tz, userSession, 36600336915042172L)) {
                        list2.remove(0);
                    }
                    if (list2.size() >= C18U.A01(c06090Tz, userSession, 36600336915042172L) && AbstractC166987dD.A0N(AbstractC001800i.A0K(list2)) - AbstractC166987dD.A0N(AbstractC001800i.A0I(list2)) < C18U.A01(c06090Tz, userSession, 36600336915107709L)) {
                        l5e.A00 = true;
                    }
                }
                if (!l5e.A00) {
                    if (kx1 instanceof C45984KWy) {
                        C45984KWy c45984KWy = (C45984KWy) kx1;
                        C2EC c2ec = c45984KWy.A01;
                        C83403nh c83403nh2 = c45984KWy.A00;
                        if (c83403nh2.A2P && !c2ec.CWO()) {
                            C2DS c2ds = l5e.A05;
                            DirectThreadKey BKb = c2ec.BKb();
                            C2DU c2du = (C2DU) c2ds;
                            synchronized (c2du) {
                                C4GV A0P = c2du.A0P(BKb);
                                if (A0P != null && (c81663kb = A0P.A0I) != null) {
                                    c81663kb.A0L(true);
                                }
                            }
                        }
                        String A0g = c83403nh2.A0g();
                        if (A0g != null) {
                            C2DS c2ds2 = l5e.A05;
                            if (c2ds2.BSf(c2ec.BKb(), C2EY.A1O, A0g) != null) {
                                c2ds2.EFl(c2ec.BKb(), null, A0g);
                            }
                        }
                        l5e.A06.A00(str, null, 7021, 0);
                        C2DS c2ds3 = l5e.A05;
                        c2ds3.A9n(c83403nh2, c2ec.BKb(), true, false);
                        if (c83403nh2.A01 > 0) {
                            AbstractC162277Op.A00(userSession, c2ec, c2ds3, c2ds3.Bn1(c2ec.BKb(), c83403nh2.A0h()));
                        }
                    } else if (kx1 instanceof C45985KWz) {
                        C45985KWz c45985KWz = (C45985KWz) kx1;
                        C2EC c2ec2 = c45985KWz.A00;
                        String str4 = c45985KWz.A01;
                        DirectThreadKey BKb2 = c2ec2.BKb();
                        if (C18U.A06(c06090Tz, userSession, 2342164482484151804L)) {
                            arrayList = l5e.A05.Bn1(BKb2, str4);
                        } else {
                            arrayList = null;
                        }
                        C2DS c2ds4 = l5e.A05;
                        C83403nh BSg = c2ds4.BSg(c2ec2.BKb(), str4);
                        if (BSg != null) {
                            InterfaceC09390do interfaceC09390do = LKn.A05;
                            AbstractC46712KlV.A00(userSession).A06(LIM.A00.A01(BSg));
                        }
                        List Bkx = c2ds4.Bkx(BKb2, true);
                        C83403nh c83403nh3 = (C83403nh) AbstractC001800i.A0L(Bkx);
                        if (Bkx.size() > 1) {
                            c83403nh = (C83403nh) Bkx.get(Bkx.size() - 2);
                        } else {
                            c83403nh = null;
                        }
                        if (c83403nh3 != null) {
                            str2 = c83403nh3.A0g();
                        } else {
                            str2 = null;
                        }
                        if (C14360o3.A0K(str2, str4)) {
                            c83403nh3 = c83403nh;
                        }
                        if (c83403nh3 != null && (A0h = c83403nh3.A0h()) != null && (str3 = BKb2.A00) != null) {
                            JTa A00 = AbstractC31277Doz.A00(userSession, c83403nh3.A0M());
                            C14360o3.A0B(A00, 1);
                            ?? c1ow = new C1OW(A00);
                            c1ow.A01 = "";
                            c1ow.A02 = str3;
                            c1ow.A01 = A0h;
                            c1ow.A00 = 0L;
                            c1ow.A03 = true;
                            c1ow.A04 = false;
                            C47581Kzr c47581Kzr = l5e.A04;
                            C26141Ov c26141Ov = c47581Kzr.A00;
                            C26141Ov c26141Ov2 = c26141Ov;
                            if (c26141Ov == null) {
                                C26141Ov A01 = C26141Ov.A01(c47581Kzr.A01);
                                c47581Kzr.A00 = A01;
                                c26141Ov2 = A01;
                            }
                            if (c26141Ov2 == 0) {
                                C14360o3.A0F("mutationManager");
                                throw C00O.createAndThrow();
                            }
                            c26141Ov2.A0B(c1ow);
                        }
                        l5e.A06.A00(str, null, 7022, 0);
                        c2ds4.EFl(BKb2, null, str4);
                        if (arrayList != null) {
                            AbstractC162277Op.A00(userSession, c2ec2, c2ds4, arrayList);
                        }
                    } else {
                        throw B4Z.A00();
                    }
                } else {
                    l5e.A09.add(kx1);
                    C14270nr c14270nr = l5e.A03;
                    AbstractRunnableC14200nk abstractRunnableC14200nk = l5e.A02;
                    c14270nr.A02(abstractRunnableC14200nk);
                    c14270nr.A01(abstractRunnableC14200nk, C18U.A01(c06090Tz, userSession, 36600336915173246L));
                }
            }
        }
        if (C18U.A06(C06090Tz.A05, c48518LdG.A02, 36327572124154560L)) {
            synchronized (c48518LdG.A08) {
                if (c48518LdG.A00 < j) {
                    A01(c48518LdG, j);
                }
            }
        }
        lja.A03(str, "process_end");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fb, code lost:
    
        if (r0.equals(r33) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r30, X.EnumC46242KdI r31, java.lang.Long r32, java.lang.String r33, java.lang.String r34, int r35, long r36, long r38, long r40, long r42, boolean r44) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48518LdG.A03(com.instagram.direct.armadilloexpress.transportpayload.TransportPayload, X.KdI, java.lang.Long, java.lang.String, java.lang.String, int, long, long, long, long, boolean):void");
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AbstractC25651Mw.A00(this.A02).A02(this.A01, C2Im.class);
    }

    public C48518LdG(UserSession userSession) {
        this.A02 = userSession;
        LAB A00 = AbstractC47001KqK.A00(userSession);
        this.A07 = A00;
        L8o A002 = AbstractC47002KqL.A00(userSession);
        this.A0B = A002;
        C132515ya A003 = C60J.A00(userSession);
        this.A0C = A003;
        C2DS A004 = C2JD.A00(userSession);
        this.A0A = A004;
        L7X l7x = new L7X(userSession, A002);
        this.A09 = l7x;
        this.A03 = new C47970LIe(userSession, l7x, A004, A00, A002, A003);
        this.A04 = new C47912LEg(userSession, l7x, A004, A002);
        this.A05 = new C47913LEh(userSession, l7x, A002);
        this.A06 = new L5E(userSession, A004, A002, A003);
        this.A08 = new Object();
        this.A00 = -1L;
        C44288Jhe c44288Jhe = new C44288Jhe(this, 9);
        this.A01 = c44288Jhe;
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36327572124089023L)) {
            AbstractC25651Mw.A00(userSession).A01(c44288Jhe, C2Im.class);
            if (((C2DU) A004).A0H.A0F) {
                A00(this);
            }
        }
    }
}
