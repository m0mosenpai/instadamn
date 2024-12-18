package X;

import com.facebook.messenger.mcp.integration.MCPPluginsRegistryIntegration;

/* renamed from: X.614, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass614 implements Runnable {
    public static final AnonymousClass614 A00 = new AnonymousClass614();

    @Override // java.lang.Runnable
    public final void run() {
        MCPPluginsRegistryIntegration.nativePreregisterMCPPluginsRegistry();
    }
}
