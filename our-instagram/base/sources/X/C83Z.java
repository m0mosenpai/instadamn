package X;

import com.facebook.cameracore.mediapipeline.services.persistence.interfaces.PersistenceServiceDelegateHybrid;
import com.facebook.cameracore.mediapipeline.services.persistence.interfaces.PersistenceServiceDelegateJavaHybrid;

/* renamed from: X.83Z, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C83Z implements InterfaceC1814783a {
    @Override // X.InterfaceC1814783a
    public final PersistenceServiceDelegateHybrid AML() {
        return new PersistenceServiceDelegateJavaHybrid(this);
    }
}
