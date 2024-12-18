package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Tye, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66042Tye {
    public C5JJ A00;
    public Iterator A01;
    public EnumC1125356h A02;
    public C1125956n A03;
    public final MediaComposition A04;
    public final boolean A05;

    public final float A00(TimeUnit timeUnit, long j) {
        C5JJ c5jj;
        boolean z = false;
        if (this.A02 != null) {
            z = true;
        }
        AbstractC1126356r.A07(z, "No track is selected");
        while (true) {
            C5JJ c5jj2 = this.A00;
            if (c5jj2 == null || j < c5jj2.A01.A03(timeUnit)) {
                break;
            }
            if (this.A00.A01.A06(timeUnit, j, this.A05)) {
                return this.A00.A00;
            }
            Iterator it = this.A01;
            if (it != null && it.hasNext()) {
                c5jj = (C5JJ) this.A01.next();
            } else {
                c5jj = null;
            }
            this.A00 = c5jj;
        }
        return 1.0f;
    }

    public final void A01(EnumC1125356h enumC1125356h, int i) {
        this.A02 = enumC1125356h;
        C1125956n A04 = this.A04.A04(enumC1125356h, i);
        this.A03 = A04;
        if (A04 != null) {
            Iterator A0n = AbstractC65702TsY.A0n(A04.A07);
            this.A01 = A0n;
            if (A0n.hasNext()) {
                this.A00 = (C5JJ) this.A01.next();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Requested Track is not available");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TimelineSpeedProvider{mMediaComposition=");
        sb.append(this.A04);
        sb.append(", mTimelineSpeedIterator=");
        sb.append(this.A01);
        sb.append(", mCurrentTimelineSpeed=");
        sb.append(this.A00);
        sb.append(", mMediaTrackComposition=");
        sb.append(this.A03);
        sb.append(", mSelectedTrackType=");
        return AbstractC58320PtC.A11(this.A02, sb);
    }

    public C66042Tye(MediaComposition mediaComposition, boolean z) {
        this.A04 = mediaComposition;
        this.A05 = z;
    }
}
