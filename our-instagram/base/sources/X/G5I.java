package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class G5I implements C7TQ {
    public final C41761wQ A00;
    public final UserSession A01;

    public G5I(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = AbstractC31174DnI.A0S();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r1.hasNext() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r4.add(X.AbstractC34821FVx.A00(X.AbstractC25226BEj.A15(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00c4, code lost:
    
        return X.AbstractC31180DnO.A0I(r5.A00.A0L(new X.C36229Fyi(r5, r4, r2)), "instagram_secure_participants_add").A0K(X.C36241Fyu.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        r2 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (r2.hasNext() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        r1 = X.AbstractC25226BEj.A15(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r1.Bkb() == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        r0 = r1.Bkb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r0.intValue() == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        r0 = 2131958695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (X.C18U.A05(X.C06090Tz.A05, r8.A01) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
    
        r0 = 2131958693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        r1 = new X.C32025E5d(null, null, "ADULT_MINOR_GROUP_RESTRICTION", r9.getString(r0), r9.getString(2131958694), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0065, code lost:
    
        if (r2 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r13.isEmpty() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        r5 = A00(r8);
        r2 = X.AbstractC1345466e.A03(r10).A00;
        r4 = X.AbstractC167017dG.A0q(r13);
        r1 = r13.iterator();
     */
    @Override // X.C7TQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C42221xC A9t(android.content.Context r9, X.InterfaceC83733oI r10, X.EnumC31337Dq2 r11, java.util.List r12, java.util.List r13, int r14) {
        /*
            r8 = this;
            r7 = 0
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L4f
            boolean r2 = r13 instanceof java.util.Collection
            if (r2 == 0) goto L3b
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L3b
        L11:
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L68
        L17:
            X.6JY r5 = A00(r8)
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = X.AbstractC1345466e.A03(r10)
            long r2 = r0.A00
            java.util.ArrayList r4 = X.AbstractC167017dG.A0q(r13)
            java.util.Iterator r1 = r13.iterator()
        L29:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lad
            com.instagram.user.model.User r0 = X.AbstractC25226BEj.A15(r1)
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r0 = X.AbstractC34821FVx.A00(r0)
            r4.add(r0)
            goto L29
        L3b:
            java.util.Iterator r1 = r13.iterator()
        L3f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L65
            com.instagram.user.model.User r0 = X.AbstractC25226BEj.A15(r1)
            java.lang.Long r0 = r0.BTC()
            if (r0 != 0) goto L3f
        L4f:
            r2 = 0
            java.lang.String r5 = "Error"
            java.lang.String r6 = "Some participant's fbid are null"
            X.E5d r1 = new X.E5d
            r3 = r2
            r4 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L5b:
            X.Lcn r0 = new X.Lcn
            r0.<init>(r1)
            X.1xC r0 = X.C42221xC.A09(r0)
            return r0
        L65:
            if (r2 == 0) goto L68
            goto L11
        L68:
            java.util.Iterator r2 = r13.iterator()
        L6c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            com.instagram.user.model.User r1 = X.AbstractC25226BEj.A15(r2)
            java.lang.Integer r0 = r1.Bkb()
            if (r0 == 0) goto L6c
            java.lang.Integer r0 = r1.Bkb()
            if (r0 == 0) goto L88
            int r0 = r0.intValue()
            if (r0 == 0) goto L6c
        L88:
            r2 = 0
            com.instagram.common.session.UserSession r1 = r8.A01
            X.0Tz r0 = X.C06090Tz.A05
            boolean r1 = X.C18U.A05(r0, r1)
            r0 = 2131958695(0x7f131ba7, float:1.955401E38)
            if (r1 == 0) goto L99
            r0 = 2131958693(0x7f131ba5, float:1.9554005E38)
        L99:
            java.lang.String r5 = r9.getString(r0)
            r0 = 2131958694(0x7f131ba6, float:1.9554007E38)
            java.lang.String r6 = r9.getString(r0)
            java.lang.String r4 = "ADULT_MINOR_GROUP_RESTRICTION"
            X.E5d r1 = new X.E5d
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L5b
        Lad:
            X.1xC r1 = r5.A00
            X.Fyi r0 = new X.Fyi
            r0.<init>()
            X.1xC r1 = r1.A0L(r0)
            java.lang.String r0 = "instagram_secure_participants_add"
            X.1xC r1 = X.AbstractC31180DnO.A0I(r1, r0)
            X.Fyu r0 = X.C36241Fyu.A00
            X.1xC r0 = r1.A0K(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G5I.A9t(android.content.Context, X.3oI, X.Dq2, java.util.List, java.util.List, int):X.1xC");
    }

    @Override // X.C7TQ
    public final C42221xC AGy(C3o9 c3o9, String str) {
        C14360o3.A0B(str, 1);
        return AbstractC31180DnO.A0I(A00(this).A01.A0L(new JRU(AbstractC31179DnN.A03(c3o9), str, 2)), "tam_client_thread_update_thread_image").A0K(C36242Fyv.A00);
    }

    @Override // X.C7TQ
    public final void AGz(Context context, InterfaceC83733oI interfaceC83733oI, String str, boolean z) {
        C14360o3.A0B(str, 1);
        if (!AbstractC001900j.A0T(str)) {
            long j = AbstractC1345466e.A03(interfaceC83733oI).A00;
            UserSession userSession = this.A01;
            C25671My A00 = AbstractC25651Mw.A00(userSession);
            A00.E4s(new C7MH(interfaceC83733oI, C05F.A00));
            K3a A01 = LIu.A01(userSession);
            InterfaceExecutorC135866Co ASj = A01.mMailboxApiHandleMetaProvider.ASj(0);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
            String A002 = AbstractC43591JPw.A00(1295);
            int A003 = AbstractC1346866s.A00(mailboxFutureImpl);
            TraceInfo A012 = AbstractC1346866s.A01(mailboxFutureImpl, "MailboxTam", A002);
            if (!ASj.ELJ(new LVI(mailboxFutureImpl, A01, str, A003, 5, j))) {
                mailboxFutureImpl.cancel(false);
                AbstractC1346866s.A02(A003);
                AbstractC1346866s.A03(A012, "MailboxTam", A002);
            }
            PlatformLogger.platformEventLog(5);
            mailboxFutureImpl.addResultCallback(new C35857FsX(2, A00, interfaceC83733oI));
        }
    }

    @Override // X.C7TQ
    public final C42221xC Ch5(Context context, C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        return A00(this).A05(AbstractC31179DnN.A03(c3o9));
    }

    @Override // X.C7TQ
    public final void Cmy(InterfaceC83733oI interfaceC83733oI, String str, String str2, int i) {
    }

    @Override // X.C7TQ
    public final void Cmz(InterfaceC83733oI interfaceC83733oI) {
    }

    @Override // X.C7TQ
    public final void CnL(InterfaceC83733oI interfaceC83733oI, String str, boolean z) {
    }

    @Override // X.C7TQ
    public final void CnP(DirectMessageIdentifier directMessageIdentifier) {
    }

    @Override // X.C7TQ
    public final void Co1(InterfaceC83733oI interfaceC83733oI) {
    }

    @Override // X.C7TQ
    public final C42221xC CqC(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, boolean z) {
        C14360o3.A0B(interfaceC83733oI, 0);
        UserSession userSession = this.A01;
        AbstractC34136F4m.A00(userSession).A05(interfaceC11380iw, interfaceC83733oI, AbstractC31179DnN.A0U(interfaceC83733oI), true);
        C42221xC A06 = C6JW.A00(userSession, "MsysThreadActionsManager").A00.A06(AbstractC1345466e.A03(interfaceC83733oI).A00);
        this.A00.A02(A06, GKG.A00);
        return A06;
    }

    @Override // X.C7TQ
    public final void CqJ(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, int i) {
        C14360o3.A0B(interfaceC83733oI, 0);
        UserSession userSession = this.A01;
        AbstractC34136F4m.A00(userSession).A02(interfaceC11380iw, interfaceC83733oI, AbstractC31179DnN.A0U(interfaceC83733oI), i);
        LEB.A01.A02(userSession, i, AbstractC1345466e.A03(interfaceC83733oI).A00);
    }

    @Override // X.C7TQ
    public final void CqK(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI) {
        C14360o3.A0B(interfaceC83733oI, 0);
        UserSession userSession = this.A01;
        AbstractC34136F4m.A00(userSession).A04(interfaceC11380iw, interfaceC83733oI, AbstractC31179DnN.A0U(interfaceC83733oI), true);
        LIu.A01(userSession).A02(AbstractC1345466e.A03(interfaceC83733oI).A00);
    }

    @Override // X.C7TQ
    public final C42221xC E6K(InterfaceC83733oI interfaceC83733oI, User user) {
        return C6JY.A00(A00(this), AbstractC34821FVx.A00(user), 1, AbstractC1345466e.A03(interfaceC83733oI).A00).A0K(C36244Fyx.A00);
    }

    @Override // X.C7TQ
    public final C42221xC EG6(InterfaceC83733oI interfaceC83733oI, List list) {
        if (!list.isEmpty()) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((MessagingUser) it.next()).A02 == null) {
                    }
                }
            }
            C6JY A00 = A00(this);
            long j = AbstractC1345466e.A03(interfaceC83733oI).A00;
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A0q.add(((MessagingUser) it2.next()).A02);
            }
            return AbstractC31180DnO.A0I(A00.A00.A0L(new C36227Fyg(j, A0q, 0)), "tam_client_request_participants_remove");
        }
        return C42221xC.A09(false);
    }

    @Override // X.C7TQ
    public final void EI8(C3o9 c3o9) {
    }

    @Override // X.C7TQ
    public final C42221xC ELf(C3o9 c3o9, String str, String str2, boolean z) {
        C14360o3.A0B(c3o9, 1);
        return A00(this).A02.A0L(new C48359LaZ(str, c3o9, 4)).A0G().A0O(AbstractC137146It.A00(AbstractC43591JPw.A00(1297)));
    }

    @Override // X.C7TQ
    public final void F7t(UserSession userSession, C81613kW c81613kW, InterfaceC83733oI interfaceC83733oI, int i, boolean z, boolean z2) {
        int i2;
        C14360o3.A0B(userSession, 0);
        if (interfaceC83733oI instanceof MsysThreadId) {
            MsysThreadId A03 = AbstractC1345466e.A03(interfaceC83733oI);
            C1345666g A00 = LFD.A00(userSession);
            long j = A03.A00;
            if (z) {
                i2 = AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36601084231356533L);
            } else {
                i2 = 0;
            }
            InterfaceExecutorC135866Co ASj = A00.mMailboxApiHandleMetaProvider.ASj(0);
            MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASj);
            String A002 = AbstractC111324zv.A00(1692);
            String A003 = AbstractC43591JPw.A00(1296);
            int A004 = AbstractC1346866s.A00(mailboxFutureImpl);
            TraceInfo A01 = AbstractC1346866s.A01(mailboxFutureImpl, A002, A003);
            if (!ASj.ELJ(new C48178LUc(A004, i2, 1, j, A00, mailboxFutureImpl))) {
                mailboxFutureImpl.cancel(false);
                AbstractC1346866s.A02(A004);
                AbstractC1346866s.A03(A01, A002, A003);
            }
            PlatformLogger.platformEventLog(5);
        }
    }

    @Override // X.C7TQ
    public final void F7z(InterfaceC83733oI interfaceC83733oI, boolean z, boolean z2) {
        C14360o3.A0B(interfaceC83733oI, 0);
        AbstractC31278Dp0.A0B(this.A01, AbstractC1345466e.A01(interfaceC83733oI), AnonymousClass001.A1D("MsysThreadActionsManager ", false), z);
    }

    @Override // X.C7TQ
    public final void F9J(InterfaceC11380iw interfaceC11380iw, C3o9 c3o9) {
        InterfaceC83733oI A05 = JRE.A05(c3o9);
        if (A05 != null) {
            AbstractC34136F4m.A00(this.A01).A06(interfaceC11380iw, A05, Boolean.valueOf(JRE.A09(c3o9)), false);
        }
        AbstractC31181DnP.A0x(this.A01, c3o9);
    }

    @Override // X.C7TQ
    public final C42221xC F9L(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI, boolean z) {
        C14360o3.A0B(interfaceC83733oI, 0);
        UserSession userSession = this.A01;
        AbstractC34136F4m.A00(userSession).A05(interfaceC11380iw, interfaceC83733oI, AbstractC31179DnN.A0U(interfaceC83733oI), false);
        C42221xC A08 = C6JW.A00(userSession, "MsysThreadActionsManager").A00.A08(AbstractC1345466e.A03(interfaceC83733oI).A00);
        this.A00.A02(A08, GKH.A00);
        return A08;
    }

    @Override // X.C7TQ
    public final C42221xC F9Q(InterfaceC11380iw interfaceC11380iw, InterfaceC83733oI interfaceC83733oI) {
        C14360o3.A0B(interfaceC83733oI, 0);
        UserSession userSession = this.A01;
        AbstractC34136F4m.A00(userSession).A04(interfaceC11380iw, interfaceC83733oI, AbstractC31179DnN.A0U(interfaceC83733oI), false);
        C42221xC A07 = C6JW.A00(userSession, "MsysThreadActionsManager").A00.A07(AbstractC1345466e.A03(interfaceC83733oI).A00);
        this.A00.A02(A07, GKI.A00);
        return A07;
    }

    @Override // X.C7TQ
    public final void FBU(String str, String str2, String str3) {
    }

    @Override // X.C7TQ
    public final void FBV(String str, String str2, String str3) {
    }

    public static C6JY A00(G5I g5i) {
        return C6JW.A00(g5i.A01, "MsysThreadActionsManager").A00;
    }

    @Override // X.C7TQ
    public final void CnH(InterfaceC83733oI interfaceC83733oI) {
        C131225wA.A01.A02(new C50363MLp(48, interfaceC83733oI, this), this.A01);
    }

    @Override // X.C7TQ
    public final void D9t(InterfaceC83713oG interfaceC83713oG) {
        this.A00.A01();
    }

    @Override // X.C7TQ
    public final void F7u(UserSession userSession, InterfaceC83733oI interfaceC83733oI, Integer num, int i, int i2) {
        throw AbstractC166987dD.A14("Disappearing Mode isn't supported for msys threads.");
    }

    @Override // X.C7TQ
    public final C42221xC AGX(InterfaceC83733oI interfaceC83733oI, List list) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.C7TQ
    public final C42221xC AOp(InterfaceC83733oI interfaceC83733oI, User user) {
        return C6JY.A00(A00(this), AbstractC34821FVx.A00(user), 0, AbstractC1345466e.A03(interfaceC83733oI).A00).A0K(C36243Fyw.A00);
    }

    @Override // X.C7TQ
    public final C42221xC APY(InterfaceC83733oI interfaceC83733oI) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.C7TQ
    public final C42221xC ARs(InterfaceC83733oI interfaceC83733oI) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.C7TQ
    public final void Cmu(C34583FLs c34583FLs) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.C7TQ
    public final void CqA(InterfaceC11380iw interfaceC11380iw, C3o9 c3o9, int i) {
        long currentTimeMillis;
        InterfaceC83733oI A05 = JRE.A05(c3o9);
        if (A05 != null) {
            C35165FfF A00 = AbstractC34136F4m.A00(this.A01);
            if (i <= 0) {
                A00.A06(interfaceC11380iw, A05, Boolean.valueOf(JRE.A09(c3o9)), true);
            } else {
                A00.A03(interfaceC11380iw, A05, Boolean.valueOf(JRE.A09(c3o9)), i);
            }
        }
        K3Z A002 = AbstractC46876KoJ.A00(this.A01);
        long A03 = AbstractC31179DnN.A03(c3o9);
        if (i < 0) {
            currentTimeMillis = -1;
        } else {
            currentTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(i);
        }
        A002.A00(A03, currentTimeMillis);
    }

    @Override // X.C7TQ
    public final C42221xC EF9(InterfaceC83733oI interfaceC83733oI, List list) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.C7TQ
    public final C42221xC EFn(InterfaceC83733oI interfaceC83733oI, List list) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.C7TQ
    public final C42221xC EGS(C3o9 c3o9) {
        return AbstractC31180DnO.A0I(A00(this).A01.A0L(new C48348LaO(AbstractC31179DnN.A03(c3o9), 3)), AbstractC43591JPw.A00(1359)).A0K(C36245Fyy.A00);
    }

    @Override // X.C7TQ
    public final void EpG(String str, String str2) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.C7TQ
    public final void CnG(C206259Bi c206259Bi, InterfaceC83733oI interfaceC83733oI, boolean z) {
        CnH(interfaceC83733oI);
    }
}
