package X;

import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.BitSet;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OJG {
    public final Context A03;
    public final Map A02 = AbstractC166987dD.A1G();
    public final Map A01 = AbstractC166987dD.A1G();
    public final Map A00 = AbstractC166987dD.A1G();
    public final BitSet A04 = new BitSet(0);

    public final void A00(IgBloksScreenConfig igBloksScreenConfig) {
        C66277U6x A02 = C66277U6x.A02("com.bloks.www.biig.bio.productcreation", AbstractC191768eY.A01(this.A02), this.A01);
        A02.A00 = 719983200;
        A02.A05 = null;
        A02.A01 = 0L;
        A02.A06 = null;
        A02.A03 = null;
        A02.A02 = null;
        A02.A04 = null;
        A02.A08(this.A00);
        A02.A04(this.A03, igBloksScreenConfig);
    }

    public OJG(Context context) {
        this.A03 = context;
    }
}
