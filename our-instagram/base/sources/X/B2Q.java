package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.instagram.unifiedfilter.UnifiedFilterManager;

/* loaded from: classes4.dex */
public final class B2Q implements InterfaceC09250da, InterfaceC16820sZ {
    public final int A00;

    public B2Q(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider, java.lang.Object] */
    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        ValueMapFilterModel A01;
        switch (this.A00) {
            case 0:
                return new Ow3();
            case 1:
                C0o0 A00 = AbstractC14350nz.A00();
                A00.A01 = "BoomerangCapture";
                return new C18240vB(A00);
            case 2:
                return new UnifiedFilterManager();
            case 3:
                return new C14140ne(1094744753, 3, false, false);
            case 4:
                ColorFilter colorFilter = new ColorFilter("normal");
                colorFilter.A01 = true;
                C199838sn c199838sn = new C199838sn(new Object(), colorFilter);
                c199838sn.A00 = false;
                return c199838sn;
            default:
                Integer num = C05F.A0C;
                A01 = AHK.A01(new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false), "rounded_rect2", null, 46);
                A01.A00("topLeftRadius", 0.0f);
                A01.A00("topRightRadius", 0.0f);
                A01.A00("bottomLeftRadius", 0.0f);
                A01.A00("bottomRightRadius", 0.0f);
                return new AW9(new Object(), A01);
        }
    }
}
