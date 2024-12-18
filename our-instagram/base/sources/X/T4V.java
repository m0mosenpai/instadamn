package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class T4V implements InterfaceC92354Bq {
    public long A00;
    public boolean A01;
    public final C4JB A02;
    public final InterfaceC92354Bq A03;

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ void cancel() {
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        try {
            this.A03.close();
        } finally {
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        }
    }

    @Override // X.InterfaceC92354Bq
    public final Map getResponseHeaders() {
        return this.A03.getResponseHeaders();
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        return this.A03.getUri();
    }

    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        long open = this.A03.open(c4c7);
        this.A00 = open;
        if (open == 0) {
            return 0L;
        }
        if (c4c7.A03 == -1 && open != -1) {
            c4c7 = c4c7.A00(0L, open);
        }
        this.A01 = true;
        this.A02.E2L(c4c7);
        return this.A00;
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i, i2);
        if (read <= 0) {
            return read;
        }
        this.A02.write(bArr, i, read);
        long j = this.A00;
        if (j == -1) {
            return read;
        }
        this.A00 = j - read;
        return read;
    }

    public T4V(C4JB c4jb, InterfaceC92354Bq interfaceC92354Bq) {
        this.A03 = interfaceC92354Bq;
        this.A02 = c4jb;
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        c2bc.getClass();
        this.A03.addTransferListener(c2bc);
    }
}
