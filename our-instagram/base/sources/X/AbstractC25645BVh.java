package X;

/* renamed from: X.BVh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25645BVh {
    public static final void A00(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        C14360o3.A0B(interfaceC16620sF, 1);
        c5Tl.Enr(-1398424219);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                z2 = false;
            }
            if (C0fH.A02()) {
                C0fH.A01(1095151543, "com.instagram.barcelona.bds.theme.BdsTheme (BdsTheme.kt:23)");
            }
            AbstractC117995Vj.A00(c5Tl, C5UA.A01(c5Tl, new DS9(3, interfaceC16620sF, z2), -1375927148), 6);
            if (C0fH.A02()) {
                C0fH.A00(279900827);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30215DSu(interfaceC16620sF, i, i2, 1, z2);
        }
    }
}
