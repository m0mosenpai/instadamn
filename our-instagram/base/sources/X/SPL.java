package X;

import java.util.concurrent.TimeoutException;

/* loaded from: classes10.dex */
public final class SPL {
    public Throwable A00 = null;
    public final int A01;
    public final long A02;
    public final C63364SiN A03;
    public final EnumC61172RgY A04;
    public final String A05;
    public volatile InterfaceFutureC65699TsL A06;
    public volatile InterfaceC65545TmK A07;

    public final void A00() {
        synchronized (this) {
            this.A00 = new TimeoutException();
        }
        if (this.A07 != null) {
            this.A07.DcP(this.A01);
        }
        if (this.A06 != null) {
            this.A06.cancel(false);
        }
    }

    public final void A01(C42Y c42y) {
        synchronized (this) {
            this.A00 = c42y;
        }
        if (this.A07 != null) {
            this.A07.DFv(this.A01, AbstractC62804SRy.A01(c42y.A00));
        }
        if (this.A06 != null) {
            this.A06.cancel(false);
        }
    }

    public SPL(C63364SiN c63364SiN, EnumC61172RgY enumC61172RgY, String str, int i, long j) {
        this.A03 = c63364SiN;
        this.A05 = str;
        this.A04 = enumC61172RgY;
        this.A01 = i;
        this.A02 = j;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MqttOperation{mResponseType=");
        A1C.append(this.A04);
        A1C.append(", mOperationId=");
        A1C.append(this.A01);
        A1C.append(", mCreationTime=");
        A1C.append(this.A02);
        return AbstractC167027dH.A0R(A1C);
    }
}
