package X;

import ca.psiphon.PsiphonTunnel;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

/* renamed from: X.Wqw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71267Wqw implements Runnable {
    public final /* synthetic */ C69439VnO A00;

    public RunnableC71267Wqw(C69439VnO c69439VnO) {
        this.A00 = c69439VnO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object c09540e5;
        C69439VnO c69439VnO = this.A00;
        try {
            C55097Ob8 c55097Ob8 = c69439VnO.A07;
            String str = c69439VnO.A08;
            long j = c69439VnO.A02;
            StringBuilder sb = new StringBuilder();
            sb.append(MSV.A00(PsiphonTunnel.VPN_INTERFACE_MTU));
            sb.append(str);
            sb.append('_');
            sb.append(j);
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(C55097Ob8.A00(c55097Ob8, AbstractC166997dE.A0x(".wav", sb))));
            c55097Ob8.A04(str);
            try {
                int i = c69439VnO.A01 / 2;
                short[] sArr = new short[i];
                for (int i2 = 0; i2 < i; i2++) {
                    byte[] bArr = c69439VnO.A0A;
                    int i3 = i2 * 2;
                    sArr[i2] = (short) ((bArr[i3] & 255) + (bArr[i3 + 1] << 8));
                }
                byte[] bArr2 = new byte[i];
                for (int i4 = 0; i4 < i; i4 += 2) {
                    int i5 = i4 + 1;
                    int i6 = (sArr[i4] + sArr[i5]) / 2;
                    bArr2[i4] = (byte) (i6 & 255);
                    bArr2[i5] = (byte) ((i6 >> 8) & 255);
                }
                int i7 = i + 36;
                int i8 = c69439VnO.A03.A01;
                int i9 = (i8 * 16) / 8;
                dataOutputStream.write(new byte[]{82, 73, 70, 70, (byte) (i7 & 255), (byte) ((i7 >> 8) & 255), (byte) ((i7 >> 16) & 255), (byte) ((i7 >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, 1, 0, (byte) (i8 & 255), (byte) ((i8 >> 8) & 255), (byte) ((i8 >> 16) & 255), (byte) ((i8 >> 24) & 255), (byte) (i9 & 255), (byte) ((i9 >> 8) & 255), (byte) ((i9 >> 16) & 255), (byte) ((i9 >> 24) & 255), 2, 0, 16, 0, 100, 97, 116, 97, (byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
                dataOutputStream.write(bArr2);
                c69439VnO.A04 = true;
                c69439VnO.A05 = false;
                dataOutputStream.close();
                c09540e5 = C0eB.A00;
            } finally {
            }
        } catch (Throwable th) {
            c09540e5 = new C09540e5(th);
        }
        Throwable A00 = C09550e6.A00(c09540e5);
        if (A00 != null) {
            C0K8.A0C("MediaAccuracyAudioCapture", AbstractC167017dG.A0n(A00, "Exception while  writing the buffer to the file ", new StringBuilder()));
            c69439VnO.A06.A01(C05F.A05, C05F.A00, Long.valueOf(c69439VnO.A02), c69439VnO.A08, null, "Failed while saving bytes into a wav file.", A00, null, AbstractC167007dF.A0n("bytes_recorded", String.valueOf(c69439VnO.A01)));
            c69439VnO.A01 = 0;
            c69439VnO.A00 = 0;
        }
        if (!(c09540e5 instanceof C09540e5)) {
            c69439VnO.A06.A02(C05F.A06, C05F.A00, Long.valueOf(c69439VnO.A02), c69439VnO.A08, null, AbstractC167007dF.A0n("bytes_recorded", String.valueOf(c69439VnO.A01)));
            c69439VnO.A01 = 0;
            c69439VnO.A00 = 0;
        }
    }
}
