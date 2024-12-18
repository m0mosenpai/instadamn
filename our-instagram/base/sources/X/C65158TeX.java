package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.List;

/* renamed from: X.TeX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65158TeX extends AbstractC61528Rp4 {
    public int A01;
    public int A02;
    public int A03;
    public Socket A05;
    public Socket A06;
    public C62996SaK A07;
    public EnumC61215RhF A08;
    public THU A09;
    public InterfaceC65700TsM A0A;
    public InterfaceC65701TsN A0B;
    public boolean A0C;
    public final SP2 A0E;
    public final SZ7 A0F;
    public int A00 = 1;
    public final List A0D = AbstractC166987dD.A1E();
    public long A04 = Long.MAX_VALUE;

    public static void A00(C65158TeX c65158TeX, int i, int i2) {
        Socket createSocket;
        SP2 sp2 = c65158TeX.A0E;
        Proxy proxy = sp2.A01;
        C62756SPn c62756SPn = sp2.A02;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.HTTP) {
            createSocket = new Socket(proxy);
        } else {
            createSocket = c62756SPn.A04.createSocket();
        }
        c65158TeX.A05 = createSocket;
        createSocket.setSoTimeout(i2);
        try {
            C63220SfQ c63220SfQ = C63220SfQ.A01;
            Socket socket = c65158TeX.A05;
            InetSocketAddress inetSocketAddress = sp2.A00;
            if (c63220SfQ instanceof C65163Tec) {
                try {
                    socket.connect(inetSocketAddress, i);
                } catch (AssertionError e) {
                    if (AbstractC63404SjZ.A0B(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                } catch (ClassCastException e2) {
                    throw e2;
                }
            } else {
                socket.connect(inetSocketAddress, i);
            }
            try {
                c65158TeX.A0B = new TWW(C63261SgK.A01(c65158TeX.A05));
                c65158TeX.A0A = new TWV(C63261SgK.A00(c65158TeX.A05));
            } catch (NullPointerException e3) {
                if ("throw with null exception".equals(e3.getMessage())) {
                    throw new IOException(e3);
                }
            }
        } catch (ConnectException e4) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("Failed to connect to ");
            ConnectException connectException = new ConnectException(AbstractC166997dE.A0v(sp2.A00, A1C));
            connectException.initCause(e4);
            throw connectException;
        }
    }

    public final void A01() {
        synchronized (this.A0F) {
            this.A0C = true;
        }
    }

    public final boolean A02(C63379Sit c63379Sit) {
        int i = c63379Sit.A00;
        C63379Sit c63379Sit2 = this.A0E.A02.A0A;
        if (i != c63379Sit2.A00) {
            return false;
        }
        String str = c63379Sit.A02;
        if (str.equals(c63379Sit2.A02)) {
            return true;
        }
        C62996SaK c62996SaK = this.A07;
        if (c62996SaK == null || !TVx.A00.A01(str, (X509Certificate) c62996SaK.A00.get(0))) {
            return false;
        }
        return true;
    }

    public C65158TeX(SP2 sp2, SZ7 sz7) {
        this.A0F = sz7;
        this.A0E = sp2;
    }

    public final String toString() {
        Object obj;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Connection{");
        SP2 sp2 = this.A0E;
        C63379Sit c63379Sit = sp2.A02.A0A;
        A1C.append(c63379Sit.A02);
        A1C.append(":");
        A1C.append(c63379Sit.A00);
        A1C.append(", proxy=");
        A1C.append(sp2.A01);
        A1C.append(" hostAddress=");
        A1C.append(sp2.A00);
        A1C.append(" cipherSuite=");
        C62996SaK c62996SaK = this.A07;
        if (c62996SaK != null) {
            obj = c62996SaK.A01;
        } else {
            obj = NetInfoModule.CONNECTION_TYPE_NONE;
        }
        A1C.append(obj);
        A1C.append(" protocol=");
        return AbstractC58320PtC.A11(this.A08, A1C);
    }
}
