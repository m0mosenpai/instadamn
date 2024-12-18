package com.facebook.cameracore.ardelivery.xplat.modelmanager;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class XplatModelMetadataResponse {
    public final VersionedCapability jVersionedCapability;
    public final List modelAssets;
    public final List remoteAssetAdapters;
    public final int requestId;
    public final int version;

    public XplatModelMetadataResponse(int i, VersionedCapability versionedCapability, int i2, List list) {
        AbstractC167007dF.A1F(versionedCapability, 2, list);
        this.requestId = i;
        this.jVersionedCapability = versionedCapability;
        this.version = i2;
        this.modelAssets = list;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(new XplatRemoteAsset((ARRequestAsset) it.next()));
        }
        this.remoteAssetAdapters = A0q;
    }

    public final List getRemoteAssetAdapters() {
        return this.remoteAssetAdapters;
    }

    public final int getRequestId() {
        return this.requestId;
    }

    public final int getVersion() {
        return this.version;
    }

    public final int getVersionedCapability() {
        return this.jVersionedCapability.getXplatValue();
    }
}
