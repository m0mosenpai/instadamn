package X;

import com.facebook.R;

/* renamed from: X.Cgn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28439Cgn {
    public static final void A00(C5Tl c5Tl, String str, int i, boolean z) {
        int i2;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(-746799880);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(727796805, "com.instagram.creation.igbarcelona.upsell.ShareToBarcelonaAutoPostUpsellContent (ShareToBarcelonaUpsellContent.kt:18)");
            }
            A02(str, c5Tl, i2 & 14);
            A04(z, c5Tl, (i2 >> 3) & 14);
            if (C0fH.A02()) {
                C0fH.A00(1846453000);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSX(str, z, i, 0);
        }
    }

    public static final void A01(C5Tl c5Tl, String str, int i, boolean z) {
        int i2;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(1874265587);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2063346359, "com.instagram.creation.igbarcelona.upsell.ShareToBarcelonaToggleUpsellContent (ShareToBarcelonaUpsellContent.kt:12)");
            }
            A03(str, c5Tl, i2 & 14);
            A04(z, c5Tl, (i2 >> 3) & 14);
            if (C0fH.A02()) {
                C0fH.A00(-1362430138);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSX(str, z, i, 1);
        }
    }

    public static final void A02(String str, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(1898157833);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1240450609, "com.instagram.creation.igbarcelona.upsell.AutoPostUpsellDescriptionSection (ShareToBarcelonaUpsellContent.kt:36)");
            }
            AbstractC28474ChS.A05(c5Tl, new C26177Bi2(AbstractC25228BEl.A17(c5Tl, str, 2131973730), 0), R.drawable.instagram_app_threads_pano_outline_24);
            if (C0fH.A02()) {
                C0fH.A00(-1542800598);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30500Dbj.A01(ASZ, str, i, 6);
        }
    }

    public static final void A03(String str, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-1763012626);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-17186747, "com.instagram.creation.igbarcelona.upsell.ToggleUpsellDescriptionSection (ShareToBarcelonaUpsellContent.kt:24)");
            }
            AbstractC28474ChS.A05(c5Tl, new C26177Bi2(AbstractC25228BEl.A17(c5Tl, str, 2131973749), 0), R.drawable.instagram_app_threads_pano_outline_24);
            if (C0fH.A02()) {
                C0fH.A00(-655047465);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30500Dbj.A01(ASZ, str, i, 7);
        }
    }

    public static final void A04(boolean z, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-1687874044);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2135118154, "com.instagram.creation.igbarcelona.upsell.PrivacySection (ShareToBarcelonaUpsellContent.kt:49)");
            }
            int i3 = 2131973752;
            if (z) {
                i3 = 2131973750;
            }
            String A00 = C5YD.A00(c5Tl, i3);
            int i4 = 2131973753;
            if (z) {
                i4 = 2131973751;
            }
            AbstractC28474ChS.A05(c5Tl, C26178Bi3.A00(c5Tl, A00, i4), R.drawable.instagram_globe_pano_outline_24);
            if (C0fH.A02()) {
                C0fH.A00(-719424601);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DS6(z, i, 2);
        }
    }
}
