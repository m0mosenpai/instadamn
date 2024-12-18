package X;

import android.media.CamcorderProfile;
import java.io.File;
import java.io.FileDescriptor;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Aae, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23467Aae implements InterfaceC176297sm {
    public InterfaceC178337w7 A00;
    public AGu A01;
    public C176117sU A02;
    public Y1s A03;
    public File A04;
    public CountDownLatch A05;
    public final InterfaceC25203BDb A06 = new C23412AZl(this, 0);
    public volatile C212409b9 A07;
    public final /* synthetic */ C180037yt A08;

    public C23467Aae(C180037yt c180037yt) {
        this.A08 = c180037yt;
    }

    @Override // X.InterfaceC176297sm
    public final /* synthetic */ Y1s Eo8(CamcorderProfile camcorderProfile, C176587tG c176587tG, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, int i2, boolean z, boolean z2, boolean z3) {
        throw AbstractC166987dD.A1D(AbstractC111324zv.A00(669));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (r23 == 270) goto L6;
     */
    @Override // X.InterfaceC176297sm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.Y1s Eo9(android.media.CamcorderProfile r18, X.C176587tG r19, java.lang.String r20, java.lang.String r21, int r22, int r23, boolean r24, boolean r25, boolean r26) {
        /*
            r17 = this;
            r12 = r20
            java.io.File r1 = X.AbstractC166987dD.A11(r12)
            r0 = r17
            r0.A04 = r1
            X.7yt r1 = r0.A08
            int r8 = r1.A03
            int r9 = r1.A01
            int r10 = r1.A00
            int r11 = r1.A02
            X.7w7 r6 = r0.A00
            X.AZq r4 = new X.AZq
            r5 = r18
            r7 = r23
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1 = 90
            if (r7 == r1) goto L28
            r1 = 270(0x10e, float:3.78E-43)
            r2 = 1
            if (r7 != r1) goto L29
        L28:
            r2 = 0
        L29:
            r8 = 0
            X.ACo r1 = r4.A01
            if (r2 == 0) goto L94
            int r13 = r1.A05
            int r14 = r1.A04
        L32:
            X.Y14 r10 = new X.Y14
            r16 = r22
            r11 = r8
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.Xl2 r2 = X.Y1s.A0N
            if (r25 == 0) goto L92
            int r1 = r5.audioCodec
        L41:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.A01(r2, r1)
            X.Xl2 r2 = X.Y1s.A0Z
            int r1 = r5.videoCodec
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.A01(r2, r1)
            X.Y1s r1 = new X.Y1s
            r1.<init>(r10)
            r0.A03 = r1
            X.7sU r1 = r0.A02
            if (r1 == 0) goto L8f
            X.7sS r1 = r1.A04
            java.lang.Integer r2 = r1.A04
            java.lang.Integer r1 = X.C05F.A0u
            if (r2 != r1) goto L8f
            r1 = 2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            X.AGu r7 = r0.A01
            X.7w7 r6 = r0.A00
            X.7um r5 = new X.7um
            r9 = r8
            r10 = r8
            r12 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r3.add(r5)
            r3.add(r4)
            X.7sU r2 = r0.A02
            java.io.File r7 = r0.A04
            java.lang.Integer r9 = X.C05F.A0C
            X.AGI r5 = new X.AGI
            r6 = r8
            r5.<init>(r6, r7, r8, r9, r10)
            X.BDb r1 = r0.A06
            r2.A02(r5, r1, r3)
        L8f:
            X.Y1s r0 = r0.A03
            return r0
        L92:
            r1 = -1
            goto L41
        L94:
            int r13 = r1.A04
            int r14 = r1.A05
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23467Aae.Eo9(android.media.CamcorderProfile, X.7tG, java.lang.String, java.lang.String, int, int, boolean, boolean, boolean):X.Y1s");
    }

    @Override // X.InterfaceC176297sm
    public final void Eom() {
        Integer num;
        C176117sU c176117sU = this.A02;
        if (c176117sU != null && (num = c176117sU.A04.A04) != C05F.A0j && num != C05F.A0u) {
            if (this.A05 == null) {
                this.A07 = null;
                this.A05 = new CountDownLatch(1);
                this.A02.A01();
                try {
                    try {
                        this.A05.await();
                        if (this.A07 != null) {
                            throw this.A07;
                        }
                    } catch (InterruptedException e) {
                        C0K8.A0F("SurfaceRecorder", "Thread interrupted while recording", e);
                    }
                    return;
                } finally {
                    this.A05 = null;
                }
            }
            C0K8.A0C("SurfaceRecorder", "Unfinished previous recording state");
            throw AbstractC166987dD.A14("LiteVideoRecorder: Unfinished previous recording state");
        }
    }
}
