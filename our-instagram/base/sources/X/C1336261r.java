package X;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* renamed from: X.61r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1336261r {
    public GoogleApiAvailabilityLight A00;
    public final SparseIntArray A01;

    public C1336261r(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.A01 = new SparseIntArray();
        C3U5.A02(googleApiAvailabilityLight);
        this.A00 = googleApiAvailabilityLight;
    }

    public final int A00(Context context, InterfaceC1340663q interfaceC1340663q) {
        C3U5.A02(context);
        C3U5.A02(interfaceC1340663q);
        int minApkVersion = interfaceC1340663q.getMinApkVersion();
        SparseIntArray sparseIntArray = this.A01;
        int i = sparseIntArray.get(minApkVersion, -1);
        if (i == -1) {
            int i2 = 0;
            while (true) {
                if (i2 < sparseIntArray.size()) {
                    int keyAt = sparseIntArray.keyAt(i2);
                    if (keyAt > minApkVersion && sparseIntArray.get(keyAt) == 0) {
                        i = 0;
                        break;
                    }
                    i2++;
                } else {
                    i = this.A00.A03(context, minApkVersion);
                    break;
                }
            }
            sparseIntArray.put(minApkVersion, i);
        }
        return i;
    }

    public C1336261r() {
        this(GoogleApiAvailability.A00);
    }
}
