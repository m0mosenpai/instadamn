package X;

import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.viewer.feature.midcard.ui.ClipsMidCardMegacardVideoPlayerViewModel$initializeVirtualVideoPlayerMetadata$1", f = "ClipsMidCardMegacardVideoPlayerViewModel.kt", i = {0, 0, 0}, l = {137}, m = "invokeSuspend", n = {"destination$iv$iv", "index$iv$iv", "index"}, s = {"L$2", "I$1", "I$2"})
/* renamed from: X.J6g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43166J6g extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final /* synthetic */ int A09;
    public final /* synthetic */ C37658Ghr A0A;
    public final /* synthetic */ C37641Gha A0B;
    public final /* synthetic */ List A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43166J6g(C37658Ghr c37658Ghr, C37641Gha c37641Gha, List list, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A0C = list;
        this.A0B = c37641Gha;
        this.A09 = i;
        this.A0A = c37658Ghr;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        List list = this.A0C;
        return new C43166J6g(this.A0A, this.A0B, list, interfaceC23621Ds, this.A09);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009f -> B:4:0x0024). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1JX r9 = X.C1JX.A02
            int r0 = r14.A03
            r8 = 1
            if (r0 == 0) goto L51
            int r11 = r14.A02
            int r2 = r14.A01
            int r7 = r14.A00
            java.lang.Object r12 = r14.A08
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r10 = r14.A07
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r6 = r14.A06
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r5 = r14.A05
            X.Ghr r5 = (X.C37658Ghr) r5
            java.lang.Object r4 = r14.A04
            X.Gha r4 = (X.C37641Gha) r4
            X.AbstractC09560e7.A00(r15)
        L24:
            X.5qm r15 = (X.C128175qm) r15
            if (r15 != 0) goto L35
            X.0wb r2 = X.C18950wb.A01
            r1 = 817892914(0x30c00e32, float:1.3973873E-9)
            java.lang.String r0 = "ClipsMidCardMegacardVideoPlayerViewModel: unable to get ClipsDraft"
            X.AbstractC166987dD.A1T(r2, r0, r1)
        L32:
            X.0eB r9 = X.C0eB.A00
        L34:
            return r9
        L35:
            X.07g r13 = r4.A05
            android.app.Application r3 = r4.A0D()
            com.instagram.common.session.UserSession r0 = r4.A06
            X.OVo r1 = new X.OVo
            r1.<init>(r3, r13, r0)
            X.Iq5 r0 = new X.Iq5
            r0.<init>(r5, r4, r11, r7)
            r1.A01(r15, r0)
            X.0eB r0 = X.C0eB.A00
            r12.add(r0)
            r11 = r2
            goto L65
        L51:
            X.AbstractC09560e7.A00(r15)
            java.util.List r0 = r14.A0C
            X.Gha r4 = r14.A0B
            int r7 = r14.A09
            X.Ghr r5 = r14.A0A
            java.util.ArrayList r6 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r10 = r0.iterator()
            r11 = 0
        L65:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r3 = r10.next()
            int r2 = r11 + 1
            if (r11 >= 0) goto L7b
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L7b:
            java.lang.String r3 = (java.lang.String) r3
            android.app.Application r1 = r4.A0D()
            com.instagram.common.session.UserSession r0 = r4.A06
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r0 = X.C2OY.A00(r1, r0)
            r14.A04 = r4
            r14.A05 = r5
            r14.A06 = r6
            r14.A07 = r10
            r14.A08 = r6
            r14.A00 = r7
            r14.A01 = r2
            r14.A02 = r11
            r14.A03 = r8
            java.lang.Object r15 = r0.A07(r3, r14)
            if (r15 == r9) goto L34
            r12 = r6
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43166J6g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C43166J6g) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
