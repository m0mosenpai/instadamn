package X;

import android.opengl.Matrix;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter;

/* renamed from: X.9XI, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9XI extends AbstractC199818si {
    public final float[] A00;

    @Override // X.InterfaceC199548s4
    public final void ACI(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        C14360o3.A0B(filterManagerImpl, 0);
        AbstractC167017dG.A1P(fArr, fArr2);
        float[] fArr3 = this.A00;
        Matrix.multiplyMM(fArr3, 0, fArr, 0, super.A00.getTextureTransform(), 0);
        filterManagerImpl.setFloatArrayParameter("texture_transform", fArr3);
        filterManagerImpl.setFloatArrayParameter("content_transform", fArr2);
    }

    @Override // X.InterfaceC199548s4
    public void ACJ(FilterManagerImpl filterManagerImpl) {
        C14360o3.A0B(filterManagerImpl, 0);
        filterManagerImpl.setFloatParameter("transition_progress", ((TransitionFilter) super.A00).CAb());
    }

    public C9XI(InstagramFilterFactoryProvider instagramFilterFactoryProvider, TransitionFilter transitionFilter) {
        super(instagramFilterFactoryProvider, transitionFilter);
        this.A00 = new float[16];
    }
}
