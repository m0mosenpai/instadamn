package X;

import android.os.SystemClock;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4Wk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96754Wk implements C4UC {
    public C4TU A00 = C4TU.A03;
    public long A01;
    public long A02;
    public boolean A03;
    public final C2A7 A04;

    public final void A00() {
        if (!this.A03) {
            this.A01 = SystemClock.elapsedRealtime();
            this.A03 = true;
        }
    }

    public final void A01() {
        if (this.A03) {
            A02(Beg());
            this.A03 = false;
        }
    }

    public final void A02(long j) {
        this.A02 = j;
        if (this.A03) {
            this.A01 = SystemClock.elapsedRealtime();
        }
    }

    @Override // X.C4UC
    public final C4TU Bdw() {
        return this.A00;
    }

    @Override // X.C4UC
    public final long Beg() {
        long j;
        long j2 = this.A02;
        if (this.A03) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.A01;
            if (this.A00.A01 == 1.0f) {
                j = Util.A07(elapsedRealtime);
            } else {
                j = elapsedRealtime * r4.A02;
            }
            return j2 + j;
        }
        return j2;
    }

    @Override // X.C4UC
    public final void Eaz(C4TU c4tu) {
        if (this.A03) {
            A02(Beg());
        }
        this.A00 = c4tu;
    }

    public C96754Wk(C2A7 c2a7) {
        this.A04 = c2a7;
    }
}
