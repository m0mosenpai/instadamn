package X;

import android.content.pm.PackageItemInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T3Y implements InterfaceC65390TjN {
    public final /* synthetic */ SJB A00;

    public T3Y(SJB sjb) {
        this.A00 = sjb;
    }

    @Override // X.InterfaceC65390TjN
    public final void Elw(SMG smg, Map map) {
        LinkedHashMap A0i = AbstractC37302Gc3.A0i(map);
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        LinkedHashMap A1I2 = AbstractC166987dD.A1I();
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            String A17 = AbstractC31172DnG.A17(A1K);
            byte[] bArr = (byte[]) A1K.getValue();
            SJB sjb = this.A00;
            Map map2 = sjb.A05;
            C14360o3.A0A(A17);
            Object obj = map2.get(AbstractC43592JPx.A0z(A17, 5));
            if (obj != null) {
                A1I2.put(obj, A17);
                if (obj.equals(((PackageItemInfo) sjb.A00.getApplicationInfo()).packageName)) {
                    C49352Or c49352Or = sjb.A02;
                    C14360o3.A0A(bArr);
                    A0i.put(A17, c49352Or.A02(bArr));
                } else {
                    C14360o3.A0A(bArr);
                    A1I.put(obj, bArr);
                }
            }
        }
        SJB sjb2 = this.A00;
        C58443PvM A06 = C2FP.A06();
        C14360o3.A07(A06);
        A06.A00.A03.execute(new TRF(smg, sjb2, A1I, A0i, A1I2));
    }
}
