package X;

import android.app.Activity;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7YG, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7YG {
    public final UserSession A00;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r3 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.InterfaceC83703oF r6, final java.util.List r7, X.InterfaceC16660sJ r8, boolean r9) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            r0 = 1
            X.C14360o3.A0B(r7, r0)
            r0 = 0
            X.1wQ r4 = new X.1wQ
            r4.<init>(r0)
            boolean r0 = r6 instanceof X.C83693oE
            if (r0 == 0) goto L1b
            r3 = r6
            X.3oE r3 = (X.C83693oE) r3
            if (r3 != 0) goto L40
        L17:
            A00(r5, r6, r7, r8, r9)
            return
        L1b:
            boolean r0 = r6 instanceof X.C122145g6
            if (r0 == 0) goto L77
            com.instagram.common.session.UserSession r0 = r5.A00
            X.2DS r2 = X.AbstractC28761aE.A00(r0)
            com.instagram.model.direct.DirectThreadKey r1 = X.AbstractC140956Yx.A01(r6)
            X.2DU r2 = (X.C2DU) r2
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            X.3kb r0 = X.C2DU.A03(r2, r1)
            if (r0 == 0) goto L17
            java.lang.String r0 = r0.C7I()
            if (r0 == 0) goto L17
            X.3oE r3 = new X.3oE
            r3.<init>(r0)
        L40:
            com.instagram.common.session.UserSession r1 = r5.A00
            java.lang.String r0 = "IGDThreadCutoverHelper"
            X.6JX r0 = X.C6JW.A00(r1, r0)
            X.6JY r0 = r0.A00
            X.1xC r1 = r0.A00
            java.lang.String r2 = "get_msys_thread_key_from_direct_threadId"
            X.LaU r0 = new X.LaU
            r0.<init>()
            X.1xC r1 = r1.A0L(r0)
            X.5Fn r0 = X.AbstractC137146It.A00(r2)
            X.1xC r0 = r1.A0O(r0)
            X.1xC r1 = r0.A0G()
            if (r9 == 0) goto L74
            X.5Fn r0 = X.AbstractC142856cl.A01
        L67:
            X.1xC r0 = r1.A0O(r0)
            X.Lxs r3 = new X.Lxs
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r4.A02(r0, r3)
            return
        L74:
            X.5Fn r0 = X.AbstractC142856cl.A00
            goto L67
        L77:
            r0 = 872(0x368, float:1.222E-42)
            java.lang.String r1 = X.MSV.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7YG.A02(X.3oF, java.util.List, X.0sJ, boolean):void");
    }

    public final void A03(MsysThreadId msysThreadId, InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(msysThreadId, 0);
        UserSession userSession = this.A00;
        C50367MLu c50367MLu = new C50367MLu(interfaceC16660sJ, 3);
        C14360o3.A0B(userSession, 0);
        C131225wA.A01.A02(new C50363MLp(36, c50367MLu, msysThreadId), userSession);
    }

    public static final void A00(C7YG c7yg, InterfaceC83703oF interfaceC83703oF, List list, InterfaceC16660sJ interfaceC16660sJ, boolean z) {
        C5Fn c5Fn;
        final ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((PendingRecipient) it.next()).getId());
        }
        UserSession userSession = c7yg.A00;
        final boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36313042249909874L);
        C6JY c6jy = C6JW.A00(userSession, "IGDThreadCutoverHelper").A00;
        C42221xC A0G = C42221xC.A01(new YO2() { // from class: X.FyY
            @Override // X.YO2
            public final Object apply(Object obj, Object obj2) {
                return Pair.create(obj, obj2);
            }
        }, c6jy.A00, c6jy.A01).A0L(new C6D2() { // from class: X.LaV
            @Override // X.C6D2
            public final Object apply(Object obj) {
                String A00 = AbstractC111324zv.A00(962);
                final List list2 = arrayList;
                final boolean z2 = A06;
                Pair pair = (Pair) obj;
                final C1345666g c1345666g = (C1345666g) pair.first;
                final K3Z k3z = (K3Z) pair.second;
                return C42221xC.A07(new InterfaceC1345866i() { // from class: X.Lc6
                    @Override // X.InterfaceC1345866i
                    public final void EpD(C1346766r c1346766r) {
                        C1345666g.this.A01(new LUO(1, c1346766r, list2, k3z, z2));
                    }
                }, AbstractC137146It.A00(A00));
            }
        }).A0O(AbstractC137146It.A00("get_should_use_secure_thread")).A0G();
        if (z) {
            c5Fn = AbstractC142856cl.A01;
        } else {
            c5Fn = AbstractC142856cl.A00;
        }
        C42221xC A0O = A0G.A0O(c5Fn);
        C41761wQ c41761wQ = new C41761wQ(null);
        c41761wQ.A02(A0O, new C36794GJt(c41761wQ, interfaceC83703oF, list, interfaceC16660sJ));
    }

    public final void A01(Activity activity, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC83703oF interfaceC83703oF, List list) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(interfaceC11380iw, 4);
        if (activity != null && list != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new PendingRecipient((User) it.next()));
            }
            A02(interfaceC83703oF, arrayList, new MIV(this, interfaceC11380iw, activity, userSession, abstractC59962oe, "cutover_auto_redirect", 2), true);
        }
    }

    public C7YG(UserSession userSession) {
        this.A00 = userSession;
    }
}
