package X;

import java.io.File;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class TFS implements InterfaceC26421Px {
    public final int A00;
    public final int A01;
    public final InterfaceC65613To4 A02;
    public final File A03;

    @Override // X.InterfaceC26421Px
    public final C23781El Aqy() {
        return null;
    }

    @Override // X.InterfaceC26421Px
    public final C23781El Ar8() {
        return new C23781El("Content-Type", "application/octet-stream");
    }

    @Override // X.InterfaceC26421Px
    public final InputStream E2i() {
        TFN tfn = new TFN(this);
        InterfaceC65613To4 interfaceC65613To4 = this.A02;
        long j = this.A01;
        long j2 = this.A00;
        interfaceC65613To4.onBytesTransferred(j, j2);
        return new C58611Pye(tfn, new C61037Re9(this.A03, j, j2), j2);
    }

    @Override // X.InterfaceC26421Px
    public final long getContentLength() {
        return this.A00;
    }

    public TFS(InterfaceC65613To4 interfaceC65613To4, File file, int i, int i2) {
        this.A03 = file;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = interfaceC65613To4;
    }
}
