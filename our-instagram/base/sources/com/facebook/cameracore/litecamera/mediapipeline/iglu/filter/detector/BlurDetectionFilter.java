package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector;

import X.AbstractC06930Yk;
import X.C09170dP;
import X.C14360o3;
import X.C224599vk;
import X.C63475SlG;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterWeakPtr;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.detection.DetectionFilterModel;
import com.facebook.jni.HybridData;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class BlurDetectionFilter extends DetectionFilterModel {
    public final String filterName;
    public final HybridData mHybridData;
    public static final C224599vk Companion = new Object();
    public static final Parcelable.Creator CREATOR = new C63475SlG(36);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurDetectionFilter(String str) {
        super(null, null, false, null, 15, null);
        C14360o3.A0B(str, 1);
        this.filterName = str;
        this.mHybridData = initHybrid();
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final native float getBlurrinessScore(FilterWeakPtr filterWeakPtr);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.filterName);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9vk, java.lang.Object] */
    static {
        C09170dP.A0C("mediapipeline-iglufilter-detector");
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public /* bridge */ /* synthetic */ FilterModel deepCopy() {
        return new BlurDetectionFilter("blur_detection");
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public String getFilterName() {
        return this.filterName;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.detection.DetectionFilterModel
    public Map getDetectionStatistics() {
        return AbstractC06930Yk.A0E();
    }

    public /* synthetic */ BlurDetectionFilter(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "blur_detection" : str);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public BlurDetectionFilter deepCopy() {
        return new BlurDetectionFilter("blur_detection");
    }

    public BlurDetectionFilter() {
        this("blur_detection");
    }
}
