package X;

import android.os.Handler;
import java.lang.ref.Reference;
import java.util.Map;

/* renamed from: X.L9p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47807L9p {
    public final Handler A00;
    public final Object A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;
    public final InterfaceC16660sJ A05;

    public C47807L9p() {
        C50348MLa c50348MLa = C50348MLa.A00;
        C14360o3.A0B(c50348MLa, 1);
        this.A05 = c50348MLa;
        this.A01 = new Object();
        this.A00 = AbstractC167007dF.A0J();
        this.A03 = AbstractC166987dD.A1I();
        this.A04 = AbstractC166987dD.A1I();
        this.A02 = AbstractC166987dD.A1I();
    }

    public final Object A00(Object obj) {
        Object obj2;
        synchronized (this.A01) {
            try {
                obj2 = this.A03.get(obj);
                if (obj2 == null) {
                    Reference reference = (Reference) this.A04.get(obj);
                    if (reference != null) {
                        obj2 = reference.get();
                    } else {
                        obj2 = null;
                    }
                }
            } finally {
                A02(obj);
            }
        }
        return obj2;
    }

    public final void A01(long j, Object obj, Object obj2, boolean z) {
        synchronized (this.A01) {
            A02(obj);
            this.A03.put(obj, obj2);
            M64 m64 = new M64(this, obj, z);
            this.A02.put(obj, m64);
            this.A00.postDelayed(m64, j);
        }
    }

    public final void A02(Object obj) {
        synchronized (this.A01) {
            this.A03.remove(obj);
            this.A04.remove(obj);
            Map map = this.A02;
            Runnable runnable = (Runnable) map.get(obj);
            if (runnable != null) {
                this.A00.removeCallbacks(runnable);
            }
            map.remove(obj);
        }
    }
}
