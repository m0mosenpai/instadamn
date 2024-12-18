package com.instagram.creation.capture.quickcapture.inspirationhub.network;

import X.AbstractC06950Ym;
import X.C121275eQ;
import X.C14360o3;
import X.C1E2;
import X.C1GJ;
import X.C206899Du;
import X.C24891Jo;
import X.C2AH;
import X.C38321qM;
import X.C75H;
import X.InterfaceC23621Ds;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes4.dex */
public final class InspirationHubNetworkDataSource {
    public final UserSession A00;
    public final C75H A01;

    public InspirationHubNetworkDataSource(UserSession userSession, Context context) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        this.A00 = userSession;
        this.A01 = new C75H(context, userSession);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r13, X.InterfaceC23621Ds r14) {
        /*
            r12 = this;
            r3 = 17
            boolean r0 = X.C9CY.A00(r14, r3)
            if (r0 == 0) goto L61
            r4 = r14
            X.9CY r4 = (X.C9CY) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r2 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L67
            java.lang.Object r6 = r4.A01
            X.0ps r6 = (X.C15370ps) r6
            X.AbstractC09560e7.A00(r2)
        L28:
            java.lang.Object r3 = r6.A00
            return r3
        L2b:
            X.AbstractC09560e7.A00(r2)
            r11 = 0
            java.lang.String[] r0 = new java.lang.String[]{r13}
            java.util.HashSet r10 = X.AbstractC16830sb.A05(r0)
            r9 = 0
            com.instagram.common.session.UserSession r6 = r12.A00
            X.3G5 r7 = X.C3G5.A0C
            X.1ET r5 = new X.1ET
            r5.<init>(r9)
            java.lang.String r8 = "auto_created_reels"
            X.1Hw r5 = X.C5N9.A00(r5, r6, r7, r8, r9, r10, r11)
            X.0ps r6 = new X.0ps
            r6.<init>()
            r0 = 4
            X.9G1 r2 = new X.9G1
            r2.<init>(r12, r6, r13, r0)
            r4.A01 = r6
            r4.A00 = r1
            r1 = 1370611006(0x51b1dd3e, float:9.549013E10)
            r0 = 3
            java.lang.Object r0 = r5.A01(r4, r2, r1, r0)
            if (r0 != r3) goto L28
            return r3
        L61:
            X.9CY r4 = new X.9CY
            r4.<init>(r12, r14, r3)
            goto L16
        L67:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubNetworkDataSource.A00(java.lang.String, X.1Ds):java.lang.Object");
    }

    public final Object A01(List list, InterfaceC23621Ds interfaceC23621Ds) {
        C75H c75h = this.A01;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(c75h.A00((C38321qM) it.next()));
        }
        C121275eQ A01 = c75h.A01(arrayList, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C24891Jo.A02;
        final C24891Jo c24891Jo = new C24891Jo(1, C1E2.A02(interfaceC23621Ds));
        c24891Jo.A0I();
        A01.A00 = new C2AH() { // from class: X.9gx
            @Override // X.C2AH
            public final void onFail(Exception exc) {
                C14360o3.A0B(exc, 0);
                AbstractC12120kG.A07("InspirationHubRepository", MSV.A00(1203), exc);
                InterfaceC24901Jp.this.resumeWith(new C194848jk(exc));
            }

            @Override // X.C2AH
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                C14360o3.A0B(obj, 0);
                InterfaceC24901Jp.this.resumeWith(new C3NX(obj));
            }
        };
        c24891Jo.CPA(new C206899Du(A01, 3));
        C1GJ.A06(A01, 1370611006, 3, true, false);
        return c24891Jo.A0E();
    }
}
