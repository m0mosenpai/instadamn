package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector;

import X.AbstractC06930Yk;
import X.C09170dP;
import X.C14360o3;
import X.C224609vl;
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
public final class DefectDetectorFilter extends DetectionFilterModel {
    public final String filterName;
    public final HybridData mHybridData;
    public int numOfBlackFrames;
    public int numOfFrames;
    public static final C224609vl Companion = new Object();
    public static final Parcelable.Creator CREATOR = new C63475SlG(37);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefectDetectorFilter(String str) {
        super(null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        C14360o3.A0B(str, 1);
        this.filterName = str;
        this.mHybridData = initHybrid();
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public final native boolean allSamplesSameColor(FilterWeakPtr filterWeakPtr);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final native int frameCounter(FilterWeakPtr filterWeakPtr);

    public final native int numBlack(FilterWeakPtr filterWeakPtr);

    public final native int numFramesSameColor(FilterWeakPtr filterWeakPtr);

    public final native int numSamples(FilterWeakPtr filterWeakPtr);

    public final float percentBlack(FilterWeakPtr filterWeakPtr) {
        C14360o3.A0B(filterWeakPtr, 0);
        int numSamples = numSamples(filterWeakPtr);
        if (numSamples == 0) {
            numSamples = 1;
        }
        return (numBlack(filterWeakPtr) * 100.0f) / numSamples;
    }

    public final native int rgba(FilterWeakPtr filterWeakPtr);

    public final void updateFrameCount(FilterWeakPtr filterWeakPtr) {
        C14360o3.A0B(filterWeakPtr, 0);
        this.numOfFrames++;
        if (percentBlack(filterWeakPtr) == 100.0f) {
            this.numOfBlackFrames++;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeString(this.filterName);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9vl, java.lang.Object] */
    static {
        C09170dP.A0C("mediapipeline-iglufilter-detector");
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public /* bridge */ /* synthetic */ FilterModel deepCopy() {
        return new DefectDetectorFilter("defect_detection");
    }

    public final float getBlackFrameRate() {
        return (this.numOfBlackFrames / this.numOfFrames) * 1.0f;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public String getFilterName() {
        return this.filterName;
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.detection.DetectionFilterModel
    public Map getDetectionStatistics() {
        return AbstractC06930Yk.A0E();
    }

    public /* synthetic */ DefectDetectorFilter(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "defect_detection" : str);
    }

    @Override // com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel
    public DefectDetectorFilter deepCopy() {
        return new DefectDetectorFilter("defect_detection");
    }

    public DefectDetectorFilter() {
        this("defect_detection");
    }
}
