package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.AnonymousClass001;
import X.C05F;
import X.C0Gd;
import X.C14360o3;
import X.C2Ql;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class XplatRemoteModelVersionFetcher {
    public final C0Gd errorReporter;
    public final RemoteModelVersionFetcher modelVersionFetcher;

    public XplatRemoteModelVersionFetcher(RemoteModelVersionFetcher remoteModelVersionFetcher, C0Gd c0Gd) {
        C14360o3.A0B(remoteModelVersionFetcher, 1);
        C14360o3.A0B(c0Gd, 2);
        this.modelVersionFetcher = remoteModelVersionFetcher;
        this.errorReporter = c0Gd;
    }

    public final void fetchServerPreferredVersions(List list, XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback) {
        String str;
        C14360o3.A0B(list, 0);
        C14360o3.A0B(xplatRemoteModelVersionFetchCompletionCallback, 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(((Number) it.next()).intValue());
            if (fromXplatValue != null) {
                arrayList.add(fromXplatValue);
            }
        }
        try {
            this.modelVersionFetcher.fetchServerPreferredVersions(arrayList, xplatRemoteModelVersionFetchCompletionCallback);
        } catch (IllegalArgumentException e) {
            this.errorReporter.EHD("ArDelivery", C05F.A00, AnonymousClass001.A0R("XplatRemoteModelVersionFetcher hits illegal argument exception: ", C2Ql.A00(e)));
            str = "XplatRemoteModelVersionFetcher hits illegal argument exception";
            xplatRemoteModelVersionFetchCompletionCallback.onFailure(str);
        } catch (IllegalStateException e2) {
            this.errorReporter.EHD("ArDelivery", C05F.A00, AnonymousClass001.A0R("XplatRemoteModelVersionFetcher hits illegal state exception: ", C2Ql.A00(e2)));
            str = "XplatRemoteModelVersionFetcher hits illegal state exception";
            xplatRemoteModelVersionFetchCompletionCallback.onFailure(str);
        } catch (Exception e3) {
            this.errorReporter.EHD("ArDelivery", C05F.A00, AnonymousClass001.A0R("XplatRemoteModelVersionFetcher hits exception: ", C2Ql.A00(e3)));
            str = "XplatRemoteModelVersionFetcher hits exception";
            xplatRemoteModelVersionFetchCompletionCallback.onFailure(str);
        }
    }
}
