package X;

import com.facebook.common.build.BuildConstants;
import java.io.File;

/* loaded from: classes10.dex */
public final class SHL {
    public final InterfaceC216113n A00;
    public final File A01;
    public final File A02;
    public final File A03;

    public SHL(InterfaceC216113n interfaceC216113n, File file, File file2) {
        C0J8.A03(file, "cacheDir == null");
        this.A01 = file;
        C0J8.A03(file2, "tempDir == null");
        this.A03 = file2;
        this.A00 = interfaceC216113n;
        this.A02 = MSW.A0w(file, String.valueOf(BuildConstants.A01()));
    }
}
