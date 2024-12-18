package com.instagram.bloks.extensions.plugins.bkactionzerogetheadersidentifier;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.bloks.extensions.plugins.bkactionzerogetheadersidentifier.BKBloksActionZeroGetHeadersIdentifierImpl$evaluate$1", f = "BKBloksActionZeroGetHeadersIdentifierImpl.kt", i = {}, l = {33, 35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class BKBloksActionZeroGetHeadersIdentifierImpl$evaluate$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BKBloksActionZeroGetHeadersIdentifierImpl$evaluate$1(String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new BKBloksActionZeroGetHeadersIdentifierImpl$evaluate$1(this.A02, this.A01, interfaceC23621Ds);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1JX r2 = X.C1JX.A02
            int r0 = r6.A00
            r5 = 2
            r4 = 1
            if (r0 == 0) goto Lc
            X.AbstractC09560e7.A00(r7)
        Lb:
            return r7
        Lc:
            X.AbstractC09560e7.A00(r7)
            java.lang.String r3 = r6.A02
            java.lang.String r0 = "DISPLAY"
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            X.C14360o3.A07(r0)
            boolean r0 = X.C14360o3.A0K(r3, r0)
            if (r0 == 0) goto L35
            java.lang.String r1 = r6.A01
            r6.A00 = r4
            X.OSa r0 = X.C3Q1.A00
            if (r0 == 0) goto L55
            com.instagram.zero.main.IgZeroMain r0 = com.instagram.zero.main.IgZeroMain.A09
            if (r0 == 0) goto L55
            java.lang.Object r7 = r0.A04(r1, r6)
        L32:
            if (r7 != r2) goto Lb
            return r2
        L35:
            java.lang.String r0 = "SUBMIT"
            java.lang.String r0 = r0.toLowerCase(r1)
            X.C14360o3.A07(r0)
            boolean r0 = X.C14360o3.A0K(r3, r0)
            if (r0 == 0) goto L57
            java.lang.String r1 = r6.A01
            r6.A00 = r5
            X.OSa r0 = X.C3Q1.A00
            if (r0 == 0) goto L55
            com.instagram.zero.main.IgZeroMain r0 = com.instagram.zero.main.IgZeroMain.A09
            if (r0 == 0) goto L55
            java.lang.Object r7 = r0.A03(r1, r6)
            goto L32
        L55:
            r7 = 0
            goto L32
        L57:
            java.lang.String r7 = ""
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bloks.extensions.plugins.bkactionzerogetheadersidentifier.BKBloksActionZeroGetHeadersIdentifierImpl$evaluate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BKBloksActionZeroGetHeadersIdentifierImpl$evaluate$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
