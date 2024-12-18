package X;

import android.content.Context;

/* renamed from: X.T5n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64238T5n implements InterfaceC65409Tjg {
    @Override // X.InterfaceC65409Tjg
    public final SGP EMr(Context context, InterfaceC65514Tlj interfaceC65514Tlj, String str) {
        SGP sgp = new SGP();
        sgp.A00 = interfaceC65514Tlj.FFW(context, str);
        int i = 1;
        int FFm = interfaceC65514Tlj.FFm(context, str, true);
        sgp.A01 = FFm;
        int i2 = sgp.A00;
        if (i2 == 0) {
            if (FFm == 0) {
                i = 0;
                sgp.A02 = i;
                return sgp;
            }
            i2 = 0;
        }
        if (FFm < i2) {
            i = -1;
        }
        sgp.A02 = i;
        return sgp;
    }
}
