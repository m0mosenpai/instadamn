package X;

import android.graphics.Point;

/* renamed from: X.AxM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24738AxM implements Runnable {
    public final /* synthetic */ C175297r3 A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ float[] A02;

    public RunnableC24738AxM(C175297r3 c175297r3, Integer num, float[] fArr) {
        this.A00 = c175297r3;
        this.A02 = fArr;
        this.A01 = num;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Point point;
        InterfaceC198408pp interfaceC198408pp = this.A00.A02;
        if (interfaceC198408pp != null) {
            float[] fArr = this.A02;
            Integer num = this.A01;
            if (fArr != null) {
                point = new Point((int) fArr[0], (int) fArr[1]);
            } else {
                point = null;
            }
            interfaceC198408pp.DHd(point, num);
        }
    }
}
