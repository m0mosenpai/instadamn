package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;

/* renamed from: X.5ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125315ld {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final HashMap A01 = new HashMap();

    public final void A00(C75113Zb c75113Zb) {
        int hashCode = c75113Zb.hashCode();
        HashMap hashMap = this.A01;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) hashMap.get(valueOf);
        if (runnable != null) {
            this.A00.removeCallbacks(runnable);
            hashMap.remove(valueOf);
        }
        c75113Zb.A32 = false;
    }

    public final void A01(final C75113Zb c75113Zb, long j) {
        int hashCode = c75113Zb.hashCode();
        HashMap hashMap = this.A01;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) hashMap.get(valueOf);
        if (runnable != null) {
            this.A00.removeCallbacks(runnable);
            hashMap.remove(valueOf);
        }
        Runnable runnable2 = new Runnable(this) { // from class: X.624
            public final /* synthetic */ C125315ld A00;

            {
                this.A00 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C75113Zb c75113Zb2 = c75113Zb;
                if (!c75113Zb2.A32) {
                    c75113Zb2.A32 = true;
                    this.A00.A01.remove(Integer.valueOf(c75113Zb2.hashCode()));
                }
            }
        };
        hashMap.put(Integer.valueOf(c75113Zb.hashCode()), runnable2);
        this.A00.postDelayed(runnable2, j);
    }
}
