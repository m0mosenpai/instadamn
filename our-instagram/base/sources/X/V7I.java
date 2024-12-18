package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class V7I extends V7K {
    public int A00;
    public final Integer A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final EnumC194908jr A06;

    @Override // X.AbstractC202988yG
    public final EnumC194908jr A0X() {
        return this.A06;
    }

    public V7I(Context context, int i) {
        super(context, i);
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.A03 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.A04 = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.A05 = arrayList4;
        this.A01 = C05F.A01;
        this.A06 = EnumC194908jr.A09;
        arrayList2.add(new PointF(0.0f, 0.0f));
        arrayList2.add(new PointF(0.33333334f, 1.15f));
        arrayList2.add(new PointF(0.5555556f, 0.89f));
        arrayList2.add(new PointF(0.7777778f, 1.05f));
        arrayList2.add(new PointF(1.0f, 1.0f));
        arrayList4.add(new PointF(0.0f, 1.0f));
        arrayList4.add(new PointF(0.5f, 1.1f));
        arrayList4.add(new PointF(1.0f, 0.0f));
        arrayList.add(new PathInterpolator(0.16666667f, 0.16666667f, 0.13455492f, 1.0f));
        arrayList.add(new PathInterpolator(0.6698928f, 0.0f, 0.42556378f, 1.0f));
        arrayList.add(new PathInterpolator(0.72331685f, 0.0f, 0.42846164f, 1.0f));
        arrayList.add(new PathInterpolator(0.42846164f, 0.0f, 0.5503368f, 1.0f));
        arrayList3.add(new PathInterpolator(0.623265f, 0.0f, 0.5811811f, 1.0f));
        arrayList3.add(new PathInterpolator(0.7035138f, 0.0f, 0.8333333f, 0.8333333f));
    }

    @Override // X.V7K, X.C6RB
    public final void A0R() {
        super.A0R();
        int i = ((V7K) this).A02 - 10;
        if (i < 1) {
            i = 1;
        }
        this.A00 = (64 / i) + 80;
    }
}
