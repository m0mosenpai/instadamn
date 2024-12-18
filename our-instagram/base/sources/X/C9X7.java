package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.9X7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9X7 extends AbstractC199818si {
    @Override // X.InterfaceC199548s4
    public final void ACJ(FilterManagerImpl filterManagerImpl) {
        C14360o3.A0B(filterManagerImpl, 0);
        DataDrivenGraphFilter dataDrivenGraphFilter = (DataDrivenGraphFilter) this.A00;
        if (dataDrivenGraphFilter.A02) {
            filterManagerImpl.setStringParameter("jsonFilterGraph", dataDrivenGraphFilter.A00);
            dataDrivenGraphFilter.A02 = false;
        }
        HashMap hashMap = dataDrivenGraphFilter.A05;
        if (hashMap != null) {
            Iterator A0l = AbstractC167007dF.A0l(hashMap);
            while (A0l.hasNext()) {
                String A1B = AbstractC166987dD.A1B(A0l);
                AbstractMap abstractMap = (AbstractMap) hashMap.get(A1B);
                if (abstractMap != null) {
                    Iterator A0l2 = AbstractC167007dF.A0l(abstractMap);
                    while (A0l2.hasNext()) {
                        String A1B2 = AbstractC166987dD.A1B(A0l2);
                        Object obj = abstractMap.get(A1B2);
                        if (obj instanceof Integer) {
                            filterManagerImpl.setGraphNodeIntParameter(A1B, A1B2, AbstractC166987dD.A0H(obj));
                        } else if (!(obj instanceof Float) && !(obj instanceof Double)) {
                            if (obj instanceof Boolean) {
                                filterManagerImpl.setGraphNodeBoolParameter(A1B, A1B2, AbstractC166987dD.A1a(obj));
                            } else if (!(obj instanceof AnonymousClass810)) {
                                if (obj instanceof float[]) {
                                    filterManagerImpl.setGraphNodeFloatArrayParameter(A1B, A1B2, (float[]) obj);
                                }
                            } else {
                                throw AbstractC166987dD.A18("set Texture uniform in Data driven graph node not added yet!");
                            }
                        } else {
                            filterManagerImpl.setGraphNodeFloatParameter(A1B, A1B2, AbstractC166987dD.A09(obj));
                        }
                    }
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
