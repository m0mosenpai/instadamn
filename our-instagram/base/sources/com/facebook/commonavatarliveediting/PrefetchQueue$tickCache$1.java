package com.facebook.commonavatarliveediting;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C12T;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC58017Po2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.PrefetchQueue$tickCache$1", f = "PrefetchQueue.kt", i = {0, 0, 1, 1, 1}, l = {188, 351, 225}, m = "invokeSuspend", n = {"requestId", "qplInstanceKey", "requestId", "$this$withLock_u24default$iv", "qplInstanceKey"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes9.dex */
public final class PrefetchQueue$tickCache$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ PrefetchQueue A07;
    public final /* synthetic */ InterfaceC58017Po2 A08;
    public final /* synthetic */ C12T A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrefetchQueue$tickCache$1(PrefetchQueue prefetchQueue, InterfaceC58017Po2 interfaceC58017Po2, InterfaceC23621Ds interfaceC23621Ds, C12T c12t, int i) {
        super(2, interfaceC23621Ds);
        this.A07 = prefetchQueue;
        this.A06 = i;
        this.A08 = interfaceC58017Po2;
        this.A09 = c12t;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new PrefetchQueue$tickCache$1(this.A07, this.A08, interfaceC23621Ds, this.A09, this.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0229, code lost:
    
        if (r25.A07.A02.get() != false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a A[Catch: all -> 0x0248, TryCatch #0 {all -> 0x0248, blocks: (B:18:0x0086, B:20:0x008a, B:22:0x00a8, B:23:0x00ac, B:25:0x00c0, B:26:0x00c4, B:28:0x00d8, B:29:0x00dc, B:33:0x0109, B:34:0x010e, B:36:0x0112, B:38:0x012a, B:40:0x012e, B:41:0x0137, B:43:0x013b, B:45:0x0148, B:47:0x0155, B:49:0x0160, B:51:0x0164, B:53:0x0171, B:55:0x0175, B:57:0x0182, B:59:0x0186, B:61:0x0191, B:63:0x0195, B:65:0x01a0, B:67:0x01a4, B:69:0x01b3, B:71:0x01b7, B:85:0x0234, B:87:0x023b, B:88:0x023c, B:89:0x0241, B:93:0x0242, B:94:0x0247), top: B:17:0x0086 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0242 A[Catch: all -> 0x0248, TryCatch #0 {all -> 0x0248, blocks: (B:18:0x0086, B:20:0x008a, B:22:0x00a8, B:23:0x00ac, B:25:0x00c0, B:26:0x00c4, B:28:0x00d8, B:29:0x00dc, B:33:0x0109, B:34:0x010e, B:36:0x0112, B:38:0x012a, B:40:0x012e, B:41:0x0137, B:43:0x013b, B:45:0x0148, B:47:0x0155, B:49:0x0160, B:51:0x0164, B:53:0x0171, B:55:0x0175, B:57:0x0182, B:59:0x0186, B:61:0x0191, B:63:0x0195, B:65:0x01a0, B:67:0x01a4, B:69:0x01b3, B:71:0x01b7, B:85:0x0234, B:87:0x023b, B:88:0x023c, B:89:0x0241, B:93:0x0242, B:94:0x0247), top: B:17:0x0086 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x021b -> B:8:0x001c). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.PrefetchQueue$tickCache$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PrefetchQueue$tickCache$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
