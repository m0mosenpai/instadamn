package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class CYV {
    public static final void A00(C5Tl c5Tl, String str, String str2, int i, int i2) {
        int i3;
        C118125Vw A00;
        C118125Vw A002;
        c5Tl.Enr(-1626875293);
        if ((i2 & 14) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i2 & 896) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, str2);
        }
        if ((i3 & 731) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-212988280, "com.instagram.creator.inspiration.fragment.audio.TopAudioBottomSheetRow (CreatorInspirationHubTopAudioBottomSheetFragment.kt:117)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0A = AbstractC118175Wb.A0A(c1130158n, 16.0f, 0.0f);
            InterfaceC1127857k A0T = AbstractC25231BEo.A0T(c5Tl, 16.0f);
            int A003 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0A);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0T, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C5YS.A01(c5Tl, null, AbstractC25226BEj.A0Y(c5Tl, i3, i), 56, 20, AbstractC25226BEj.A0F(c5Tl));
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0Y, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            A00 = C118125Vw.A00(null, null, AbstractC25226BEj.A0h(c5Tl), null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, AbstractC118155Vz.A01(18));
            C5WR.A0N(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 8.0f), A00, str, AbstractC25225BEi.A03(i3), AbstractC25226BEj.A0G(c5Tl));
            A002 = C118125Vw.A00(null, null, AbstractC25226BEj.A0c(c5Tl), null, null, null, 0, 0, 0, 16646143, 0L, 0L, 0L, AbstractC118155Vz.A01(18));
            C5WR.A0q(c5Tl, A002, str2, (i3 >> 6) & 14, AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-128973154);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSN(i, str, str2, i2);
        }
    }

    public static final void A01(C5Tl c5Tl, ArrayList arrayList, int i) {
        int i2;
        String A00;
        int i3;
        if (AbstractC25235BEs.A1W(c5Tl, 314412060)) {
            C0fH.A01(1880252137, "com.instagram.creator.inspiration.fragment.audio.TopAudioBottomSheetContent (CreatorInspirationHubTopAudioBottomSheetFragment.kt:66)");
        }
        Modifier A0L = AbstractC25227BEk.A0L(Modifier.A00, 16.0f);
        InterfaceC1127857k A0a = AbstractC25230BEn.A0a(AbstractC118255Wn.A01(16.0f), c5Tl);
        int A002 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, A0L);
        AbstractC25233BEq.A11(c5Tl, c117505Tk);
        AbstractC25231BEo.A12(c5Tl, A0a, A04);
        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
        }
        AbstractC25225BEi.A1K(c5Tl, A01);
        c5Tl.Eno(-593934188);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (C14360o3.A0K(next, "trending")) {
                    c5Tl.Eno(1075441364);
                    i2 = R.drawable.instagram_arrow_up_right_pano_outline_24;
                    A00 = AbstractC136736Hc.A00(c5Tl, 2131957181);
                    i3 = 2131957180;
                } else if (C14360o3.A0K(next, AbstractC111324zv.A00(1173))) {
                    c5Tl.Eno(1075896351);
                    i2 = R.drawable.instagram_users_pano_outline_24;
                    A00 = AbstractC136736Hc.A00(c5Tl, 2131957178);
                    i3 = 2131957177;
                } else if (C14360o3.A0K(next, AbstractC43591JPw.A00(97))) {
                    c5Tl.Eno(1076367768);
                    i2 = R.drawable.instagram_users_pano_outline_24;
                    A00 = AbstractC136736Hc.A00(c5Tl, 2131957183);
                    i3 = 2131957182;
                } else {
                    c5Tl.Eno(1281665039);
                    C117505Tk.A0L(c117505Tk, false);
                }
                A00(c5Tl, A00, AbstractC136736Hc.A00(c5Tl, i3), i2, 0);
                C117505Tk.A0L(c117505Tk, false);
            }
        }
        C117505Tk.A0L(c117505Tk, false);
        A00(c5Tl, AbstractC136736Hc.A00(c5Tl, 2131957176), AbstractC136736Hc.A00(c5Tl, 2131957175), R.drawable.instagram_shield_star_pano_outline_24, 0);
        if (AbstractC25227BEk.A1R(c5Tl)) {
            C0fH.A00(-7550433);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, arrayList, i, 4);
        }
    }
}
