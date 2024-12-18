package androidx.compose.foundation.gestures;

import X.AbstractC105074oN;
import X.AbstractC166987dD;
import X.BFo;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {212}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
/* loaded from: classes5.dex */
public final class TapGestureDetectorKt$awaitSecondDown$2 extends AbstractC105074oN implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ BFo A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$awaitSecondDown$2(BFo bFo, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A03 = bFo;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        TapGestureDetectorKt$awaitSecondDown$2 tapGestureDetectorKt$awaitSecondDown$2 = new TapGestureDetectorKt$awaitSecondDown$2(this.A03, interfaceC23621Ds);
        tapGestureDetectorKt$awaitSecondDown$2.A02 = obj;
        return tapGestureDetectorKt$awaitSecondDown$2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0038 -> B:4:0x000f). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1JX r8 = X.C1JX.A02
            int r0 = r9.A00
            r7 = 1
            if (r0 == 0) goto L18
            long r2 = r9.A01
            java.lang.Object r0 = r9.A02
            X.6KZ r4 = X.AbstractC25225BEi.A0T(r0, r10)
        Lf:
            X.BFo r10 = (X.BFo) r10
            long r5 = r10.A0A
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 < 0) goto L2c
            return r10
        L18:
            X.AbstractC09560e7.A00(r10)
            java.lang.Object r4 = r9.A02
            X.6KZ r4 = (X.C6KZ) r4
            X.BFo r0 = r9.A03
            long r2 = r0.A0A
            X.59J r0 = r4.CFl()
            long r0 = r0.Az7()
            long r2 = r2 + r0
        L2c:
            r9.A02 = r4
            r9.A01 = r2
            r9.A00 = r7
            X.BJd r0 = X.EnumC25334BJd.Main
            java.lang.Object r10 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r4, r0, r9, r7)
            if (r10 != r8) goto Lf
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TapGestureDetectorKt$awaitSecondDown$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
