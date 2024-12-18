package X;

import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.5fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121895fh extends C0YY implements InterfaceC16820sZ {
    public static final C121895fh A00 = new C121895fh();

    public C121895fh() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Display defaultDisplay;
        Display.HdrCapabilities hdrCapabilities;
        int[] supportedHdrTypes;
        boolean z = false;
        try {
            WindowManager windowManager = AbstractC121885fg.A00;
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null && (hdrCapabilities = defaultDisplay.getHdrCapabilities()) != null && (supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes()) != null) {
                z = AbstractC009903n.A0P(supportedHdrTypes, 3);
            }
        } catch (Exception e) {
            C0K8.A0G("ScreenCapabilityUtil", "isHdrSupported", e);
        }
        return Boolean.valueOf(z);
    }
}
