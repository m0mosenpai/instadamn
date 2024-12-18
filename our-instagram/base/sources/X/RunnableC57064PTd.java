package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;

/* renamed from: X.PTd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC57064PTd implements Runnable {
    public final /* synthetic */ C197368o7 A00;
    public final /* synthetic */ OEN A01;
    public final /* synthetic */ OJJ A02;
    public final /* synthetic */ OZr A03;
    public final /* synthetic */ InterfaceC197718oi A04;

    public RunnableC57064PTd(C197368o7 c197368o7, OEN oen, OJJ ojj, OZr oZr, InterfaceC197718oi interfaceC197718oi) {
        this.A04 = interfaceC197718oi;
        this.A03 = oZr;
        this.A01 = oen;
        this.A00 = c197368o7;
        this.A02 = ojj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C197728oj B9M = this.A04.B9M();
        OZr oZr = this.A03;
        if (oZr.A0M && B9M != null) {
            OEN oen = this.A01;
            C197368o7 c197368o7 = this.A00;
            OJJ ojj = this.A02;
            SparseArray sparseArray = ((FilterGroupModelImpl) oZr.A0F).A02.A01;
            FilterModel A0g = AbstractC166987dD.A0g(sparseArray, 5);
            if (A0g != null) {
                A0g.setEnabled(false);
            }
            if (B9M.A04.A00) {
                FilterModel A0g2 = AbstractC166987dD.A0g(sparseArray, 8);
                if (A0g2 != null) {
                    if (A0g2 instanceof GradientTransformFilter) {
                        ((GradientTransformFilter) A0g2).A05 = true;
                    } else if (A0g2 instanceof ValueMapFilterModel) {
                        ValueMapFilterModel valueMapFilterModel = (ValueMapFilterModel) A0g2;
                        if (C14360o3.A0K(valueMapFilterModel.A03, "gradient_transform")) {
                            valueMapFilterModel.A02("u_isGainmapEnabled", false);
                        }
                    }
                }
                FilterModel A0g3 = AbstractC166987dD.A0g(sparseArray, 3);
                if (A0g3 != null && (A0g3 instanceof SurfaceCropFilterModel)) {
                    ((SurfaceCropFilterModel) A0g3).A08 = "gainmap_alpha";
                }
                FilterModel A0g4 = AbstractC166987dD.A0g(sparseArray, 28);
                if (A0g4 != null && (A0g4 instanceof GainmapFilter)) {
                    GainmapFilter gainmapFilter = (GainmapFilter) A0g4;
                    gainmapFilter.A0A = true;
                    gainmapFilter.A09 = 4;
                    gainmapFilter.A01(true);
                }
            }
            Bitmap A00 = c197368o7.A00();
            if (A00 == null) {
                ojj.A00(AbstractC166987dD.A14("SDR Bitmap is null!"));
                return;
            }
            float A002 = C2J9.A00(oZr.A09);
            OZr.A01(new C55719Ool(A00, c197368o7, oen, ojj, oZr, B9M), c197368o7, oZr, B9M, AbstractC166987dD.A0A(oZr.A03, A002), AbstractC166987dD.A0A(oZr.A02, A002));
            return;
        }
        OZr.A00(null, this.A00, this.A01, this.A02, oZr);
    }
}
