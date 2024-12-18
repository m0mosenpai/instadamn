package com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C6FQ;
import X.InterfaceC103384lE;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1", f = "BKBloksActionZeroTriggerHeadersPingImpl.kt", i = {}, l = {39, 43, 49, 52, 62}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ C6FQ A01;
    public final /* synthetic */ InterfaceC103384lE A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1(C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, Integer num, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(2, interfaceC23621Ds);
        this.A02 = interfaceC103384lE;
        this.A05 = str;
        this.A07 = z;
        this.A04 = str2;
        this.A01 = c6fq;
        this.A03 = num;
        this.A06 = z2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        InterfaceC103384lE interfaceC103384lE = this.A02;
        String str = this.A05;
        boolean z = this.A07;
        return new BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1(this.A01, interfaceC103384lE, this.A03, str, this.A04, interfaceC23621Ds, z, this.A06);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1JX r5 = X.C1JX.A02
            int r0 = r10.A00
            r8 = 0
            r6 = 5
            r7 = 4
            r9 = 3
            r3 = 2
            r2 = 1
            java.lang.String r4 = ""
            if (r0 == 0) goto L17
            if (r0 == r2) goto Lad
            if (r0 == r3) goto La3
            if (r0 == r9) goto L65
            if (r0 != r7) goto La3
            goto L80
        L17:
            X.AbstractC09560e7.A00(r11)
            X.4lE r0 = r10.A02
            if (r0 != 0) goto L33
            java.lang.String r1 = r10.A05
            r10.A00 = r2
            X.OSa r0 = X.C3Q1.A00
            if (r0 == 0) goto L31
            com.instagram.zero.main.IgZeroMain r0 = com.instagram.zero.main.IgZeroMain.A09
            if (r0 == 0) goto L31
            java.lang.Object r0 = r0.A05(r1, r10)
        L2e:
            if (r0 != r5) goto Lb0
            return r5
        L31:
            r0 = 0
            goto L2e
        L33:
            boolean r0 = r10.A07
            if (r0 == 0) goto L4c
            java.lang.String r1 = r10.A04
            r10.A00 = r3
        L3b:
            X.OSa r0 = X.C3Q1.A00
            if (r0 == 0) goto L4a
            com.instagram.zero.main.IgZeroMain r0 = com.instagram.zero.main.IgZeroMain.A09
            if (r0 == 0) goto L4a
            java.lang.Object r11 = r0.A03(r1, r10)
        L47:
            if (r11 != r5) goto La6
            return r5
        L4a:
            r11 = 0
            goto L47
        L4c:
            java.lang.Integer r0 = r10.A03
            if (r0 != 0) goto L6b
            java.lang.String r1 = r10.A05
            r10.A00 = r9
            X.OSa r0 = X.C3Q1.A00
            if (r0 == 0) goto L63
            com.instagram.zero.main.IgZeroMain r0 = com.instagram.zero.main.IgZeroMain.A09
            if (r0 == 0) goto L63
            java.lang.Object r11 = r0.A05(r1, r10)
        L60:
            if (r11 != r5) goto L68
            return r5
        L63:
            r11 = 0
            goto L60
        L65:
            X.AbstractC09560e7.A00(r11)
        L68:
            libraries.zero.headers.ZeroHeadersEntry r11 = (libraries.zero.headers.ZeroHeadersEntry) r11
            goto L87
        L6b:
            int r0 = r0.intValue()     // Catch: X.C902540k -> L86
            long r2 = (long) r0     // Catch: X.C902540k -> L86
            java.lang.String r1 = r10.A05     // Catch: X.C902540k -> L86
            com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1 r0 = new com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1$headersEntry$1     // Catch: X.C902540k -> L86
            r0.<init>(r1, r8)     // Catch: X.C902540k -> L86
            r10.A00 = r7     // Catch: X.C902540k -> L86
            java.lang.Object r11 = X.LHL.A00(r10, r0, r2)     // Catch: X.C902540k -> L86
            if (r11 != r5) goto L83
            goto Lac
        L80:
            X.AbstractC09560e7.A00(r11)     // Catch: X.C902540k -> L86
        L83:
            libraries.zero.headers.ZeroHeadersEntry r11 = (libraries.zero.headers.ZeroHeadersEntry) r11     // Catch: X.C902540k -> L86
            r8 = r11
        L86:
            r11 = r8
        L87:
            if (r11 == 0) goto L9a
            X.4lE r2 = r10.A02
            java.lang.String r4 = r11.A03
        L8d:
            X.6FQ r1 = r10.A01
            X.6FX r0 = X.AbstractC25225BEi.A0s()
            r0.A01(r4)
            X.AbstractC25227BEk.A1M(r1, r0, r2)
            goto Lb0
        L9a:
            boolean r0 = r10.A06
            if (r0 == 0) goto La9
            java.lang.String r1 = r10.A04
            r10.A00 = r6
            goto L3b
        La3:
            X.AbstractC09560e7.A00(r11)
        La6:
            if (r11 == 0) goto La9
            r4 = r11
        La9:
            X.4lE r2 = r10.A02
            goto L8d
        Lac:
            return r5
        Lad:
            X.AbstractC09560e7.A00(r11)
        Lb0:
            X.0eB r5 = X.C0eB.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bloks.extensions.plugins.bkactionzerotriggerheadersping.BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BKBloksActionZeroTriggerHeadersPingImpl$evaluate$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
