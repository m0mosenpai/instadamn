package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder;

import X.AZ7;
import X.AnonymousClass810;
import X.AnonymousClass812;
import X.C02R;
import X.C09170dP;
import X.InterfaceC198588q7;
import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class FilterManagerImpl {
    public FilterModel mCachedModel;
    public FilterWeakPtr mFilterWeakPtr;
    public final InterfaceC198588q7 mTextureLoader;
    public final SparseArray mSubFilterMangerMap = new SparseArray();
    public final HybridData mHybridData = initHybrid();

    private native void createFilterChainNative();

    private native void createFilterGroupNative();

    private native void createFilterNative(SingleFilterFactory singleFilterFactory);

    private native FilterWeakPtr createFilterWeakPtrNative();

    private native void createSplitScreenFilterNative();

    public static native HybridData initHybrid();

    private native void releaseNative();

    private void releaseResources() {
        this.mFilterWeakPtr = null;
        int size = this.mSubFilterMangerMap.size();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.mSubFilterMangerMap;
            if (i < size) {
                Object valueAt = sparseArray.valueAt(i);
                valueAt.getClass();
                ((FilterManagerImpl) valueAt).release();
                i++;
            } else {
                sparseArray.clear();
                releaseNative();
                return;
            }
        }
    }

    private native void setBoolParameterNative(String str, boolean z);

    private native void setFilterChainInputTextureNative(int i, int i2, int i3, int i4, int i5, int i6, TextureLoaderWeakPtr textureLoaderWeakPtr);

    private native void setFilterChainOutputSizeNative(int i, int i2, int i3);

    private native void setFilterChainPositionEnabledNative(int i, boolean z);

    private native void setFilterGroupPositionEnabledNative(int i, boolean z);

    private native void setFilterUseInputFromGroupNative(int i, boolean z);

    private native void setFilterUseOutputFromGroupNative(int i, boolean z);

    private native void setFloatArrayParameterNative(String str, float[] fArr);

    private native void setFloatParameterNative(String str, float f);

    private native void setGraphNodeBoolParameterNative(String str, String str2, boolean z);

    private native void setGraphNodeFloatArrayParameterNative(String str, String str2, float[] fArr);

    private native void setGraphNodeFloatParameterNative(String str, String str2, float f);

    private native void setGraphNodeIntParameterNative(String str, String str2, int i);

    private native void setIntParameterNative(String str, int i);

    private native void setSplitScreenValueNative(float f);

    private native void setStringParameterNative(String str, String str2);

    private native void setTextureInputNative(String str, int i, int i2, int i3, int i4, TextureLoaderWeakPtr textureLoaderWeakPtr);

    private native void setTextureInputPathNative(String str, String str2, TextureLoaderWeakPtr textureLoaderWeakPtr, int i);

    private native void updateFilterChainPositionNative(int i, FilterWeakPtr filterWeakPtr);

    private native void updateFilterGroupPositionNative(int i, FilterWeakPtr filterWeakPtr);

    private native void updateSplitScreenFilterPositionNative(int i, FilterWeakPtr filterWeakPtr);

    public void release() {
        this.mCachedModel = null;
        releaseResources();
    }

    public void setTextureInput(String str, AnonymousClass810 anonymousClass810) {
        C02R.A03(this.mTextureLoader, "setTextureInput requires creating FilterManagerImpl with TextureLoader");
        int i = anonymousClass810.A00;
        int i2 = anonymousClass810.A01;
        AnonymousClass812 anonymousClass812 = anonymousClass810.A02;
        setTextureInputNative(str, i, i2, anonymousClass812.A01, anonymousClass812.A00, this.mTextureLoader.getTextureLoaderWeakPtr());
    }

    public void unsetFilterChainPosition(int i) {
        updateFilterChainPositionNative(i, null);
    }

    public void unsetFilterGroupPosition(int i) {
        updateFilterGroupPositionNative(i, null);
    }

    public void unsetSplitScreenFilterPosition(int i) {
        updateSplitScreenFilterPositionNative(i, null);
    }

    static {
        C09170dP.A0C("mediapipeline-iglufilter-holder");
    }

    public FilterWeakPtr getFilterWeakPtr() {
        FilterWeakPtr filterWeakPtr = this.mFilterWeakPtr;
        if (filterWeakPtr == null) {
            FilterWeakPtr createFilterWeakPtrNative = createFilterWeakPtrNative();
            this.mFilterWeakPtr = createFilterWeakPtrNative;
            return createFilterWeakPtrNative;
        }
        return filterWeakPtr;
    }

    public FilterManagerImpl getSubFilterManager(int i) {
        FilterManagerImpl filterManagerImpl = (FilterManagerImpl) this.mSubFilterMangerMap.get(i);
        if (filterManagerImpl == null) {
            FilterManagerImpl filterManagerImpl2 = new FilterManagerImpl(this.mTextureLoader, null);
            this.mSubFilterMangerMap.put(i, filterManagerImpl2);
            return filterManagerImpl2;
        }
        return filterManagerImpl;
    }

    public void setFilterUseOutputFromGroup(int i, boolean z) {
        setFilterUseOutputFromGroupNative(27, false);
    }

    public void setTextureInputPath(String str, String str2) {
        C02R.A03(this.mTextureLoader, "setTextureInputPath requires creating FilterManagerImpl with TextureLoader");
        setTextureInputPathNative(str, str2, this.mTextureLoader.getTextureLoaderWeakPtr(), 12);
    }

    public void syncFilterChainPosition(int i) {
        FilterManagerImpl filterManagerImpl = (FilterManagerImpl) this.mSubFilterMangerMap.get(i);
        if (filterManagerImpl != null) {
            updateFilterChainPositionNative(i, filterManagerImpl.getFilterWeakPtr());
        }
    }

    public void syncFilterGroupPosition(int i) {
        FilterManagerImpl filterManagerImpl = (FilterManagerImpl) this.mSubFilterMangerMap.get(i);
        if (filterManagerImpl != null) {
            updateFilterGroupPositionNative(i, filterManagerImpl.getFilterWeakPtr());
        }
    }

    public void syncSplitScreenFilterPosition(int i) {
        FilterManagerImpl filterManagerImpl = (FilterManagerImpl) this.mSubFilterMangerMap.get(i);
        if (filterManagerImpl != null) {
            updateSplitScreenFilterPositionNative(i, filterManagerImpl.getFilterWeakPtr());
        }
    }

    public FilterManagerImpl(InterfaceC198588q7 interfaceC198588q7, AZ7 az7) {
        this.mTextureLoader = interfaceC198588q7;
    }

    public void createFilter(SingleFilterFactory singleFilterFactory) {
        releaseResources();
        createFilterNative(singleFilterFactory);
    }

    public void createFilterChain() {
        releaseResources();
        createFilterChainNative();
    }

    public void createFilterGroup() {
        releaseResources();
        createFilterGroupNative();
    }

    public void createSplitScreenFilter() {
        releaseResources();
        createSplitScreenFilterNative();
    }

    public void setSplitScreenValue(float f) {
        setSplitScreenValueNative(f);
    }

    public void setStringParameter(String str, String str2) {
        boolean z = false;
        if (str2.length() > 0) {
            z = true;
        }
        C02R.A03(Boolean.valueOf(z), "setStringParameter requires valid string");
        setStringParameterNative(str, str2);
    }

    public void setBoolParameter(String str, boolean z) {
        setBoolParameterNative(str, z);
    }

    public void setFilterChainOutputSize(int i, int i2, int i3) {
        setFilterChainOutputSizeNative(i, i2, i3);
    }

    public void setFilterChainPositionEnabled(int i, boolean z) {
        setFilterChainPositionEnabledNative(i, z);
    }

    public void setFilterGroupPositionEnabled(int i, boolean z) {
        setFilterGroupPositionEnabledNative(i, z);
    }

    public void setFloatArrayParameter(String str, float[] fArr) {
        setFloatArrayParameterNative(str, fArr);
    }

    public void setFloatParameter(String str, float f) {
        setFloatParameterNative(str, f);
    }

    public void setGraphNodeBoolParameter(String str, String str2, boolean z) {
        setGraphNodeBoolParameterNative(str, str2, z);
    }

    public void setGraphNodeFloatArrayParameter(String str, String str2, float[] fArr) {
        setGraphNodeFloatArrayParameterNative(str, str2, fArr);
    }

    public void setGraphNodeFloatParameter(String str, String str2, float f) {
        setGraphNodeFloatParameterNative(str, str2, f);
    }

    public void setGraphNodeIntParameter(String str, String str2, int i) {
        setGraphNodeIntParameterNative(str, str2, i);
    }

    public void setIntParameter(String str, int i) {
        setIntParameterNative(str, i);
    }
}
