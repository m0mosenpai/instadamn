package com.instagram.settings2.core.viewmodel;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C38688GzT;
import X.C51759Mti;
import X.C51922Mx4;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$5", f = "UiState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class UiStateKt$toUiState$5 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ C51759Mti A00;
    public final /* synthetic */ C51759Mti A01;
    public final /* synthetic */ C38688GzT A02;
    public final /* synthetic */ C51922Mx4 A03;
    public final /* synthetic */ Boolean A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiStateKt$toUiState$5(C51759Mti c51759Mti, C51759Mti c51759Mti2, C38688GzT c38688GzT, C51922Mx4 c51922Mx4, Boolean bool, String str, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A03 = c51922Mx4;
        this.A07 = z;
        this.A04 = bool;
        this.A05 = str;
        this.A08 = z2;
        this.A06 = list;
        this.A02 = c38688GzT;
        this.A01 = c51759Mti;
        this.A00 = c51759Mti2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C51922Mx4 c51922Mx4 = this.A03;
        boolean z = this.A07;
        Boolean bool = this.A04;
        String str = this.A05;
        boolean z2 = this.A08;
        List list = this.A06;
        return new UiStateKt$toUiState$5(this.A01, this.A00, this.A02, c51922Mx4, bool, str, list, interfaceC23621Ds, z, z2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UiStateKt$toUiState$5) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (X.C14360o3.A0K(r1, "nido_pending_setting_change_request2") != false) goto L7;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.AbstractC09560e7.A00(r10)
            X.Mx4 r0 = r9.A03
            X.Psu r4 = r0.A03
            boolean r0 = r9.A07
            java.lang.Boolean r2 = r9.A04
            java.lang.String r1 = r9.A05
            if (r0 == 0) goto L1a
            if (r2 != 0) goto L1a
            java.lang.String r0 = "nido_pending_setting_change_request2"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            r7 = 1
            if (r0 == 0) goto L30
        L1a:
            r7 = 0
            if (r2 == 0) goto L30
            boolean r8 = r2.booleanValue()
        L21:
            r6 = 1
            java.util.List r5 = r9.A06
            X.GzT r3 = r9.A02
            X.Mti r1 = r9.A01
            X.Mti r2 = r9.A00
            X.Bis r0 = new X.Bis
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L30:
            boolean r8 = r9.A08
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
