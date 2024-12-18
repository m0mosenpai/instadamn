package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T4W implements InterfaceC92354Bq {
    public InterfaceC92354Bq A00;
    public final UserSession A01;
    public final T4Z A02;
    public final T4Y A03;

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ void cancel() {
    }

    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        InterfaceC92354Bq interfaceC92354Bq;
        String A0R;
        C14360o3.A0B(c4c7, 0);
        android.net.Uri uri = c4c7.A06;
        C14360o3.A06(uri);
        if (uri.getQueryParameter("sidecar") != null) {
            LJJ ljj = C48517LdF.A08;
            C48517LdF A01 = LJJ.A01(this.A01);
            String queryParameter = uri.getQueryParameter("sha256");
            String queryParameter2 = uri.getQueryParameter("mimetype");
            if (queryParameter == null || queryParameter2 == null || (A0R = AnonymousClass001.A0R(AbstractC62268S4n.A00(queryParameter), LLT.A05(queryParameter2))) == null || !C48517LdF.A00(A01, A0R).exists()) {
                interfaceC92354Bq = this.A02;
                InterfaceC92354Bq interfaceC92354Bq2 = interfaceC92354Bq;
                this.A00 = interfaceC92354Bq2;
                return interfaceC92354Bq2.open(c4c7);
            }
        }
        interfaceC92354Bq = this.A03;
        InterfaceC92354Bq interfaceC92354Bq22 = interfaceC92354Bq;
        this.A00 = interfaceC92354Bq22;
        return interfaceC92354Bq22.open(c4c7);
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        C14360o3.A0B(bArr, 0);
        return this.A00.read(bArr, i, i2);
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        this.A00.addTransferListener(c2bc);
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        this.A00.close();
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        return this.A00.getUri();
    }

    public T4W(UserSession userSession, T4Z t4z, T4Y t4y) {
        this.A01 = userSession;
        this.A02 = t4z;
        this.A03 = t4y;
        this.A00 = t4z;
    }

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
