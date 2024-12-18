package X;

import android.graphics.Canvas;
import com.facebook.rendercore.text.RCTextView;

/* loaded from: classes11.dex */
public final class WXs implements X9N {
    public final /* synthetic */ X9N A00;
    public final /* synthetic */ InterfaceC131865xM A01;
    public final /* synthetic */ RCTextView A02;

    public WXs(X9N x9n, InterfaceC131865xM interfaceC131865xM, RCTextView rCTextView) {
        this.A02 = rCTextView;
        this.A01 = interfaceC131865xM;
        this.A00 = x9n;
    }

    @Override // X.X9N
    public final void AQP(Canvas canvas) {
        InterfaceC131865xM interfaceC131865xM = this.A01;
        X9N x9n = this.A00;
        C70463WXt c70463WXt = (C70463WXt) interfaceC131865xM;
        C14360o3.A0B(canvas, 0);
        C69370VmG c69370VmG = c70463WXt.A02;
        if (c69370VmG != null) {
            C70463WXt.A00(canvas, c70463WXt.A00, c69370VmG);
        }
        x9n.AQP(canvas);
        C69370VmG c69370VmG2 = c70463WXt.A03;
        if (c69370VmG2 != null) {
            C70463WXt.A00(canvas, c70463WXt.A01, c69370VmG2);
        }
    }
}
