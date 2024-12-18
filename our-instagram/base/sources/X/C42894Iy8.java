package X;

import android.content.Context;

/* renamed from: X.Iy8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42894Iy8 implements InterfaceC43411JGb {
    public final /* synthetic */ HCE A00;

    public C42894Iy8(HCE hce) {
        this.A00 = hce;
    }

    @Override // X.InterfaceC43411JGb
    public final void Czo(C1338462s c1338462s) {
        String str;
        HCE hce = this.A00;
        C6T7 c6t7 = hce.A06;
        if (c6t7 != null) {
            c6t7.A04();
        }
        Context requireContext = hce.requireContext();
        C62862tP c62862tP = hce.A05;
        if (c62862tP == null) {
            str = "igBloksFragmentHost";
        } else {
            C6T7 A0B = AbstractC37301Gc2.A0B(requireContext, c1338462s, c62862tP);
            hce.A06 = A0B;
            C126545np c126545np = hce.A04;
            if (c126545np == null) {
                str = "rootHostView";
            } else {
                A0B.A07(c126545np);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
