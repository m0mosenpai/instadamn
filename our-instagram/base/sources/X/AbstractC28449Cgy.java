package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.Cgy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28449Cgy {
    public static final void A00(C6GN c6gn, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-1148384501);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c6gn) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1782461444, "instagram.features.clips.translations.audio.compose.fragment.AudioTranslationsImage (ComposeAudioTranslationsOptionsFragment.kt:135)");
            }
            C6LQ.A03(c5Tl, c6gn.AB6(C118195Wf.A00, AbstractC118175Wb.A0A(Modifier.A00, 0.0f, C5XT.A00(c5Tl))), AbstractC25227BEk.A0P(c5Tl, R.drawable.instagram_reels_translation_dubbinghero));
            if (C0fH.A02()) {
                C0fH.A00(772083756);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, c6gn, i, 23);
        }
    }

    public static final void A01(C6GN c6gn, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(343777399);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, c6gn) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1559364023, "instagram.features.clips.translations.audio.compose.fragment.AudioTranslationsOptionsContent (ComposeAudioTranslationsOptionsFragment.kt:129)");
            }
            A00(c6gn, c5Tl, i2 & 14);
            A02(c5Tl, 0);
            if (C0fH.A02()) {
                C0fH.A00(-98223756);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, c6gn, i, 25);
        }
    }

    public static final void A02(C5Tl c5Tl, int i) {
        c5Tl.Enr(-549855862);
        if (i == 0 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1913784677, "instagram.features.clips.translations.audio.compose.fragment.AudioTranslationsOptInToggle (ComposeAudioTranslationsOptionsFragment.kt:147)");
            }
            String A00 = C5YD.A00(c5Tl, 2131955324);
            Modifier A0W = AbstractC25228BEl.A0W();
            AbstractC25705BXp.A0E(c5Tl, AbstractC118175Wb.A0E(A0W, 0.0f, 0.0f, 0.0f, C5XT.A01(c5Tl)), new C29199Cu4(C30168DQy.A00, false, false), A00);
            String A002 = C5YD.A00(c5Tl, 2131955325);
            C5WR.A0R(c5Tl, AbstractC118175Wb.A0A(A0W, C5XT.A00(c5Tl), 0.0f), AbstractC25226BEj.A0c(c5Tl), A002, AbstractC25226BEj.A0M(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(-1013779391);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30493Dbc.A01(ASZ, i, 32);
        }
    }

    public static final void A03(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        c5Tl.Enr(-794367537);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(738051136, "instagram.features.clips.translations.audio.compose.fragment.AudioTranslationsOptionsScreen (ComposeAudioTranslationsOptionsFragment.kt:107)");
            }
            int i5 = i3 & 14;
            InterfaceC1127857k A0D = AbstractC25233BEq.A0D(c5Tl, i5);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0D, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C6GM c6gm = C6GM.A00;
            A04(interfaceC16820sZ, c5Tl, (i3 >> 3) & 14);
            A01(c6gm, c5Tl, (((i5 >> 6) & 112) | 6) & 14);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-290445452);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(modifier, interfaceC16820sZ, i2, i, 44);
        }
    }

    public static final void A04(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(-1376408291);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(528167771, "instagram.features.clips.translations.audio.compose.fragment.AudioTranslationsOptionsActionBar (ComposeAudioTranslationsOptionsFragment.kt:115)");
            }
            AbstractC25708BXt.A02(c5Tl, AbstractC25232BEp.A0y(c5Tl, Modifier.A00), new C25707BXs(null, 7, 0), C5YD.A00(c5Tl, 2131955326), AbstractC133095zb.A04(new C26183Bi8(C5YD.A00(c5Tl, 2131961124), C05F.A00, interfaceC16820sZ)), 6, 24);
            if (C0fH.A02()) {
                C0fH.A00(1737603608);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, interfaceC16820sZ, i, 24);
        }
    }
}
