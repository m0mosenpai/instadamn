package X;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4YH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4YH extends AbstractC97384Yy {
    public static final Object A02 = new Object();
    public final Object A00;
    public final Object A01;

    @Override // X.AbstractC97384Yy, com.google.android.exoplayer2.Timeline
    public final C4WJ A0D(C4WJ c4wj, int i, boolean z) {
        super.A00.A0D(c4wj, i, z);
        if (Util.A0I(c4wj.A05, this.A00) && z) {
            c4wj.A05 = A02;
        }
        return c4wj;
    }

    @Override // X.AbstractC97384Yy, com.google.android.exoplayer2.Timeline
    public final C96604Vv A0E(C96604Vv c96604Vv, int i, long j) {
        super.A00.A0E(c96604Vv, i, j);
        if (Util.A0I(c96604Vv.A0C, this.A01)) {
            c96604Vv.A0C = C96604Vv.A0H;
        }
        return c96604Vv;
    }

    public C4YH(Timeline timeline, Object obj, Object obj2) {
        super(timeline);
        this.A01 = obj;
        this.A00 = obj2;
    }
}
