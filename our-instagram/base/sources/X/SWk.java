package X;

import com.google.android.gms.common.Feature;

/* loaded from: classes10.dex */
public final class SWk {
    public final int A00;
    public final boolean A01;
    public final Feature[] A02;
    public final /* synthetic */ C62947SYp A03;

    public SWk(C62947SYp c62947SYp, Feature[] featureArr, int i, boolean z) {
        this.A03 = c62947SYp;
        this.A02 = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.A01 = z2;
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.SYp] */
    public static C62947SYp A00() {
        ?? obj = new Object();
        obj.A02 = true;
        obj.A00 = 0;
        return obj;
    }
}
