package X;

import android.view.View;
import com.google.common.collect.ImmutableList;

/* loaded from: classes10.dex */
public final class RDz extends SWN {
    public final int A00;
    public final int A01;
    public final int A02;
    public final View.OnClickListener A03;
    public final String A04;

    public static void A00(RDq rDq, ImmutableList.Builder builder) {
        builder.add((Object) new RDz(rDq));
    }

    public RDz(RDq rDq) {
        super(rDq);
        this.A04 = rDq.A04;
        this.A02 = rDq.A02;
        this.A00 = rDq.A00;
        this.A03 = rDq.A03;
        this.A01 = rDq.A01;
    }
}
