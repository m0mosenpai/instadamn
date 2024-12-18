package X;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;

/* renamed from: X.9OH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9OH implements C85Q {
    public final int A00;
    public final Object A01;

    public C9OH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C85Q
    public final void D6S(C1825788b c1825788b, Exception exc) {
        if (this.A00 != 0) {
            if (c1825788b != null) {
                C9L9 c9l9 = (C9L9) this.A01;
                ModelPathsHolder modelPathsHolder = (ModelPathsHolder) c1825788b.A00.get(VersionedCapability.HandGesture);
                if (modelPathsHolder != null) {
                    c9l9.A02 = modelPathsHolder.getModelPath(EnumC1825988f.A0W);
                    return;
                }
                return;
            }
            return;
        }
        if (c1825788b == null) {
            return;
        }
        C22937A9h c22937A9h = (C22937A9h) this.A01;
        ModelPathsHolder modelPathsHolder2 = (ModelPathsHolder) c1825788b.A00.get(VersionedCapability.VideoHighlights);
        if (modelPathsHolder2 == null) {
            return;
        }
        c22937A9h.A02 = modelPathsHolder2.getModelPath(EnumC1825988f.A0W);
    }
}
