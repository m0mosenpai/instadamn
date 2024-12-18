package X;

import android.content.Context;
import com.instagram.realtimeclient.RealtimeConstants;
import java.lang.ref.Reference;
import java.net.Socket;
import java.security.cert.Certificate;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes10.dex */
public final class TUU implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public TUU(Object obj, Object obj2, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = i;
        this.A04 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String A0R;
        int length;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (this.A00 != 0) {
            Socket socket = (Socket) this.A03;
            AbstractC62803SRx.A00(socket.isConnected());
            SHW shw = (SHW) this.A02;
            SSLSocketFactory sSLSocketFactory = shw.A03;
            String str6 = this.A04;
            SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str6, this.A01, true);
            SBV sbv = shw.A01;
            sSLSocket.getInputStream();
            SSLSession session = sSLSocket.getSession();
            if (session != null) {
                if ("SSL_NULL_WITH_NULL_NULL".equals(session.getCipherSuite())) {
                    if (sSLSocket.isClosed()) {
                        str = "closed";
                    } else {
                        str = "open";
                    }
                    if (sSLSocket.isConnected()) {
                        str2 = RealtimeConstants.MQTT_CONNECTED;
                    } else {
                        str2 = RealtimeConstants.MQTT_DISCONNECTED;
                    }
                    if (sSLSocket.isBound()) {
                        str3 = "bound";
                    } else {
                        str3 = "unbound";
                    }
                    if (sSLSocket.isInputShutdown()) {
                        str4 = "input_shutdown";
                    } else {
                        str4 = "input_open";
                    }
                    if (sSLSocket.isOutputShutdown()) {
                        str5 = "output_shutdown";
                    } else {
                        str5 = "output_open";
                    }
                    throw new SSLException(AbstractC58318PtA.A0k("SSL handshake returned an invalid session. Socket state (%s, %s, %s, %s, %s, %s, %s)", new Object[]{str, str2, str3, str4, str5, str6, String.valueOf(sSLSocket.getInetAddress())}));
                }
                if (!sbv.A00.verify(str6, session)) {
                    String obj = sSLSocket.getInetAddress().toString();
                    try {
                        Certificate[] peerCertificates = session.getPeerCertificates();
                        if (peerCertificates != null && (length = peerCertificates.length) > 0) {
                            A0R = AbstractC58318PtA.A0k("num: %d, %s", new Object[]{Integer.valueOf(length), peerCertificates[0].toString()});
                        } else {
                            A0R = "No certificates";
                        }
                    } catch (SSLException e) {
                        A0R = AnonymousClass001.A0R("Exception getting certificates ", e.toString());
                    }
                    throw new SSLException(AbstractC58318PtA.A0k("could not verify hostname for (%s, %s). (%s)", new Object[]{str6, obj, A0R}));
                }
                return sSLSocket;
            }
            throw new SSLException("SSL Session is null");
        }
        Reference reference = (Reference) this.A02;
        Context context = (Context) this.A03;
        int i = this.A01;
        String str7 = this.A04;
        Context context2 = (Context) reference.get();
        if (context2 != null) {
            context = context2;
        }
        return AbstractC63385Sj0.A00(context, str7, i);
    }
}
