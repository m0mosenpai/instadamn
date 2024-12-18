package X;

import android.hardware.camera2.CameraManager;

/* renamed from: X.TbQ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C65001TbQ extends C0YY implements InterfaceC16820sZ {
    public static final C65001TbQ A00 = new C65001TbQ();

    public C65001TbQ() {
        super(0);
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        CameraManager cameraManager;
        String[] cameraIdList;
        Object systemService = AbstractC12290kX.A00.getSystemService("camera");
        if (systemService instanceof CameraManager) {
            cameraManager = (CameraManager) systemService;
        } else {
            cameraManager = null;
        }
        boolean z = false;
        if (cameraManager != null && (cameraIdList = cameraManager.getCameraIdList()) != null) {
            int length = cameraIdList.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str = cameraIdList[i];
                C14360o3.A0A(str);
                if (C63394SjK.A08(cameraManager, str)) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        return Boolean.valueOf(z);
    }
}
