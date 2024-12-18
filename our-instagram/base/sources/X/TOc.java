package X;

import com.google.android.gms.internal.gtm.zzce;

/* loaded from: classes10.dex */
public final class TOc implements Runnable {
    public final /* synthetic */ ServiceConnectionC63442SkL A00;
    public final /* synthetic */ zzce A01;

    public TOc(ServiceConnectionC63442SkL serviceConnectionC63442SkL, zzce zzceVar) {
        this.A00 = serviceConnectionC63442SkL;
        this.A01 = zzceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C60689RMh c60689RMh = this.A00.A02;
        SX6.A00();
        c60689RMh.A0I();
        if (c60689RMh.A00 == null) {
            AbstractC63371Sic.A09(c60689RMh, "Connected to service after a timeout", 3);
            zzce zzceVar = this.A01;
            SX6.A00();
            c60689RMh.A00 = zzceVar;
            C60689RMh.A00(c60689RMh);
            C60683RMb c60683RMb = ((AbstractC63371Sic) c60689RMh).A00.A06;
            C63335Shm.A02(c60683RMb);
            SX6.A00();
            c60683RMb.A00.A0J();
        }
    }
}
