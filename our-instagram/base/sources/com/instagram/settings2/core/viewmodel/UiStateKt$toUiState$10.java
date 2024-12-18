package com.instagram.settings2.core.viewmodel;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C38688GzT;
import X.C51759Mti;
import X.C51923Mx5;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.settings2.core.session.SettingsSession;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$10", f = "UiState.kt", i = {}, l = {324}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class UiStateKt$toUiState$10 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ C51759Mti A02;
    public final /* synthetic */ C51759Mti A03;
    public final /* synthetic */ C38688GzT A04;
    public final /* synthetic */ C51923Mx5 A05;
    public final /* synthetic */ SettingsSession A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ List A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiStateKt$toUiState$10(C51759Mti c51759Mti, C51759Mti c51759Mti2, C38688GzT c38688GzT, C51923Mx5 c51923Mx5, SettingsSession settingsSession, String str, String str2, String str3, List list, List list2, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A0B = list;
        this.A05 = c51923Mx5;
        this.A0C = z;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A0A = list2;
        this.A04 = c38688GzT;
        this.A03 = c51759Mti;
        this.A02 = c51759Mti2;
        this.A06 = settingsSession;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        List list = this.A0B;
        C51923Mx5 c51923Mx5 = this.A05;
        boolean z = this.A0C;
        String str = this.A07;
        String str2 = this.A08;
        String str3 = this.A09;
        List list2 = this.A0A;
        UiStateKt$toUiState$10 uiStateKt$toUiState$10 = new UiStateKt$toUiState$10(this.A03, this.A02, this.A04, c51923Mx5, this.A06, str, str2, str3, list, list2, interfaceC23621Ds, z);
        uiStateKt$toUiState$10.A01 = obj;
        return uiStateKt$toUiState$10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
    
        if (r5 == null) goto L12;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r7 = r11
            X.1JX r9 = X.C1JX.A02
            int r0 = r10.A00
            r8 = 1
            if (r0 == 0) goto L36
            X.AbstractC09560e7.A00(r11)
        Lb:
            java.util.List r7 = (java.util.List) r7
            X.Mx5 r0 = r10.A05
            X.Psv r4 = r0.A05
            boolean r0 = r10.A0C
            java.lang.String r5 = r10.A07
            java.lang.String r1 = r10.A08
            if (r0 == 0) goto L23
            if (r5 != 0) goto L23
            java.lang.String r0 = "nido_pending_setting_change_request2"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L26
        L23:
            r8 = 0
            if (r5 != 0) goto L28
        L26:
            java.lang.String r5 = r10.A09
        L28:
            java.util.List r6 = r10.A0A
            X.GzT r3 = r10.A04
            X.Mti r1 = r10.A03
            X.Mti r2 = r10.A02
            X.Bit r0 = new X.Bit
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L36:
            X.AbstractC09560e7.A00(r11)
            java.lang.Object r7 = r10.A01
            X.19L r7 = (X.C19L) r7
            java.util.List r0 = r10.A0B
            com.instagram.settings2.core.session.SettingsSession r6 = r10.A06
            java.util.ArrayList r5 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r4 = r0.iterator()
        L49:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r3 = r4.next()
            r2 = 0
            r1 = 49
            X.PZL r0 = new X.PZL
            r0.<init>(r3, r6, r2, r1)
            X.MSY.A1P(r5, r0, r7)
            goto L49
        L5f:
            r10.A00 = r8
            java.lang.Object r7 = X.AbstractC918549n.A00(r5, r10)
            if (r7 != r9) goto Lb
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.viewmodel.UiStateKt$toUiState$10.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UiStateKt$toUiState$10) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
