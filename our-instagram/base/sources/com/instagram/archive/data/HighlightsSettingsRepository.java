package com.instagram.archive.data;

import X.AbstractC156256zv;
import X.AbstractC208910l;
import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C0UO;
import X.C156226zr;
import X.C156246zu;
import X.C17060sy;
import X.C19L;
import X.C206639Cu;
import X.C207129Er;
import X.C4A7;
import X.C4A8;
import X.C9BA;
import X.DHP;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;

/* loaded from: classes3.dex */
public final class HighlightsSettingsRepository extends C4A7 {
    public final C156226zr A00;
    public final UserSession A01;
    public final C05A A02;
    public final C0UO A03;

    public HighlightsSettingsRepository(C156226zr c156226zr, UserSession userSession) {
        super("HighlightsSettings", C4A8.A01(1600862899, 3));
        this.A01 = userSession;
        this.A00 = c156226zr;
        C008002u c008002u = new C008002u(new C156246zu(new C9BA(C17060sy.A01.A01(userSession).A2P(), false, 1)));
        this.A02 = c008002u;
        this.A03 = AbstractC208910l.A02(c008002u);
        C19L c19l = super.A01;
        C206639Cu c206639Cu = new C206639Cu(this, null, 6);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206639Cu, c19l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r4.AIi(r4.getValue(), new X.C156246zu(r10.invoke(java.lang.Boolean.valueOf(r11)))) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r0 = r7.A02.getValue() instanceof X.C156246zu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (r4.AIi(r4.getValue(), new X.C45557KEw(r10.invoke(java.lang.Boolean.valueOf(r12)), new java.lang.Error("cannot mutate settings"))) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r13 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r3.AIi(r3.getValue(), new X.C45558KEx(r10.invoke(java.lang.Boolean.valueOf(r11)))) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        r4.A01 = r7;
        r4.A02 = r10;
        r4.A04 = r11;
        r4.A05 = r12;
        r4.A00 = 1;
        r1 = r9.invoke(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
    
        if (r1 != r6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b3, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        if (r3.AIi(r3.getValue(), new X.C156246zu(r10.invoke(java.lang.Boolean.valueOf(r11)))) == false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.archive.data.HighlightsSettingsRepository r7, X.InterfaceC23621Ds r8, X.InterfaceC16660sJ r9, X.InterfaceC16660sJ r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            r5 = 1
            boolean r0 = r8 instanceof X.C206479Ce
            if (r0 == 0) goto Lce
            r4 = r8
            X.9Ce r4 = (X.C206479Ce) r4
            int r0 = r4.A06
            if (r0 != r5) goto Lce
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lce
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A03
            X.1JX r6 = X.C1JX.A02
            int r0 = r4.A00
            if (r0 == 0) goto L79
            if (r0 != r5) goto Ld5
            boolean r12 = r4.A05
            boolean r11 = r4.A04
            java.lang.Object r10 = r4.A02
            X.0sJ r10 = (X.InterfaceC16660sJ) r10
            java.lang.Object r7 = r4.A01
            com.instagram.archive.data.HighlightsSettingsRepository r7 = (com.instagram.archive.data.HighlightsSettingsRepository) r7
            X.AbstractC09560e7.A00(r1)
        L30:
            boolean r0 = r1 instanceof X.C3NX
            X.05A r4 = r7.A02
            if (r0 == 0) goto L5a
        L36:
            java.lang.Object r2 = r4.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.Object r1 = r10.invoke(r0)
            X.6zu r0 = new X.6zu
            r0.<init>(r1)
            boolean r0 = r4.AIi(r2, r0)
            if (r0 == 0) goto L36
        L4d:
            X.05A r0 = r7.A02
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C156246zu
        L55:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L5a:
            java.lang.Object r3 = r4.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            java.lang.Object r2 = r10.invoke(r0)
            java.lang.String r0 = "cannot mutate settings"
            java.lang.Error r1 = new java.lang.Error
            r1.<init>(r0)
            X.KEw r0 = new X.KEw
            r0.<init>(r2, r1)
            boolean r0 = r4.AIi(r3, r0)
            if (r0 == 0) goto L5a
            goto L4d
        L79:
            X.AbstractC09560e7.A00(r1)
            if (r14 != 0) goto L80
            if (r12 == r11) goto Lcc
        L80:
            X.05A r3 = r7.A02
            java.lang.Object r0 = r3.getValue()
            boolean r0 = r0 instanceof X.C45558KEx
            if (r0 != 0) goto Lcc
            if (r13 != 0) goto Lb4
        L8c:
            java.lang.Object r2 = r3.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.Object r1 = r10.invoke(r0)
            X.KEx r0 = new X.KEx
            r0.<init>(r1)
            boolean r0 = r3.AIi(r2, r0)
            if (r0 == 0) goto L8c
            r4.A01 = r7
            r4.A02 = r10
            r4.A04 = r11
            r4.A05 = r12
            r4.A00 = r5
            java.lang.Object r1 = r9.invoke(r4)
            if (r1 != r6) goto L30
            return r6
        Lb4:
            java.lang.Object r2 = r3.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.Object r1 = r10.invoke(r0)
            X.6zu r0 = new X.6zu
            r0.<init>(r1)
            boolean r0 = r3.AIi(r2, r0)
            if (r0 == 0) goto Lb4
            goto L4d
        Lcc:
            r0 = 0
            goto L55
        Lce:
            X.9Ce r4 = new X.9Ce
            r4.<init>(r7, r8, r5)
            goto L17
        Ld5:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.data.HighlightsSettingsRepository.A00(com.instagram.archive.data.HighlightsSettingsRepository, X.1Ds, X.0sJ, X.0sJ, boolean, boolean, boolean, boolean):java.lang.Object");
    }

    public final Object A02(InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        return A00(this, interfaceC23621Ds, new HighlightsSettingsRepository$setMyWeekEnabled$2(this, null, z), new DHP(4, this, z), z, A01().A02, false, false);
    }

    public final Object A03(InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2, boolean z3) {
        return A00(this, interfaceC23621Ds, new HighlightsSettingsRepository$setCardsEnabled$2(this, null, z), new C207129Er(0, this, z), z, A01().A01, z2, z3);
    }

    public final C9BA A01() {
        return (C9BA) ((AbstractC156256zv) this.A03.getValue()).A00;
    }
}
