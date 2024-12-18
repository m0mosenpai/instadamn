package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.schools.management.data.SchoolAddress;
import com.instagram.schools.management.data.SchoolInfo;

/* renamed from: X.Cg8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28402Cg8 {
    public static final void A01(C5Tl c5Tl, ImmutableList immutableList, SchoolInfo schoolInfo, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        AbstractC167017dG.A1N(interfaceC16820sZ, interfaceC16820sZ2);
        C14360o3.A0B(immutableList, 3);
        c5Tl.Enr(1584190153);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, schoolInfo);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, immutableList);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1806231565, "com.instagram.schools.management.ui.SchoolOnboardingSwitchSchoolContent (SchoolOnboardingSwitchSchoolContent.kt:31)");
            }
            AbstractC28401Cg7.A03(c5Tl, immutableList, C75.A07, interfaceC16820sZ, interfaceC16820sZ2, null, null, C5UA.A01(c5Tl, new C30519Dc2(schoolInfo, 5), 1965348782), 1597440 | (i2 & 14) | (i2 & 112) | ((i2 << 6) & 458752), 12);
            if (C0fH.A02()) {
                C0fH.A00(1152792653);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30491Dba(schoolInfo, immutableList, interfaceC16820sZ2, interfaceC16820sZ, i, 22);
        }
    }

    public static final void A00(C5Tl c5Tl, int i) {
        c5Tl.Enr(873723329);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1746435281, "com.instagram.schools.management.ui.BulletList (SchoolOnboardingSwitchSchoolContent.kt:80)");
            }
            Modifier A0W = AbstractC25228BEl.A0W();
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0W);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A02, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC28474ChS.A05(c5Tl, C26177Bi2.A00(c5Tl, 2131975059), R.drawable.instagram_cap_pano_outline_24);
            AbstractC28474ChS.A05(c5Tl, C26177Bi2.A00(c5Tl, 2131975058), R.drawable.instagram_edit_pano_outline_24);
            AbstractC28474ChS.A05(c5Tl, C26177Bi2.A00(c5Tl, 2131975057), R.drawable.instagram_circle_x_pano_outline_24);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1235030046);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 16);
        }
    }

    public static final void A02(C5Tl c5Tl, SchoolInfo schoolInfo, int i) {
        int i2;
        c5Tl.Enr(-917996850);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, schoolInfo) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1934135502, "com.instagram.schools.management.ui.SchoolInfoHeader (SchoolOnboardingSwitchSchoolContent.kt:60)");
            }
            SchoolAddress schoolAddress = schoolInfo.A00;
            String A01 = C5YD.A01(c5Tl, new Object[]{schoolAddress.A00, schoolAddress.A01, schoolAddress.A02}, 2131972903);
            AbstractC28504Chx.A02(c5Tl, AbstractC25228BEl.A0W(), new C26181Bi6(R.drawable.instagram_illustrations_product_illustration_pi_plus_schools_add_school, 96.0f), A01, schoolInfo.A02, 48, 4068);
            if (C0fH.A02()) {
                C0fH.A00(-2047824345);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, schoolInfo, i, 44);
        }
    }

    public static final void A03(C5Tl c5Tl, SchoolInfo schoolInfo, int i) {
        int i2;
        c5Tl.Enr(-758036524);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, schoolInfo) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1114807169, "com.instagram.schools.management.ui.SwitchSchoolContent (SchoolOnboardingSwitchSchoolContent.kt:52)");
            }
            Modifier A02 = AbstractC28285CdX.A02(c5Tl, Modifier.A00);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A02);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            A02(c5Tl, schoolInfo, i2 & 14);
            A00(c5Tl, 0);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-334691664);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, schoolInfo, i, 45);
        }
    }
}
