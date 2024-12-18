package X;

import android.content.ComponentName;

/* renamed from: X.TOd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64646TOd implements Runnable {
    public final /* synthetic */ ComponentName A00;
    public final /* synthetic */ ServiceConnectionC63442SkL A01;

    public RunnableC64646TOd(ComponentName componentName, ServiceConnectionC63442SkL serviceConnectionC63442SkL) {
        this.A01 = serviceConnectionC63442SkL;
        this.A00 = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C60689RMh c60689RMh = this.A01.A02;
        ComponentName componentName = this.A00;
        SX6.A00();
        if (c60689RMh.A00 != null) {
            c60689RMh.A00 = null;
            c60689RMh.A0D("Disconnected from device AnalyticsService", componentName);
            C60683RMb c60683RMb = ((AbstractC63371Sic) c60689RMh).A00.A06;
            C63335Shm.A02(c60683RMb);
            c60683RMb.A0I();
            SX6.A00();
            C60692RMk c60692RMk = c60683RMb.A00;
            SX6.A00();
            c60692RMk.A0I();
            AbstractC63371Sic.A09(c60692RMk, "Service disconnected", 2);
        }
    }
}
