package X;

import instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController$prepareAndPlayVideoOnDraftMidcard$1", f = "ClipsMidcardVirtualVideoPlayerController.kt", i = {0, 0, 0, 0, 0}, l = {147}, m = "invokeSuspend", n = {"mediaCompositions", "mediaCompositionDurations", "destination$iv$iv", "index$iv$iv", "index"}, s = {"L$0", "L$1", "L$4", "I$0", "I$1"})
/* renamed from: X.J6h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C43167J6h extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final /* synthetic */ C37658Ghr A0A;
    public final /* synthetic */ ClipsMidcardVirtualVideoPlayerController A0B;
    public final /* synthetic */ List A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43167J6h(C37658Ghr c37658Ghr, ClipsMidcardVirtualVideoPlayerController clipsMidcardVirtualVideoPlayerController, List list, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A0C = list;
        this.A0B = clipsMidcardVirtualVideoPlayerController;
        this.A0A = c37658Ghr;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        List list = this.A0C;
        return new C43167J6h(this.A0A, this.A0B, list, interfaceC23621Ds);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00be -> B:4:0x0030). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r14 = r22
            X.1JX r10 = X.C1JX.A02
            r11 = r21
            int r0 = r11.A02
            r9 = 1
            if (r0 == 0) goto L6a
            int r0 = r11.A01
            r16 = r0
            int r13 = r11.A00
            java.lang.Object r12 = r11.A09
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r8 = r11.A08
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r3 = r11.A07
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r7 = r11.A06
            X.Ghr r7 = (X.C37658Ghr) r7
            java.lang.Object r6 = r11.A05
            instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController r6 = (instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController) r6
            java.lang.Object r5 = r11.A04
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r4 = r11.A03
            java.util.Map r4 = (java.util.Map) r4
            X.AbstractC09560e7.A00(r14)
        L30:
            X.5qm r14 = (X.C128175qm) r14
            if (r14 != 0) goto L45
            X.0wb r2 = X.C18950wb.A01
            r1 = 817892914(0x30c00e32, float:1.3973873E-9)
            r0 = 722(0x2d2, float:1.012E-42)
            java.lang.String r0 = X.MSV.A00(r0)
            X.AbstractC166987dD.A1T(r2, r0, r1)
        L42:
            X.0eB r10 = X.C0eB.A00
        L44:
            return r10
        L45:
            X.07g r15 = r6.A04
            android.content.Context r2 = r6.A02
            com.instagram.common.session.UserSession r0 = r6.A05
            X.OVo r1 = new X.OVo
            r1.<init>(r2, r15, r0)
            X.Iq6 r0 = new X.Iq6
            r19 = r5
            r20 = r16
            r17 = r6
            r18 = r4
            r15 = r0
            r16 = r7
            r15.<init>(r16, r17, r18, r19, r20)
            r1.A01(r14, r0)
            X.0eB r0 = X.C0eB.A00
            r12.add(r0)
            r12 = r3
            goto L84
        L6a:
            X.AbstractC09560e7.A00(r14)
            java.util.LinkedHashMap r4 = X.AbstractC166987dD.A1I()
            java.util.LinkedHashMap r5 = X.AbstractC166987dD.A1I()
            java.util.List r0 = r11.A0C
            instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController r6 = r11.A0B
            X.Ghr r7 = r11.A0A
            java.util.ArrayList r12 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r8 = r0.iterator()
            r13 = 0
        L84:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r3 = r8.next()
            int r2 = r13 + 1
            if (r13 >= 0) goto L9a
            X.AbstractC16960so.A1U()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L9a:
            java.lang.String r3 = (java.lang.String) r3
            android.content.Context r1 = r6.A02
            com.instagram.common.session.UserSession r0 = r6.A05
            com.instagram.creation.drafts.model.datasource.clips.ClipsDraftLocalDataSource r0 = X.C2OY.A00(r1, r0)
            r11.A03 = r4
            r11.A04 = r5
            r11.A05 = r6
            r11.A06 = r7
            r11.A07 = r12
            r11.A08 = r8
            r11.A09 = r12
            r11.A00 = r2
            r11.A01 = r13
            r11.A02 = r9
            java.lang.Object r14 = r0.A07(r3, r11)
            if (r14 == r10) goto L44
            r16 = r13
            r3 = r12
            r13 = r2
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43167J6h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C43167J6h) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
