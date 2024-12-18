package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.instagram.reels.music.external.pulseanimation.PulseAnimation;

/* renamed from: X.Jjm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44408Jjm extends View {
    public final /* synthetic */ PulseAnimation A00;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        PulseAnimation pulseAnimation = this.A00;
        if (pulseAnimation.A07 != null) {
            float min = Math.min(getWidth(), getHeight()) / 2;
            Paint paint = pulseAnimation.A07;
            if (paint == null) {
                C14360o3.A0F("paint");
                throw C00O.createAndThrow();
            }
            canvas.drawCircle(min, min, min, paint);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44408Jjm(Context context, PulseAnimation pulseAnimation) {
        super(context);
        this.A00 = pulseAnimation;
        setVisibility(4);
    }
}
