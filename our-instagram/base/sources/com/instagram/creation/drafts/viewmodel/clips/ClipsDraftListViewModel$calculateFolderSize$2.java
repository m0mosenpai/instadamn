package com.instagram.creation.drafts.viewmodel.clips;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C75E;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.drafts.viewmodel.clips.ClipsDraftListViewModel$calculateFolderSize$2", f = "ClipsDraftListViewModel.kt", i = {0, 0}, l = {289}, m = "invokeSuspend", n = {"size", "$this$forEach$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
public final class ClipsDraftListViewModel$calculateFolderSize$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final /* synthetic */ C75E A0A;
    public final /* synthetic */ File A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipsDraftListViewModel$calculateFolderSize$2(C75E c75e, File file, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A0B = file;
        this.A0A = c75e;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new ClipsDraftListViewModel$calculateFolderSize$2(this.A0A, this.A0B, interfaceC23621Ds);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:19:0x008f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.0pT] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x008a -> B:9:0x0095). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r14 = r18
            X.1JX r10 = X.C1JX.A02
            r11 = r17
            int r0 = r11.A02
            r9 = 1
            if (r0 == 0) goto L2d
            long r0 = r11.A04
            long r4 = r11.A03
            int r2 = r11.A01
            int r8 = r11.A00
            java.lang.Object r13 = r11.A09
            X.0pT r13 = (X.C15130pT) r13
            java.lang.Object r12 = r11.A08
            X.0pT r12 = (X.C15130pT) r12
            java.lang.Object r7 = r11.A07
            X.75E r7 = (X.C75E) r7
            java.lang.Object r6 = r11.A06
            java.io.File[] r6 = (java.io.File[]) r6
            java.lang.Object r3 = r11.A05
            X.0pT r3 = (X.C15130pT) r3
            X.AbstractC09560e7.A00(r14)     // Catch: java.lang.Exception -> L92
            r15 = r4
            r4 = r0
            goto L8a
        L2d:
            X.AbstractC09560e7.A00(r14)
            java.io.File r1 = r11.A0B
            boolean r0 = r1.exists()
            if (r0 != 0) goto L40
            r0 = 0
        L3a:
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r0)
        L3f:
            return r10
        L40:
            X.0pT r3 = new X.0pT
            r3.<init>()
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L9b
            java.io.File[] r6 = r1.listFiles()
            if (r6 == 0) goto La1
            X.75E r7 = r11.A0A
            int r2 = r6.length
            r8 = 0
        L55:
            if (r8 >= r2) goto La1
            r13 = r6[r8]
            long r4 = r3.A00
            X.C14360o3.A0A(r13)     // Catch: java.lang.Exception -> L8f
            r11.A05 = r3     // Catch: java.lang.Exception -> L8f
            r11.A06 = r6     // Catch: java.lang.Exception -> L8f
            r11.A07 = r7     // Catch: java.lang.Exception -> L8f
            r11.A08 = r3     // Catch: java.lang.Exception -> L8f
            r11.A09 = r3     // Catch: java.lang.Exception -> L8f
            r11.A00 = r8     // Catch: java.lang.Exception -> L8f
            r11.A01 = r2     // Catch: java.lang.Exception -> L8f
            r11.A03 = r4     // Catch: java.lang.Exception -> L8f
            r11.A04 = r4     // Catch: java.lang.Exception -> L8f
            r11.A02 = r9     // Catch: java.lang.Exception -> L8f
            X.12L r14 = X.C12L.A00     // Catch: java.lang.Exception -> L8f
            r12 = 0
            r1 = -18
            r0 = 3
            X.0nZ r1 = r14.AOT(r1, r0)     // Catch: java.lang.Exception -> L8f
            com.instagram.creation.drafts.viewmodel.clips.ClipsDraftListViewModel$calculateFolderSize$2 r0 = new com.instagram.creation.drafts.viewmodel.clips.ClipsDraftListViewModel$calculateFolderSize$2     // Catch: java.lang.Exception -> L8f
            r0.<init>(r7, r13, r12)     // Catch: java.lang.Exception -> L8f
            java.lang.Object r14 = X.AbstractC23641Du.A00(r11, r1, r0)     // Catch: java.lang.Exception -> L8f
            if (r14 == r10) goto L3f
            r13 = r3
            r12 = r3
            r15 = r4
        L8a:
            long r0 = X.AbstractC166987dD.A0N(r14)     // Catch: java.lang.Exception -> L91
            goto L95
        L8f:
            r12 = r3
            goto L92
        L91:
            r4 = r15
        L92:
            r13 = r12
            r0 = 0
        L95:
            long r4 = r4 + r0
            r13.A00 = r4
            int r8 = r8 + 1
            goto L55
        L9b:
            long r0 = r1.length()
            r3.A00 = r0
        La1:
            long r0 = r3.A00
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.drafts.viewmodel.clips.ClipsDraftListViewModel$calculateFolderSize$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsDraftListViewModel$calculateFolderSize$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
