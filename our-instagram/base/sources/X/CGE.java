package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CGE {
    public static final void A00(C5Tl c5Tl, Modifier modifier, C6M c6m, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z, boolean z2) {
        int i3;
        long j;
        C6M c6m2 = c6m;
        boolean z3 = z2;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16660sJ, 0);
        c5Tl.Enr(782300269);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0e(c5Tl, z3);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0V(c5Tl, c6m2);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            z3 = AbstractC25226BEj.A1V(i5, z3);
            if (i6 != 0) {
                c6m2 = C6M.A02;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1463538837, "com.instagram.compose.igds.components.checkbox.IgdsCheckbox (IgdsCheckbox.kt:69)");
            }
            InterfaceC74953Yl A0U = AbstractC25228BEl.A0U(c5Tl, AndroidCompositionLocals_androidKt.A01);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 693878368);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                boolean A05 = C14640oc.A05();
                if (A05) {
                    AbstractC53182c0.A01(true);
                }
                A0q = AbstractC25227BEk.A0j(c5Tl, A05);
            }
            boolean A1a = AbstractC166987dD.A1a(A0q);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C5XO c5xo = (C5XO) AbstractC25234BEr.A0Z(c5Tl, obj, 693887270);
            C117505Tk.A0L(A0K, false);
            Modifier A00 = AnonymousClass598.A00(AbstractC27476CAx.A00(null, c5xo, modifier2, null, interfaceC16660sJ, z, z3), C30040DMa.A00, false);
            if (AbstractC25227BEk.A1U(c5Tl, -2098598692)) {
                C0fH.A01(1423461010, "com.instagram.compose.igds.components.checkbox.rememberBackgroundTint (IgdsCheckbox.kt:143)");
            }
            if (A1a) {
                c5Tl.Eno(-1215359654);
                if (z) {
                    if (z3) {
                        j = AbstractC25227BEk.A0g(c5Tl, -1978865099).A06;
                    } else {
                        j = AbstractC25227BEk.A0g(c5Tl, -1978862883).A05;
                    }
                } else if (z3) {
                    j = AbstractC25227BEk.A0g(c5Tl, -1978860425).A07;
                } else {
                    j = AbstractC25227BEk.A0g(c5Tl, -1978858763).A04;
                }
                C117505Tk.A0L(A0K, false);
            } else {
                c5Tl.Eno(-1215027117);
                if (z) {
                    j = AbstractC25227BEk.A0g(c5Tl, -1214997264).A03;
                } else {
                    c5Tl.Eno(-1214938488);
                    int ordinal = c6m2.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    j = AbstractC25227BEk.A0g(c5Tl, -1978845680).A0W;
                                } else {
                                    throw AbstractC25231BEo.A0v(c5Tl, A0K, -1978853852, false);
                                }
                            } else {
                                j = AbstractC25227BEk.A0g(c5Tl, -1978847760).A0U;
                            }
                        } else {
                            j = AbstractC25227BEk.A0g(c5Tl, -1978849840).A0V;
                        }
                    } else {
                        j = AbstractC25227BEk.A0g(c5Tl, -1978851982).A0s;
                    }
                    C117505Tk.A0L(A0K, false);
                }
                C117505Tk.A0L(A0K, false);
                if (!z3) {
                    j = C5AC.A02(AbstractC1132459m.A0K[(int) (j & 63)], C1132359l.A03(j), C1132359l.A02(j), C1132359l.A01(j), 0.3f);
                }
            }
            InterfaceC74953Yl A002 = C5WZ.A00(c5Tl, AbstractC25225BEi.A0S(j));
            if (AbstractC25227BEk.A1b(A0K, false)) {
                C0fH.A00(-2091167903);
            }
            C117505Tk.A0L(A0K, false);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A0U, 693903215);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == obj) {
                Drawable drawable = ((Context) A0U.getValue()).getDrawable(R.drawable.instagram_check_pano_filled_24);
                if (drawable == null || (EEc = AbstractC27488CBj.A00(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())) == null) {
                    EEc = Bitmap.createBitmap(14, 14, Bitmap.Config.ARGB_8888);
                    C14360o3.A07(EEc);
                }
                c5Tl.FBy(EEc);
            }
            Bitmap bitmap = (Bitmap) EEc;
            C117505Tk.A0L(A0K, false);
            long A09 = AbstractC25226BEj.A09(c5Tl);
            Modifier A0B = AbstractC118185Wd.A0B(AbstractC118185Wd.A02(C118195Wf.A09, A00), 24.0f);
            boolean A1W = AbstractC25226BEj.A1W(c5Tl, A09, AbstractC25228BEl.A1U(c5Tl, bitmap, AbstractC25227BEk.A1Y(c5Tl, A002, 693914311), AbstractC25233BEq.A1I(i3)));
            Object EEc2 = c5Tl.EEc();
            if (A1W || EEc2 == obj) {
                EEc2 = new C29917DHf(bitmap, A002, A09, A1a, z);
                c5Tl.FBy(EEc2);
            }
            AbstractC119665bP.A00(c5Tl, A0B, AbstractC25225BEi.A1B(A0K, EEc2, false), 0);
            if (C0fH.A02()) {
                C0fH.A00(805330944);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV2(c6m2, interfaceC16660sJ, modifier2, i, i2, 0, z, z3);
        }
    }
}
