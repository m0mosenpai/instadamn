package X;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes10.dex */
public final class Q8Z extends AbstractC52922bZ {
    public Bundle A00;
    public final C2GT A01;
    public final C58252li A02;
    public final C58252li A03;
    public final C2GS A04;
    public final C2GS A05;
    public final C58770Q8c A06;

    public static String A00(Q8Z q8z) {
        String string = q8z.A00.getString("PAYMENT_TYPE");
        if (TextUtils.isEmpty(string)) {
            return "fbpay_hub";
        }
        return string;
    }

    public Q8Z(C58770Q8c c58770Q8c, C62962SZf c62962SZf) {
        C58252li A0I = AbstractC58318PtA.A0I();
        this.A03 = A0I;
        C58252li A0I2 = AbstractC58318PtA.A0I();
        this.A02 = A0I2;
        this.A04 = AbstractC58318PtA.A0J();
        this.A05 = AbstractC58318PtA.A0J();
        this.A06 = c58770Q8c;
        C58252li A01 = c62962SZf.A01();
        this.A01 = A01;
        C63627SqZ.A02(A01, A0I, C63628Sqa.A00(this, 61), 46);
        C2GT[] c2gtArr = {A01, c58770Q8c.A04, c58770Q8c.A03, c58770Q8c.A02};
        C63625SqX c63625SqX = new C63625SqX(14, A0I2, c2gtArr);
        int i = 0;
        do {
            A0I2.A0E(c2gtArr[i], c63625SqX);
            i++;
        } while (i < 4);
    }
}
