package X;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: X.SYx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62955SYx {
    public static final S5Y A04 = new Object();
    public static final InterfaceC09390do A05 = AbstractC09440dt.A01(C65020Tbj.A00);
    public Class A00;
    public Method A01;
    public Method A02;
    public boolean A03;

    public final void A00(String str, Socket socket) {
        C14360o3.A0B(str, 1);
        if (socket != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                if (SSLSockets.isSupportedSocket(sSLSocket)) {
                    SSLSockets.setUseSessionTickets(sSLSocket, true);
                }
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                if (sSLParameters != null) {
                    sSLParameters.setServerNames(AbstractC166987dD.A1J(new SNIHostName(str)));
                    sSLSocket.setSSLParameters(sSLParameters);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            if (!this.A03) {
                return;
            }
            Class cls = this.A00;
            if (cls != null) {
                if (!cls.isInstance(socket)) {
                    return;
                }
                try {
                    Method method = this.A02;
                    if (method != null) {
                        method.invoke(socket, true);
                        Method method2 = this.A01;
                        if (method2 != null) {
                            method2.invoke(socket, str);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                } catch (IllegalAccessException e) {
                    throw AbstractC58318PtA.A0W(e);
                } catch (InvocationTargetException e2) {
                    throw AbstractC58318PtA.A0f(e2);
                }
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public C62955SYx() {
        Class<?> cls;
        Method method;
        try {
            try {
                cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            }
            this.A00 = cls;
            if (cls == null) {
                method = null;
            } else {
                method = cls.getMethod("setUseSessionTickets", Boolean.TYPE);
            }
            this.A02 = method;
            Class cls2 = this.A00;
            this.A01 = cls2 != null ? cls2.getMethod("setHostname", String.class) : null;
            this.A03 = true;
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
        }
    }
}
