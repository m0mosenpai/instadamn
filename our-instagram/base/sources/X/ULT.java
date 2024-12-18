package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class ULT extends AbstractC66278U6y {
    public final WlL A00;
    public final C44351Jiq A01;
    public final int A02;
    public final Rect A03;

    @Override // X.AbstractC66278U6y
    public final void A0D(Canvas canvas) {
        C66356UBx c66356UBx = this.A07.A0I;
        int width = c66356UBx.getWidth();
        int height = c66356UBx.getHeight();
        C44351Jiq c44351Jiq = this.A01;
        int intrinsicWidth = c44351Jiq.getIntrinsicWidth();
        int intrinsicHeight = c44351Jiq.getIntrinsicHeight();
        Rect rect = this.A03;
        rect.set(0, 0, intrinsicWidth, intrinsicHeight);
        int i = this.A02;
        rect.offsetTo((width - i) - intrinsicWidth, (height - i) - intrinsicHeight);
        c44351Jiq.setBounds(rect);
        c44351Jiq.draw(canvas);
    }

    public ULT(C70394WTw c70394WTw, WlL wlL, int i) {
        super(c70394WTw);
        this.A03 = new Rect();
        Context context = c70394WTw.A0G;
        this.A01 = new C44351Jiq(context, context.getDrawable(R.drawable.location_outline));
        this.A02 = i;
        super.A02 = 3.0f;
        super.A03 = 5;
        this.A00 = wlL;
    }
}
