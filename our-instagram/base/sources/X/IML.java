package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class IML {
    public long A00;
    public long A01;
    public boolean A02;
    public final SparseArray A03;
    public final C38687GzS A04;
    public final List A05;
    public final List A06;

    public /* synthetic */ IML(C38687GzS c38687GzS, List list) {
        SparseArray sparseArray = new SparseArray();
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A04 = c38687GzS;
        this.A06 = list;
        this.A03 = sparseArray;
        this.A05 = A1E;
        this.A02 = false;
        this.A01 = 0L;
        this.A00 = 0L;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SurfaceState(surfaceRegistration=");
        A1C.append(this.A04);
        A1C.append("\n, supportedRules=");
        A1C.append(this.A06);
        A1C.append("\n, visitedItems=");
        A1C.append(this.A03);
        A1C.append("\n, allSurfacesVisitedWhileInBackground=");
        A1C.append(this.A05);
        A1C.append("\n, isInForeground=");
        A1C.append(this.A02);
        A1C.append("\n, totalTimeSpentMillis=");
        A1C.append(this.A01);
        A1C.append("\n, lastForegroundTimeMillis=");
        A1C.append(this.A00);
        A1C.append(')');
        return A1C.toString();
    }
}
