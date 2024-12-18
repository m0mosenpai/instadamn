package com.facebook.cameracore.ardelivery.effectasyncassetfetcher;

import X.AbstractC166987dD;
import X.C09170dP;
import X.C0K8;
import X.EnumC202068wl;
import X.InterfaceC150176pN;
import X.InterfaceC2040690z;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.jni.HybridData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class AsyncAssetFetcher {
    public static final String TAG = "AsyncAssetFetcher";
    public final List mAsyncAssets;
    public final String mEffectId;
    public final String mEffectInstanceId;
    public final InterfaceC2040690z mFetchCallback;
    public HybridData mHybridData;
    public final boolean mIsLoggingDisabled;

    private native HybridData initHybrid();

    public static ARAssetType fromAsyncAssetType(EnumC202068wl enumC202068wl) {
        if (enumC202068wl == EnumC202068wl.Remote) {
            return ARAssetType.REMOTE;
        }
        if (enumC202068wl != EnumC202068wl.Block && enumC202068wl != EnumC202068wl.ShareableBlock && enumC202068wl != EnumC202068wl.ExternalBlock) {
            return null;
        }
        return ARAssetType.ASYNC;
    }

    public CancelableToken fetchAsyncAsset(String str, String str2, String str3, int i, int i2, int i3, OnAsyncAssetFetchCompletedListener onAsyncAssetFetchCompletedListener) {
        InterfaceC150176pN CxV;
        StringBuilder A1C;
        String obj;
        String str4 = str;
        InterfaceC150176pN interfaceC150176pN = null;
        if (this.mFetchCallback == null) {
            C0K8.A0E(TAG, "fetch asset async but AsyncAssetFetchCallback is null.");
            obj = "No AsyncAssetFetchCallback. Abort.";
        } else {
            if (i != 1 && i != 0 && i != 2 && i != 3) {
                A1C = AbstractC166987dD.A1C();
                A1C.append("unsupported async asset type: ");
                A1C.append(i);
            } else if (i2 != 0 && i2 != 1) {
                A1C = AbstractC166987dD.A1C();
                A1C.append("Unsupported AsyncAssetRequestType: ");
                A1C.append(i2);
            } else {
                EnumC202068wl enumC202068wl = EnumC202068wl.values()[i];
                ARAssetType fromAsyncAssetType = fromAsyncAssetType(enumC202068wl);
                fromAsyncAssetType.getClass();
                if (i == 3) {
                    if (i2 == 0) {
                        interfaceC150176pN = this.mFetchCallback.DGe(onAsyncAssetFetchCompletedListener, str4, this.mEffectId);
                        return new CancelableLoadToken(interfaceC150176pN);
                    }
                } else if (i != 2) {
                    if (i == 0) {
                        str4 = TextUtils.join("_", Arrays.asList(this.mEffectId, str3));
                    }
                    CxV = this.mFetchCallback.CxV(onAsyncAssetFetchCompletedListener, new ARRequestAsset(fromAsyncAssetType, ARRequestAsset.CompressionMethod.fromCompressionTypeCppValue(i3), null, enumC202068wl, null, null, null, null, str4, this.mEffectInstanceId, null, str3, str2, null, str3, null, null, null, -1, -1L, -1L, this.mIsLoggingDisabled, false, false));
                    return new CancelableLoadToken(CxV);
                }
                CxV = this.mFetchCallback.CxW(onAsyncAssetFetchCompletedListener, fromAsyncAssetType, enumC202068wl, str4, this.mEffectId, this.mEffectInstanceId, this.mIsLoggingDisabled);
                return new CancelableLoadToken(CxV);
            }
            obj = A1C.toString();
        }
        onAsyncAssetFetchCompletedListener.onAsyncAssetFetchCompleted(null, obj);
        return new CancelableLoadToken(interfaceC150176pN);
    }

    public List getAsyncAssets() {
        List list = this.mAsyncAssets;
        if (list == null) {
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(list);
    }

    public AsyncAssetFetcher(String str, String str2, List list, InterfaceC2040690z interfaceC2040690z, boolean z) {
        HybridData hybridData;
        this.mEffectId = str;
        this.mEffectInstanceId = str2;
        this.mAsyncAssets = list;
        this.mFetchCallback = interfaceC2040690z;
        this.mIsLoggingDisabled = z;
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            C09170dP.A0C("ard-android-async-asset-fetcher");
            hybridData = initHybrid();
        } else {
            hybridData = null;
        }
        this.mHybridData = hybridData;
    }
}
