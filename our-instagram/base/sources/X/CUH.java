package X;

import android.os.Handler;
import com.facebook.R;
import java.util.AbstractMap;

/* loaded from: classes5.dex */
public final class CUH {
    public final long A02;
    public final CS2 A04;
    public final boolean A06;
    public final Handler A03 = AbstractC167007dF.A0J();
    public boolean A00 = false;
    public boolean A01 = true;
    public final Runnable A05 = new D11(this);

    public final void A00() {
        this.A00 = true;
        this.A03.removeCallbacks(this.A05);
        CS2 cs2 = this.A04;
        C6FG c6fg = (C6FG) cs2.A03.get();
        if (c6fg != null) {
            ((AbstractMap) c6fg.A00(R.id.bk_context_key_timers)).remove(cs2.A02);
        }
    }

    public CUH(CS2 cs2, long j, boolean z) {
        this.A02 = j;
        this.A06 = z;
        this.A04 = cs2;
    }
}
