package X;

/* renamed from: X.A1a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22730A1a {
    public static final C42321xM A00(C130725vK c130725vK) {
        String str = c130725vK.A04;
        if (str != null) {
            long j = c130725vK.A01;
            boolean z = c130725vK.A08;
            return new C42321xM(str, c130725vK.A02, c130725vK.A03, j, c130725vK.A00, z, c130725vK.A09);
        }
        throw AbstractC166987dD.A14("userId must always provided in the realtime payload!");
    }
}
