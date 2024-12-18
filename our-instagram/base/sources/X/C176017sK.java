package X;

import android.media.MediaCodec;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7sK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176017sK extends C179617yB {
    public C23416AZp A00;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r7 != null) goto L11;
     */
    @Override // X.C179617yB, X.InterfaceC179627yC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AGI AMa(X.InterfaceC176157sY r6, X.AGu r7, java.io.File r8) {
        /*
            r5 = this;
            r0 = 0
            X.AGI r4 = super.AMa(r0, r7, r8)
            r1 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            if (r7 == 0) goto L2f
            java.lang.Boolean r0 = r7.A03
            boolean r0 = X.C14360o3.A0K(r0, r3)
            if (r0 == 0) goto L2f
            X.AZp r0 = r5.A00
            if (r0 == 0) goto L2f
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A04
            boolean r0 = r0.get()
            if (r0 != r1) goto L2f
            java.lang.Integer r1 = X.C05F.A01
        L23:
            java.lang.Boolean r0 = r7.A03
            boolean r2 = X.C14360o3.A0K(r0, r3)
        L29:
            X.AGI r0 = new X.AGI
            r0.<init>(r4, r1, r2)
            return r0
        L2f:
            java.lang.Integer r1 = X.C05F.A00
            if (r7 == 0) goto L29
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C176017sK.AMa(X.7sY, X.AGu, java.io.File):X.AGI");
    }

    public final void A0C(boolean z) {
        Integer num;
        int i;
        C23416AZp c23416AZp = this.A00;
        if (c23416AZp != null) {
            AtomicBoolean atomicBoolean = c23416AZp.A04;
            if (atomicBoolean.getAndSet(z) != z) {
                boolean z2 = atomicBoolean.get();
                C176137sW c176137sW = c23416AZp.A01;
                if (z2) {
                    num = C05F.A01;
                } else {
                    num = C05F.A00;
                }
                if (c176137sW != null) {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    if (num.intValue() != 0) {
                        i = 2097152;
                    } else {
                        i = 1048576;
                    }
                    bufferInfo.set(0, 0, 0L, i);
                    c176137sW.A03(bufferInfo, EnumC176237sg.SUPERNOVA_AUDIO, C23416AZp.A06);
                }
            }
        }
    }
}
