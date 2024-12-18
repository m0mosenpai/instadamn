package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Cd8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28263Cd8 {
    public final C55020OWu A00;
    public final List A01;
    public final List A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C28263Cd8() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28263Cd8) {
                C28263Cd8 c28263Cd8 = (C28263Cd8) obj;
                if (!C14360o3.A0K(this.A01, c28263Cd8.A01) || !C14360o3.A0K(this.A02, c28263Cd8.A02) || !C14360o3.A0K(this.A00, c28263Cd8.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C28263Cd8(C55020OWu c55020OWu, List list, List list2, DefaultConstructorMarker defaultConstructorMarker, int i) {
        C16930sl c16930sl = C16930sl.A00;
        C5HZ c5hz = C5HZ.A01;
        C55020OWu c55020OWu2 = new C55020OWu(c5hz, c5hz, false);
        C14360o3.A0B(c16930sl, 1);
        this.A01 = c16930sl;
        this.A02 = c16930sl;
        this.A00 = c55020OWu2;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A01)));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("MEmuOnboardingData(memuPoseDataList=");
        A1C.append(this.A01);
        A1C.append(", userUploadedImages=");
        A1C.append(this.A02);
        A1C.append(", profileResponse=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
