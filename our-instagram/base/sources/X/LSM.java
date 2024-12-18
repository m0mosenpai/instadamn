package X;

import android.content.Context;

/* loaded from: classes8.dex */
public final class LSM implements InterfaceC50417MNt {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ LAF A01;
    public final /* synthetic */ C47553KzO A02;
    public final /* synthetic */ KPL A03;

    public LSM(Context context, LAF laf, C47553KzO c47553KzO, KPL kpl) {
        this.A03 = kpl;
        this.A02 = c47553KzO;
        this.A01 = laf;
        this.A00 = context;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        boolean A1b = AbstractC31177DnL.A1b(obj);
        KPL kpl = this.A03;
        if (A1b) {
            kpl.A05("FETCH_BACKUP_STATUS");
            C47553KzO c47553KzO = this.A02;
            AbstractC46742Klz.A00(c47553KzO.A01, C05F.A07).A06(new DT0(13, c47553KzO, this.A01, kpl, this.A00));
            return;
        }
        kpl.A0C("BLOCK_STORE_ENCRYPTION_NOT_AVAILABLE");
    }
}
