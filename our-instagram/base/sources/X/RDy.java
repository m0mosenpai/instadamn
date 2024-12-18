package X;

import android.view.View;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public final class RDy extends SWN {
    public final int A00;
    public final View.OnClickListener A01;
    public final String A02;

    public static void A00(RDn rDn, ImmutableList.Builder builder) {
        builder.add((Object) new RDy(rDn));
    }

    public RDy(RDn rDn) {
        super(rDn);
        this.A02 = rDn.A02;
        this.A00 = rDn.A00;
        this.A01 = rDn.A01;
    }
}
