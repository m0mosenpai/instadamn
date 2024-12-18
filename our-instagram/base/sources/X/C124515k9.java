package X;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5k9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124515k9 {
    public final Map A00 = new LinkedHashMap();
    public final Handler A01 = new Handler(Looper.getMainLooper());

    public final void A00(C75113Zb c75113Zb) {
        int hashCode = c75113Zb.hashCode();
        Map map = this.A00;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) map.get(valueOf);
        if (runnable != null) {
            this.A01.removeCallbacks(runnable);
            map.remove(valueOf);
        }
    }

    public final void A01(C75113Zb c75113Zb, long j) {
        A00(c75113Zb);
        BOC boc = new BOC(this, c75113Zb);
        this.A00.put(Integer.valueOf(c75113Zb.hashCode()), boc);
        this.A01.postDelayed(boc, j);
    }
}
