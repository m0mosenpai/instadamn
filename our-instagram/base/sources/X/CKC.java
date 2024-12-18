package X;

import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CKC {
    public static final void A00(C5Tl c5Tl, EnumC39642HiX enumC39642HiX, C29138Ct5 c29138Ct5, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, int i2, int i3, boolean z) {
        int i4;
        AbstractC167007dF.A1F(interfaceC16820sZ, 0, interfaceC16820sZ2);
        AbstractC25229BEm.A1I(c29138Ct5, 5, enumC39642HiX);
        c5Tl.Enr(-258736883);
        if ((i3 & 6) == 0) {
            i4 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i3 & 384) == 0) {
            i4 |= AbstractC25236BEt.A03(c5Tl, i2);
        }
        if ((i3 & 3072) == 0) {
            i4 |= AbstractC25232BEp.A0e(c5Tl, z);
        }
        if ((i3 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i4 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16820sZ2);
        }
        if ((196608 & i3) == 0) {
            i4 |= AbstractC25232BEp.A0M(c5Tl, c29138Ct5);
        }
        if ((1572864 & i3) == 0) {
            i4 |= AbstractC25232BEp.A0X(c5Tl, enumC39642HiX);
        }
        if ((599187 & i4) == 599186 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2068928779, "com.instagram.schools.management.graduation.ChangeGraduationComposeView (ChangeGraduationComposeView.kt:36)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -906670042);
            if (A0q == C5UI.A00) {
                A0q = new CPM();
                c5Tl.FBy(A0q);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            if (AbstractC25235BEs.A1Z(c5Tl, new C30285DVm(interfaceC16820sZ2, A0q, enumC39642HiX, interfaceC16820sZ, c29138Ct5, i, i2, 5, z), 491353675)) {
                C0fH.A00(-784409119);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30283DVk(interfaceC16820sZ, interfaceC16820sZ2, c29138Ct5, enumC39642HiX, i, i2, i3, 0, z);
        }
    }
}
