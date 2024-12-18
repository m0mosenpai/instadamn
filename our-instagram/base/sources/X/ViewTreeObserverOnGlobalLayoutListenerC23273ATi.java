package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: X.ATi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23273ATi implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ TextView A02;

    public ViewTreeObserverOnGlobalLayoutListenerC23273ATi(TextView textView, int i, int i2) {
        this.A02 = textView;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        TextView textView = this.A02;
        AbstractC166997dE.A1K(textView, this);
        float width = textView.getWidth() / 2;
        textView.getPaint().setShader(new LinearGradient(width, 0.0f, width, textView.getHeight(), new int[]{this.A01, this.A00}, (float[]) null, Shader.TileMode.CLAMP));
    }
}
