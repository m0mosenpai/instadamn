package X;

import android.content.Context;

/* renamed from: X.Iy7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42893Iy7 implements InterfaceC43411JGb {
    public final /* synthetic */ HCL A00;

    public C42893Iy7(HCL hcl) {
        this.A00 = hcl;
    }

    @Override // X.InterfaceC43411JGb
    public final void Czo(C1338462s c1338462s) {
        HCL hcl = this.A00;
        C6T7 c6t7 = hcl.A03;
        if (c6t7 != null) {
            c6t7.A04();
        }
        Context context = hcl.getContext();
        if (context != null) {
            C62862tP c62862tP = hcl.A02;
            if (c62862tP == null) {
                C14360o3.A0F("igBloksHost");
                throw C00O.createAndThrow();
            }
            C6T7 A0B = AbstractC37301Gc2.A0B(context, c1338462s, c62862tP);
            hcl.A03 = A0B;
            C126545np c126545np = hcl.A01;
            if (c126545np != null) {
                A0B.A07(c126545np);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
