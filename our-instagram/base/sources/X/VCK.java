package X;

import java.io.File;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes11.dex */
public final class VCK extends File {
    public final CountDownLatch A00;
    public volatile boolean A01;
    public volatile boolean A02;

    public VCK(String str, boolean z) {
        super(str);
        this.A01 = false;
        this.A02 = false;
        this.A00 = AbstractC58319PtB.A15();
        this.A02 = z;
    }
}
