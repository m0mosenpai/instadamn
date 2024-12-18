package X;

import java.io.File;
import java.nio.charset.Charset;

/* renamed from: X.1NV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NV {
    public static final Charset A04 = Charset.forName("US-ASCII");
    public final C1NR A00;
    public final File A01;
    public final File A02;
    public final File A03;

    public C1NV(C1NR c1nr, File file) {
        this.A01 = file;
        this.A00 = c1nr;
        this.A02 = new File(file, "blocker_journal");
        this.A03 = new File(file, "blocker_journal.tmp");
    }
}
