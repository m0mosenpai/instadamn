package X;

import android.graphics.Paint;
import java.util.concurrent.TimeUnit;

/* renamed from: X.W2z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70099W2z {
    public static final long A08 = AbstractC43593JPy.A09(TimeUnit.SECONDS);
    public float A00;
    public Paint A01;
    public final float A02;
    public final long A03;
    public final C69329Vlb A04;
    public final C69329Vlb A05;
    public final boolean A06;
    public final int[] A07;

    public C70099W2z(C69329Vlb c69329Vlb, C69329Vlb c69329Vlb2, int[] iArr, float f, boolean z) {
        this.A07 = iArr;
        this.A05 = c69329Vlb;
        this.A04 = c69329Vlb2;
        this.A06 = z;
        float f2 = c69329Vlb.A03 - c69329Vlb.A02;
        float f3 = c69329Vlb2.A03 - c69329Vlb2.A02;
        float f4 = c69329Vlb.A05 - c69329Vlb.A04;
        float f5 = c69329Vlb2.A05 - c69329Vlb2.A04;
        this.A02 = (float) (90.0d - Math.toDegrees(Math.atan2((f2 * f3) + (f4 * f5), (f2 * f5) - (f3 * f4))));
        this.A03 = f * A08;
    }
}
