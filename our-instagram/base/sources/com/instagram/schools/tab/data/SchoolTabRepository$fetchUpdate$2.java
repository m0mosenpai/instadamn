package com.instagram.schools.tab.data;

import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16660sJ;
import X.InterfaceC23621Ds;
import X.NSQ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.schools.tab.data.SchoolTabRepository$fetchUpdate$2", f = "SchoolTabRepository.kt", i = {0, 0}, l = {45}, m = "invokeSuspend", n = {"$this$update$iv", "prevValue$iv"}, s = {"L$0", "L$3"})
/* loaded from: classes9.dex */
public final class SchoolTabRepository$fetchUpdate$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public boolean A07;
    public final /* synthetic */ int A08;
    public final /* synthetic */ NSQ A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SchoolTabRepository$fetchUpdate$2(NSQ nsq, String str, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(1, interfaceC23621Ds);
        this.A09 = nsq;
        this.A08 = i;
        this.A0A = str;
        this.A0B = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new SchoolTabRepository$fetchUpdate$2(this.A09, this.A0A, interfaceC23621Ds, this.A08, this.A0B);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((SchoolTabRepository$fetchUpdate$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1JX r7 = X.C1JX.A02
            int r0 = r10.A01
            r6 = 1
            if (r0 == 0) goto L32
            boolean r1 = r10.A07
            int r9 = r10.A00
            java.lang.Object r8 = r10.A05
            java.lang.Object r3 = r10.A04
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r10.A03
            X.NSQ r5 = (X.NSQ) r5
            java.lang.Object r4 = r10.A02
            X.05A r4 = (X.C05A) r4
            X.AbstractC09560e7.A00(r11)
        L1c:
            X.PkY r11 = (X.InterfaceC57806PkY) r11
            r0 = 0
            X.C14360o3.A0B(r11, r0)
            r2 = 49
            X.Mte r0 = new X.Mte
            r0.<init>(r11, r2)
            boolean r0 = r4.AIi(r8, r0)
            if (r0 == 0) goto L56
            X.0eB r7 = X.C0eB.A00
            return r7
        L32:
            X.AbstractC09560e7.A00(r11)
            X.NSQ r5 = r10.A09
            X.05A r4 = r5.A02
        L39:
            java.lang.Object r3 = r4.getValue()
            X.MUq r2 = X.MUq.A00
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            r1 = 49
            X.Mte r0 = new X.Mte
            r0.<init>(r2, r1)
            boolean r0 = r4.AIi(r3, r0)
            if (r0 == 0) goto L39
            int r9 = r10.A08
            java.lang.String r3 = r10.A0A
            boolean r1 = r10.A0B
        L56:
            java.lang.Object r8 = r4.getValue()
            com.instagram.schools.tab.data.SchoolTabDataSource r0 = r5.A01
            r10.A02 = r4
            r10.A03 = r5
            r10.A04 = r3
            r10.A05 = r8
            r10.A06 = r8
            r10.A00 = r9
            r10.A07 = r1
            r10.A01 = r6
            if (r1 == 0) goto L75
            java.lang.Object r11 = com.instagram.schools.tab.data.SchoolTabDataSource.A02(r0, r3, r10, r9)
        L72:
            if (r11 != r7) goto L1c
            return r7
        L75:
            java.lang.Object r11 = com.instagram.schools.tab.data.SchoolTabDataSource.A01(r0, r3, r10, r9)
            goto L72
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.schools.tab.data.SchoolTabRepository$fetchUpdate$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
