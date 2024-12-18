package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TRF implements Runnable {
    public final /* synthetic */ SMG A00;
    public final /* synthetic */ SJB A01;
    public final /* synthetic */ Map A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ Map A04;

    public TRF(SMG smg, SJB sjb, Map map, Map map2, Map map3) {
        this.A01 = sjb;
        this.A03 = map;
        this.A00 = smg;
        this.A04 = map2;
        this.A02 = map3;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.0ps, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        SJB sjb = this.A01;
        SF8 sf8 = sjb.A03;
        Map map = this.A03;
        C14360o3.A0B(map, 0);
        C58252li A0I = AbstractC58318PtA.A0I();
        ArrayList A1E = AbstractC166987dD.A1E();
        Map map2 = sf8.A01;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        Iterator A15 = AbstractC166997dE.A15(map2);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (AbstractC58319PtB.A1V(A1K, map)) {
                AbstractC43594JPz.A1S(A1I, A1K);
            }
        }
        AbstractC63246Sg0.A03(S5S.A00(A1I), new C63626SqY(19, A0I, map, A1E));
        C63406Sjd.A0B(A0I, new C63622SqU(this.A00, sjb, map, this.A04, this.A02, new Object()));
    }
}
