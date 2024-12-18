package X;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class SPA {
    public final AtomicInteger A00;
    public final AtomicInteger A01;
    public final AtomicLong A02;
    public final AtomicLong A03;

    public /* synthetic */ SPA() {
        AtomicInteger A1C = MSW.A1C(0);
        AtomicInteger A1C2 = MSW.A1C(0);
        AtomicLong A15 = AbstractC58318PtA.A15(0L);
        AtomicLong A152 = AbstractC58318PtA.A15(0L);
        this.A01 = A1C;
        this.A00 = A1C2;
        this.A03 = A15;
        this.A02 = A152;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SPA) {
                SPA spa = (SPA) obj;
                Object A00 = AbstractC111324zv.A00(421);
                if (!A00.equals(A00) || !C14360o3.A0K(this.A01, spa.A01) || !C14360o3.A0K(this.A00, spa.A00) || !C14360o3.A0K(this.A03, spa.A03) || !C14360o3.A0K(this.A02, spa.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166997dE.A0J(this.A01, 1002714075))));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FOAMessagingMarkerPointConfig(markerPointName=");
        A1C.append(AbstractC111324zv.A00(421));
        A1C.append(", limit=");
        A1C.append(10);
        A1C.append(", startCounter=");
        A1C.append(this.A01);
        A1C.append(", endCounter=");
        A1C.append(this.A00);
        A1C.append(", startTimestamp=");
        A1C.append(this.A03);
        A1C.append(", endTimestamp=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
