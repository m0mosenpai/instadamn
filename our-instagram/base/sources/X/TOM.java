package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class TOM implements Runnable {
    public final /* synthetic */ SMG A00;
    public final /* synthetic */ Map A01;

    public TOM(SMG smg, Map map) {
        this.A00 = smg;
        this.A01 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SMG smg = this.A00;
        SZ5.A00(smg.A00, smg.A01, smg.A02, this.A01, smg.A03);
    }
}
