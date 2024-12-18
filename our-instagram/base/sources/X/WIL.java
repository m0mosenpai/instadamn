package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.util.List;

/* loaded from: classes11.dex */
public final class WIL implements SurfaceTexture.OnFrameAvailableListener {
    public final C1814082s A00;
    public final WFO A01;
    public final W68 A02;
    public final C70127W5n A03;
    public final Object A04;

    public final synchronized void A00() {
        if (!this.A02.A03()) {
            this.A03.A01();
        }
    }

    public final synchronized void A01() {
        SurfaceTexture surfaceTexture;
        W68 w68 = this.A02;
        if (!w68.A03()) {
            C70127W5n c70127W5n = this.A03;
            C176507t8 c176507t8 = c70127W5n.A09;
            c70127W5n.A09 = null;
            if (c176507t8 != null) {
                synchronized (c176507t8) {
                    if (c70127W5n.A0A && (surfaceTexture = c176507t8.A0B) != null) {
                        surfaceTexture.setOnFrameAvailableListener(null);
                    }
                    c176507t8.A01();
                    c70127W5n.A0A = false;
                }
            }
            C1814082s c1814082s = this.A00;
            List list = c1814082s.A00;
            c1814082s.A00();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C69796Vvg) list.get(i)).A03();
            }
            WFO wfo = this.A01;
            C69375VmL c69375VmL = wfo.A00;
            if (c69375VmL != null) {
                GLES20.glDeleteProgram(c69375VmL.A00);
                c69375VmL.A00 = -1;
                wfo.A00 = null;
            }
            w68.A02();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (r2.A0E == false) goto L27;
     */
    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void onFrameAvailable(android.graphics.SurfaceTexture r21) {
        /*
            r20 = this;
            r7 = r20
            monitor-enter(r7)
            X.W68 r9 = r7.A02     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r9.A03()     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L8a
            X.W5n r6 = r7.A03     // Catch: java.lang.Throwable -> L8c
            r0 = r21
            boolean r0 = r6.A03(r0)     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L8a
            boolean r0 = r9.A03()     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L8a
            X.82s r0 = r7.A00     // Catch: java.lang.Throwable -> L8c
            java.util.List r8 = r0.A00     // Catch: java.lang.Throwable -> L8c
            int r5 = r8.size()     // Catch: java.lang.Throwable -> L8c
            r4 = 0
        L24:
            if (r4 >= r5) goto L8a
            java.lang.Object r3 = r8.get(r4)     // Catch: java.lang.Throwable -> L8c
            X.Vvg r3 = (X.C69796Vvg) r3     // Catch: java.lang.Throwable -> L8c
            X.7t8 r2 = r3.A00     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L7f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r2.A04()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L7e
            r3.A02()     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            int r14 = r6.A07     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            int r15 = r6.A06     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            float[] r10 = r6.A01     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            int r16 = r3.A01()     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            int r17 = r3.A00()     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            float[] r12 = r3.A03     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            r1 = 16
            r0 = 0
        L4d:
            r11 = r10[r0]     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            r12[r0] = r11     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            int r0 = r0 + 1
            if (r0 < r1) goto L4d
            X.7t8 r0 = r3.A00     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            if (r0 == 0) goto L5c
            r0.A03(r12)     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
        L5c:
            X.WFO r11 = r7.A01     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            int r13 = r6.A00     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            int r1 = r2.A08     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            boolean r0 = r6.A0B     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            if (r0 == 0) goto L6c
            boolean r0 = r2.A0E     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            r19 = 1
            if (r0 != 0) goto L6e
        L6c:
            r19 = 0
        L6e:
            r18 = r1
            r11.A03(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            long r0 = r6.A08     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            r3.A05(r0)     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
            r3.A04()     // Catch: java.lang.RuntimeException -> L7b java.lang.Throwable -> L82
        L7b:
            r9.A01()     // Catch: java.lang.Throwable -> L87
        L7e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L87
        L7f:
            int r4 = r4 + 1
            goto L24
        L82:
            r0 = move-exception
            r9.A01()     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L8c
        L8a:
            monitor-exit(r7)
            return
        L8c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WIL.onFrameAvailable(android.graphics.SurfaceTexture):void");
    }

    public WIL(Object obj) {
        this.A04 = obj;
        W68 w68 = new W68(obj);
        this.A02 = w68;
        this.A00 = new C1814082s();
        w68.A01();
        this.A01 = new WFO();
        this.A03 = new C70127W5n(w68, obj);
    }

    public WIL() {
        this(new Object());
    }
}
