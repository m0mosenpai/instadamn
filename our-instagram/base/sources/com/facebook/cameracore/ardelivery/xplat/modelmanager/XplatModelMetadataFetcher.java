package com.facebook.cameracore.ardelivery.xplat.modelmanager;

import X.C14360o3;
import X.C1819085a;
import X.C66015TyD;
import com.facebook.cameracore.ardelivery.modelmanager.metadataloader.ARModelMetadataDownloader;
import java.util.List;

/* loaded from: classes3.dex */
public final class XplatModelMetadataFetcher {
    public ARModelMetadataDownloader modelMetadataDownloader;

    public XplatModelMetadataFetcher(ARModelMetadataDownloader aRModelMetadataDownloader) {
        C14360o3.A0B(aRModelMetadataDownloader, 1);
        this.modelMetadataDownloader = aRModelMetadataDownloader;
    }

    public final void executeRequests(List list, XplatModelMetadataCompletionCallback xplatModelMetadataCompletionCallback) {
        C14360o3.A0B(list, 0);
        C14360o3.A0B(xplatModelMetadataCompletionCallback, 1);
        this.modelMetadataDownloader.downloadModelMetadata(list, new C1819085a().A00(), new C66015TyD(xplatModelMetadataCompletionCallback));
    }

    public final void setModelMetadataDownloader(ARModelMetadataDownloader aRModelMetadataDownloader) {
        C14360o3.A0B(aRModelMetadataDownloader, 0);
        this.modelMetadataDownloader = aRModelMetadataDownloader;
    }

    public final ARModelMetadataDownloader getModelMetadataDownloader() {
        return this.modelMetadataDownloader;
    }
}
