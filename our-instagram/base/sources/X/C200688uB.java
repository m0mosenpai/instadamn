package X;

import android.opengl.GLES20;

/* renamed from: X.8uB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200688uB {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass810 A03;
    public boolean A04;
    public int[] A05;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0086, code lost:
    
        if (r16 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C200688uB(int r15, int r16, boolean r17) {
        /*
            r14 = this;
            java.lang.String r0 = "FrameBufferTexture"
            X.811 r3 = new X.811
            r3.<init>(r0)
            r4 = r17
            r3.A0A = r4
            r5 = 3553(0xde1, float:4.979E-42)
            r3.A03 = r5
            r8 = r15
            r3.A04 = r15
            r9 = r16
            r3.A02 = r9
            r0 = 10241(0x2801, float:1.435E-41)
            r1 = 9729(0x2601, float:1.3633E-41)
            android.util.SparseIntArray r2 = r3.A0B
            r2.put(r0, r1)
            r0 = 10240(0x2800, float:1.4349E-41)
            r2.put(r0, r1)
            r0 = 10242(0x2802, float:1.4352E-41)
            r1 = 33071(0x812f, float:4.6342E-41)
            r2.put(r0, r1)
            r0 = 10243(0x2803, float:1.4354E-41)
            r2.put(r0, r1)
            X.810 r2 = new X.810
            r2.<init>(r3)
            r14.<init>()
            r14.A02 = r15
            r14.A01 = r9
            r14.A03 = r2
            r14.A04 = r4
            r1 = 1
            int[] r0 = new int[r1]
            r6 = 0
            android.opengl.GLES20.glGenFramebuffers(r1, r0, r6)
            r0 = r0[r6]
            r14.A00 = r0
            r1 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r1, r0)
            int r3 = r2.A00
            android.opengl.GLES20.glBindTexture(r5, r3)
            if (r17 == 0) goto L9e
            r7 = 32857(0x8059, float:4.6042E-41)
            r11 = 6408(0x1908, float:8.98E-42)
            r12 = 33640(0x8368, float:4.714E-41)
            r13 = 0
            r10 = r6
        L63:
            android.opengl.GLES20.glTexImage2D(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r0 = "FrameBufferTexture glTexImage2D"
            X.AbstractC180237zD.A02(r0, r4)
            r0 = 36064(0x8ce0, float:5.0536E-41)
            android.opengl.GLES20.glFramebufferTexture2D(r1, r0, r5, r3, r6)
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.String r0 = "FrameBufferTexture glFramebufferTexture2D"
            X.AbstractC180237zD.A02(r0, r3)
            int r3 = android.opengl.GLES20.glCheckFramebufferStatus(r1)
            r0 = 36053(0x8cd5, float:5.0521E-41)
            if (r3 == r0) goto La6
            if (r15 == 0) goto L88
            r0 = 0
            if (r16 != 0) goto L89
        L88:
            r0 = 1
        L89:
            java.lang.String r2 = "Frame buffer creation failed with "
            java.lang.String r1 = " isWidthOrHeightZero="
            if (r0 == 0) goto L9b
            java.lang.String r0 = "true"
        L91:
            java.lang.String r1 = X.AnonymousClass001.A05(r3, r2, r1, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L9b:
            java.lang.String r0 = "false"
            goto L91
        L9e:
            r7 = 6408(0x1908, float:8.98E-42)
            r12 = 5121(0x1401, float:7.176E-42)
            r13 = 0
            r10 = r6
            r11 = r7
            goto L63
        La6:
            android.opengl.GLES20.glBindTexture(r5, r6)
            android.opengl.GLES20.glBindFramebuffer(r1, r6)
            r2.A00(r15, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200688uB.<init>(int, int, boolean):void");
    }

    public final void A00() {
        GLES20.glBindFramebuffer(36160, this.A00);
        int[] iArr = new int[1];
        this.A05 = iArr;
        GLES20.glGenRenderbuffers(1, iArr, 0);
        GLES20.glBindRenderbuffer(36161, this.A05[0]);
        GLES20.glRenderbufferStorage(36161, 33189, this.A02, this.A01);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.A05[0]);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glBindRenderbuffer(36161, 0);
            GLES20.glBindFramebuffer(36160, 0);
            return;
        }
        throw new RuntimeException(AnonymousClass001.A0O("Depth buffer attachment to FrameBufferTexture failed with ", glCheckFramebufferStatus));
    }

    public final void A01() {
        AnonymousClass810 anonymousClass810 = this.A03;
        this.A03 = null;
        if (anonymousClass810 != null) {
            GLES20.glDeleteFramebuffers(1, new int[]{this.A00}, 0);
            int[] iArr = this.A05;
            this.A05 = null;
            if (iArr != null) {
                GLES20.glDeleteRenderbuffers(1, iArr, 0);
            }
            anonymousClass810.A01();
        }
    }

    public C200688uB(int i, int i2) {
        this(i, i2, false);
    }
}
