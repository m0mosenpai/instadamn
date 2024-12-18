package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* renamed from: X.TWk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64844TWk implements InterfaceC65677Tr7 {
    public final /* synthetic */ C65172Tel A00;
    public final /* synthetic */ InterfaceC65677Tr7 A01;

    public C64844TWk(C65172Tel c65172Tel, InterfaceC65677Tr7 interfaceC65677Tr7) {
        this.A00 = c65172Tel;
        this.A01 = interfaceC65677Tr7;
    }

    @Override // X.InterfaceC65677Tr7
    public final long E7q(TWX twx, long j) {
        C65172Tel c65172Tel = this.A00;
        c65172Tel.A08();
        try {
            try {
                long E7q = this.A01.E7q(twx, j);
                c65172Tel.A09();
                return E7q;
            } catch (IOException e) {
                if (c65172Tel.A0A()) {
                    SocketTimeoutException socketTimeoutException = new SocketTimeoutException(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
                    socketTimeoutException.initCause(e);
                    throw socketTimeoutException;
                }
                throw e;
            }
        } catch (Throwable th) {
            c65172Tel.A0A();
            throw th;
        }
    }

    @Override // X.InterfaceC65677Tr7
    public final C63030Sb2 Eq9() {
        return this.A00;
    }

    @Override // X.InterfaceC65677Tr7, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        C65172Tel c65172Tel = this.A00;
        c65172Tel.A08();
        try {
            try {
                this.A01.close();
                c65172Tel.A09();
            } catch (IOException e) {
                if (c65172Tel.A0A()) {
                    SocketTimeoutException socketTimeoutException = new SocketTimeoutException(PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);
                    socketTimeoutException.initCause(e);
                    throw socketTimeoutException;
                }
            }
        } catch (Throwable th) {
            c65172Tel.A0A();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AsyncTimeout.source(");
        return AbstractC58323PtF.A0q(this.A01, A1C);
    }
}
