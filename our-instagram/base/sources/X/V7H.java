package X;

import android.content.Context;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

/* loaded from: classes11.dex */
public final class V7H extends V7K {
    public float A00;
    public int A01;
    public final Interpolator A02;
    public final Integer A03;
    public final EnumC194908jr A04;

    @Override // X.AbstractC202988yG
    public final EnumC194908jr A0X() {
        return this.A04;
    }

    public V7H(Context context, int i) {
        super(context, i);
        this.A02 = new AccelerateInterpolator();
        this.A03 = C05F.A01;
        this.A04 = EnumC194908jr.A0F;
    }
}
