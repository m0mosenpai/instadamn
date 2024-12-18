package com.facebook.cameracore.mediapipeline.dataproviders.location.implementation;

import X.AbstractC63183Sei;
import X.C0K8;
import X.C103804lz;
import X.C1VW;
import X.C64073Syp;
import X.QFG;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationData;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

/* loaded from: classes10.dex */
public class LocationDataProviderImpl extends LocationDataProvider {
    public AbstractC63183Sei mDataSource;

    private native HybridData initHybrid();

    private native void onLocationDataUpdatedNative(LocationData locationData);

    @Override // com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider
    public void getCurrentCityName(NativeDataPromise nativeDataPromise) {
        AbstractC63183Sei abstractC63183Sei = this.mDataSource;
        if (abstractC63183Sei != null) {
            abstractC63183Sei.A03 = nativeDataPromise;
            abstractC63183Sei.A05 = false;
            String str = abstractC63183Sei.A04;
            if (str != null) {
                nativeDataPromise.setValue(str);
                abstractC63183Sei.A05 = true;
            }
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider
    public LocationData getCurrentLocationData() {
        C103804lz A01;
        AbstractC63183Sei abstractC63183Sei = this.mDataSource;
        if (abstractC63183Sei != null) {
            Context context = abstractC63183Sei.A07;
            boolean isLocationEnabled = C1VW.isLocationEnabled(context);
            boolean isLocationPermitted = C1VW.isLocationPermitted(context, null, "LOCATION_SERVICE_DATA_SOURCE");
            if (isLocationEnabled && isLocationPermitted && (A01 = abstractC63183Sei.A09.A01("LocationDataSource", Float.MAX_VALUE, Long.MAX_VALUE, false)) != null && A01.A03() != null) {
                return AbstractC63183Sei.A00(abstractC63183Sei, A01);
            }
            return new LocationData(false, 0.0d, 0.0d, 0.0d);
        }
        return null;
    }

    public void release() {
        AbstractC63183Sei abstractC63183Sei = this.mDataSource;
        if (abstractC63183Sei != null) {
            abstractC63183Sei.A00 = null;
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider
    public void setDataSource(AbstractC63183Sei abstractC63183Sei) {
        AbstractC63183Sei abstractC63183Sei2 = this.mDataSource;
        if (abstractC63183Sei != abstractC63183Sei2) {
            if (abstractC63183Sei2 != null) {
                abstractC63183Sei2.A00 = null;
            }
            this.mDataSource = abstractC63183Sei;
            abstractC63183Sei.A00 = this;
            if (abstractC63183Sei.A01 == null) {
                Context context = abstractC63183Sei.A07;
                boolean isLocationEnabled = C1VW.isLocationEnabled(context);
                boolean isLocationPermitted = C1VW.isLocationPermitted(context, null, "LOCATION_SERVICE_DATA_SOURCE");
                if (isLocationEnabled && isLocationPermitted) {
                    C64073Syp c64073Syp = new C64073Syp(abstractC63183Sei, 0);
                    abstractC63183Sei.A01 = c64073Syp;
                    try {
                        abstractC63183Sei.A0A.A07(c64073Syp, abstractC63183Sei.A02, QFG.class.getName());
                    } catch (IllegalStateException e) {
                        C0K8.A05(QFG.class, "Failed to request location updates", e);
                    }
                }
            }
        }
    }

    public LocationDataProviderImpl() {
        this.mHybridData = initHybrid();
    }

    public void onLocationDataUpdated(LocationData locationData) {
        onLocationDataUpdatedNative(locationData);
    }
}
