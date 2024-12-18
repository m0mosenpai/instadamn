package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes10.dex */
public final class TWb implements InterfaceC65679Tr9 {
    public final /* synthetic */ C65172Tel A00;
    public final /* synthetic */ InterfaceC65679Tr9 A01;

    @Override // X.InterfaceC65679Tr9
    public final void FEM(TWX twx, long j) {
        long j2 = j;
        SUN.A00(twx.A00, 0L, j2);
        while (true) {
            long j3 = 0;
            if (j2 > 0) {
                C63304ShA c63304ShA = twx.A01;
                while (true) {
                    j3 += C63304ShA.A00(c63304ShA);
                    if (j3 >= j2) {
                        j3 = j2;
                        break;
                    } else {
                        c63304ShA = c63304ShA.A02;
                        if (j3 >= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED) {
                            break;
                        }
                    }
                }
                C65172Tel c65172Tel = this.A00;
                c65172Tel.A08();
                try {
                    try {
                        this.A01.FEM(twx, j3);
                        j2 -= j3;
                        c65172Tel.A09();
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
            } else {
                return;
            }
        }
    }

    public TWb(C65172Tel c65172Tel, InterfaceC65679Tr9 interfaceC65679Tr9) {
        this.A00 = c65172Tel;
        this.A01 = interfaceC65679Tr9;
    }

    @Override // X.InterfaceC65679Tr9
    public final C63030Sb2 Eq9() {
        return this.A00;
    }

    @Override // X.InterfaceC65679Tr9, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
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

    @Override // X.InterfaceC65679Tr9, java.io.Flushable
    public final void flush() {
        C65172Tel c65172Tel = this.A00;
        c65172Tel.A08();
        try {
            try {
                this.A01.flush();
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
        A1C.append("AsyncTimeout.sink(");
        return AbstractC58323PtF.A0q(this.A01, A1C);
    }
}
