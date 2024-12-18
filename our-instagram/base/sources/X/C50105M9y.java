package X;

import java.util.Map;
import java.util.TimerTask;

/* renamed from: X.M9y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50105M9y extends TimerTask {
    public final /* synthetic */ C55013OVy A00;
    public final /* synthetic */ Map A01;

    public C50105M9y(C55013OVy c55013OVy, Map map) {
        this.A00 = c55013OVy;
        this.A01 = map;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C55013OVy c55013OVy = this.A00;
        C54498O6a c54498O6a = c55013OVy.A06;
        Map map = this.A01;
        C14360o3.A0B(map, 0);
        AbstractC53656No2.A00(c54498O6a.A00, c54498O6a.A01, map, 40);
        c55013OVy.A01();
    }
}
