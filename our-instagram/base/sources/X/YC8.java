package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.widget.zoomcontainer.SimpleZoomableViewContainer;

/* loaded from: classes12.dex */
public final class YC8 implements InterfaceC51522Ya {
    public final /* synthetic */ XVc A00;

    public YC8(XVc xVc) {
        this.A00 = xVc;
    }

    @Override // X.InterfaceC51522Ya
    public final /* bridge */ /* synthetic */ Object ABB(Context context) {
        C14360o3.A0B(context, 0);
        XVc xVc = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.simple_zoomable_media_primitive_component, (ViewGroup) null);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(483));
        SimpleZoomableViewContainer simpleZoomableViewContainer = (SimpleZoomableViewContainer) inflate;
        XVc.A03(simpleZoomableViewContainer, xVc);
        return simpleZoomableViewContainer;
    }
}
