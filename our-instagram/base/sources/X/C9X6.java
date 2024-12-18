package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.9X6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9X6 extends AbstractC199818si {
    @Override // X.InterfaceC199548s4
    public final void ACJ(FilterManagerImpl filterManagerImpl) {
        C14360o3.A0B(filterManagerImpl, 0);
        DataDrivenFilter dataDrivenFilter = (DataDrivenFilter) this.A00;
        filterManagerImpl.setStringParameter("glslShaderString", dataDrivenFilter.A00);
        HashMap hashMap = dataDrivenFilter.A04;
        if (hashMap != null) {
            Iterator A0l = AbstractC167007dF.A0l(hashMap);
            while (A0l.hasNext()) {
                String A1B = AbstractC166987dD.A1B(A0l);
                Object obj = hashMap.get(A1B);
                if (obj instanceof Integer) {
                    filterManagerImpl.setIntParameter(A1B, AbstractC166987dD.A0H(obj));
                } else if (!(obj instanceof Float) && !(obj instanceof Double)) {
                    if (obj instanceof Boolean) {
                        filterManagerImpl.setBoolParameter(A1B, AbstractC166987dD.A1a(obj));
                    } else if (obj instanceof AnonymousClass810) {
                        filterManagerImpl.setTextureInput(A1B, (AnonymousClass810) obj);
                    } else if (obj instanceof float[]) {
                        filterManagerImpl.setFloatArrayParameter(A1B, (float[]) obj);
                    }
                } else {
                    filterManagerImpl.setFloatParameter(A1B, AbstractC166987dD.A09(obj));
                }
            }
        }
    }

    @Override // X.InterfaceC199548s4
    public final void ACI(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        AbstractC167027dH.A12(filterManagerImpl, fArr, fArr2);
        filterManagerImpl.setFloatArrayParameter("texture_transform", fArr);
        filterManagerImpl.setFloatArrayParameter("content_transform", fArr2);
    }
}
