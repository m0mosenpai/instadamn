package com.instagram.settings2.core.viewmodel;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C26082BgB;
import X.C47979LIr;
import X.C51759Mti;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.settings2.core.session.SettingsSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$2", f = "UiState.kt", i = {0, 1}, l = {74, 99}, m = "invokeSuspend", n = {"$this$coroutineScope", "footers"}, s = {"L$0", "L$0"})
/* loaded from: classes9.dex */
public final class UiStateKt$toUiState$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C51759Mti A02;
    public final /* synthetic */ C26082BgB A03;
    public final /* synthetic */ SettingsSession A04;
    public final /* synthetic */ C47979LIr A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiStateKt$toUiState$2(C51759Mti c51759Mti, C26082BgB c26082BgB, SettingsSession settingsSession, C47979LIr c47979LIr, List list, List list2, List list3, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A07 = list;
        this.A06 = list2;
        this.A08 = list3;
        this.A03 = c26082BgB;
        this.A02 = c51759Mti;
        this.A05 = c47979LIr;
        this.A04 = settingsSession;
        this.A09 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        List list = this.A07;
        List list2 = this.A06;
        List list3 = this.A08;
        C26082BgB c26082BgB = this.A03;
        UiStateKt$toUiState$2 uiStateKt$toUiState$2 = new UiStateKt$toUiState$2(this.A02, c26082BgB, this.A04, this.A05, list, list2, list3, interfaceC23621Ds, this.A09);
        uiStateKt$toUiState$2.A01 = obj;
        return uiStateKt$toUiState$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0084 A[LOOP:0: B:17:0x007e->B:19:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1JX r6 = X.C1JX.A02
            int r0 = r14.A00
            r4 = 0
            r5 = 2
            r9 = 1
            if (r0 == 0) goto L26
            if (r0 == r9) goto L59
            java.lang.Object r4 = r14.A01
            java.util.List r4 = (java.util.List) r4
            X.AbstractC09560e7.A00(r15)
        L12:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.List r3 = X.AbstractC001800i.A0X(r15)
            X.BgB r0 = r14.A03
            java.lang.Object r2 = r0.A03
            X.Xce r2 = (X.EnumC72392Xce) r2
            X.Mti r1 = r14.A02
            X.GzT r0 = new X.GzT
            r0.<init>(r1, r2, r3, r4)
            return r0
        L26:
            X.AbstractC09560e7.A00(r15)
            java.lang.Object r3 = r14.A01
            X.19L r3 = (X.C19L) r3
            java.util.List r0 = r14.A07
            if (r0 == 0) goto L63
            java.util.ArrayList r8 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r7 = r0.iterator()
        L39:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r2 = r7.next()
            r1 = 23
            X.PYs r0 = new X.PYs
            r0.<init>(r2, r4, r1)
            X.MSY.A1P(r8, r0, r3)
            goto L39
        L4e:
            r14.A01 = r3
            r14.A00 = r9
            java.lang.Object r15 = X.AbstractC918549n.A00(r8, r14)
            if (r15 != r6) goto L60
            return r6
        L59:
            java.lang.Object r3 = r14.A01
            X.19L r3 = (X.C19L) r3
            X.AbstractC09560e7.A00(r15)
        L60:
            r4 = r15
            java.util.List r4 = (java.util.List) r4
        L63:
            java.util.List r0 = r14.A06
            if (r0 != 0) goto L70
            java.util.List r0 = r14.A08
            if (r0 != 0) goto L70
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L70:
            X.LIr r9 = r14.A05
            com.instagram.settings2.core.session.SettingsSession r10 = r14.A04
            boolean r13 = r14.A09
            java.util.ArrayList r2 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L7e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r8 = r1.next()
            r11 = 0
            r12 = 18
            X.MSm r7 = new X.MSm
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.MSY.A1P(r2, r7, r3)
            goto L7e
        L94:
            r14.A01 = r4
            r14.A00 = r5
            java.lang.Object r15 = X.AbstractC918549n.A00(r2, r14)
            if (r15 != r6) goto L12
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UiStateKt$toUiState$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
