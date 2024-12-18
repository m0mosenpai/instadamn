package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SjK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63394SjK {
    public static final C63394SjK A00 = new Object();
    public static final List A01 = AbstractC16960so.A1Q("c2.dolby.decoder.hevc", "c2.qti.dv.decoder");
    public static final InterfaceC09390do A06 = AbstractC09440dt.A01(C65003TbS.A00);
    public static final InterfaceC09390do A07 = AbstractC09440dt.A01(C65004TbT.A00);
    public static final InterfaceC09390do A08 = AbstractC09440dt.A01(C65005TbU.A00);
    public static final InterfaceC09390do A04 = AbstractC09440dt.A01(C65002TbR.A00);
    public static final InterfaceC09390do A02 = AbstractC09440dt.A01(C65000TbP.A00);
    public static final InterfaceC09390do A05 = AbstractC09440dt.A01(X4N.A00);
    public static final InterfaceC09390do A03 = AbstractC09440dt.A01(C65001TbQ.A00);

    public static final String A00() {
        return AbstractC25225BEi.A15(A05);
    }

    public static final List A01() {
        return (List) A02.getValue();
    }

    public static final List A02() {
        return (List) A04.getValue();
    }

    public static final boolean A04() {
        return AbstractC167007dF.A1Z(A03);
    }

    public static final boolean A05() {
        return AbstractC167007dF.A1Z(A06);
    }

    public static final boolean A06() {
        return AbstractC167007dF.A1Z(A07);
    }

    public static final boolean A07() {
        return AbstractC167007dF.A1Z(A08);
    }

    public static final /* synthetic */ boolean A08(CameraManager cameraManager, String str) {
        java.util.Set<Long> set;
        int[] iArr = (int[]) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 18) {
                    List A1Q = AbstractC16960so.A1Q(64L, 128L, 16L, 32L);
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                    C14360o3.A07(cameraCharacteristics);
                    DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES);
                    if (dynamicRangeProfiles == null || (set = dynamicRangeProfiles.getSupportedProfiles()) == null) {
                        set = C16910sj.A00;
                    }
                    if ((A1Q instanceof Collection) && A1Q.isEmpty()) {
                        return false;
                    }
                    Iterator it = A1Q.iterator();
                    while (it.hasNext()) {
                        if (set.contains(Long.valueOf(MSY.A07(it)))) {
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }
}
