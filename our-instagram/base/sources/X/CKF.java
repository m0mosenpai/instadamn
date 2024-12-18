package X;

/* loaded from: classes5.dex */
public abstract class CKF {
    public static final void A00(C5Tl c5Tl, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        AbstractC167027dH.A12(interfaceC16820sZ, interfaceC16820sZ2, str);
        c5Tl.Enr(-308267474);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1259722957, "com.instagram.schools.management.ui.SchoolRemovalBottomSheetComposeView (SchoolRemovalBottomSheetComposeView.kt:25)");
            }
            if (AbstractC25235BEs.A1Z(c5Tl, new DSZ(interfaceC16820sZ2, interfaceC16820sZ, str, 6), -977310228)) {
                C0fH.A00(2020378158);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT4(interfaceC16820sZ, interfaceC16820sZ2, str, i, 16);
        }
    }
}
