package X;

import java.io.File;

/* loaded from: classes10.dex */
public final class TFC implements InterfaceC23811Eo {
    public final long A00;
    public final long A01;
    public final File A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC23811Eo
    public final boolean isStreaming() {
        return true;
    }

    @Override // X.InterfaceC23811Eo
    public final void AAc(C58613Pyh c58613Pyh, String str) {
        c58613Pyh.A00(new TFM(this.A02, this.A04, this.A03, this.A01, this.A00), str);
    }

    public TFC(File file, String str) {
        String name = file.getName();
        long length = file.length();
        this.A02 = file;
        this.A04 = name;
        this.A03 = str;
        this.A01 = 0L;
        this.A00 = length;
    }

    public TFC(File file, long j, long j2) {
        String name = file.getName();
        this.A02 = file;
        this.A04 = name;
        this.A03 = "application/octet-stream";
        this.A01 = j;
        this.A00 = j2;
    }
}
