package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T4h implements InterfaceC92374Bs {
    public InterfaceC92354Bq A00;
    public final InterfaceC92354Bq A01;
    public final Map A02;

    @Override // X.InterfaceC92354Bq
    public final void cancel() {
    }

    @Override // X.InterfaceC92374Bs
    public final void changeHttpPriority(byte b, boolean z) {
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        return null;
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        InterfaceC92354Bq interfaceC92354Bq = this.A00;
        if (interfaceC92354Bq != null) {
            interfaceC92354Bq.close();
            this.A00 = null;
        }
    }

    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        String A0i;
        InterfaceC92354Bq interfaceC92354Bq;
        C4C7 c4c72 = c4c7;
        Map map = this.A02;
        if (map.size() == 1) {
            Iterator A16 = AbstractC166997dE.A16(map);
            A0i = null;
            while (A16.hasNext()) {
                A0i = AbstractC166987dD.A1B(A16);
            }
        } else {
            A0i = AbstractC58318PtA.A0i(c4c72.A08, map);
        }
        if (A0i != null) {
            android.net.Uri A0I = AbstractC167007dF.A0I(A0i);
            String str = null;
            Map emptyMap = Collections.emptyMap();
            if (A0I == null) {
                A0I = android.net.Uri.EMPTY;
            }
            long j = c4c72.A02;
            long j2 = c4c72.A04;
            long j3 = j - j2;
            long j4 = c4c72.A03;
            if (j4 <= 0) {
                j4 = -1;
            }
            int i = c4c72.A00;
            C4C6 c4c6 = c4c72.A07;
            String str2 = c4c72.A08;
            if (str2 != null) {
                str = str2;
            }
            C4B8.A02(A0I);
            if (c4c6 == null) {
                c4c6 = new C4C6();
            }
            c4c72 = new C4C7(A0I, c4c6, str, emptyMap, null, 1, i, j3, j2, j4);
            interfaceC92354Bq = new C4C1(false);
        } else {
            interfaceC92354Bq = this.A01;
        }
        this.A00 = interfaceC92354Bq;
        return interfaceC92354Bq.open(c4c72);
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC92354Bq interfaceC92354Bq = this.A00;
        if (interfaceC92354Bq == null) {
            return -1;
        }
        return interfaceC92354Bq.read(bArr, i, i2);
    }

    public T4h(InterfaceC92354Bq interfaceC92354Bq, Map map) {
        this.A01 = interfaceC92354Bq;
        this.A02 = map;
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
