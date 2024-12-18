package com.instagram.quicksnap.data.repository;

import X.AbstractC001800i;
import X.AbstractC208910l;
import X.AbstractC76433bn;
import X.AnonymousClass194;
import X.AnonymousClass197;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C12L;
import X.C14360o3;
import X.C16930sl;
import X.C17060sy;
import X.C191108d8;
import X.C191138dB;
import X.C191148dC;
import X.C26086BgF;
import X.C4A7;
import X.InterfaceC16660sJ;
import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.api.QuickSnapApi;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class QuickSnapRepository extends C4A7 {
    public long A00;
    public boolean A01;
    public final C191138dB A02;
    public final QuickSnapApi A03;
    public final C191108d8 A04;
    public final User A05;
    public final Map A06;
    public final C05A A07;
    public final C05A A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final C0UO A0B;
    public final C05A A0C;

    public QuickSnapRepository(UserSession userSession, C191138dB c191138dB, QuickSnapApi quickSnapApi, C191108d8 c191108d8) {
        super("QuickSnapRepository", AnonymousClass194.A02(new AnonymousClass197(null).plus(C12L.A00.CPG(307878321, 3))));
        this.A03 = quickSnapApi;
        this.A04 = c191108d8;
        this.A02 = c191138dB;
        C16930sl c16930sl = C16930sl.A00;
        C008002u c008002u = new C008002u(new C191148dC(c16930sl, c16930sl));
        this.A08 = c008002u;
        this.A0B = AbstractC208910l.A02(c008002u);
        C008002u A00 = C10E.A00(null);
        this.A07 = A00;
        this.A09 = AbstractC208910l.A02(A00);
        this.A05 = C17060sy.A01.A01(userSession);
        C008002u A002 = C10E.A00(c16930sl);
        this.A0C = A002;
        this.A0A = A002;
        this.A06 = new LinkedHashMap();
    }

    public final void A05(String str) {
        Object value;
        C191148dC c191148dC;
        ArrayList arrayList;
        C14360o3.A0B(str, 0);
        C05A c05a = this.A08;
        do {
            value = c05a.getValue();
            c191148dC = (C191148dC) value;
            List list = c191148dC.A01;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (!C14360o3.A0K(AbstractC76433bn.A00((User) ((C26086BgF) obj).A01), str)) {
                    arrayList.add(obj);
                }
            }
        } while (!c05a.AIi(value, new C191148dC(arrayList, c191148dC.A00)));
    }

    public static final void A00(QuickSnapRepository quickSnapRepository, InterfaceC16660sJ interfaceC16660sJ) {
        Object value;
        ArrayList A0U;
        C05A c05a = quickSnapRepository.A0C;
        do {
            value = c05a.getValue();
            A0U = AbstractC001800i.A0U((Collection) value);
            interfaceC16660sJ.invoke(A0U);
        } while (!c05a.AIi(value, A0U));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r4 = 23
            boolean r0 = X.PXA.A03(r7, r4)
            if (r0 == 0) goto L86
            r3 = r7
            X.PXA r3 = (X.PXA) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r4 = r3.A03
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L73
            if (r0 != r1) goto L8c
            java.lang.Object r6 = r3.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r3.A01
            com.instagram.quicksnap.data.repository.QuickSnapRepository r3 = (com.instagram.quicksnap.data.repository.QuickSnapRepository) r3
            X.AbstractC09560e7.A00(r4)
        L2c:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r2 = r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L4f
            X.05A r0 = r3.A0C
            java.lang.Object r1 = r0.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L50
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L50
        L4a:
            X.05A r0 = r3.A07
            r0.Egh(r6)
        L4f:
            return r2
        L50:
            java.util.Iterator r1 = r1.iterator()
        L54:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r1.next()
            X.ODx r0 = (X.ODx) r0
            java.lang.String r0 = r0.A04
            boolean r0 = X.C14360o3.A0K(r0, r6)
            if (r0 == 0) goto L54
            r1 = 47
            X.MLn r0 = new X.MLn
            r0.<init>(r6, r1)
            A00(r3, r0)
            return r2
        L73:
            X.AbstractC09560e7.A00(r4)
            com.instagram.quicksnap.data.api.QuickSnapApi r0 = r5.A03
            r3.A01 = r5
            r3.A02 = r6
            r3.A00 = r1
            java.lang.Object r4 = r0.A01(r6, r3)
            if (r4 == r2) goto L4f
            r3 = r5
            goto L2c
        L86:
            X.PXA r3 = new X.PXA
            r3.<init>(r5, r7, r4)
            goto L16
        L8c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.repository.QuickSnapRepository.A01(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[LOOP:0: B:19:0x003f->B:21:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.util.List r8, X.InterfaceC23621Ds r9) {
        /*
            r7 = this;
            r3 = 8
            boolean r0 = X.PXD.A03(r9, r3)
            if (r0 == 0) goto L6b
            r6 = r9
            X.PXD r6 = (X.PXD) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A01
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L49
            if (r0 == r3) goto L5d
            if (r0 != r4) goto L73
            X.AbstractC09560e7.A00(r1)
        L27:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L3b
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L3b
        L36:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L3b:
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L36
            r1.next()
            goto L3f
        L49:
            X.AbstractC09560e7.A00(r1)
            r2 = 0
            r1 = 46
            X.MBt r0 = new X.MBt
            r0.<init>(r7, r8, r2, r1)
            r6.A00 = r3
            java.lang.Object r1 = X.AnonymousClass194.A00(r6, r0)
            if (r1 != r5) goto L60
            return r5
        L5d:
            X.AbstractC09560e7.A00(r1)
        L60:
            java.util.Collection r1 = (java.util.Collection) r1
            r6.A00 = r4
            java.lang.Object r1 = X.AbstractC918549n.A00(r1, r6)
            if (r1 != r5) goto L27
            return r5
        L6b:
            r0 = 42
            X.PXD r6 = new X.PXD
            r6.<init>(r7, r9, r3, r0)
            goto L16
        L73:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.repository.QuickSnapRepository.A02(java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.util.List r6, X.InterfaceC23621Ds r7) {
        /*
            r5 = this;
            r3 = 38
            boolean r0 = X.C57145PWx.A02(r7, r3)
            if (r0 == 0) goto L54
            r4 = r7
            X.PWx r4 = (X.C57145PWx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L40
            if (r0 != r1) goto L5a
            java.lang.Object r2 = r4.A01
            com.instagram.quicksnap.data.repository.QuickSnapRepository r2 = (com.instagram.quicksnap.data.repository.QuickSnapRepository) r2
            X.AbstractC09560e7.A00(r3)
        L28:
            r0 = 0
            r2.A01 = r0
            if (r3 == 0) goto L3f
            long r0 = java.lang.System.currentTimeMillis()
            r2.A00 = r0
            X.05A r1 = r2.A08
        L35:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.AIi(r0, r3)
            if (r0 == 0) goto L35
        L3f:
            return r3
        L40:
            X.AbstractC09560e7.A00(r3)
            r5.A01 = r1
            com.instagram.quicksnap.data.api.QuickSnapApi r0 = r5.A03
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r3 = r0.A04(r6, r4)
            if (r3 != r2) goto L52
            return r2
        L52:
            r2 = r5
            goto L28
        L54:
            X.PWx r4 = new X.PWx
            r4.<init>(r5, r7, r3)
            goto L16
        L5a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.repository.QuickSnapRepository.A03(java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.InterfaceC23621Ds r11, boolean r12) {
        /*
            r10 = this;
            r3 = 44
            boolean r0 = X.C9CY.A00(r11, r3)
            if (r0 == 0) goto L7a
            r6 = r11
            X.9CY r6 = (X.C9CY) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r3 = r6.A02
            X.1JX r7 = X.C1JX.A02
            int r0 = r6.A00
            r5 = 1
            if (r0 == 0) goto L4a
            if (r0 != r5) goto L80
            java.lang.Object r2 = r6.A01
            com.instagram.quicksnap.data.repository.QuickSnapRepository r2 = (com.instagram.quicksnap.data.repository.QuickSnapRepository) r2
            X.AbstractC09560e7.A00(r3)
        L28:
            r0 = 0
            r2.A01 = r0
            if (r3 == 0) goto L42
            long r0 = java.lang.System.currentTimeMillis()
            r2.A00 = r0
        L33:
            X.05A r1 = r2.A08
        L35:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.AIi(r0, r3)
            if (r0 == 0) goto L35
        L3f:
            X.0eB r7 = X.C0eB.A00
        L41:
            return r7
        L42:
            X.0sl r0 = X.C16930sl.A00
            X.8dC r3 = new X.8dC
            r3.<init>(r0, r0)
            goto L33
        L4a:
            X.AbstractC09560e7.A00(r3)
            long r8 = java.lang.System.currentTimeMillis()
            long r2 = r10.A00
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 30
            long r0 = r4.toMillis(r0)
            long r2 = r2 + r0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L62
            r1 = 1
        L62:
            boolean r0 = r10.A01
            if (r0 != 0) goto L3f
            if (r12 != 0) goto L6a
            if (r1 == 0) goto L3f
        L6a:
            r10.A01 = r5
            com.instagram.quicksnap.data.api.QuickSnapApi r0 = r10.A03
            r6.A01 = r10
            r6.A00 = r5
            java.lang.Object r3 = r0.A06(r6)
            if (r3 == r7) goto L41
            r2 = r10
            goto L28
        L7a:
            X.9CY r6 = new X.9CY
            r6.<init>(r10, r11, r3)
            goto L16
        L80:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.repository.QuickSnapRepository.A04(X.1Ds, boolean):java.lang.Object");
    }
}
