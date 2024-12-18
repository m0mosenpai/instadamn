package X;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.Pz1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58633Pz1 {
    public final C23311Bt A00 = C23311Bt.A00();

    public final int A00(String str, int i, byte[] bArr) {
        C14360o3.A0B(str, 1);
        String A0o = AbstractC58318PtA.A0o(Locale.US, "bytes=%d-%d", Arrays.copyOf(AbstractC25228BEl.A1Z(Integer.valueOf(i), (162760 + i) - 1), 2));
        C26371Ps A0e = AbstractC58319PtB.A0e();
        A0e.A02 = str;
        A0e.A01(C05F.A0N);
        A0e.A03("Range", A0o);
        C1QW A00 = A0e.A00();
        C1QX c1qx = new C1QX();
        c1qx.A04 = EnumC23341Bw.Other;
        c1qx.A03 = C1Ef.OffScreen;
        C3JY A01 = this.A00.A01(AbstractC58319PtB.A0d(A00, c1qx));
        C14360o3.A07(A01);
        InterfaceC26481Qd A002 = A01.A00();
        if (A002 != null) {
            InputStream AjT = A002.AjT();
            int i2 = 0;
            int i3 = 162760;
            do {
                try {
                    int read = AjT.read(bArr, i2, i3);
                    if (read == -1) {
                        break;
                    }
                    i2 += read;
                    i3 = 162760 - i2;
                } finally {
                }
            } while (i3 > 0);
            AjT.close();
            C23781El A012 = A01.A01("content-range");
            if (A012 != null) {
                String str2 = A012.A01;
                C14360o3.A06(str2);
                int A04 = AbstractC001900j.A04(str2, '/', 0);
                String str3 = A012.A01;
                C14360o3.A06(str3);
                return Integer.parseInt(AbstractC43592JPx.A0z(str3, A04 + 1));
            }
            throw MSW.A0y("no content-range header");
        }
        throw AbstractC166997dE.A0g();
    }
}
