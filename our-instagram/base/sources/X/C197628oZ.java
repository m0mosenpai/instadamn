package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;

/* renamed from: X.8oZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197628oZ extends AbstractC199818si {
    @Override // X.InterfaceC199548s4
    public final void ACI(FilterManagerImpl filterManagerImpl, float[] fArr, float[] fArr2) {
        C14360o3.A0B(filterManagerImpl, 0);
        GainmapFilter gainmapFilter = (GainmapFilter) this.A00;
        filterManagerImpl.setFloatArrayParameter("texture_transform", gainmapFilter.A0F);
        filterManagerImpl.setFloatArrayParameter("content_transform", gainmapFilter.A0D);
    }

    @Override // X.InterfaceC199548s4
    public final void ACJ(FilterManagerImpl filterManagerImpl) {
        C14360o3.A0B(filterManagerImpl, 0);
        GainmapFilter gainmapFilter = (GainmapFilter) this.A00;
        filterManagerImpl.setFloatParameter("strength", gainmapFilter.A07);
        filterManagerImpl.setFloatParameter("weight", gainmapFilter.A08);
        filterManagerImpl.setFloatParameter("ratioMin", gainmapFilter.A04);
        filterManagerImpl.setFloatParameter("ratioMax", gainmapFilter.A03);
        filterManagerImpl.setFloatParameter("gamma", gainmapFilter.A02);
        filterManagerImpl.setFloatParameter("epsilonSdr", gainmapFilter.A01);
        filterManagerImpl.setFloatParameter("epsilonHdr", gainmapFilter.A00);
        int i = gainmapFilter.A09;
        if ((i == 1 || i == 2) && !gainmapFilter.A0B) {
            i = 0;
        }
        filterManagerImpl.setIntParameter("gainmapMode", i);
        float[] fArr = gainmapFilter.A0E;
        filterManagerImpl.setFloatParameter("destTFG", fArr[0]);
        filterManagerImpl.setFloatParameter("destTFA", fArr[1]);
        filterManagerImpl.setFloatParameter("destTFB", fArr[2]);
        filterManagerImpl.setFloatParameter("destTFC", fArr[3]);
        filterManagerImpl.setFloatParameter("destTFD", fArr[4]);
        filterManagerImpl.setFloatParameter("destTFE", fArr[5]);
        filterManagerImpl.setFloatParameter("destTFF", fArr[6]);
    }
}
