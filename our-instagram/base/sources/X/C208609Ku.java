package X;

import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.R;

/* renamed from: X.9Ku, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208609Ku implements InterfaceC131505wh {
    public float[] A00;
    public int[] A01;
    public final float A02;
    public final Context A03;

    public C208609Ku(Context context, float f) {
        C14360o3.A0B(context, 1);
        this.A03 = context;
        this.A02 = f;
    }

    @Override // X.InterfaceC131505wh
    public final float BiN(long j) {
        return ((((float) j) / 2000.0f) * 360.0f) % 360.0f;
    }

    @Override // X.InterfaceC131505wh
    public final boolean CRA() {
        return true;
    }

    @Override // X.InterfaceC131505wh
    public final int[] BiL(int i) {
        int[] iArr = this.A01;
        if (iArr == null) {
            Context context = this.A03;
            int[] iArr2 = {context.getColor(R.color.clips_gradient_redesign_color_0), context.getColor(R.color.clips_gradient_redesign_color_1), context.getColor(R.color.clips_gradient_redesign_color_2), context.getColor(R.color.clips_gradient_redesign_color_3), context.getColor(R.color.clips_gradient_redesign_color_4)};
            this.A01 = iArr2;
            return iArr2;
        }
        return iArr;
    }

    @Override // X.InterfaceC131505wh
    public final float[] BiM() {
        float[] fArr = this.A00;
        if (fArr == null) {
            float[] fArr2 = {0.15f, 0.3f, 0.5f, 0.7f, 0.85f};
            this.A00 = fArr2;
            return fArr2;
        }
        return fArr;
    }

    @Override // X.InterfaceC131505wh
    public final float BiO(float f, long j) {
        long j2;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        long currentTimeMillis = System.currentTimeMillis() % 2000;
        float f2 = 0.75f * f;
        if (currentTimeMillis < 1000) {
            j2 = (-500) + currentTimeMillis;
        } else {
            j2 = 500 - currentTimeMillis;
        }
        return f + (f2 * accelerateDecelerateInterpolator.getInterpolation(((float) j2) / 500.0f));
    }

    @Override // X.InterfaceC131505wh
    public final float CFO() {
        return this.A02;
    }
}
