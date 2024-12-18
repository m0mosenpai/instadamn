package X;

import java.io.FileNotFoundException;

/* loaded from: classes4.dex */
public final class Aw1 implements Runnable {
    public final /* synthetic */ AK8 A00;
    public final /* synthetic */ FileNotFoundException A01;

    public Aw1(AK8 ak8, FileNotFoundException fileNotFoundException) {
        this.A00 = ak8;
        this.A01 = fileNotFoundException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A07.A02(this.A01);
    }
}
