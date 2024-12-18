package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class RcH extends AbstractRunnableC14200nk {
    public final /* synthetic */ SJW A00;
    public final /* synthetic */ Map A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcH(SJW sjw, Map map) {
        super(1773997430, 3, false, false);
        this.A00 = sjw;
        this.A01 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        SJW sjw = this.A00;
        AtomicBoolean atomicBoolean = sjw.A07;
        if (!atomicBoolean.get() && (map = this.A01) != null && map.containsKey("DGWSendPingResultUserInfoKey")) {
            boolean parseBoolean = Boolean.parseBoolean(String.valueOf(map.get("DGWSendPingResultUserInfoKey")));
            sjw.A08.set(parseBoolean);
            sjw.A03.markerAnnotate(936452326, sjw.A00, "is_dgw_success", parseBoolean);
            atomicBoolean.set(true);
        }
    }
}
