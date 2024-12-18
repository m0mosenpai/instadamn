package X;

import android.media.AudioRecord;
import android.os.Handler;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class AM5 {
    public int A00;
    public int A01;
    public AudioRecord A02;
    public boolean A03;
    public final int A04;
    public final long A05;
    public final Handler A06;
    public final InterfaceC176077sQ A07;
    public final C177547uo A08;
    public final C175927s7 A09;
    public final Runnable A0A;
    public final Runnable A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final BDY A0E;
    public volatile Integer A0F;

    public final void A06(InterfaceC176157sY interfaceC176157sY, Handler handler) {
        synchronized (this) {
            this.A09.A01("sARc");
            A01(handler);
            this.A0F = C05F.A00;
            this.A06.post(new Ax7(handler, this, interfaceC176157sY));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.9b8, X.9ty] */
    public static int A00(AM5 am5, byte[] bArr) {
        int read;
        Integer num = am5.A0F;
        Integer num2 = C05F.A0C;
        if (num == num2) {
            C175927s7 c175927s7 = am5.A09;
            c175927s7.A01("rbAR");
            long j = am5.A05;
            AudioRecord audioRecord = am5.A02;
            int length = bArr.length;
            if (j > 0) {
                read = audioRecord.read(bArr, 0, length, 1);
            } else {
                read = audioRecord.read(bArr, 0, length);
            }
            c175927s7.A01("rbARs");
            if (am5.A0F == num2) {
                if (read > 0) {
                    AH7 AXE = am5.A07.AXE();
                    if (AXE != null) {
                        AXE.A05 += read;
                        AXE.A03++;
                    }
                    if (!am5.A03) {
                        am5.A03 = true;
                        c175927s7.A01("ffAR");
                        am5.A0E.DHP();
                        c175927s7.A01("ffARs");
                    }
                    c175927s7.A01("daAR");
                    am5.A0E.D9C(bArr, read);
                    c175927s7.A01("daARs");
                    return 0;
                }
                if (read == 0) {
                    c175927s7.A01("oerAR");
                    AH7 AXE2 = am5.A07.AXE();
                    if (AXE2 != null) {
                        AXE2.A02++;
                    }
                    return 1;
                }
                c175927s7.A01("oreAR");
                AH7 AXE3 = am5.A07.AXE();
                if (AXE3 != null) {
                    AXE3.A04++;
                }
                int i = 22003;
                if (read == -3) {
                    i = 22004;
                }
                ?? abstractC223559ty = new AbstractC223559ty(i, String.format(null, AbstractC111324zv.A00(636), Integer.valueOf(read)));
                A02(abstractC223559ty, am5);
                am5.A0E.DE6(abstractC223559ty);
                return 2;
            }
        }
        return 3;
    }

    private void A01(Handler handler) {
        if (handler != null) {
            if (this.A06.getLooper() != handler.getLooper()) {
                return;
            } else {
                throw AbstractC166987dD.A14("The handler must be on a separate thread then the recording one");
            }
        }
        throw AbstractC166987dD.A12("The handler cannot be null");
    }

    public static void A02(C212399b8 c212399b8, AM5 am5) {
        String str;
        Integer num = am5.A0F;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "PREPARED";
                    break;
                case 2:
                    str = "STARTED";
                    break;
                default:
                    str = "STOPPED";
                    break;
            }
        } else {
            str = "null";
        }
        c212399b8.A00("mState", str);
        c212399b8.A00("mSystemAudioBufferSizeB", String.valueOf(am5.A01));
        c212399b8.A00("mAudioBufferSizeB", String.valueOf(am5.A00));
        c212399b8.A01(am5.A08.A00());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.9b8, X.9ty] */
    public final int A03(C73493YFw c73493YFw) {
        int i;
        ByteBuffer byteBuffer = c73493YFw.A02;
        Integer num = this.A0F;
        Integer num2 = C05F.A0C;
        if (num == num2) {
            i = this.A02.read(byteBuffer, byteBuffer.capacity());
        } else {
            i = 0;
        }
        if (this.A0F == num2) {
            if (i > 0) {
                AH7 AXE = this.A07.AXE();
                if (AXE != null) {
                    AXE.A05 += i;
                    AXE.A03++;
                }
                if (!this.A03) {
                    this.A03 = true;
                    this.A0E.DHP();
                }
                this.A0E.D9B(c73493YFw, i);
                return 0;
            }
            C175927s7 c175927s7 = this.A09;
            if (i == 0) {
                c175927s7.A01("oerAR");
                AH7 AXE2 = this.A07.AXE();
                if (AXE2 != null) {
                    AXE2.A02++;
                }
            } else {
                c175927s7.A01("oreAR");
                AH7 AXE3 = this.A07.AXE();
                if (AXE3 != null) {
                    AXE3.A04++;
                }
                int i2 = 22003;
                if (i == -3) {
                    i2 = 22004;
                }
                ?? abstractC223559ty = new AbstractC223559ty(i2, String.format(null, AbstractC111324zv.A00(636), Integer.valueOf(i)));
                A02(abstractC223559ty, this);
                this.A0E.DE6(abstractC223559ty);
                return 1;
            }
        }
        return 1;
    }

    public final void A04(InterfaceC176157sY interfaceC176157sY, Handler handler) {
        this.A09.A01("pARc");
        A01(handler);
        this.A06.post(new Ax5(handler, this, interfaceC176157sY));
    }

    public final void A05(InterfaceC176157sY interfaceC176157sY, Handler handler) {
        this.A09.A01("stARc");
        A01(handler);
        this.A06.post(new RunnableC24724Ax6(handler, this, interfaceC176157sY));
    }

    public AM5(Handler handler, InterfaceC176077sQ interfaceC176077sQ, C177547uo c177547uo, BDY bdy, int i, int i2, long j, boolean z) {
        C175927s7 c175927s7 = new C175927s7();
        this.A09 = c175927s7;
        this.A0B = new RunnableC24248ApF(this);
        this.A0A = new RunnableC24536Att(this);
        this.A08 = c177547uo;
        this.A06 = handler;
        this.A0E = bdy;
        this.A0F = C05F.A00;
        this.A00 = c177547uo.A03;
        this.A03 = false;
        this.A07 = interfaceC176077sQ;
        this.A0D = z;
        this.A04 = i;
        this.A05 = j;
        this.A0C = j > 0;
        int minBufferSize = AudioRecord.getMinBufferSize(c177547uo.A04, c177547uo.A01, c177547uo.A02);
        this.A01 = minBufferSize;
        this.A01 = minBufferSize > 0 ? Math.min(minBufferSize * i2, 409600) : 409600;
        c175927s7.A01("c");
        c177547uo.toString();
    }
}
