package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.4b4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98254b4 implements InterfaceC92354Bq {
    public long A00;
    public android.net.Uri A01;
    public Map A02;
    public final InterfaceC92354Bq A03;

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ void cancel() {
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        this.A03.close();
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
        this.A01 = c4c7.A06;
        this.A02 = Collections.emptyMap();
        InterfaceC92354Bq interfaceC92354Bq = this.A03;
        long open = interfaceC92354Bq.open(c4c7);
        android.net.Uri uri = interfaceC92354Bq.getUri();
        uri.getClass();
        this.A01 = uri;
        this.A02 = interfaceC92354Bq.getResponseHeaders();
        return open;
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.A03.read(bArr, i, i2);
        if (read != -1) {
            this.A00 += read;
        }
        return read;
    }

    public C98254b4(InterfaceC92354Bq interfaceC92354Bq) {
        interfaceC92354Bq.getClass();
        this.A03 = interfaceC92354Bq;
        this.A01 = android.net.Uri.EMPTY;
        this.A02 = Collections.emptyMap();
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        c2bc.getClass();
        this.A03.addTransferListener(c2bc);
    }
}
