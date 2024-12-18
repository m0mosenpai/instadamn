package X;

import android.content.Context;
import com.instagram.debug.devoptions.apiperf.DebugHeadPlugin;

/* renamed from: X.NGt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52398NGt extends AbstractC18280vF {
    public final /* synthetic */ C218614m A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52398NGt(C218614m c218614m) {
        super("initDebugHead", 1664189633, 5, false, false);
        this.A00 = c218614m;
    }

    @Override // X.AbstractC18280vF
    public final void loggedRun() {
        Context context = this.A00.A00;
        C50352Td.A00(context.getResources(), context.getFilesDir());
        if (C1RQ.A03 != null) {
            C1RQ A00 = C1RQ.A00();
            EnumC27091Ti enumC27091Ti = EnumC27091Ti.A0M;
            if (!A00.A06(enumC27091Ti) && !C1RQ.A00().A07(enumC27091Ti)) {
                C0K8.A0D("DebugHeadInitializer", "DebugHeadPlugin is enabled but downloadable-module isn't loaded");
                return;
            }
        }
        try {
            Object newInstance = Class.forName("com.instagram.debug.devoptions.debughead.DebugHeadPluginImpl").newInstance();
            C14360o3.A0C(newInstance, "null cannot be cast to non-null type com.instagram.debug.devoptions.apiperf.DebugHeadPlugin");
            DebugHeadPlugin debugHeadPlugin = (DebugHeadPlugin) newInstance;
            DebugHeadPlugin.sInstance = debugHeadPlugin;
            debugHeadPlugin.onCreate(context);
            Object A002 = AbstractC54852fj.A00();
            C14360o3.A0C(A002, "null cannot be cast to non-null type android.content.Context");
            DebugHeadPlugin.maybeAttachToWindow((Context) A002);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            C0K8.A0F("DebugHeadInitializer", "Failed to initialize DebugHeapPluginImpl", e);
        }
    }
}
