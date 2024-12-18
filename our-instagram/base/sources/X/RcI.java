package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class RcI extends AbstractRunnableC14200nk {
    public final /* synthetic */ SJW A00;
    public final /* synthetic */ Map A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcI(SJW sjw, Map map) {
        super(1773997430, 3, false, false);
        this.A00 = sjw;
        this.A01 = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        SJW sjw = this.A00;
        AtomicBoolean atomicBoolean = sjw.A05;
        if (!atomicBoolean.get() && (map = this.A01) != null && map.containsKey("MEMContextSendPingResultUserInfoKey")) {
            boolean parseBoolean = Boolean.parseBoolean(String.valueOf(map.get("MEMContextSendPingResultUserInfoKey")));
            sjw.A06.set(parseBoolean);
            sjw.A03.markerAnnotate(936452326, sjw.A00, "is_act_success", parseBoolean);
            atomicBoolean.set(true);
        }
    }
}
