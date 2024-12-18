package X;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public final class SXB {
    public Socket A00;
    public final int A01;
    public final SHW A02;
    public final InetAddress A03;
    public final InetAddress A04;
    public final ScheduledExecutorService A05;
    public final int A06;
    public final int A07;

    public static void A00(SXB sxb, InetAddress inetAddress, Socket socket, Socket socket2) {
        socket.setTcpNoDelay(true);
        socket.setSoTimeout(0);
        socket.setKeepAlive(false);
        socket.connect(new InetSocketAddress(inetAddress, sxb.A06), sxb.A07);
        synchronized (sxb) {
            if (sxb.A00 == null) {
                sxb.A00 = socket;
                try {
                    socket2.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public SXB(SHW shw, InetAddress inetAddress, InetAddress inetAddress2, ScheduledExecutorService scheduledExecutorService, int i, int i2, int i3) {
        this.A02 = shw;
        this.A04 = inetAddress;
        this.A03 = inetAddress2;
        this.A06 = i;
        this.A07 = i2;
        this.A05 = scheduledExecutorService;
        this.A01 = i3;
    }
}
