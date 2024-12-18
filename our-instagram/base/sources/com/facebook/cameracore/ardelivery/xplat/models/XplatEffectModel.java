package com.facebook.cameracore.ardelivery.xplat.models;

import X.C14360o3;
import X.C174407pa;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public final class XplatEffectModel {
    public final String MD5Hash;
    public final List arEffectAsyncAssets;
    public final String cacheKey;
    public List capabilitiesMinVersionModels;
    public final int compressionTypeCppValue;
    public final String effectId;
    public final String effectInstanceId;
    public final boolean encrypted;
    public final String fileName;
    public final long fileSize;
    public final String graphqlId;
    public final String manifestCapabilities;
    public List sparkVisionModels;
    public final String uri;

    public XplatEffectModel(ARRequestAsset aRRequestAsset) {
        ImmutableList immutableList;
        List list;
        C14360o3.A0B(aRRequestAsset, 1);
        C174407pa c174407pa = aRRequestAsset.A02;
        if (c174407pa.A02 == ARAssetType.EFFECT) {
            String str = c174407pa.A09;
            this.effectId = str;
            this.effectInstanceId = c174407pa.A0A;
            this.capabilitiesMinVersionModels = aRRequestAsset.A0A;
            SparkVisionCapability sparkVisionCapability = aRRequestAsset.A03;
            if (sparkVisionCapability != null && (list = sparkVisionCapability.A00) != null) {
                immutableList = ImmutableList.copyOf((Collection) list);
            } else {
                immutableList = null;
            }
            this.sparkVisionModels = immutableList;
            this.fileName = aRRequestAsset.A07;
            this.graphqlId = str;
            this.cacheKey = c174407pa.A08;
            this.uri = aRRequestAsset.A09;
            this.MD5Hash = aRRequestAsset.A06;
            this.fileSize = aRRequestAsset.A00;
            this.compressionTypeCppValue = ARRequestAsset.CompressionMethod.toXplatCompressionType(c174407pa.A03).A00;
            this.arEffectAsyncAssets = aRRequestAsset.A04;
            this.manifestCapabilities = aRRequestAsset.A08;
            this.encrypted = c174407pa.A06.booleanValue();
            return;
        }
        throw new IllegalStateException("This adapter is only for effect asset");
    }

    public final List getCapabilitiesMinVersionModels() {
        return this.capabilitiesMinVersionModels;
    }

    public final List getSparkVisionModels() {
        return this.sparkVisionModels;
    }

    public final void setCapabilitiesMinVersionModels(List list) {
        this.capabilitiesMinVersionModels = list;
    }

    public final void setSparkVisionModels(List list) {
        this.sparkVisionModels = list;
    }
}
