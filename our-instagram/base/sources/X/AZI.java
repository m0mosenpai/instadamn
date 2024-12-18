package X;

import android.opengl.GLES30;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.List;

/* loaded from: classes4.dex */
public final class AZI implements InterfaceC179447xu {
    public int A00;
    public C179427xs A01;
    public final ABU A02;
    public final C81F A04;
    public final C178747wm A07;
    public final Object A05 = new Object();
    public final List A06 = AbstractC166987dD.A1E();
    public final C22807A4a A03 = new Object();

    @Override // X.InterfaceC179447xu
    public final InterfaceC179467xw B8Z() {
        List list;
        C179457xv c179457xv;
        Object obj = this.A05;
        synchronized (obj) {
            C179427xs c179427xs = this.A01;
            if (c179427xs != null) {
                this.A02.A00(c179427xs);
            }
            this.A00--;
            do {
                list = this.A06;
                if (!AbstractC166987dD.A1b(list)) {
                    try {
                        obj.wait(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                    } catch (InterruptedException unused) {
                    }
                } else {
                    Object remove = list.remove(0);
                    remove.getClass();
                    this.A01 = (C179427xs) remove;
                    long j = this.A03.A00;
                    if (j != 0) {
                        GLES30.glWaitSync(j, 0, -1L);
                        c179457xv = this.A01.A0A;
                        obj.notifyAll();
                    } else {
                        throw AbstractC166987dD.A18("can't wait for non existing fence");
                    }
                }
            } while (AbstractC166987dD.A1b(list));
            throw AbstractC166987dD.A18("decoding took too long :(");
        }
        return c179457xv;
    }

    @Override // X.InterfaceC179447xu
    public final /* synthetic */ int BHw() {
        return 0;
    }

    @Override // X.InterfaceC179447xu
    public final void EZr(InterfaceC1809280u interfaceC1809280u) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.A4a, java.lang.Object] */
    public AZI(C178747wm c178747wm) {
        this.A07 = c178747wm;
        this.A02 = new ABU(c178747wm);
        this.A04 = new C81F(c178747wm);
    }
}
