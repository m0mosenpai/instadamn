package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: X.5Li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115725Li {
    public static final InterfaceC09390do A02 = AbstractC09440dt.A01(C115735Lj.A00);
    public final HashMap A00 = new HashMap();
    public final Handler A01 = new Handler(Looper.getMainLooper());

    public final void A00(C75113Zb c75113Zb) {
        C14360o3.A0B(c75113Zb, 0);
        int hashCode = c75113Zb.hashCode();
        HashMap hashMap = this.A00;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) hashMap.get(valueOf);
        if (runnable != null) {
            this.A01.removeCallbacks(runnable);
            hashMap.remove(valueOf);
        }
    }

    public final void A01(final C75113Zb c75113Zb, long j) {
        C14360o3.A0B(c75113Zb, 0);
        A00(c75113Zb);
        Runnable runnable = new Runnable(this) { // from class: X.5Lk
            public final /* synthetic */ C115725Li A00;

            {
                this.A00 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C75113Zb c75113Zb2 = c75113Zb;
                if (!c75113Zb2.A2O) {
                    c75113Zb2.A0m(true, false);
                    c75113Zb2.A1K = "dwell";
                    this.A00.A00.remove(Integer.valueOf(c75113Zb2.hashCode()));
                }
            }
        };
        this.A00.put(Integer.valueOf(c75113Zb.hashCode()), runnable);
        this.A01.postDelayed(runnable, j);
    }
}
