package X;

import android.graphics.Canvas;
import android.graphics.RadialGradient;
import com.meta.metaai.components.voice.animation.ui.view.MetaAIListeningIndicatorView;

/* renamed from: X.D8l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29715D8l extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ Canvas A04;
    public final /* synthetic */ MetaAIListeningIndicatorView A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29715D8l(Canvas canvas, MetaAIListeningIndicatorView metaAIListeningIndicatorView, float f, float f2, float f3, float f4) {
        super(0);
        this.A04 = canvas;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A05 = metaAIListeningIndicatorView;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Canvas canvas = this.A04;
        canvas.translate(this.A00, this.A01);
        canvas.scale(this.A02, this.A03);
        MetaAIListeningIndicatorView metaAIListeningIndicatorView = this.A05;
        RadialGradient radialGradient = MetaAIListeningIndicatorView.A0S;
        canvas.drawCircle(0.0f, 0.0f, 100.0f, metaAIListeningIndicatorView.A0A);
        return C0eB.A00;
    }
}
