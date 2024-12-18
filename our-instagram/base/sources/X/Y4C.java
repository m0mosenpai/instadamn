package X;

import android.os.SystemClock;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes12.dex */
public final class Y4C {
    public static final C72851Xp7 A0K = new C72851Xp7(AbstractC58318PtA.A0b());
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final Y1o A05;
    public final Timeline A06;
    public final XQ6 A07;
    public final C72851Xp7 A08;
    public final C72851Xp7 A09;
    public final Y1Q A0A;
    public final C72743XmJ A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public volatile long A0G;
    public volatile long A0H;
    public volatile long A0I;
    public volatile long A0J;

    public static Y4C A00(C72743XmJ c72743XmJ) {
        Timeline timeline = Timeline.A00;
        C72851Xp7 c72851Xp7 = A0K;
        return new Y4C(Y1o.A03, timeline, null, c72851Xp7, c72851Xp7, Y1Q.A02, c72743XmJ, ImmutableList.of(), 1, 1, 0, -9223372036854775807L, 0L, 0L, 0L, 0L, 0L, false, false, false);
    }

    public final Y4C A02(int i) {
        Timeline timeline = this.A06;
        C72851Xp7 c72851Xp7 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        XQ6 xq6 = this.A07;
        boolean z = this.A0D;
        Y1Q y1q = this.A0A;
        C72743XmJ c72743XmJ = this.A0B;
        List list = this.A0C;
        C72851Xp7 c72851Xp72 = this.A08;
        boolean z2 = this.A0E;
        return new Y4C(this.A05, timeline, xq6, c72851Xp7, c72851Xp72, y1q, c72743XmJ, list, i, this.A00, this.A02, j, j2, this.A0G, this.A0J, this.A0I, this.A0H, z, z2, this.A0F);
    }

    public final Y4C A03(int i, int i2, boolean z) {
        Timeline timeline = this.A06;
        C72851Xp7 c72851Xp7 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i3 = this.A01;
        XQ6 xq6 = this.A07;
        boolean z2 = this.A0D;
        Y1Q y1q = this.A0A;
        C72743XmJ c72743XmJ = this.A0B;
        List list = this.A0C;
        return new Y4C(this.A05, timeline, xq6, c72851Xp7, this.A08, y1q, c72743XmJ, list, i3, i, i2, j, j2, this.A0G, this.A0J, this.A0I, this.A0H, z2, z, this.A0F);
    }

    public final Y4C A04(Timeline timeline) {
        C72851Xp7 c72851Xp7 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i = this.A01;
        XQ6 xq6 = this.A07;
        boolean z = this.A0D;
        Y1Q y1q = this.A0A;
        C72743XmJ c72743XmJ = this.A0B;
        List list = this.A0C;
        C72851Xp7 c72851Xp72 = this.A08;
        boolean z2 = this.A0E;
        return new Y4C(this.A05, timeline, xq6, c72851Xp7, c72851Xp72, y1q, c72743XmJ, list, i, this.A00, this.A02, j, j2, this.A0G, this.A0J, this.A0I, this.A0H, z, z2, this.A0F);
    }

    public final Y4C A05(XQ6 xq6) {
        Timeline timeline = this.A06;
        C72851Xp7 c72851Xp7 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i = this.A01;
        boolean z = this.A0D;
        Y1Q y1q = this.A0A;
        C72743XmJ c72743XmJ = this.A0B;
        List list = this.A0C;
        C72851Xp7 c72851Xp72 = this.A08;
        boolean z2 = this.A0E;
        return new Y4C(this.A05, timeline, xq6, c72851Xp7, c72851Xp72, y1q, c72743XmJ, list, i, this.A00, this.A02, j, j2, this.A0G, this.A0J, this.A0I, this.A0H, z, z2, this.A0F);
    }

    public final Y4C A06(C72851Xp7 c72851Xp7) {
        Timeline timeline = this.A06;
        C72851Xp7 c72851Xp72 = this.A09;
        long j = this.A04;
        long j2 = this.A03;
        int i = this.A01;
        XQ6 xq6 = this.A07;
        boolean z = this.A0D;
        Y1Q y1q = this.A0A;
        C72743XmJ c72743XmJ = this.A0B;
        List list = this.A0C;
        boolean z2 = this.A0E;
        return new Y4C(this.A05, timeline, xq6, c72851Xp72, c72851Xp7, y1q, c72743XmJ, list, i, this.A00, this.A02, j, j2, this.A0G, this.A0J, this.A0I, this.A0H, z, z2, this.A0F);
    }

    public final boolean A07() {
        if (this.A01 == 3 && this.A0E && this.A02 == 0) {
            return true;
        }
        return false;
    }

    public final long A01() {
        long j;
        long j2;
        if (!A07()) {
            return this.A0I;
        }
        do {
            j = this.A0H;
            j2 = this.A0I;
        } while (j != this.A0H);
        return Util.A03(Util.A04(j2) + (((float) (SystemClock.elapsedRealtime() - j)) * 1.0f));
    }

    public Y4C(Y1o y1o, Timeline timeline, XQ6 xq6, C72851Xp7 c72851Xp7, C72851Xp7 c72851Xp72, Y1Q y1q, C72743XmJ c72743XmJ, List list, int i, int i2, int i3, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3) {
        this.A06 = timeline;
        this.A09 = c72851Xp7;
        this.A04 = j;
        this.A03 = j2;
        this.A01 = i;
        this.A07 = xq6;
        this.A0D = z;
        this.A0A = y1q;
        this.A0B = c72743XmJ;
        this.A0C = list;
        this.A08 = c72851Xp72;
        this.A0E = z2;
        this.A00 = i2;
        this.A02 = i3;
        this.A05 = y1o;
        this.A0G = j3;
        this.A0J = j4;
        this.A0I = j5;
        this.A0H = j6;
        this.A0F = z3;
    }
}
