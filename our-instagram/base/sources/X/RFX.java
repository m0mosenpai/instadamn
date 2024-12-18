package X;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes10.dex */
public final class RFX extends C4C1 {
    public int A00;
    public android.net.Uri A01;
    public DatagramSocket A02;
    public InetAddress A03;
    public MulticastSocket A04;
    public boolean A05;
    public final DatagramPacket A06;
    public final byte[] A07;

    @Override // X.InterfaceC92354Bq
    public final void close() {
        this.A01 = null;
        MulticastSocket multicastSocket = this.A04;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.A03;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.A04 = null;
        }
        DatagramSocket datagramSocket = this.A02;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.A02 = null;
        }
        this.A03 = null;
        this.A00 = 0;
        if (this.A05) {
            this.A05 = false;
            A01();
        }
    }

    public RFX() {
        super(true);
        byte[] bArr = new byte[CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS];
        this.A07 = bArr;
        this.A06 = new DatagramPacket(bArr, 0, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        return this.A01;
    }

    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        DatagramSocket datagramSocket;
        android.net.Uri uri = c4c7.A06;
        this.A01 = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.A01.getPort();
        A02();
        try {
            InetAddress byName = InetAddress.getByName(host);
            this.A03 = byName;
            InetSocketAddress inetSocketAddress = new InetSocketAddress(byName, port);
            if (this.A03.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.A04 = multicastSocket;
                multicastSocket.joinGroup(this.A03);
                datagramSocket = this.A04;
            } else {
                datagramSocket = new DatagramSocket(inetSocketAddress);
            }
            this.A02 = datagramSocket;
            datagramSocket.setSoTimeout(CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD);
            this.A05 = true;
            A04(c4c7);
            return -1L;
        } catch (IOException e) {
            throw new C93224Fy(2001, e);
        } catch (SecurityException e2) {
            throw new C93224Fy(2006, e2);
        }
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.A00 == 0) {
            try {
                DatagramSocket datagramSocket = this.A02;
                datagramSocket.getClass();
                DatagramPacket datagramPacket = this.A06;
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.A00 = length;
                A03(length);
            } catch (SocketTimeoutException e) {
                throw new C93224Fy(2002, e);
            } catch (IOException e2) {
                throw new C93224Fy(2001, e2);
            }
        }
        int length2 = this.A06.getLength();
        int i3 = this.A00;
        int min = Math.min(i3, i2);
        System.arraycopy(this.A07, length2 - i3, bArr, i, min);
        this.A00 -= min;
        return min;
    }
}
