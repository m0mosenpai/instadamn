package X;

import androidx.media3.common.Timeline;
import java.util.Arrays;

/* renamed from: X.XpB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72855XpB {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Timeline A06;
    public final Timeline A07;
    public final C72851Xp7 A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C72855XpB c72855XpB = (C72855XpB) obj;
            if (this.A04 != c72855XpB.A04 || this.A01 != c72855XpB.A01 || this.A03 != c72855XpB.A03 || this.A00 != c72855XpB.A00 || this.A02 != c72855XpB.A02 || this.A05 != c72855XpB.A05 || !AbstractC50102Ry.A00(this.A07, c72855XpB.A07) || !AbstractC50102Ry.A00(this.A06, c72855XpB.A06) || !AbstractC50102Ry.A00(this.A08, c72855XpB.A08)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A04), this.A07, Integer.valueOf(this.A01), null, Long.valueOf(this.A03), this.A06, Integer.valueOf(this.A00), this.A08, Long.valueOf(this.A02), Long.valueOf(this.A05)});
    }

    public C72855XpB(Timeline timeline, Timeline timeline2, C72851Xp7 c72851Xp7, int i, int i2, long j, long j2, long j3, long j4) {
        this.A04 = j;
        this.A07 = timeline;
        this.A01 = i;
        this.A03 = j2;
        this.A06 = timeline2;
        this.A00 = i2;
        this.A08 = c72851Xp7;
        this.A02 = j3;
        this.A05 = j4;
    }
}
