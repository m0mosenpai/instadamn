package X;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5O2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5O2 {
    public static final C5O3 A01 = new Object();
    public final Integer A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.0sl] */
    public final C4PX A01(SidecarDeviceState sidecarDeviceState, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        ?? arrayList;
        W4E w4e;
        W4D w4d;
        if (sidecarWindowLayoutInfo == null) {
            arrayList = C16930sl.A00;
        } else {
            SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
            C5O3 c5o3 = A01;
            C5O3.A01(sidecarDeviceState2, c5o3.A02(sidecarDeviceState));
            List<SidecarDisplayFeature> A00 = C5O3.A00(sidecarWindowLayoutInfo);
            C14360o3.A0B(A00, 0);
            arrayList = new ArrayList();
            for (SidecarDisplayFeature sidecarDisplayFeature : A00) {
                C14360o3.A0B(sidecarDisplayFeature, 0);
                Integer num = this.A00;
                C55593OmW c55593OmW = C55593OmW.A00;
                C14360o3.A0B(num, 2);
                C14360o3.A0B(c55593OmW, 3);
                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) new C51395Mn0(c55593OmW, num, sidecarDisplayFeature).A00("Type must be either TYPE_FOLD or TYPE_HINGE", DK5.A00).A00("Feature bounds must not be 0", DK6.A00).A00("TYPE_FOLD must have 0 area", DK7.A00).A00("Feature be pinned to either left or top", DK8.A00).A01();
                if (sidecarDisplayFeature2 != null) {
                    int type = sidecarDisplayFeature2.getType();
                    if (type != 1) {
                        if (type == 2) {
                            w4e = W4E.A02;
                        }
                    } else {
                        w4e = W4E.A01;
                    }
                    int A02 = c5o3.A02(sidecarDeviceState2);
                    if (A02 != 0 && A02 != 1) {
                        if (A02 != 2) {
                            if (A02 == 3 || A02 != 4) {
                                w4d = W4D.A01;
                            }
                        } else {
                            w4d = W4D.A02;
                        }
                        Rect rect = sidecarDisplayFeature.getRect();
                        C14360o3.A07(rect);
                        arrayList.add(new WTE(new C52872bT(rect), w4d, w4e));
                    }
                }
            }
        }
        return new C4PX(arrayList);
    }

    public C5O2(Integer num) {
        this.A00 = num;
    }

    public static final boolean A00(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (C14360o3.A0K(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null) {
            return false;
        }
        C5O3 c5o3 = A01;
        if (c5o3.A02(sidecarDeviceState) == c5o3.A02(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    public final boolean A02(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (!C14360o3.A0K(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
                return false;
            }
            List A00 = C5O3.A00(sidecarWindowLayoutInfo);
            List A002 = C5O3.A00(sidecarWindowLayoutInfo2);
            if (A00 != A002) {
                if (A00 != null && A002 != null && A00.size() == A002.size()) {
                    int size = A00.size();
                    for (int i = 0; i < size; i++) {
                        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) A00.get(i);
                        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) A002.get(i);
                        if (C14360o3.A0K(sidecarDisplayFeature, sidecarDisplayFeature2) || (sidecarDisplayFeature != null && sidecarDisplayFeature2 != null && sidecarDisplayFeature.getType() == sidecarDisplayFeature2.getType() && C14360o3.A0K(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect()))) {
                        }
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public C5O2() {
        this(C05F.A0C);
    }
}
