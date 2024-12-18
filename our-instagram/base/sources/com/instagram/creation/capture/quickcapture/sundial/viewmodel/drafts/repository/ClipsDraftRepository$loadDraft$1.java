package com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.OVo;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository$loadDraft$1", f = "ClipsDraftRepository.kt", i = {1, 2}, l = {178, 190, 196}, m = "invokeSuspend", n = {"draft", "clipsDraft"}, s = {"L$1", "L$1"})
/* loaded from: classes9.dex */
public final class ClipsDraftRepository$loadDraft$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ ClipsDraftRepository A03;
    public final /* synthetic */ OVo A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsDraftRepository$loadDraft$1(ClipsDraftRepository clipsDraftRepository, OVo oVo, String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        super(2, interfaceC23621Ds);
        this.A03 = clipsDraftRepository;
        this.A05 = str;
        this.A04 = oVo;
        this.A07 = interfaceC16660sJ;
        this.A06 = interfaceC16820sZ;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        ClipsDraftRepository clipsDraftRepository = this.A03;
        String str = this.A05;
        return new ClipsDraftRepository$loadDraft$1(clipsDraftRepository, this.A04, str, interfaceC23621Ds, this.A06, this.A07);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1JX r4 = X.C1JX.A02
            int r0 = r8.A00
            r5 = 3
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L1e
            if (r0 == r7) goto L30
            java.lang.Object r2 = r8.A02
            X.5qm r2 = (X.C128175qm) r2
            java.lang.Object r3 = r8.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r3 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository) r3
            if (r0 == r6) goto L6d
            X.AbstractC09560e7.A00(r9)
        L18:
            r3.A0O(r2)
        L1b:
            X.0eB r4 = X.C0eB.A00
            return r4
        L1e:
            X.AbstractC09560e7.A00(r9)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r2 = r8.A03
            java.lang.String r1 = r8.A05
            X.OVo r0 = r8.A04
            r8.A00 = r7
            java.lang.Object r9 = r2.A0H(r0, r1, r8)
            if (r9 != r4) goto L33
            return r4
        L30:
            X.AbstractC09560e7.A00(r9)
        L33:
            X.3NY r9 = (X.C3NY) r9
            X.0sJ r1 = r8.A07
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r3 = r8.A03
            boolean r0 = r9 instanceof X.C3NX
            if (r0 != 0) goto L77
            boolean r0 = r9 instanceof X.C194848jk
            if (r0 == 0) goto L9f
            X.8jk r9 = (X.C194848jk) r9
            java.lang.Object r0 = r9.A00
            X.O7P r0 = (X.O7P) r0
            r1.invoke(r0)
            X.5qm r2 = r0.A00
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto L57
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L57
            r7 = 0
        L57:
            if (r2 == 0) goto L73
            java.lang.String r0 = r2.A0i
            if (r0 == 0) goto L73
            if (r7 == 0) goto L73
            r0 = 0
            r8.A01 = r3
            r8.A02 = r2
            r8.A00 = r6
            java.lang.Object r0 = r3.A0A(r0, r2, r8)
            if (r0 != r4) goto L70
            return r4
        L6d:
            X.AbstractC09560e7.A00(r9)
        L70:
            r3.A0O(r2)
        L73:
            X.8jk r9 = X.AbstractC25227BEk.A0h()
        L77:
            X.0sZ r1 = r8.A06
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r3 = r8.A03
            boolean r0 = r9 instanceof X.C3NX
            if (r0 == 0) goto L96
            X.3NX r9 = (X.C3NX) r9
            java.lang.Object r2 = r9.A00
            X.5qm r2 = (X.C128175qm) r2
            r1.invoke()
            r0 = 0
            r8.A01 = r3
            r8.A02 = r2
            r8.A00 = r5
            java.lang.Object r0 = r3.A0A(r0, r2, r8)
            if (r0 != r4) goto L18
            return r4
        L96:
            boolean r0 = r9 instanceof X.C194848jk
            if (r0 != 0) goto L1b
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L9f:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository$loadDraft$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsDraftRepository$loadDraft$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
