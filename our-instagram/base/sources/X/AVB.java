package X;

import android.os.Handler;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class AVB implements InterfaceC176057sO {
    public C177547uo A00;
    public C176217se A01;
    public AtomicLong A02 = new AtomicLong(0);
    public InterfaceC16620sF A03;
    public byte[] A04;
    public final BDY A05;
    public final MPO A06;
    public volatile float A07;

    @Override // X.InterfaceC176057sO
    public final void A9r(Handler handler, AH7 ah7, A9H a9h, InterfaceC176157sY interfaceC176157sY, C176217se c176217se) {
        AbstractC167007dF.A1F(c176217se, 0, handler);
        this.A01 = c176217se;
        handler.post(new RunnableC24503AtM(interfaceC176157sY));
    }

    @Override // X.InterfaceC176057sO
    public final Map Avx() {
        return null;
    }

    @Override // X.InterfaceC176057sO
    public final void E5W(Handler handler, Handler handler2, C177547uo c177547uo, InterfaceC176157sY interfaceC176157sY) {
        boolean A1R = AbstractC167007dF.A1R(0, c177547uo, handler);
        C14360o3.A0B(handler2, 3);
        this.A00 = c177547uo;
        this.A02 = new AtomicLong(0L);
        AM5 am5 = new AM5(handler, AVA.A00, c177547uo, this.A05, A1R ? 1 : 0, 2, 0L, false);
        am5.A04(interfaceC176157sY, handler2);
        int length = this.A04.length;
        int i = am5.A00;
        if (length < i) {
            this.A04 = new byte[i];
        }
        InterfaceC16620sF interfaceC16620sF = this.A03;
        if (interfaceC16620sF != null) {
            interfaceC16620sF.invoke(am5, new L33(this.A06));
        }
        handler2.post(new RunnableC24504AtN(interfaceC176157sY));
    }

    @Override // X.InterfaceC176057sO
    public final void EG5(Handler handler, InterfaceC176157sY interfaceC176157sY, C176217se c176217se) {
        C14360o3.A0B(handler, 2);
        this.A01 = null;
        handler.post(new RunnableC24505AtO(interfaceC176157sY));
    }

    @Override // X.InterfaceC176057sO
    public final void release() {
        this.A01 = null;
    }

    public AVB(MPO mpo, int i, int i2) {
        this.A06 = mpo;
        this.A04 = new byte[i2];
        this.A05 = new AVD(this, i);
    }
}
