package X;

import android.app.ResourcesManager;

/* renamed from: X.4r9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106554r9 implements InterfaceC106514r5 {
    @Override // X.InterfaceC106514r5
    public final String getName() {
        return "ResourceManagerWatchdog";
    }

    @Override // X.InterfaceC106514r5
    public final void Cpp() {
        ResourcesManager resourcesManager = ResourcesManager.getInstance();
        if (resourcesManager != null) {
            synchronized (resourcesManager) {
            }
        }
    }
}
