package X;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import com.facebook.rsys.camera.gen.Camera;
import java.util.ArrayList;

/* renamed from: X.AGf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23095AGf {
    public static final C23095AGf A00 = new Object();

    public final ArrayList A00(Context context) {
        Camera camera;
        EnumC177227uI enumC177227uI;
        C14360o3.A0B(context, 0);
        try {
            ArrayList arrayList = new ArrayList(2);
            if (AbstractC115265Ix.A00(context, false)) {
                enumC177227uI = EnumC177227uI.CAMERA2;
            } else {
                enumC177227uI = EnumC177227uI.CAMERA1;
            }
            InterfaceC175067qg interfaceC175067qg = AbstractC175047qe.A00(context, null, enumC177227uI, false).A07;
            if (interfaceC175067qg.CKn(1)) {
                arrayList.add(Camera.FRONT_FACING_CAMERA);
            }
            if (interfaceC175067qg.CKn(0)) {
                arrayList.add(Camera.BACK_FACING_CAMERA);
                return arrayList;
            }
            return arrayList;
        } catch (CameraAccessException e) {
            C0w9.A03("CameraProxyUtil", AbstractC166997dE.A0y("Exception while creating available cameras for camera proxy. Error: ", e));
            try {
                Object systemService = context.getSystemService("camera");
                C14360o3.A0C(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
                CameraManager cameraManager = (CameraManager) systemService;
                String[] cameraIdList = cameraManager.getCameraIdList();
                C14360o3.A07(cameraIdList);
                ArrayList arrayList2 = new ArrayList(cameraIdList.length);
                for (String str : cameraIdList) {
                    Number number = (Number) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                    if (number != null && number.intValue() == 1) {
                        camera = Camera.FRONT_FACING_CAMERA;
                    } else {
                        camera = Camera.BACK_FACING_CAMERA;
                    }
                    arrayList2.add(camera);
                }
                return AbstractC166987dD.A1F(arrayList2);
            } catch (CameraAccessException e2) {
                C0w9.A03("CameraProxyUtil", AbstractC166997dE.A0y("Exception while creating available cameras for camera proxy. Error: ", e2));
                return AbstractC166987dD.A1E();
            }
        }
    }
}
