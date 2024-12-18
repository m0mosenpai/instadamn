package X;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.4aR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97864aR implements InterfaceC97874aS {
    public android.net.Uri A00;
    public final InterfaceC92354Bq A01;

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ void cancel() {
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        this.A01.close();
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        return this.A00;
    }

    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        this.A00 = c4c7.A06;
        return this.A01.open(c4c7);
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.A01.read(bArr, i, i2);
        } catch (IOException e) {
            throw e;
        }
    }

    public C97864aR(InterfaceC92354Bq interfaceC92354Bq) {
        this.A01 = interfaceC92354Bq;
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        c2bc.getClass();
        this.A01.addTransferListener(c2bc);
    }

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
