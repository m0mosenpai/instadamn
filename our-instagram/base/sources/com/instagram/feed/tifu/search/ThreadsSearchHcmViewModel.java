package com.instagram.feed.tifu.search;

import X.AbstractC111324zv;
import X.AbstractC123875j1;
import X.AbstractC14490oL;
import X.C05A;
import X.C0UO;
import X.C132115xo;
import X.C132125xp;
import X.C132335yC;
import X.C14360o3;
import X.C35265Fh0;
import X.C44226JgW;
import X.C5Hc;
import X.C69727VuM;
import X.C9C6;
import X.InterfaceC11380iw;
import X.InterfaceC99474dM;
import X.InterfaceC99494dO;
import X.JQ0;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.feed.tifu.api.TifuApiHelper;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class ThreadsSearchHcmViewModel {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C69727VuM A03;
    public final C44226JgW A04;
    public final C132125xp A05;
    public final C132115xo A06;
    public final Integer A07;
    public final String A08;
    public final C05A A09;
    public final C0UO A0A;
    public final TifuApiHelper A0B;

    public static C5Hc A00(ThreadsSearchHcmViewModel threadsSearchHcmViewModel, Object obj) {
        C14360o3.A0B(obj, 0);
        return ((C132335yC) threadsSearchHcmViewModel.A0A.getValue()).A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0098, code lost:
    
        if (new X.C4dV(r4).A05 != r3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ThreadsSearchHcmViewModel(androidx.fragment.app.FragmentActivity r29, X.InterfaceC11380iw r30, com.instagram.common.session.UserSession r31, X.C69727VuM r32) {
        /*
            r28 = this;
            r8 = r30
            boolean r27 = X.AbstractC167007dF.A1V(r8)
            r1 = r28
            r1.<init>()
            r9 = r31
            r1.A02 = r9
            r1.A01 = r8
            r7 = r29
            r1.A00 = r7
            r4 = r32
            r1.A03 = r4
            java.lang.String r6 = r4.A05
            r1.A08 = r6
            r0 = 37
            X.J7S r2 = new X.J7S
            r2.<init>(r9, r0)
            java.lang.Class<com.instagram.feed.tifu.api.TifuApiHelper> r0 = com.instagram.feed.tifu.api.TifuApiHelper.class
            java.lang.Object r0 = r9.A01(r0, r2)
            com.instagram.feed.tifu.api.TifuApiHelper r0 = (com.instagram.feed.tifu.api.TifuApiHelper) r0
            r1.A0B = r0
            X.Vsn r0 = r4.A00()
            X.4dT r2 = r0.A03
            if (r2 == 0) goto Lc0
            X.4dV r0 = new X.4dV
            r0.<init>(r2)
            java.lang.Integer r0 = r0.A04
        L3d:
            r1.A07 = r0
            boolean r2 = X.AbstractC14490oL.A0A(r7)
            X.JgW r5 = new X.JgW
            r5.<init>(r8, r9, r2)
            r1.A04 = r5
            r10 = 0
            X.5xo r2 = new X.5xo
            r2.<init>(r5, r10, r0, r6)
            r1.A06 = r2
            java.util.List r3 = r4.A08
            X.5xp r2 = new X.5xp
            r2.<init>(r5, r0, r6, r3)
            r1.A05 = r2
            X.0do r2 = r4.A0A
            java.lang.String r19 = X.AbstractC25225BEi.A15(r2)
            java.util.List r12 = r4.A08
            X.Vsn r2 = r4.A00()
            X.4dT r3 = r2.A03
            if (r3 == 0) goto Lbe
            X.4dV r2 = new X.4dV
            r2.<init>(r3)
            java.lang.Integer r2 = r2.A05
        L72:
            java.lang.Integer r3 = X.C05F.A00
            boolean r13 = X.AbstractC167007dF.A1X(r2, r3)
            r14 = 0
            r11 = r10
            r15 = r14
            r16 = r14
            r17 = r14
            r18 = r14
            X.5Hb r21 = X.AbstractC132145xr.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.5HZ r22 = X.C5HZ.A01
            X.Vsn r2 = r4.A00()
            X.4dT r4 = r2.A03
            if (r4 == 0) goto L9a
            X.4dV r2 = new X.4dV
            r2.<init>(r4)
            java.lang.Integer r2 = r2.A05
            r25 = 1
            if (r2 == r3) goto L9c
        L9a:
            r25 = 0
        L9c:
            r2 = 1819(0x71b, float:2.549E-42)
            java.lang.String r20 = X.AbstractC111324zv.A00(r2)
            X.5yC r16 = new X.5yC
            r17 = r10
            r23 = r14
            r24 = r14
            r26 = r14
            r18 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.02u r0 = X.AbstractC25225BEi.A1H(r16)
            r1.A09 = r0
            X.059 r0 = X.AbstractC208910l.A02(r0)
            r1.A0A = r0
            return
        Lbe:
            r2 = r10
            goto L72
        Lc0:
            java.lang.Integer r0 = X.C05F.A00
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel.<init>(androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, X.VuM):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r6, X.InterfaceC23621Ds r7, boolean r8) {
        /*
            r5 = this;
            r3 = 10
            boolean r0 = X.PX0.A01(r7, r3)
            if (r0 == 0) goto L52
            r4 = r7
            X.PX0 r4 = (X.PX0) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 != r2) goto L58
            boolean r8 = r4.A05
            java.lang.Object r6 = r4.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r0 = r4.A01
            com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel r0 = (com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel) r0
            X.AbstractC09560e7.A00(r1)
        L2e:
            com.instagram.common.session.UserSession r0 = r0.A02
            X.AbstractC41286IPb.A01(r0, r6, r8)
            X.0eB r0 = X.C0eB.A00
            return r0
        L36:
            X.AbstractC09560e7.A00(r1)
            com.instagram.feed.tifu.api.TifuApiHelper r1 = r5.A0B
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C38321qM.A0i
            java.lang.String r0 = X.C38801rC.A06(r6)
            r4.A01 = r5
            r4.A02 = r6
            r4.A05 = r8
            r4.A00 = r2
            java.lang.Object r0 = r1.A02(r0, r4, r8)
            if (r0 != r3) goto L50
            return r3
        L50:
            r0 = r5
            goto L2e
        L52:
            X.PX0 r4 = new X.PX0
            r4.<init>(r5, r7, r3)
            goto L16
        L58:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel.A01(java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    public final void A02(Context context, String str, boolean z) {
        InterfaceC99474dM interfaceC99474dM;
        Object obj;
        InterfaceC99494dO interfaceC99494dO;
        C5Hc A00 = A00(this, context);
        C35265Fh0 c35265Fh0 = C35265Fh0.A00;
        UserSession userSession = this.A02;
        FragmentActivity fragmentActivity = this.A00;
        Iterator it = A00.iterator();
        while (true) {
            interfaceC99474dM = null;
            if (it.hasNext()) {
                obj = it.next();
                if (C14360o3.A0K(((C9C6) obj).A03, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C9C6 c9c6 = (C9C6) obj;
        if (c9c6 != null && (interfaceC99494dO = (InterfaceC99494dO) c9c6.A01) != null) {
            interfaceC99474dM = interfaceC99494dO.BQg();
        }
        c35265Fh0.A07(fragmentActivity, interfaceC99474dM, userSession, AbstractC111324zv.A00(4874), "tischu");
        int i = 0;
        Iterator it2 = A00.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (JQ0.A1a(str, it2)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        C44226JgW c44226JgW = this.A04;
        int size = A00.size();
        boolean A0A = AbstractC14490oL.A0A(context);
        String A002 = AbstractC123875j1.A00(this.A07);
        String str2 = this.A08;
        c44226JgW.CkZ(str, null, null, A002, str2, i, size, A0A);
        if (!z) {
            c44226JgW.A08(str, null, null, A002, str2, i, A00.size());
        }
    }
}
