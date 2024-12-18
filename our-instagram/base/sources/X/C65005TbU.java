package X;

import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: X.TbU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65005TbU extends C0YY implements InterfaceC16820sZ {
    public static final C65005TbU A00 = new C65005TbU();

    public C65005TbU() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        DisplayManager displayManager;
        Display display;
        Object systemService = AbstractC12290kX.A00.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            displayManager = (DisplayManager) systemService;
        } else {
            displayManager = null;
        }
        boolean z = false;
        if (displayManager != null && (display = displayManager.getDisplay(0)) != null) {
            int[] supportedHdrTypes = display.getHdrCapabilities().getSupportedHdrTypes();
            C14360o3.A07(supportedHdrTypes);
            int length = supportedHdrTypes.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (supportedHdrTypes[i] == 1) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }
}
