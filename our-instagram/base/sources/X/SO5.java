package X;

import java.io.IOException;
import java.net.Proxy;

/* loaded from: classes10.dex */
public final class SO5 {
    public final SUL A00;
    public final TIU A01;
    public final SOD A02;
    public final C63026Saw A03;
    public final InterfaceC65593TnY A04;

    public final SZJ A00(boolean z) {
        try {
            SZJ E8I = this.A04.E8I(z);
            if (E8I != null) {
                E8I.A0C = this;
            }
            return E8I;
        } catch (IOException e) {
            A01(e);
            throw e;
        }
    }

    public final void A01(IOException iOException) {
        this.A02.A00();
        C65158TeX AJU = this.A04.AJU();
        SZ7 sz7 = AJU.A0F;
        synchronized (sz7) {
            if (iOException instanceof C61031Rdz) {
                Integer num = ((C61031Rdz) iOException).A00;
                if (num == C05F.A0Y) {
                    int i = AJU.A01 + 1;
                    AJU.A01 = i;
                    if (i > 1) {
                        AJU.A0C = true;
                        AJU.A02++;
                    }
                } else if (num != C05F.A0j) {
                    AJU.A0C = true;
                    AJU.A02++;
                }
            } else if (AJU.A09 == null || (iOException instanceof C61027Rdv)) {
                AJU.A0C = true;
                if (AJU.A03 == 0) {
                    SP2 sp2 = AJU.A0E;
                    Proxy proxy = sp2.A01;
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        C62756SPn c62756SPn = sp2.A02;
                        c62756SPn.A01.connectFailed(c62756SPn.A0A.A0B(), proxy.address(), iOException);
                    }
                    C62461SCo c62461SCo = sz7.A05;
                    synchronized (c62461SCo) {
                        c62461SCo.A00.add(sp2);
                    }
                    AJU.A02++;
                }
            }
        }
    }

    public SO5(SUL sul, TIU tiu, SOD sod, C63026Saw c63026Saw, InterfaceC65593TnY interfaceC65593TnY) {
        this.A03 = c63026Saw;
        this.A01 = tiu;
        this.A00 = sul;
        this.A02 = sod;
        this.A04 = interfaceC65593TnY;
    }
}
