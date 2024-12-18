package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CKk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27717CKk {
    public static final void A00(C5Tl c5Tl, Modifier modifier, float f, int i, int i2, long j, boolean z) {
        int i3;
        float f2;
        Modifier A0D;
        boolean z2 = z;
        C14360o3.A0B(modifier, 0);
        c5Tl.Enr(-1968128800);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0E(c5Tl, j);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A05(c5Tl, f);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0e(c5Tl, z2);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            z2 = AbstractC25226BEj.A1V(i4, z2);
            if (C0fH.A02()) {
                C0fH.A01(1988926806, "com.meta.compose.component.divider.BasicDivider (BasicDivider.kt:32)");
            }
            c5Tl.Eno(261349344);
            if (C119145aW.A01(f, 0.0f)) {
                f2 = 1.0f / AbstractC25228BEl.A0h(c5Tl).Awk();
            } else {
                f2 = f;
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            if (z2) {
                A0D = AbstractC118185Wd.A08(AbstractC25226BEj.A0T(c1130158n), f2);
            } else {
                A0D = AbstractC118185Wd.A0D(c1130158n.Eq3(AbstractC118185Wd.A00), f2);
            }
            AbstractC25229BEm.A16(c5Tl, modifier.Eq3(A0D), j);
            if (C0fH.A02()) {
                C0fH.A00(1492407075);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTR(modifier, f, i, i2, j, z2);
        }
    }
}
