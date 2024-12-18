package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.Dpv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31330Dpv implements InterfaceC13000lm {
    public Integer A00;
    public boolean A01;
    public final C5Fn A02;
    public final C41761wQ A03;
    public final UserSession A04;
    public final C137756Lx A05;
    public final C2DS A06;
    public final C34550FKk A07;
    public final Integer A08;
    public final EnumSet A09;
    public final C25671My A0E;
    public final InterfaceC41501vz A0F;
    public final InterfaceC41501vz A0G;
    public final InterfaceC41501vz A0H;
    public final FGV A0I;
    public final Map A0C = AbstractC166987dD.A1I();
    public final Map A0B = AbstractC166987dD.A1I();
    public final Map A0A = AbstractC166987dD.A1I();
    public final java.util.Set A0D = AbstractC31171DnF.A0l();

    public final C42221xC A09(C3o9 c3o9, C3o9 c3o92) {
        InterfaceC83733oI interfaceC83733oI;
        C14360o3.A0B(c3o9, 0);
        InterfaceC83733oI A05 = JRE.A05(c3o9);
        if (c3o92 == null || (interfaceC83733oI = JRE.A05(c3o92)) == null) {
            E70 e70 = (E70) AbstractC34200F6y.A00(this.A04, c3o9);
            if (e70 != null) {
                interfaceC83733oI = e70.A0K;
            } else {
                interfaceC83733oI = null;
            }
        }
        if (A05 != null) {
            if (interfaceC83733oI != null) {
                C42221xC A01 = C42221xC.A01(new C36221Fya(this, c3o9), A00(A05), A00(interfaceC83733oI));
                C14360o3.A0A(A01);
                return A01;
            }
            return A00(A05);
        }
        return AbstractC42021ws.A01(new E72(true, false, (List) C16930sl.A00, 7));
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [X.0oO, java.lang.Object] */
    public final void A0A(C3o9 c3o9, Integer num) {
        String A1A;
        C81613kW c81613kW;
        String str;
        String str2;
        E72 e72;
        E72 e722;
        List list;
        C35169FfL c35169FfL;
        C14360o3.A0B(c3o9, 0);
        InterfaceC83733oI A05 = JRE.A05(c3o9);
        if (A05 != null) {
            UserSession userSession = this.A04;
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36326854864418980L)) {
                A1A = null;
                if (!this.A01 && (e722 = (E72) this.A0B.get(A05)) != null && (list = (List) e722.A00) != null && (c35169FfL = (C35169FfL) AbstractC001800i.A0L(list)) != null) {
                    A1A = Long.valueOf(c35169FfL.A01()).toString();
                }
            } else {
                A1A = AbstractC166987dD.A1A(A05, this.A0A);
            }
            C42201xA c42201xA = (C42201xA) this.A0C.get(A05);
            if (c42201xA != null && (e72 = (E72) c42201xA.A0W()) != null && !e72.A02) {
                Object A0W = c42201xA.A0W();
                if (A0W != null) {
                    c42201xA.accept(A0W);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            if (C18U.A06(c06090Tz, userSession, 36318033002567489L) && this.A0D.contains(A05)) {
                return;
            }
            String A0j = AbstractC167017dG.A0j();
            C83693oE A02 = AbstractC1345466e.A02(A05);
            if (A02 != null) {
                C2DS c2ds = this.A06;
                String str3 = A02.A00;
                C14360o3.A0B(str3, 0);
                ((C2DU) c2ds).A0N(str3);
                ?? obj = new Object();
                C161867Mw c161867Mw = C161857Mv.A02;
                C81663kb A0h = AbstractC31172DnG.A0h(C2JD.A00(userSession), str3);
                if (A0h != null) {
                    c81613kW = A0h.Aic();
                } else {
                    c81613kW = null;
                }
                boolean A03 = c161867Mw.A03(userSession, c81613kW);
                this.A0D.add(A05);
                C34550FKk c34550FKk = this.A07;
                if (this.A08 == C05F.A00) {
                    str = "photos_and_videos";
                } else {
                    str = "media_shares";
                }
                UserSession userSession2 = c34550FKk.A01;
                C25621Ms A0M = AbstractC31177DnL.A0M(userSession2);
                A0M.A0L("direct_v2/threads/%s/media/", str3);
                if (num == null || (str2 = num.toString()) == null) {
                    str2 = c34550FKk.A02;
                }
                A0M.A9s("limit", str2);
                A0M.A9s("media_type", str);
                A0M.A9s(AbstractC111324zv.A00(2299), C6CC.A03.A02(userSession2));
                A0M.A9s(AbstractC111324zv.A00(2512), A0j);
                A0M.A0R(ECQ.class, FV7.class);
                if (A1A != null) {
                    A0M.A9s(AbstractC43591JPw.A00(1159), A1A);
                }
                this.A03.A02(AbstractC34046F0z.A00(A0M.A0N()).A0O(c34550FKk.A00).A0K(new C48371Lal(this, A02, A05, obj, A03)), new C36795GJu(0, obj, A05, this, A02));
            }
            if (JRE.A00(c3o9) != EnumC92794Ds.A04) {
                return;
            }
            A04(this, A05, num, A1A);
        }
    }

    private final C42201xA A00(InterfaceC83733oI interfaceC83733oI) {
        Map map = this.A0C;
        Object obj = map.get(interfaceC83733oI);
        if (obj == null) {
            obj = AbstractC42021ws.A01(new E72(true, false, (List) C16930sl.A00, 7));
            if (AbstractC1345466e.A02(interfaceC83733oI) != null) {
                GKM.A00(C42221xC.A07(new C44091JeG(18, this, interfaceC83733oI), this.A02), this.A03, interfaceC83733oI, this, 4);
            }
            map.put(interfaceC83733oI, obj);
        }
        return (C42201xA) obj;
    }

    public static final InterfaceC83733oI A01(C2Io c2Io, AbstractC31330Dpv abstractC31330Dpv) {
        C83693oE A00 = AbstractC83823oR.A00(c2Io.A00);
        Object obj = null;
        if (A00 == null) {
            return null;
        }
        Iterator it = abstractC31330Dpv.A0C.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C14360o3.A0K(AbstractC1345466e.A02((InterfaceC83733oI) next), A00)) {
                obj = next;
                break;
            }
        }
        return (InterfaceC83733oI) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        if (r6.A04(r0) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0126, code lost:
    
        if (r12 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002b, code lost:
    
        if (r15 != false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112 A[LOOP:1: B:51:0x010c->B:53:0x0112, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.1rE, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.LinkedList A02(X.AbstractC31330Dpv r36, X.InterfaceC83733oI r37, java.util.List r38) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC31330Dpv.A02(X.Dpv, X.3oI, java.util.List):java.util.LinkedList");
    }

    public static final void A05(AbstractC31330Dpv abstractC31330Dpv, InterfaceC83733oI interfaceC83733oI, Collection collection) {
        E72 e72;
        C42201xA c42201xA = (C42201xA) abstractC31330Dpv.A0C.get(interfaceC83733oI);
        if (c42201xA != null && (e72 = (E72) c42201xA.A0W()) != null) {
            List list = (List) e72.A00;
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                C35169FfL c35169FfL = (C35169FfL) obj;
                if (!AbstractC001800i.A0u(collection, c35169FfL.A05()) && !AbstractC001800i.A0u(collection, new C50679MYx(c35169FfL.A04(), AbstractC25231BEo.A0s(c35169FfL.A02()), 45).A01)) {
                    A1E.add(obj);
                }
            }
            c42201xA.accept(new E72(e72.A02, e72.A01, A1E, 7));
        }
    }

    public static final void A06(AbstractC31330Dpv abstractC31330Dpv, InterfaceC83733oI interfaceC83733oI, List list) {
        E72 e72;
        C42201xA c42201xA = (C42201xA) abstractC31330Dpv.A0C.get(interfaceC83733oI);
        if (c42201xA != null && (e72 = (E72) c42201xA.A0W()) != null) {
            e72.A00 = A03(abstractC31330Dpv, (List) e72.A00, list);
            if (!C18U.A06(C06090Tz.A05, abstractC31330Dpv.A04, 36326854864418980L)) {
                boolean z = true;
                if (!e72.A02) {
                    if (list.size() >= 6 && (!(list instanceof Collection) || !list.isEmpty())) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((C35169FfL) it.next()).A08()) {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                e72.A02 = z;
                if (!z && !((List) e72.A00).isEmpty()) {
                    abstractC31330Dpv.A0A.put(interfaceC83733oI, String.valueOf(((C35169FfL) AbstractC001800i.A0K((List) e72.A00)).A01()));
                } else {
                    abstractC31330Dpv.A0A.remove(interfaceC83733oI);
                }
            }
            abstractC31330Dpv.A0B.put(interfaceC83733oI, e72);
            c42201xA.accept(e72);
        }
    }

    public static final void A07(AbstractC31330Dpv abstractC31330Dpv, InterfaceC83733oI interfaceC83733oI, List list, boolean z, boolean z2) {
        abstractC31330Dpv.A0D.remove(interfaceC83733oI);
        Object A0W = abstractC31330Dpv.A00(interfaceC83733oI).A0W();
        if (A0W != null) {
            E72 e72 = (E72) A0W;
            if (z) {
                if (AbstractC166987dD.A1b(list)) {
                    e72.A00 = A03(abstractC31330Dpv, (List) e72.A00, list);
                }
                e72.A01 = false;
                e72.A02 = z2;
            } else {
                e72.A01 = true;
            }
            abstractC31330Dpv.A0B.put(interfaceC83733oI, e72);
            AbstractC42211xB abstractC42211xB = (AbstractC42211xB) abstractC31330Dpv.A0C.get(interfaceC83733oI);
            if (abstractC42211xB != null) {
                abstractC42211xB.accept(e72);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A03.A01();
        this.A0C.clear();
        this.A0B.clear();
        C25671My c25671My = this.A0E;
        c25671My.A02(this.A0H, C48032Iq.class);
        c25671My.A02(this.A0G, C160997Ji.class);
        c25671My.A02(this.A0F, C2Io.class);
    }

    public AbstractC31330Dpv(C25671My c25671My, C5Fn c5Fn, UserSession userSession, C137756Lx c137756Lx, C2DS c2ds, C34550FKk c34550FKk, FGV fgv, Integer num, EnumSet enumSet) {
        this.A08 = num;
        this.A09 = enumSet;
        this.A04 = userSession;
        this.A06 = c2ds;
        this.A07 = c34550FKk;
        this.A02 = c5Fn;
        this.A0E = c25671My;
        this.A0I = fgv;
        this.A05 = c137756Lx;
        C41761wQ A0S = AbstractC31174DnI.A0S();
        this.A03 = A0S;
        C36125Fwz c36125Fwz = new C36125Fwz(this);
        this.A0H = c36125Fwz;
        C36124Fwy c36124Fwy = new C36124Fwy(this);
        this.A0G = c36124Fwy;
        C31317Dpd c31317Dpd = new C31317Dpd(this);
        this.A0F = c31317Dpd;
        C2DU c2du = (C2DU) this.A06;
        C42221xC A0O = c2du.A09.A0O((C5Fn) c2du.A0L.getValue());
        final C31315Dpb c31315Dpb = C31315Dpb.A00;
        A0S.A02(A0O.A0M(new C6J5() { // from class: X.DpY
            @Override // X.C6J5
            public final /* synthetic */ boolean test(Object obj) {
                return AbstractC25231BEo.A1a(obj, InterfaceC16660sJ.this);
            }
        }), new C31329Dpu(this));
        C42221xC A00 = C137766Ly.A00(this.A05.A01);
        final C31655DvL c31655DvL = C31655DvL.A00;
        A0S.A02(A00.A0M(new C6J5() { // from class: X.DpY
            @Override // X.C6J5
            public final /* synthetic */ boolean test(Object obj) {
                return AbstractC25231BEo.A1a(obj, InterfaceC16660sJ.this);
            }
        }), new C36791GJo(this));
        c25671My.A01(c36125Fwz, C48032Iq.class);
        c25671My.A01(c36124Fwy, C160997Ji.class);
        c25671My.A01(c31317Dpd, C2Io.class);
    }

    public static final LinkedList A03(AbstractC31330Dpv abstractC31330Dpv, List list, List list2) {
        Object c50679MYx;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C35169FfL c35169FfL = (C35169FfL) it.next();
            A1I.put(new C50679MYx(c35169FfL.A04(), AbstractC25231BEo.A0s(c35169FfL.A02()), 45), c35169FfL);
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C35169FfL c35169FfL2 = (C35169FfL) it2.next();
            if (abstractC31330Dpv.A08 == C05F.A01 && !c35169FfL2.A08()) {
                Iterator A14 = AbstractC166997dE.A14(A1I);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    c50679MYx = A1K.getKey();
                    if (AbstractC002300n.A0g(((C35169FfL) A1K.getValue()).A04(), c35169FfL2.A04(), false)) {
                        break;
                    }
                }
            }
            c50679MYx = new C50679MYx(c35169FfL2.A04(), AbstractC25231BEo.A0s(c35169FfL2.A02()), 45);
            if (A1I.containsKey(c50679MYx)) {
                C35169FfL c35169FfL3 = (C35169FfL) A1I.get(c50679MYx);
                if (c35169FfL3 != null) {
                    if (c35169FfL3.A02() != null && c35169FfL2.A00() == c35169FfL3.A00()) {
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            A1I.put(c50679MYx, c35169FfL2);
        }
        TreeSet treeSet = new TreeSet(new C31460Ds4((InterfaceC16620sF) new C30495Dbe(abstractC31330Dpv, 31), 11));
        treeSet.addAll(A1I.values());
        return new LinkedList(treeSet);
    }

    public static final void A04(AbstractC31330Dpv abstractC31330Dpv, InterfaceC83733oI interfaceC83733oI, Integer num, String str) {
        final long currentTimeMillis;
        final int i;
        Long A0j;
        final MsysThreadId A04 = AbstractC1345466e.A04(interfaceC83733oI);
        if (A04 != null) {
            C41761wQ c41761wQ = abstractC31330Dpv.A03;
            FGV fgv = abstractC31330Dpv.A0I;
            Integer num2 = abstractC31330Dpv.A08;
            C14360o3.A0B(num2, 1);
            if (str != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                currentTimeMillis = AbstractC166987dD.A0L(A0j.longValue());
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 20;
            }
            C137766Ly c137766Ly = fgv.A00.A01;
            final int i2 = 2;
            if (num2.intValue() == 0) {
                i2 = 1;
            }
            GKM.A00(c137766Ly.A09.A0L(new C6D2() { // from class: X.Fyj
                @Override // X.C6D2
                public final Object apply(Object obj) {
                    final MsysThreadId msysThreadId = MsysThreadId.this;
                    final long j = currentTimeMillis;
                    final int i3 = i;
                    final int i4 = i2;
                    final C1345666g c1345666g = (C1345666g) obj;
                    C137766Ly c137766Ly2 = C137766Ly.A0L;
                    return C42221xC.A07(new InterfaceC1345866i() { // from class: X.FzD
                        @Override // X.InterfaceC1345866i
                        public final void EpD(C1346766r c1346766r) {
                            C1345666g c1345666g2 = C1345666g.this;
                            MsysThreadId msysThreadId2 = msysThreadId;
                            long j2 = j;
                            int i5 = i3;
                            int i6 = i4;
                            C137766Ly c137766Ly3 = C137766Ly.A0L;
                            long j3 = msysThreadId2.A00;
                            C35856FsW c35856FsW = new C35856FsW(c1346766r, 6);
                            InterfaceExecutorC135866Co ASj = c1345666g2.mMailboxApiHandleMetaProvider.ASj(0);
                            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
                            String A00 = AbstractC111324zv.A00(1692);
                            String A002 = AbstractC111324zv.A00(2675);
                            int A003 = AbstractC1346866s.A00(mailboxFutureImpl);
                            TraceInfo A01 = AbstractC1346866s.A01(mailboxFutureImpl, A00, A002);
                            mailboxFutureImpl.Ecq(c35856FsW);
                            if (!ASj.ELJ(new YBP(c1345666g2, mailboxFutureImpl, A003, i5, i6, j3, j2))) {
                                mailboxFutureImpl.cancel(false);
                                AbstractC1346866s.A02(A003);
                                AbstractC1346866s.A03(A01, A00, A002);
                            }
                            PlatformLogger.platformEventLog(5);
                        }
                    }, AbstractC137146It.A00("load_secure_message_attachment_list"));
                }
            }).A0K(C36246Fyz.A00).A0K(C36247Fz0.A00).A0K(new C36225Fye(i)), c41761wQ, interfaceC83733oI, abstractC31330Dpv, 5);
        }
    }

    public static final void A08(C35169FfL c35169FfL, C2EY c2ey) {
        if (c35169FfL.A02() == null && c35169FfL.A06() == null) {
            C0f5 AEp = C18950wb.A01.AEp("Trying to create item with no media id or target URL", 20134884);
            AEp.ABW("message_type", c2ey.toString());
            AEp.report();
        }
    }
}
