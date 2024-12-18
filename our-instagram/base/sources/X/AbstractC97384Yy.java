package X;

import com.google.android.exoplayer2.Timeline;

/* renamed from: X.4Yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC97384Yy extends Timeline {
    public final Timeline A00;

    @Override // com.google.android.exoplayer2.Timeline
    public C4WJ A0D(C4WJ c4wj, int i, boolean z) {
        return this.A00.A0D(c4wj, i, z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public C96604Vv A0E(C96604Vv c96604Vv, int i, long j) {
        return this.A00.A0E(c96604Vv, i, j);
    }

    public AbstractC97384Yy(Timeline timeline) {
        this.A00 = timeline;
    }
}
