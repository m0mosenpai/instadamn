package X;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Azp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24890Azp implements Runnable {
    public final /* synthetic */ C179107xM A00;
    public final /* synthetic */ InterfaceC179467xw A01;
    public final /* synthetic */ InterfaceC179037xF A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ CountDownLatch A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public RunnableC24890Azp(C179107xM c179107xM, InterfaceC179467xw interfaceC179467xw, InterfaceC179037xF interfaceC179037xF, Integer num, CountDownLatch countDownLatch, boolean z, boolean z2) {
        this.A00 = c179107xM;
        this.A02 = interfaceC179037xF;
        this.A01 = interfaceC179467xw;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = num;
        this.A04 = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C179107xM c179107xM = this.A00;
            if (c179107xM.A0d) {
                Long l = c179107xM.A0b;
                if (l != null) {
                    GLES20.glFlush();
                    long longValue = l.longValue();
                    GLES30.glWaitSync(longValue, 0, -1L);
                    GLES30.glDeleteSync(longValue);
                }
                c179107xM.A0b = null;
                InterfaceC179037xF interfaceC179037xF = this.A02;
                c179107xM.A0a = C179107xM.A01(c179107xM, this.A01, interfaceC179037xF, this.A03, true, this.A06, this.A05);
                c179107xM.A0c = C179107xM.A04(c179107xM, c179107xM.A0c);
            }
        } finally {
            this.A04.countDown();
        }
    }
}
