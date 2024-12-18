package X;

import android.os.SystemClock;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* renamed from: X.T4a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64211T4a implements InterfaceC98244b3 {
    @Override // X.InterfaceC98244b3
    public final void AGY() {
    }

    @Override // X.InterfaceC98244b3
    public final void ChG() {
        synchronized (AbstractC63115SdJ.A02) {
            Object obj = AbstractC63115SdJ.A03;
            synchronized (obj) {
                try {
                    if (!AbstractC63115SdJ.A01) {
                        synchronized (obj) {
                            try {
                            } finally {
                            }
                        }
                        InetAddress byName = InetAddress.getByName("time.android.com");
                        DatagramSocket datagramSocket = new DatagramSocket();
                        try {
                            datagramSocket.setSoTimeout(10000);
                            byte[] bArr = new byte[48];
                            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
                            bArr[0] = 27;
                            long currentTimeMillis = System.currentTimeMillis();
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (currentTimeMillis == 0) {
                                Arrays.fill(bArr, 40, 48, (byte) 0);
                            } else {
                                long j = currentTimeMillis / 1000;
                                long j2 = currentTimeMillis - (j * 1000);
                                long j3 = j + 2208988800L;
                                bArr[40] = (byte) (j3 >> 24);
                                bArr[41] = (byte) (j3 >> 16);
                                bArr[42] = (byte) (j3 >> 8);
                                bArr[43] = (byte) (j3 >> 0);
                                long j4 = (j2 * 4294967296L) / 1000;
                                bArr[44] = (byte) (j4 >> 24);
                                bArr[45] = (byte) (j4 >> 16);
                                bArr[46] = (byte) (j4 >> 8);
                                bArr[47] = (byte) (Math.random() * 255.0d);
                            }
                            datagramSocket.send(datagramPacket);
                            datagramSocket.receive(new DatagramPacket(bArr, 48));
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            long j5 = currentTimeMillis + (elapsedRealtime2 - elapsedRealtime);
                            byte b = bArr[0];
                            byte b2 = (byte) ((b >> 6) & 3);
                            byte b3 = (byte) (b & 7);
                            int i = bArr[1] & 255;
                            long A00 = AbstractC63115SdJ.A00(bArr, 24);
                            long A002 = AbstractC63115SdJ.A00(bArr, 32);
                            long A003 = AbstractC63115SdJ.A00(bArr, 40);
                            if (b2 != 3) {
                                if (b3 == 4 || b3 == 5) {
                                    if (i != 0 && i <= 15) {
                                        if (A003 != 0) {
                                            long j6 = (j5 + (((A002 - A00) + (A003 - j5)) / 2)) - elapsedRealtime2;
                                            datagramSocket.close();
                                            synchronized (obj) {
                                                try {
                                                    AbstractC63115SdJ.A00 = j6;
                                                    AbstractC63115SdJ.A01 = true;
                                                } finally {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    throw AbstractC58320PtC.A0i("SNTP: Untrusted mode: ", b3);
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                datagramSocket.close();
                                throw th;
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                throw th;
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }
}
