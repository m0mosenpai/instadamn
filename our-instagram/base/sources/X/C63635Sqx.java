package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.Sqx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63635Sqx implements InterfaceC65627Tpn {
    public InterfaceC65627Tpn A00;
    public InterfaceC65627Tpn A01;
    public InterfaceC65627Tpn A02;
    public InterfaceC65627Tpn A03;
    public InterfaceC65627Tpn A04;
    public InterfaceC65627Tpn A05;
    public InterfaceC65627Tpn A06;
    public InterfaceC65627Tpn A07;
    public final Context A08;
    public final InterfaceC65627Tpn A09;
    public final List A0A = AbstractC166987dD.A1E();

    private void A00(InterfaceC65627Tpn interfaceC65627Tpn) {
        int i = 0;
        while (true) {
            List list = this.A0A;
            if (i < list.size()) {
                interfaceC65627Tpn.AAg((YM6) list.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e5  */
    @Override // X.InterfaceC65627Tpn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long E2I(X.C62932SYa r5) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63635Sqx.E2I(X.SYa):long");
    }

    @Override // X.InterfaceC65627Tpn
    public final void close() {
        InterfaceC65627Tpn interfaceC65627Tpn = this.A07;
        if (interfaceC65627Tpn != null) {
            try {
                interfaceC65627Tpn.close();
            } finally {
                this.A07 = null;
            }
        }
    }

    @Override // X.InterfaceC65627Tpn
    public final android.net.Uri getUri() {
        InterfaceC65627Tpn interfaceC65627Tpn = this.A07;
        if (interfaceC65627Tpn == null) {
            return null;
        }
        return interfaceC65627Tpn.getUri();
    }

    @Override // X.InterfaceC71873X8g
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC65627Tpn interfaceC65627Tpn = this.A07;
        interfaceC65627Tpn.getClass();
        return interfaceC65627Tpn.read(bArr, i, i2);
    }

    public C63635Sqx(Context context, InterfaceC65627Tpn interfaceC65627Tpn) {
        this.A08 = context.getApplicationContext();
        this.A09 = interfaceC65627Tpn;
    }

    @Override // X.InterfaceC65627Tpn
    public final void AAg(YM6 ym6) {
        ym6.getClass();
        this.A09.AAg(ym6);
        this.A0A.add(ym6);
        InterfaceC65627Tpn interfaceC65627Tpn = this.A03;
        if (interfaceC65627Tpn != null) {
            interfaceC65627Tpn.AAg(ym6);
        }
        InterfaceC65627Tpn interfaceC65627Tpn2 = this.A00;
        if (interfaceC65627Tpn2 != null) {
            interfaceC65627Tpn2.AAg(ym6);
        }
        InterfaceC65627Tpn interfaceC65627Tpn3 = this.A01;
        if (interfaceC65627Tpn3 != null) {
            interfaceC65627Tpn3.AAg(ym6);
        }
        InterfaceC65627Tpn interfaceC65627Tpn4 = this.A05;
        if (interfaceC65627Tpn4 != null) {
            interfaceC65627Tpn4.AAg(ym6);
        }
        InterfaceC65627Tpn interfaceC65627Tpn5 = this.A06;
        if (interfaceC65627Tpn5 != null) {
            interfaceC65627Tpn5.AAg(ym6);
        }
        InterfaceC65627Tpn interfaceC65627Tpn6 = this.A02;
        if (interfaceC65627Tpn6 != null) {
            interfaceC65627Tpn6.AAg(ym6);
        }
        InterfaceC65627Tpn interfaceC65627Tpn7 = this.A04;
        if (interfaceC65627Tpn7 != null) {
            interfaceC65627Tpn7.AAg(ym6);
        }
    }
}
