package X;

import android.content.Context;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* loaded from: classes5.dex */
public final class BNL implements InterfaceC51522Ya {
    public final /* synthetic */ BNK A00;

    public BNL(BNK bnk) {
        this.A00 = bnk;
    }

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        SimpleZoomableViewContainer simpleZoomableViewContainer = new SimpleZoomableViewContainer(context, null, 0);
        simpleZoomableViewContainer.addView(new BOI(context, this.A00.A04));
        return simpleZoomableViewContainer;
    }
}
