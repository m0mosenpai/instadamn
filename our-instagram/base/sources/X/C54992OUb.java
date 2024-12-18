package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.instagram.quicksnap.emitter.QuickSnapReactionEmitterView;
import java.util.Random;

/* renamed from: X.OUb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54992OUb {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public long A08;
    public Bitmap A09;
    public final /* synthetic */ QuickSnapReactionEmitterView A0E;
    public PointF A0A = new PointF();
    public PointF A0C = new PointF();
    public PointF A0D = new PointF();
    public PointF A0B = new PointF();

    public C54992OUb(QuickSnapReactionEmitterView quickSnapReactionEmitterView) {
        this.A0E = quickSnapReactionEmitterView;
    }

    public static void A00(C54992OUb c54992OUb, Random random, float f) {
        c54992OUb.A06 = f;
        c54992OUb.A05 = (float) ((-0.6283185307179586d) + ((0.6283185307179586d - (-0.6283185307179586d)) * random.nextFloat()));
    }
}
