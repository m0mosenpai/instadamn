package X;

import android.content.Context;

/* renamed from: X.T5l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64236T5l implements InterfaceC65409Tjg {
    @Override // X.InterfaceC65409Tjg
    public final SGP EMr(Context context, InterfaceC65514Tlj interfaceC65514Tlj, String str) {
        SGP sgp = new SGP();
        int i = 1;
        int FFm = interfaceC65514Tlj.FFm(context, str, true);
        sgp.A01 = FFm;
        if (FFm == 0) {
            int FFW = interfaceC65514Tlj.FFW(context, str);
            sgp.A00 = FFW;
            if (FFW != 0) {
                i = -1;
            }
            return sgp;
        }
        sgp.A02 = i;
        return sgp;
    }
}
