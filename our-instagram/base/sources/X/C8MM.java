package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.common.math.matrix.Matrix4;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.8MM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MM implements C8MI {
    public FilterGroupModel A00;
    public Matrix4 A01 = new Matrix4();
    public final UserSession A02;
    public final InterfaceC185718Lq A03;

    @Override // X.C8MI
    public final void Da9() {
        TransformMatrixConfig CAZ = this.A03.CAZ();
        if (CAZ != null) {
            Matrix4 matrix4 = this.A01;
            synchronized (CAZ) {
                C14360o3.A0B(matrix4, 0);
                matrix4.A04(CAZ.A00().A08);
            }
            FilterGroupModel filterGroupModel = this.A00;
            if (filterGroupModel != null) {
                AbstractC199768sS.A02(((FilterGroupModelImpl) filterGroupModel).A02, matrix4.A01);
                if (AbstractC199868sq.A00(this.A02)) {
                    FilterGroupModel filterGroupModel2 = this.A00;
                    if (filterGroupModel2 != null) {
                        FilterChain filterChain = ((FilterGroupModelImpl) filterGroupModel2).A02;
                        TransformMatrixParams transformMatrixParams = CAZ.A08;
                        C14360o3.A0B(transformMatrixParams, 1);
                        filterChain.A03.A00(transformMatrixParams);
                        return;
                    }
                } else {
                    return;
                }
            }
            C14360o3.A0F("filterGroupModel");
            throw C00O.createAndThrow();
        }
    }

    public C8MM(UserSession userSession, InterfaceC185718Lq interfaceC185718Lq) {
        this.A02 = userSession;
        this.A03 = interfaceC185718Lq;
    }
}
