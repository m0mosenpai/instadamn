package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;

/* renamed from: X.9bF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212469bF extends AbstractC198678qH {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public FilterModel A04;
    public InterfaceC199548s4 A05;
    public final C198718qR A06;
    public final Integer A07;

    public C212469bF(InterfaceC198588q7 interfaceC198588q7, C198548q3 c198548q3, Integer num, boolean z) {
        super(null);
        ValueMapFilterModel A01;
        ValueMapFilterModel A012;
        FilterModel filterModel;
        this.A01 = -1;
        this.A00 = -1;
        this.A03 = -1;
        this.A02 = -1;
        this.A06 = new C198718qR(interfaceC198588q7, c198548q3, null, z, false, false);
        this.A07 = num;
        int intValue = num.intValue();
        FilterModel filterModel2 = null;
        if (intValue != 2) {
            if (intValue != 3) {
                if (intValue == 4) {
                    filterModel = AHL.A02(true);
                }
                this.A04 = filterModel2;
            }
            filterModel = AHL.A02(false);
        } else {
            FilterChain filterChain = new FilterChain();
            Integer num2 = C05F.A01;
            A01 = AHK.A01(new TransformMatrixParams(num2, num2, 1.0f, 0.0f, 0.0f, 0.0f, false), MSV.A00(1642), null, 46);
            filterChain.A01(A01, 0);
            Integer num3 = C05F.A00;
            A012 = AHK.A01(new TransformMatrixParams(num3, num3, 1.0f, 0.0f, 0.0f, 0.0f, false), MSV.A00(1415), null, 46);
            filterChain.A01(A012, 1);
            filterModel = filterChain;
        }
        filterModel2 = filterModel;
        this.A04 = filterModel2;
    }
}
