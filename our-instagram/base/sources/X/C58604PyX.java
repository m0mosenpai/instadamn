package X;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.PyX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58604PyX implements InterfaceC92354Bq {
    public InterfaceC92354Bq A00;
    public InterfaceC92354Bq A01;
    public InterfaceC92354Bq A02;
    public InterfaceC92354Bq A03;
    public InterfaceC92354Bq A04;
    public InterfaceC92354Bq A05;
    public InterfaceC92354Bq A06;
    public InterfaceC92354Bq A07;
    public final Context A08;
    public final InterfaceC92354Bq A09;
    public final List A0A;

    private void A00(InterfaceC92354Bq interfaceC92354Bq) {
        int i = 0;
        while (true) {
            List list = this.A0A;
            if (i < list.size()) {
                interfaceC92354Bq.addTransferListener((C2BC) list.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ void cancel() {
    }

    public C58604PyX(Context context, String str) {
        C4CB c4cb = new C4CB(new C4CC(), str, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD);
        this.A08 = context.getApplicationContext();
        this.A09 = c4cb;
        this.A0A = AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        InterfaceC92354Bq interfaceC92354Bq = this.A07;
        if (interfaceC92354Bq != null) {
            try {
                interfaceC92354Bq.close();
            } finally {
                this.A07 = null;
            }
        }
    }

    @Override // X.InterfaceC92354Bq
    public final Map getResponseHeaders() {
        InterfaceC92354Bq interfaceC92354Bq = this.A07;
        if (interfaceC92354Bq == null) {
            return Collections.emptyMap();
        }
        return interfaceC92354Bq.getResponseHeaders();
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        InterfaceC92354Bq interfaceC92354Bq = this.A07;
        if (interfaceC92354Bq == null) {
            return null;
        }
        return interfaceC92354Bq.getUri();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    @Override // X.InterfaceC92354Bq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long open(X.C4C7 r5) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58604PyX.open(X.4C7):long");
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC92354Bq interfaceC92354Bq = this.A07;
        interfaceC92354Bq.getClass();
        return interfaceC92354Bq.read(bArr, i, i2);
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        c2bc.getClass();
        this.A09.addTransferListener(c2bc);
        this.A0A.add(c2bc);
        InterfaceC92354Bq interfaceC92354Bq = this.A03;
        if (interfaceC92354Bq != null) {
            interfaceC92354Bq.addTransferListener(c2bc);
        }
        InterfaceC92354Bq interfaceC92354Bq2 = this.A00;
        if (interfaceC92354Bq2 != null) {
            interfaceC92354Bq2.addTransferListener(c2bc);
        }
        InterfaceC92354Bq interfaceC92354Bq3 = this.A01;
        if (interfaceC92354Bq3 != null) {
            interfaceC92354Bq3.addTransferListener(c2bc);
        }
        InterfaceC92354Bq interfaceC92354Bq4 = this.A05;
        if (interfaceC92354Bq4 != null) {
            interfaceC92354Bq4.addTransferListener(c2bc);
        }
        InterfaceC92354Bq interfaceC92354Bq5 = this.A06;
        if (interfaceC92354Bq5 != null) {
            interfaceC92354Bq5.addTransferListener(c2bc);
        }
        InterfaceC92354Bq interfaceC92354Bq6 = this.A02;
        if (interfaceC92354Bq6 != null) {
            interfaceC92354Bq6.addTransferListener(c2bc);
        }
        InterfaceC92354Bq interfaceC92354Bq7 = this.A04;
        if (interfaceC92354Bq7 != null) {
            interfaceC92354Bq7.addTransferListener(c2bc);
        }
    }
}
