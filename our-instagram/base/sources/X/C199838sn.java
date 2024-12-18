package X;

import android.opengl.Matrix;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;

/* renamed from: X.8sn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199838sn extends AbstractC199818si {
    public boolean A00;
    public final float[] A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199838sn(InstagramFilterFactoryProvider instagramFilterFactoryProvider, ColorFilter colorFilter) {
        super(instagramFilterFactoryProvider, colorFilter);
        C14360o3.A0B(colorFilter, 1);
        C14360o3.A0B(instagramFilterFactoryProvider, 2);
        this.A01 = new float[16];
        this.A00 = true;
    }

    @Override // X.InterfaceC199548s4
    public final void ACI(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        ColorFilter colorFilter;
        float[] fArr3;
        C14360o3.A0B(filterManagerImpl, 0);
        C14360o3.A0B(fArr, 1);
        C14360o3.A0B(fArr2, 2);
        if (this.A00) {
            fArr3 = this.A01;
            colorFilter = (ColorFilter) super.A00;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, colorFilter.A07, 0);
        } else {
            colorFilter = (ColorFilter) super.A00;
            float[] fArr4 = colorFilter.A07;
            fArr3 = this.A01;
            AbstractC06960Yn.A0T(fArr4, fArr3, fArr4.length);
        }
        filterManagerImpl.setFloatArrayParameter("texture_transform", fArr3);
        if (!colorFilter.A05) {
            fArr2 = colorFilter.A06;
        }
        filterManagerImpl.setFloatArrayParameter("content_transform", fArr2);
    }

    @Override // X.InterfaceC199548s4
    public final void ACJ(FilterManagerImpl filterManagerImpl) {
        C14360o3.A0B(filterManagerImpl, 0);
        ColorFilter colorFilter = (ColorFilter) super.A00;
        if (colorFilter.A01 && !C14360o3.A0K(colorFilter.A04, "normal")) {
            throw new IllegalStateException("Alpha blending is only supported in the normal color filter");
        }
        filterManagerImpl.setFloatParameter("strength", colorFilter.A00);
        if (C14360o3.A0K(colorFilter.A04, "normal")) {
            filterManagerImpl.setBoolParameter("is_blend_enabled", colorFilter.A01);
        }
    }
}
