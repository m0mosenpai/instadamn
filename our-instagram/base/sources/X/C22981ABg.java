package X;

import android.opengl.GLES20;
import android.opengl.GLES30;

/* renamed from: X.ABg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22981ABg {
    public long A00;
    public InterfaceC25162BBi A01;
    public Long A02;
    public boolean A03;
    public final /* synthetic */ AZB A04;

    public C22981ABg(AZB azb) {
        this.A04 = azb;
    }

    public final void A00(int i, int i2) {
        if (this.A03 && this.A04.A02.A03.BZA() >= 3) {
            AbstractC1808580n.A03("WaitForGpuCompletion");
            Long l = this.A02;
            if (l != null) {
                GLES30.glClientWaitSync(l.longValue(), 1, 500000000L);
                GLES30.glDeleteSync(this.A02.longValue());
                this.A02 = null;
            }
            this.A02 = Long.valueOf(GLES30.glFenceSync(37143, 0));
            GLES20.glFlush();
            AbstractC1808580n.A01();
        }
        InterfaceC25162BBi interfaceC25162BBi = this.A01;
        if (interfaceC25162BBi != null) {
            interfaceC25162BBi.DIO(this.A00, i, i2);
        }
    }
}
