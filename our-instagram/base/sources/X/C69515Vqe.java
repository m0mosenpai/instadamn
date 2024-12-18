package X;

import androidx.media3.common.Metadata;
import java.io.EOFException;

/* renamed from: X.Vqe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69515Vqe {
    public final WFa A00 = new WFa(10);

    public final Metadata A00(XGj xGj, InterfaceC71838X6v interfaceC71838X6v) {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                WFa wFa = this.A00;
                xGj.E3s(wFa.A02, 0, 10);
                wFa.A0O(0);
                if (wFa.A06() != 4801587) {
                    break;
                }
                wFa.A0P(3);
                int A04 = wFa.A04();
                int i2 = A04 + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(wFa.A02, 0, bArr, 0, 10);
                    xGj.E3s(bArr, 10, A04);
                    metadata = new Q95(interfaceC71838X6v).A06(bArr, i2);
                } else {
                    xGj.AB0(A04);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        xGj.EJn();
        xGj.AB0(i);
        return metadata;
    }
}
