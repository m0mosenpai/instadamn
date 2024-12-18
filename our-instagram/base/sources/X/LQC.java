package X;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;

/* loaded from: classes8.dex */
public final class LQC implements View.OnLayoutChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C47701L4i A01;
    public final /* synthetic */ AbstractC161267Kl A02;

    public LQC(View view, C47701L4i c47701L4i, AbstractC161267Kl abstractC161267Kl) {
        this.A00 = view;
        this.A01 = c47701L4i;
        this.A02 = abstractC161267Kl;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Paint paint;
        view.removeOnLayoutChangeListener(this);
        View view2 = this.A00;
        float A08 = AbstractC166987dD.A08(view2);
        ShapeDrawable shapeDrawable = this.A01.A00;
        if (shapeDrawable != null && (paint = shapeDrawable.getPaint()) != null) {
            Context context = view2.getContext();
            AbstractC161267Kl abstractC161267Kl = this.A02;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, A08, new int[]{context.getColor(abstractC161267Kl.A03()), context.getColor(abstractC161267Kl.A02())}, (float[]) null, Shader.TileMode.CLAMP));
            paint.setAlpha(255);
            shapeDrawable.invalidateSelf();
        }
    }
}
