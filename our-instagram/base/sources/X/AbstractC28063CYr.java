package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.CYr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28063CYr {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C51758Mth c51758Mth, C26839Bt1 c26839Bt1, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, c51758Mth, c26839Bt1);
        c5Tl.Enr(9453926);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c51758Mth) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, c26839Bt1);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i3 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1008851129, "com.instagram.potato.profile.PotatoProfileTabGrid (PotatoProfileTabGrid.kt:49)");
            }
            LazyGridState A00 = CZP.A00(c5Tl);
            Modifier A0V = AbstractC25229BEm.A0V(AbstractC25225BEi.A0Q(modifier2), BHJ.A02(c5Tl), null);
            C28748Cmg c28748Cmg = new C28748Cmg(2);
            AbstractC27471CAr.A00(null, AbstractC118255Wn.A01(16.0f), AbstractC118255Wn.A01(20.0f), new C1333560c(16.0f, 16.0f, 16.0f, 16.0f), c28748Cmg, A00, c5Tl, A0V, new C57750Pjd(2, c51758Mth, c26839Bt1), 1772544, ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, false, false);
            BGP.A03(A00, c5Tl, new DGZ(c26839Bt1, 23), 0, 0, A1R ? 1 : 0);
            if (C0fH.A02()) {
                C0fH.A00(-1399188759);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 36, c26839Bt1, c51758Mth, modifier2);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, C26839Bt1 c26839Bt1, C26001Bep c26001Bep, int i, int i2) {
        int i3;
        ImageInfo imageInfo;
        ExtendedImageUrl A03;
        Modifier modifier2 = modifier;
        boolean A1R = AbstractC167007dF.A1R(0, c26001Bep, c26839Bt1);
        c5Tl.Enr(-20468567);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, c26001Bep) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, c26839Bt1);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i3 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1890604310, "com.instagram.potato.profile.GridItem (PotatoProfileTabGrid.kt:87)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1631597932);
            if (A0q == C5UI.A00) {
                C5Hc c5Hc = c26001Bep.A04;
                if (c5Hc != null && (imageInfo = (ImageInfo) AbstractC001800i.A0I(c5Hc)) != null && (A03 = AbstractC40161tk.A03(imageInfo, C05F.A0C)) != null) {
                    A0q = new SimpleImageUrl(A03);
                } else {
                    A0q = null;
                }
                c5Tl.FBy(A0q);
            }
            ImageUrlBase imageUrlBase = (ImageUrlBase) A0q;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            String str = null;
            Modifier A05 = C5XR.A05(modifier2, AbstractC25225BEi.A0W(0), null, new C57255Pbd(37, c26839Bt1, c26001Bep), A1R);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A01 = C5X3.A01(c5Tl, A05);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q2 = AbstractC25229BEm.A0q(c5Tl, A0Y, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C2DB A012 = AbstractC43541zP.A01(c5Tl, imageUrlBase, 6);
            C1130158n c1130158n = Modifier.A00;
            C6LQ.A04(c5Tl, AbstractC27468CAo.A00(AbstractC25226BEj.A0X(AbstractC25228BEl.A0X(c1130158n, 16.0f), C5XL.A00(c5Tl).A0c), 1.0f, false).Eq3(AbstractC118185Wd.A01), A012);
            C60037Qsx c60037Qsx = c26001Bep.A00;
            if (c60037Qsx != null) {
                str = c60037Qsx.getRequiredStringField(2, "text");
            }
            if (str == null) {
                str = "";
            }
            C5WR.A0R(c5Tl, AbstractC118175Wb.A0C(c1130158n, 8.0f, 8.0f, 4.0f), AbstractC25226BEj.A0h(c5Tl), str, AbstractC25226BEj.A0G(c5Tl));
            Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 8.0f, 0.0f, 8.0f, 0.0f);
            InterfaceC1127857k A0T = AbstractC25231BEo.A0T(c5Tl, 4.0f);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(A0K);
            Modifier A013 = C5X3.A01(c5Tl, A0E);
            AbstractC25233BEq.A12(c5Tl, A0K, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0T, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, A0K, A042, A0q2) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A013, A1K);
            C6LQ.A04(c5Tl, AbstractC118185Wd.A0C(AbstractC25226BEj.A0W(c1130158n), 16.0f), AbstractC25235BEs.A0d(c5Tl, c26001Bep.A02));
            String str2 = c26001Bep.A03;
            if (str2 == null) {
                str2 = "";
            }
            AbstractC25233BEq.A13(c5Tl, str2);
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(1052121382);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 35, c26839Bt1, modifier2, c26001Bep);
        }
    }
}
