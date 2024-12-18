package X;

import com.facebook.cameracore.ardelivery.model.ARModelMetadataRequest;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.XplatModelMetadataCompletionCallback;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.XplatModelMetadataResponse;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.TyD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66015TyD implements X93 {
    public final /* synthetic */ XplatModelMetadataCompletionCallback A02;
    public final AtomicBoolean A01 = AbstractC166997dE.A17();
    public final List A00 = AbstractC58322PtE.A0z();

    @Override // X.X93
    public final void D6c(Exception exc, List list, Map map) {
        List list2;
        if (exc != null) {
            if (this.A01.compareAndSet(false, true)) {
                String message = exc.getMessage();
                if (message != null) {
                    this.A02.onFailure(message);
                    return;
                } else {
                    this.A02.onFailure("ModelMetadata fetch failed");
                    return;
                }
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ARModelMetadataRequest aRModelMetadataRequest = (ARModelMetadataRequest) it.next();
            if (map != null && (list2 = (List) map.get(aRModelMetadataRequest.mCapability)) != null) {
                List list3 = this.A00;
                int i = aRModelMetadataRequest.mRequestId;
                VersionedCapability versionedCapability = aRModelMetadataRequest.mCapability;
                C14360o3.A07(versionedCapability);
                list3.add(new XplatModelMetadataResponse(i, versionedCapability, aRModelMetadataRequest.mPreferredVersion, list2));
            }
        }
        if (!this.A01.compareAndSet(false, true)) {
            return;
        }
        XplatModelMetadataCompletionCallback xplatModelMetadataCompletionCallback = this.A02;
        List list4 = this.A00;
        C14360o3.A06(list4);
        xplatModelMetadataCompletionCallback.onSuccess(list4);
    }

    public C66015TyD(XplatModelMetadataCompletionCallback xplatModelMetadataCompletionCallback) {
        this.A02 = xplatModelMetadataCompletionCallback;
    }
}
