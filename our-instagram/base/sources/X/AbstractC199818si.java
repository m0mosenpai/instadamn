package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterManagerImpl;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;

/* renamed from: X.8si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC199818si implements InterfaceC199548s4 {
    public final FilterModel A00;
    public final InstagramFilterFactoryProvider A01;

    @Override // X.InterfaceC199548s4
    public final void AC1(FilterManagerImpl filterManagerImpl, AnonymousClass810 anonymousClass810, String str) {
        if (this instanceof C9X8) {
            C14360o3.A0B(filterManagerImpl, 0);
            C14360o3.A0B(str, 1);
            C14360o3.A0B(anonymousClass810, 2);
            if ("dual".equals(str)) {
                filterManagerImpl.setTextureInput(str, anonymousClass810);
            }
        }
    }

    @Override // X.InterfaceC199548s4
    public void AC6(FilterManagerImpl filterManagerImpl) {
        FilterModel filterModel = this.A00;
        if (filterManagerImpl.mCachedModel != filterModel) {
            filterManagerImpl.mCachedModel = filterModel;
            filterManagerImpl.createFilter(this.A01.createFilterFactory(filterModel.getFilterName()));
        }
    }

    @Override // X.InterfaceC199548s4
    public final FilterModel B6R() {
        return this.A00;
    }

    public AbstractC199818si(InstagramFilterFactoryProvider instagramFilterFactoryProvider, FilterModel filterModel) {
        this.A01 = instagramFilterFactoryProvider;
        this.A00 = filterModel;
    }
}
