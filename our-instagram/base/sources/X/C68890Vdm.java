package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/* renamed from: X.Vdm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68890Vdm {
    public final BlockingQueue A00 = new DelayQueue();
    public final X1t[] A01;

    public C68890Vdm(int i) {
        this.A01 = new X1t[i];
        int i2 = 0;
        while (true) {
            X1t[] x1tArr = this.A01;
            if (i2 < x1tArr.length) {
                x1tArr[i2] = new X1t(this);
                this.A01[i2].setName(AnonymousClass001.A0O("GCD-Thread #", i2));
                this.A01[i2].start();
                i2++;
            } else {
                return;
            }
        }
    }
}
