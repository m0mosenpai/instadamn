package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class Aw0 implements Runnable {
    public final /* synthetic */ AK8 A00;
    public final /* synthetic */ IOException A01;

    public Aw0(AK8 ak8, IOException iOException) {
        this.A00 = ak8;
        this.A01 = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A07.A02(this.A01);
    }
}
