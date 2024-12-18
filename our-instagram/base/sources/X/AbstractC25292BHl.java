package X;

import android.graphics.LinearGradient;
import java.util.List;

/* renamed from: X.BHl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25292BHl {
    public static final int[] A02(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = C5AC.A00(((C1132359l) list.get(i)).A00);
        }
        return iArr;
    }

    public static final LinearGradient A00(List list, List list2, int i, long j, long j2) {
        float[] fArr;
        A01(list, list2);
        float A01 = C119365at.A01(j);
        float A02 = C119365at.A02(j);
        float A012 = C119365at.A01(j2);
        float A022 = C119365at.A02(j2);
        int[] A023 = A02(list);
        if (list2 != null) {
            fArr = AbstractC001800i.A0w(list2);
        } else {
            fArr = null;
        }
        return new LinearGradient(A01, A02, A012, A022, A023, fArr, AbstractC25293BHm.A00(i));
    }

    public static final void A01(List list, List list2) {
        int size = list.size();
        if (list2 == null) {
            if (size < 2) {
                throw AbstractC166987dD.A12("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (size != list2.size()) {
            throw AbstractC166987dD.A12("colors and colorStops arguments must have equal length.");
        }
    }
}
