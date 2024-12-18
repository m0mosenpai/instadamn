package X;

import android.content.Context;
import androidx.media3.common.util.Util;
import com.google.common.collect.ComparatorOrdering;

/* loaded from: classes12.dex */
public final class XQQ extends Xf2 implements YMF {
    public static final C4VF A07 = new ComparatorOrdering(new C73550YIx(0));
    public Y1h A00;
    public C58780Q8p A01;
    public Y0s A02;
    public final Context A03;
    public final YMQ A04;
    public final Object A05;
    public final boolean A06;

    public XQQ(Context context) {
        Y97 y97 = new Y97();
        C58780Q8p c58780Q8p = C58780Q8p.A09;
        C58780Q8p c58780Q8p2 = new C58780Q8p(new C58779Q8o(context));
        this.A05 = AbstractC58318PtA.A0b();
        this.A03 = context.getApplicationContext();
        this.A04 = y97;
        this.A01 = c58780Q8p2;
        this.A00 = Y1h.A01;
        boolean A1M = AbstractC167007dF.A1M(Util.A0D(context) ? 1 : 0);
        this.A06 = A1M;
        if (!A1M && Util.A01 >= 32) {
            this.A02 = Y0s.A00(context);
        }
    }

    public XQQ() {
    }
}
