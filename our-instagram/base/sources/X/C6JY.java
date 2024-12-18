package X;

import android.util.Pair;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.6JY, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6JY {
    public final C42221xC A00;
    public final C42221xC A01;
    public final C42221xC A02;
    public final UserSession A03;

    public static String A02(K3a k3a, String str) {
        try {
            return (String) k3a.A00(str, null).get();
        } catch (InterruptedException | ExecutionException e) {
            C0w9.A03("rxmailbox_get_resolver_id_from_url", AnonymousClass001.A0u("Failed resolve media id from FileURL:", str, " with error: ", e.getMessage()));
            return null;
        }
    }

    public static String A04(InterfaceC132965zL interfaceC132965zL, C6JY c6jy, Integer num, int i) {
        return AbstractC46872KoF.A00(c6jy.A03, 7, null, Integer.valueOf(i), num, ((MsysThreadId) AbstractC132975zM.A01(interfaceC132965zL)).A02, null, true);
    }

    public final C42221xC A0A(InterfaceC2056098k interfaceC2056098k, final C183978Ee c183978Ee, final Integer num, final Long l, final String str, final boolean z) {
        return A01(this, interfaceC2056098k).A0L(new C6D2() { // from class: X.Lap
            @Override // X.C6D2
            public final Object apply(Object obj) {
                final C6JY c6jy = C6JY.this;
                final C183978Ee c183978Ee2 = c183978Ee;
                final Integer num2 = num;
                final Long l2 = l;
                final boolean z2 = z;
                final String str2 = str;
                InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
                if (interfaceC132965zL instanceof C48496Lcn) {
                    return C48496Lcn.A00(interfaceC132965zL);
                }
                MsysThreadId msysThreadId = (MsysThreadId) AbstractC132975zM.A01(interfaceC132965zL);
                final long j = msysThreadId.A00;
                final Long A01 = AbstractC92784Dr.A01(msysThreadId);
                return AbstractC43593JPy.A0N(AbstractC43593JPy.A0M(new C6D2() { // from class: X.Las
                    @Override // X.C6D2
                    public final Object apply(Object obj2) {
                        C6JY c6jy2 = C6JY.this;
                        C183978Ee c183978Ee3 = c183978Ee2;
                        long j2 = j;
                        Integer num3 = num2;
                        Long l3 = l2;
                        boolean z3 = z2;
                        String str3 = str2;
                        Long l4 = A01;
                        Pair pair = (Pair) obj2;
                        K3a k3a = (K3a) pair.first;
                        C1345666g c1345666g = (C1345666g) pair.second;
                        String A02 = C6JY.A02(k3a, c183978Ee3.A06());
                        C18C.A07(A02, "Failed to resolve Image ID");
                        String A022 = C6JY.A02(k3a, c183978Ee3.A06());
                        C18C.A07(A022, "Failed to resolve preview ID");
                        int i = c183978Ee3.A06;
                        int i2 = c183978Ee3.A09;
                        Integer valueOf = Integer.valueOf(i);
                        Integer valueOf2 = Integer.valueOf(i2);
                        String A06 = c183978Ee3.A06();
                        long length = c183978Ee3.A03().length();
                        String A14 = AbstractC25225BEi.A14();
                        return C42221xC.A07(new C48481LcY(c1345666g, c6jy2.A03, valueOf, valueOf2, valueOf, valueOf2, num3, l4, l3, "image/jpeg", A06, A022, A02, str3, A14, 2, 0, j2, length, z3), AbstractC137146It.A00("rxmailbox_send_secure_image_message"));
                    }
                }, C48331La4.A00(c6jy)), "rxmailbox_send_secure_image_message");
            }
        }).A0G().A0O(AbstractC137146It.A00(AbstractC43591JPw.A00(1298)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C42221xC A0B(InterfaceC2056098k interfaceC2056098k, Integer num, Integer num2, String str, String str2, boolean z) {
        return A01(this, interfaceC2056098k).A0L(new C48379Lat(this, C2EY.A1i, num, num2, null, str, 0 == true ? 1 : 0, str2, z)).A0G();
    }

    public final C42221xC A0C(InterfaceC2056098k interfaceC2056098k, String str, String str2) {
        return A0B(interfaceC2056098k, null, null, str, str2, false);
    }

    public static C42221xC A00(C6JY c6jy, MsysPendingRecipient msysPendingRecipient, final int i, final long j) {
        return C42221xC.A01(new YO2() { // from class: X.FyX
            @Override // X.YO2
            public final Object apply(Object obj, Object obj2) {
                return Pair.create(obj, obj2);
            }
        }, C42221xC.A09(new MessagingUser(null, Long.valueOf(msysPendingRecipient.A01), msysPendingRecipient.A07, msysPendingRecipient.A00, true)), c6jy.A00).A0L(new C6D2() { // from class: X.LaT
            @Override // X.C6D2
            public final Object apply(Object obj) {
                final long j2 = j;
                final int i2 = i;
                final Pair pair = (Pair) obj;
                return C42221xC.A07(new InterfaceC1345866i() { // from class: X.Lbx
                    @Override // X.InterfaceC1345866i
                    public final void EpD(C1346766r c1346766r) {
                        Pair pair2 = pair;
                        long j3 = j2;
                        int i3 = i2;
                        C1345666g c1345666g = (C1345666g) pair2.second;
                        long longValue = ((MessagingUser) pair2.first).A02.longValue();
                        C48169LTt c48169LTt = new C48169LTt(c1346766r);
                        InterfaceExecutorC135866Co ASj = c1345666g.mMailboxApiHandleMetaProvider.ASj(0);
                        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
                        int A00 = AbstractC1346866s.A00(A0D);
                        TraceInfo A0F = AbstractC43592JPx.A0F(c48169LTt, A0D, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantUpdateAdminStatus");
                        if (!ASj.ELJ(new C48176LUa(c1345666g, A0D, A00, i3, j3, longValue))) {
                            A0D.cancel(false);
                            AbstractC1346866s.A02(A00);
                            AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "runInstagramSecureParticipantUpdateAdminStatus");
                        }
                        PlatformLogger.platformEventLog(5);
                    }
                }, AbstractC137146It.A00(AbstractC111324zv.A00(4695)));
            }
        }).A0O(AbstractC137146It.A00("instagram_secure_participant_update_admin_status")).A0G();
    }

    public static C42221xC A01(C6JY c6jy, InterfaceC2056098k interfaceC2056098k) {
        if (interfaceC2056098k instanceof MsysThreadId) {
            return C42221xC.A09(new C132955zK(interfaceC2056098k));
        }
        if (interfaceC2056098k instanceof C23974Ak9) {
            C23974Ak9 c23974Ak9 = (C23974Ak9) interfaceC2056098k;
            return c6jy.A09(c23974Ak9.A01, null, c23974Ak9.A02);
        }
        throw new IllegalArgumentException("MsysThreadTarget should be either MsysThreadId or MsysPendingRecipients");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r1.ELJ(new X.LU0(r2, r4)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A03(X.K3a r4, byte[] r5) {
        /*
            if (r5 == 0) goto L1a
            X.6Cm r0 = r4.mMailboxApiHandleMetaProvider     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            X.6Co r1 = r0.ASj(r3)     // Catch: java.lang.Throwable -> L3b
            com.facebook.msys.mca.MailboxFutureImpl r2 = new com.facebook.msys.mca.MailboxFutureImpl     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            X.LUA r0 = new X.LUA     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r1.ELJ(r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L34
            goto L31
        L1a:
            X.6Cm r0 = r4.mMailboxApiHandleMetaProvider     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            X.6Co r1 = r0.ASj(r3)     // Catch: java.lang.Throwable -> L3b
            com.facebook.msys.mca.MailboxFutureImpl r2 = new com.facebook.msys.mca.MailboxFutureImpl     // Catch: java.lang.Throwable -> L3b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            X.LU0 r0 = new X.LU0     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r1.ELJ(r0)     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L34
        L31:
            r2.cancel(r3)     // Catch: java.lang.Throwable -> L3b
        L34:
            java.lang.Object r0 = r2.get()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L3b
            return r0
        L3b:
            r0 = move-exception
            java.lang.String r1 = "Failed resolve media id from dataBlob with error: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.String r0 = "rxmailbox_get_resolver_id_from_data"
            X.C0w9.A03(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6JY.A03(X.K3a, byte[]):java.lang.String");
    }

    public final C42221xC A05(final long j) {
        return this.A02.A0L(new C6D2() { // from class: X.LaJ
            @Override // X.C6D2
            public final Object apply(Object obj) {
                long j2 = j;
                return C42221xC.A07(new C48440Lbt(obj, j2, 5), AbstractC137146It.A00(AbstractC111324zv.A00(5453)));
            }
        }).A0O(AbstractC137146It.A00("tam_client_participant_leave_thread")).A0G();
    }

    public final C42221xC A06(final long j) {
        return this.A01.A0L(new C6D2() { // from class: X.LaI
            @Override // X.C6D2
            public final Object apply(Object obj) {
                long j2 = j;
                return C42221xC.A07(new C48440Lbt(obj, j2, 6), AbstractC137146It.A00(AbstractC111324zv.A00(5454)));
            }
        }).A0O(AbstractC137146It.A00("tam_mute_thread_mentions")).A0G();
    }

    public final C42221xC A07(final long j) {
        return C42221xC.A02(new YO2() { // from class: X.FyZ
            @Override // X.YO2
            public final Object apply(Object obj, Object obj2) {
                return Pair.create(obj, obj2);
            }
        }, this.A02, this.A01).A0L(new C6D2() { // from class: X.LaG
            @Override // X.C6D2
            public final Object apply(Object obj) {
                long j2 = j;
                return C42221xC.A07(new C48440Lbt(obj, j2, 1), AbstractC137146It.A00(AbstractC111324zv.A00(5455)));
            }
        }).A0O(AbstractC137146It.A00("tam_unmute_thread")).A0G();
    }

    public final C42221xC A08(final long j) {
        return this.A01.A0L(new C6D2() { // from class: X.LaH
            @Override // X.C6D2
            public final Object apply(Object obj) {
                long j2 = j;
                return C42221xC.A07(new C48440Lbt(obj, j2, 3), AbstractC137146It.A00(AbstractC111324zv.A00(5456)));
            }
        }).A0O(AbstractC137146It.A00("tam_unmute_thread_mentions")).A0G();
    }

    public final C42221xC A09(final MsysThreadSubtype msysThreadSubtype, final String str, final List list) {
        return this.A00.A0L(new C6D2() { // from class: X.Lae
            @Override // X.C6D2
            public final Object apply(Object obj) {
                final C6JY c6jy = C6JY.this;
                final MsysThreadSubtype msysThreadSubtype2 = msysThreadSubtype;
                final List list2 = list;
                final String str2 = str;
                final C1345666g c1345666g = (C1345666g) obj;
                return C42221xC.A07(new InterfaceC1345866i() { // from class: X.LcC
                    @Override // X.InterfaceC1345866i
                    public final void EpD(C1346766r c1346766r) {
                        C6JY c6jy2 = c6jy;
                        C1345666g c1345666g2 = c1345666g;
                        MsysThreadSubtype msysThreadSubtype3 = msysThreadSubtype2;
                        List list3 = list2;
                        LCI.A00(c1345666g2, c6jy2.A03, msysThreadSubtype3, str2, list3, new JWS(c1346766r, 3));
                    }
                }, AbstractC137146It.A00(AbstractC111324zv.A00(4193)));
            }
        }).A0G().A0O(AbstractC137146It.A00("create_secure_thread"));
    }

    public C6JY(C42221xC c42221xC, C42221xC c42221xC2, C42221xC c42221xC3, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = c42221xC;
        this.A00 = c42221xC2;
        this.A01 = c42221xC3;
    }
}
