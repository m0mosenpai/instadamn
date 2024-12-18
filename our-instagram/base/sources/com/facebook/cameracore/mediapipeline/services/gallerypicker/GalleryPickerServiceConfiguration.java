package com.facebook.cameracore.mediapipeline.services.gallerypicker;

import X.AbstractC203838zs;
import X.C203848zt;
import X.EnumC150506pz;

/* loaded from: classes4.dex */
public class GalleryPickerServiceConfiguration extends AbstractC203838zs {
    public static final C203848zt A01 = new C203848zt(EnumC150506pz.A0V);
    public final GalleryPickerServiceDataSource A00;

    public GalleryPickerServiceDataSource getDataSource() {
        return this.A00;
    }

    public GalleryPickerServiceConfiguration(GalleryPickerServiceDataSource galleryPickerServiceDataSource) {
        this.A00 = galleryPickerServiceDataSource;
    }
}
