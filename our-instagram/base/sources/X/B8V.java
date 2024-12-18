package X;

import android.graphics.Canvas;

/* loaded from: classes4.dex */
public final class B8V extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ C6RB A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8V(C6RB c6rb, float f, float f2) {
        super(1);
        this.A00 = f;
        this.A01 = f2;
        this.A02 = c6rb;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Canvas canvas = (Canvas) obj;
        AbstractC167007dF.A0r(canvas);
        canvas.translate(this.A00 + this.A01, 0.0f);
        C6RB c6rb = this.A02;
        if (c6rb != null) {
            c6rb.A0T(canvas);
        }
        canvas.restore();
        return C0eB.A00;
    }
}
