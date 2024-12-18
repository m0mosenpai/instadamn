package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class TFM implements InterfaceC65673Tr3 {
    public final long A00;
    public final long A01;
    public final File A02;
    public final String A03;
    public final String A04;

    public TFM(File file, String str, String str2, long j, long j2) {
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A02 = file;
        this.A03 = str2;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // X.InterfaceC65527Tlw
    public final long Ch9() {
        return this.A00;
    }

    @Override // X.InterfaceC65527Tlw
    public final InputStream E2i() {
        long j = this.A01;
        if (j == 0) {
            long j2 = this.A00;
            File file = this.A02;
            if (j2 == file.length()) {
                return new FileInputStream(file);
            }
        }
        FileInputStream fileInputStream = new FileInputStream(this.A02);
        fileInputStream.skip(j);
        return new C61001RdU(fileInputStream, this.A00);
    }

    @Override // X.InterfaceC65673Tr3
    public final String getContentType() {
        return this.A03;
    }

    @Override // X.InterfaceC65673Tr3
    public final String getName() {
        return this.A04;
    }
}
