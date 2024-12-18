package com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram;

import X.AKN;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16610sE;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC71543Iw;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper$renderAllFrames$2$1", f = "OdrSnapshotHelper.kt", i = {0, 0, 1}, l = {223, 241, 243}, m = "invokeSuspend", n = {"frameNo", "nextFrame", "frameNo"}, s = {"I$0", "I$2", "I$0"})
/* loaded from: classes8.dex */
public final class OdrSnapshotHelper$renderAllFrames$2$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final /* synthetic */ OdrSnapshotHelper A04;
    public final /* synthetic */ AKN A05;
    public final /* synthetic */ InterfaceC16610sE A06;
    public final /* synthetic */ InterfaceC71543Iw A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OdrSnapshotHelper$renderAllFrames$2$1(OdrSnapshotHelper odrSnapshotHelper, AKN akn, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16610sE interfaceC16610sE, InterfaceC71543Iw interfaceC71543Iw) {
        super(2, interfaceC23621Ds);
        this.A04 = odrSnapshotHelper;
        this.A06 = interfaceC16610sE;
        this.A05 = akn;
        this.A07 = interfaceC71543Iw;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new OdrSnapshotHelper$renderAllFrames$2$1(this.A04, this.A05, interfaceC23621Ds, this.A06, this.A07);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a0 -> B:10:0x00c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b7 -> B:10:0x00c1). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r7 = r16
            X.1JX r3 = X.C1JX.A02
            int r0 = r15.A03
            r4 = 3
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L28
            if (r0 == r5) goto L21
            if (r0 == r6) goto Lba
            X.AbstractC09560e7.A00(r7)
        L12:
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r0 = r15.A04
            com.facebook.quicklog.QuickPerformanceLogger r2 = r0.A07
            r1 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r0 = "/take_snapshot/render_frame_end"
            r2.markerPoint(r1, r0)
            X.0eB r3 = X.C0eB.A00
            return r3
        L21:
            int r13 = r15.A02
            int r2 = r15.A01
            int r0 = r15.A00
            goto L81
        L28:
            X.AbstractC09560e7.A00(r7)
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r7 = r15.A04
            com.facebook.quicklog.QuickPerformanceLogger r2 = r7.A07
            r1 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r0 = "/take_snapshot/render_frame_start"
            r2.markerPoint(r1, r0)
            int r2 = r7.A01
            X.L9x r0 = r7.A06
            int r0 = r0.A02
            int r2 = r2 + r0
            if (r5 > r2) goto L12
            r0 = 1
        L41:
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r9 = r15.A04
            int r1 = r9.A00
            int r13 = r1 + 1
            r1 = 657(0x291, float:9.2E-43)
            java.lang.String r1 = X.MSV.A00(r1)
            java.lang.String r8 = X.AnonymousClass001.A0O(r1, r13)
            com.facebook.quicklog.QuickPerformanceLogger r10 = r9.A07
            r7 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r1 = "_start"
            java.lang.String r1 = X.AnonymousClass001.A0R(r8, r1)
            r10.markerPoint(r7, r1)
            X.0sE r8 = r15.A06     // Catch: X.C902540k -> L87
            X.AKN r7 = r15.A05     // Catch: X.C902540k -> L87
            X.L9x r1 = r9.A06     // Catch: X.C902540k -> L87
            int r11 = r1.A03     // Catch: X.C902540k -> L87
            int r12 = r1.A02     // Catch: X.C902540k -> L87
            boolean r14 = X.AbstractC25230BEn.A1S(r0, r12)
            X.Jwb r9 = new X.Jwb     // Catch: X.C902540k -> L87
            r9.<init>(r10, r11, r12, r13, r14)     // Catch: X.C902540k -> L87
            r15.A00 = r0     // Catch: X.C902540k -> L87
            r15.A01 = r2     // Catch: X.C902540k -> L87
            r15.A02 = r13     // Catch: X.C902540k -> L87
            r15.A03 = r5     // Catch: X.C902540k -> L87
            java.lang.Object r7 = r8.invoke(r7, r9, r15)     // Catch: X.C902540k -> L87
            if (r7 != r3) goto L84
            goto Ld6
        L81:
            X.AbstractC09560e7.A00(r7)     // Catch: X.C902540k -> L87
        L84:
            X.3NY r7 = (X.C3NY) r7     // Catch: X.C902540k -> L87
            goto L98
        L87:
            java.lang.Integer r8 = X.C05F.A00
            java.lang.String r1 = "Timed out while waiting for the snapshot to be taken"
            java.lang.RuntimeException r7 = X.AbstractC166987dD.A18(r1)
            X.JuQ r1 = new X.JuQ
            r1.<init>(r7, r8)
            X.8jk r7 = X.AbstractC43592JPx.A0p(r1)
        L98:
            boolean r1 = r7 instanceof X.C3NX
            if (r1 == 0) goto Lc7
            X.3NX r7 = (X.C3NX) r7
            java.lang.Object r8 = r7.A00
            if (r8 == 0) goto Lc1
            X.3Iw r7 = r15.A07
            X.0eP r1 = new X.0eP
            r1.<init>(r13, r8)
            X.3NX r1 = X.AbstractC25225BEi.A0z(r1)
            r15.A00 = r0
            r15.A01 = r2
            r15.A03 = r6
            java.lang.Object r1 = r7.EMz(r1, r15)
            if (r1 != r3) goto Lc1
            return r3
        Lba:
            int r2 = r15.A01
            int r0 = r15.A00
            X.AbstractC09560e7.A00(r7)
        Lc1:
            if (r0 == r2) goto L12
            int r0 = r0 + 1
            goto L41
        Lc7:
            boolean r0 = r7 instanceof X.C194848jk
            if (r0 == 0) goto Ld7
            X.3Iw r0 = r15.A07
            r15.A03 = r4
            java.lang.Object r0 = r0.EMz(r7, r15)
            if (r0 != r3) goto L12
            return r3
        Ld6:
            return r3
        Ld7:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper$renderAllFrames$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OdrSnapshotHelper$renderAllFrames$2$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
