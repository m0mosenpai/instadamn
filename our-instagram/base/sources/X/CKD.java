package X;

import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CKD {
    public static final void A00(C5Tl c5Tl, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, int i, boolean z) {
        int i2;
        boolean A1b = AbstractC25233BEq.A1b(interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3);
        C14360o3.A0B(str, 4);
        c5Tl.Enr(1773186248);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ3);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0V(c5Tl, str);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(768149378, "com.instagram.schools.management.ui.SchoolManagementBottomSheetComposeView (SchoolManagementBottomSheetComposeView.kt:25)");
            }
            if (AbstractC25235BEs.A1Y(c5Tl, AbstractC25228BEl.A0W(), new C30213DSs(str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, z), 288623238)) {
                C0fH.A00(1011933309);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUS(interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ, str, i, A1b ? 1 : 0, z);
        }
    }
}
