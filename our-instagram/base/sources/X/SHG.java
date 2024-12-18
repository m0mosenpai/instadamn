package X;

import java.io.File;
import java.util.Random;

/* loaded from: classes10.dex */
public final class SHG {
    public final File A00;
    public final File A01;
    public final File A02;
    public final Random A03 = new Random();

    public SHG(File file) {
        this.A00 = file;
        this.A02 = MSW.A0w(file, "beacon_id.lock");
        this.A01 = MSW.A0w(file, "beacon_id");
    }
}
