package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fgj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35250Fgj {
    public static final C35250Fgj A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (X.FUH.A00(r21, r23) == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.content.Context r18, X.C32071E6x r19, X.InterfaceC11380iw r20, com.instagram.common.session.UserSession r21, X.AbstractC33630Etg r22, java.util.Collection r23, java.util.List r24, boolean r25, boolean r26) {
        /*
            r7 = 0
            r10 = 0
            r8 = r23
            boolean r16 = X.AbstractC167007dF.A1V(r8)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L1e
            r0 = 248(0xf8, float:3.48E-43)
            java.lang.String r1 = X.AbstractC43591JPw.A00(r0)
            r0 = 676(0x2a4, float:9.47E-43)
            java.lang.String r0 = X.AbstractC43591JPw.A00(r0)
            X.C0w9.A03(r1, r0)
            return
        L1e:
            r5 = r21
            if (r25 != 0) goto L29
            int r0 = X.FUH.A00(r5, r8)
            r3 = 1
            if (r0 != 0) goto L2a
        L29:
            r3 = 0
        L2a:
            r4 = r19
            int r15 = r4.A00
            r0 = -1
            r11 = r20
            r14 = r24
            if (r15 == r0) goto L48
            r12 = r5
            r13 = r7
            r17 = r3
            X.F7F.A00(r11, r12, r13, r14, r15, r16, r17)
        L3c:
            if (r25 != 0) goto L71
            X.0sl r9 = X.C16930sl.A00
            r3 = r18
            r6 = r22
            A01(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L48:
            X.0wW r1 = X.AbstractC12220kQ.A01(r11, r5)
            java.lang.String r0 = "direct_requests_allow_swipe"
            X.0Ai r2 = X.AbstractC166987dD.A0f(r1, r0)
            X.AbstractC31180DnO.A1J(r2, r3)
            boolean r0 = X.AbstractC166987dD.A1b(r14)
            if (r0 == 0) goto L64
            java.lang.String r1 = r14.toString()
            java.lang.String r0 = "labels"
            r2.AAP(r0, r1)
        L64:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = "is_unread"
            r2.A7v(r0, r1)
            r2.Cht()
            goto L3c
        L71:
            java.lang.Object r0 = X.AbstractC001800i.A09(r8)
            java.lang.String r0 = (java.lang.String) r0
            long r0 = java.lang.Long.parseLong(r0)
            r2 = r26
            A04(r4, r5, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35250Fgj.A00(android.content.Context, X.E6x, X.0iw, com.instagram.common.session.UserSession, X.Etg, java.util.Collection, java.util.List, boolean, boolean):void");
    }

    public static final void A01(Context context, C32071E6x c32071E6x, UserSession userSession, AbstractC33630Etg abstractC33630Etg, String str, Collection collection, Collection collection2, int i) {
        Long A0j;
        if (!collection.isEmpty()) {
            A03(c32071E6x, new EE8(context, c32071E6x, userSession, abstractC33630Etg, C05F.A00, collection, i), userSession, str, collection, collection.size());
        }
        if (!collection2.isEmpty()) {
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                InterfaceC50518MRv interfaceC50518MRv = (InterfaceC50518MRv) it.next();
                String A07 = JRE.A07(interfaceC50518MRv.CCb());
                if (A07 != null && (A0j = AbstractC166997dE.A0j(A07)) != null) {
                    A04(c32071E6x, userSession, A0j.longValue(), interfaceC50518MRv.CVQ());
                }
            }
        }
    }

    public static final void A02(Context context, UserSession userSession, Integer num, Collection collection, List list, boolean z) {
        C14360o3.A0B(context, 0);
        AbstractC167017dG.A1Q(userSession, list);
        if (!collection.isEmpty()) {
            C2DS A002 = AbstractC28761aE.A00(userSession);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C81663kb A0M = AbstractC31175DnJ.A0M(A002, AbstractC166987dD.A1B(it));
                if (A0M != null) {
                    new C31605DuX(context, userSession).A03(A0M.BKb(), num, z);
                }
            }
        }
        if (AbstractC166987dD.A1b(list)) {
            KWi kWi = new KWi(context, userSession);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                kWi.A04((C3o9) it2.next(), false);
            }
        }
    }

    public static final void A03(C32071E6x c32071E6x, AnonymousClass935 anonymousClass935, UserSession userSession, String str, Collection collection, int i) {
        C25621Ms A0c;
        if (i == 1) {
            Object next = collection.iterator().next();
            C14360o3.A0B(next, 1);
            A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0L("direct_v2/threads/%s/%s/", next, "approve");
        } else {
            A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("direct_v2/threads/approve_multiple/");
            A0c.A9s("thread_ids", AbstractC31175DnJ.A0b(collection));
        }
        AbstractC31173DnH.A1N(A0c);
        int i2 = c32071E6x.A00;
        if (i2 != -1) {
            A0c.A9s("folder", String.valueOf(i2));
            if (i2 == 7) {
                String str2 = c32071E6x.A01;
                if (str2 != null) {
                    A0c.A9s(AbstractC111324zv.A00(865), str2);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        if (str != null) {
            A0c.A9s("filter", str);
        }
        AbstractC31175DnJ.A1K(A0c, anonymousClass935);
    }

    public static final void A04(C32071E6x c32071E6x, UserSession userSession, long j, boolean z) {
        C42221xC c42221xC;
        C6D2 c43597JQd;
        C41761wQ A0S = AbstractC31173DnH.A0S();
        C137766Ly c137766Ly = C137746Lw.A00(userSession, AbstractC43591JPw.A00(248)).A01;
        if (!z) {
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36313153919452981L);
            final Long valueOf = Long.valueOf(j);
            if (A06) {
                final int i = c32071E6x.A00;
                c42221xC = c137766Ly.A0A;
                c43597JQd = new C6D2() { // from class: X.LaS
                    @Override // X.C6D2
                    public final Object apply(Object obj) {
                        final Long l = valueOf;
                        final int i2 = i;
                        final K3Z k3z = (K3Z) obj;
                        C137766Ly c137766Ly2 = C137766Ly.A0L;
                        return C42221xC.A07(new InterfaceC1345866i() { // from class: X.Lbv
                            @Override // X.InterfaceC1345866i
                            public final void EpD(C1346766r c1346766r) {
                                Long l2 = l;
                                K3Z k3z2 = k3z;
                                int i3 = i2;
                                C137766Ly c137766Ly3 = C137766Ly.A0L;
                                long longValue = l2.longValue();
                                if (longValue != 0) {
                                    Integer valueOf2 = Integer.valueOf(i3);
                                    C35856FsW c35856FsW = new C35856FsW(c1346766r, 4);
                                    InterfaceExecutorC135866Co ASj = k3z2.mMailboxApiHandleMetaProvider.ASj(0);
                                    MailboxFutureImpl A0I = AbstractC43593JPy.A0I(ASj, c35856FsW);
                                    AbstractC25231BEo.A1C(ASj, new LUP(2, longValue, k3z2, valueOf2, A0I), A0I);
                                }
                            }
                        }, AbstractC137146It.A00("accept_message_request"));
                    }
                };
            } else {
                c42221xC = c137766Ly.A0B;
                c43597JQd = new C43597JQd(valueOf, 46);
            }
            C42221xC A0L = c42221xC.A0L(c43597JQd);
            C14360o3.A0A(A0L);
            A0S.A02(A0L, GKJ.A00);
        }
    }
}
