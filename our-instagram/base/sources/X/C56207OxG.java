package X;

import android.graphics.SurfaceTexture;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.OxG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56207OxG implements InterfaceC58165PqV {
    public SurfaceTexture A00;
    public MultiListenerTextureView A01;
    public C8Lw A02;
    public final UserSession A03;
    public final InterfaceC197218ns A04;

    @Override // X.InterfaceC58165PqV
    public final void AP4() {
    }

    @Override // X.InterfaceC58165PqV
    public final /* synthetic */ void AQ0(PhotoFilter photoFilter, FilterGroupModel filterGroupModel, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
    }

    @Override // X.InterfaceC58165PqV
    public final void AQ7(PhotoFilter photoFilter, FilterGroupModel filterGroupModel) {
        FilterChain deepCopy;
        String str;
        SurfaceCropFilterModel.FitTransformParams fitTransformParams;
        MultiListenerTextureView multiListenerTextureView = this.A01;
        C8Lw c8Lw = this.A02;
        InterfaceC197218ns interfaceC197218ns = this.A04;
        if (filterGroupModel != null && interfaceC197218ns != null && c8Lw != null && multiListenerTextureView != null) {
            int i = photoFilter.A08;
            int i2 = (int) (photoFilter.A03.A00 * 100.0f);
            FilterChain filterChain = ((FilterGroupModelImpl) filterGroupModel).A02;
            AbstractC53885NsH.A00(filterChain, i, i2);
            if (C18U.A06(C06090Tz.A05, this.A03, 36328465477156396L)) {
                str = "VideoCoverFrameRendererImpl_doOnScreenRender()";
                SurfaceCropFilter A00 = A0R.A00(filterGroupModel, "VideoCoverFrameRendererImpl_doOnScreenRender()");
                if (A00 != null) {
                    fitTransformParams = new SurfaceCropFilterModel.FitTransformParams();
                    A00.A0L(fitTransformParams);
                } else {
                    fitTransformParams = null;
                }
                deepCopy = filterChain.deepCopy();
                SurfaceCropFilter surfaceCropFilter = new SurfaceCropFilter(false);
                surfaceCropFilter.A0P(false);
                if (fitTransformParams != null) {
                    surfaceCropFilter.A0M(fitTransformParams);
                }
                deepCopy.A01(surfaceCropFilter.A00, 3);
            } else {
                deepCopy = filterChain.deepCopy();
                SurfaceCropFilter surfaceCropFilter2 = new SurfaceCropFilter(false);
                surfaceCropFilter2.A0P(false);
                deepCopy.A01(surfaceCropFilter2.A00, 3);
                str = "VideoCoverFrameRendererImpl_doOnScreenRender()";
            }
            interfaceC197218ns.Efe(multiListenerTextureView, c8Lw, A0R.A00(filterGroupModel, str));
            interfaceC197218ns.EUY(deepCopy);
            interfaceC197218ns.EGV();
        }
    }

    @Override // X.InterfaceC58165PqV
    public final void CO1(MultiListenerTextureView multiListenerTextureView, int i, int i2) {
        SurfaceTexture surfaceTexture = this.A00;
        surfaceTexture.getClass();
        surfaceTexture.setDefaultBufferSize(i, i2);
        multiListenerTextureView.setSurfaceTexture(this.A00);
        this.A02 = new C8Lw(new C81N(multiListenerTextureView));
        this.A01 = multiListenerTextureView;
    }

    @Override // X.InterfaceC58165PqV
    public final void DfN() {
        SurfaceTexture surfaceTexture = this.A00;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A00 = null;
        }
    }

    public C56207OxG(UserSession userSession, InterfaceC197218ns interfaceC197218ns) {
        this.A03 = userSession;
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        this.A00 = surfaceTexture;
        surfaceTexture.detachFromGLContext();
        this.A04 = interfaceC197218ns;
    }
}
