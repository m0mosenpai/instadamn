package X;

import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.OEw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54719OEw {
    public long A00;
    public C1QO A01;
    public final long A02;
    public final O3Y A03;
    public final C23031Ai A04;
    public final List A05;
    public final C05A A06;
    public final Nv1 A07;

    public C54719OEw(O3Y o3y, Nv1 nv1, C23031Ai c23031Ai) {
        C14360o3.A0B(c23031Ai, 3);
        this.A03 = o3y;
        this.A07 = nv1;
        this.A04 = c23031Ai;
        this.A02 = TimeUnit.SECONDS.toMillis(AbstractC25225BEi.A07(C06090Tz.A05, o3y.A00, 36592760585978542L));
        this.A05 = AbstractC16960so.A1Q(new O89(EnumC53152Nf7.A05, C57745PjY.A00(this, 8)), new O89(EnumC53152Nf7.A04, C57745PjY.A00(this, 9)));
        this.A00 = SystemClock.elapsedRealtime();
        this.A01 = C1QO.A0C;
        this.A06 = AbstractC25227BEk.A0z();
    }
}
