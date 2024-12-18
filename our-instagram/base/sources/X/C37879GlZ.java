package X;

import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.viewer.data.ClipsViewerRepository$fetchNextPage$2", f = "ClipsViewerRepository.kt", i = {}, l = {177, 187}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.GlZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37879GlZ extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ C37878GlY A01;
    public final /* synthetic */ C37866GlL A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37879GlZ(C37878GlY c37878GlY, C37866GlL c37866GlL, Boolean bool, Long l, String str, List list, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        super(1, interfaceC23621Ds);
        this.A02 = c37866GlL;
        this.A01 = c37878GlY;
        this.A07 = z;
        this.A06 = list;
        this.A08 = z2;
        this.A04 = l;
        this.A05 = str;
        this.A03 = bool;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        C37866GlL c37866GlL = this.A02;
        C37878GlY c37878GlY = this.A01;
        boolean z = this.A07;
        List list = this.A06;
        boolean z2 = this.A08;
        return new C37879GlZ(c37878GlY, c37866GlL, this.A03, this.A04, this.A05, list, interfaceC23621Ds, z, z2);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C37879GlZ) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (((X.C5R4) r8).AJT(r5, new X.C37887Glh(r9, r10, r7, r2), r10.A08) != X.C05F.A0C) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0pQ, java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r18
            X.1JX r3 = X.C1JX.A02
            r14 = r17
            int r1 = r14.A00
            r4 = 2
            r6 = 1
            if (r1 == 0) goto L19
            if (r1 == r6) goto L66
            X.AbstractC09560e7.A00(r0)
        L11:
            X.GlL r1 = r14.A02
            r0 = 0
            r1.A02 = r0
        L16:
            X.0eB r3 = X.C0eB.A00
            return r3
        L19:
            X.AbstractC09560e7.A00(r0)
            X.GlL r10 = r14.A02
            r10.A02 = r6
            X.GlY r9 = r14.A01
            boolean r0 = r9.A04
            if (r0 == 0) goto L49
            X.5R5 r8 = r10.A05
            boolean r0 = r8 instanceof X.C5R4
            if (r0 == 0) goto L49
            X.0pQ r7 = new X.0pQ
            r7.<init>()
            com.instagram.common.session.UserSession r5 = r10.A07
            boolean r2 = X.C1LE.A0B(r5)
            X.5R4 r8 = (X.C5R4) r8
            X.6xU r1 = r10.A08
            X.Glh r0 = new X.Glh
            r0.<init>(r9, r10, r7, r2)
            java.lang.Integer r1 = r8.AJT(r5, r0, r1)
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L49
            goto L16
        L49:
            boolean r15 = r14.A07
            if (r15 != 0) goto L53
            boolean r0 = X.C37866GlL.A0B(r9, r10)
            if (r0 == 0) goto L11
        L53:
            java.util.List r13 = r14.A06
            boolean r0 = r14.A08
            java.lang.Long r11 = r14.A04
            java.lang.String r12 = r14.A05
            r14.A00 = r6
            r16 = r0
            java.lang.Object r0 = X.C37866GlL.A03(r9, r10, r11, r12, r13, r14, r15, r16)
            if (r0 != r3) goto L69
            return r3
        L66:
            X.AbstractC09560e7.A00(r0)
        L69:
            boolean r0 = X.AbstractC166987dD.A1a(r0)
            if (r0 != 0) goto L11
            X.GlL r2 = r14.A02
            X.GlY r1 = r14.A01
            java.lang.Boolean r0 = r14.A03
            r14.A00 = r4
            java.lang.Object r0 = X.C37866GlL.A02(r1, r2, r0, r14)
            if (r0 != r3) goto L11
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37879GlZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
