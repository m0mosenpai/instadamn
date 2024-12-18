package X;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.WallGifPostItem;
import com.instagram.wonderwall.model.WallMediaPostItem;
import com.instagram.wonderwall.model.WallMusicPostItem;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallRepostItem;
import com.instagram.wonderwall.model.WallTextPostItem;

/* renamed from: X.Cg9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28403Cg9 {
    public static final void A00(InterfaceC119655bO interfaceC119655bO, C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        AbstractC167007dF.A1K(interfaceC119655bO, interfaceC16820sZ);
        c5Tl.Enr(990706841);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, interfaceC119655bO) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-207116811, "com.instagram.wonderwall.ui.compose.components.RemoveAttachmentButton (WallAttachment.kt:153)");
            }
            AbstractC28470ChM.A03(c5Tl, interfaceC119655bO.AB5(C118195Wf.A0D, AbstractC118175Wb.A01(Modifier.A00)), C5Y7.A00(c5Tl, R.drawable.instagram_x_pano_outline_24, 0), AbstractC136736Hc.A00(c5Tl, 2131972171), interfaceC16820sZ, (i2 << 6) & 7168, 0);
            if (C0fH.A02()) {
                C0fH.A00(-698335580);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, interfaceC119655bO, interfaceC16820sZ, i, 27);
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [X.0oO, java.lang.Object] */
    public static final void A01(C5Tl c5Tl, InterfaceC74953Yl interfaceC74953Yl, WallPostItem wallPostItem, int i) {
        int i2;
        WallMediaPostItem wallMediaPostItem;
        Medium medium;
        boolean A1R = AbstractC167007dF.A1R(0, wallPostItem, interfaceC74953Yl);
        c5Tl.Enr(114111858);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, wallPostItem) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, interfaceC74953Yl);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1027029974, "com.instagram.wonderwall.ui.compose.components.DraftVideoThumbnailEffect (WallAttachment.kt:176)");
            }
            if ((wallPostItem instanceof WallMediaPostItem) && (wallMediaPostItem = (WallMediaPostItem) wallPostItem) != null && (medium = wallMediaPostItem.A00) != null && medium.Cff() == A1R) {
                Context A0P = AbstractC25230BEn.A0P(c5Tl);
                UserSession A0e = AbstractC25229BEm.A0e(c5Tl);
                ?? obj = new Object();
                obj.A00 = A1R;
                String str = wallMediaPostItem.A02.A06;
                boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, str, 1471135655);
                Object EEc = c5Tl.EEc();
                if (A1Y || EEc == C5UI.A00) {
                    EEc = new C56051OuQ(2, interfaceC74953Yl, obj);
                    c5Tl.FBy(EEc);
                }
                C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                boolean A1Y2 = AbstractC25227BEk.A1Y(c5Tl, str, 1471152206);
                Object EEc2 = c5Tl.EEc();
                if (A1Y2 || EEc2 == C5UI.A00) {
                    EEc2 = new C8SF(A0P, A0e, C05F.A00, medium.A0B, medium.A04, false);
                    c5Tl.FBy(EEc2);
                }
                C117505Tk.A0L(A0K, false);
                boolean A1X = AbstractC25225BEi.A1X(c5Tl, EEc, AbstractC25233BEq.A1W(c5Tl, EEc2, medium, 1471158260));
                Object EEc3 = c5Tl.EEc();
                if (A1X || EEc3 == C5UI.A00) {
                    EEc3 = new PZN(EEc2, medium, EEc, null, 24);
                    c5Tl.FBy(EEc3);
                }
                AbstractC25228BEl.A1K(c5Tl, A0K, EEc3, str, false);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1836060223);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, wallPostItem, interfaceC74953Yl, i, 26);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C5Tl r24, X.C25868BcP r25, int r26) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28403Cg9.A03(X.5Tl, X.BcP, int):void");
    }

    public static final void A02(C5Tl c5Tl, WallPostItem wallPostItem, InterfaceC16660sJ interfaceC16660sJ, float f, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        boolean z3 = z2;
        boolean z4 = z;
        C14360o3.A0B(wallPostItem, 0);
        c5Tl.Enr(1910908436);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, wallPostItem) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A04(c5Tl, f);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z4);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0e(c5Tl, z3);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= DalvikInternals.IOPRIO_BACKGROUND;
        } else if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            z4 = AbstractC25226BEj.A1U(i5, z4);
            z3 = AbstractC25226BEj.A1U(i6, z3);
            C0eB c0eB = null;
            if (i7 != 0) {
                interfaceC16660sJ = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1163698470, "com.instagram.wonderwall.ui.compose.components.WallPostAttachmentPreview (WallAttachment.kt:58)");
            }
            boolean z5 = !(wallPostItem instanceof WallTextPostItem);
            WallPostInfo Bez = wallPostItem.Bez();
            boolean A01 = Bez.A01();
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, Bez.A06, -791855496);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = AbstractC25232BEp.A0w(c5Tl, null);
            }
            InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(A0K);
            Modifier A012 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, A0K);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (A0K.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A012);
            C119645bN c119645bN = C119645bN.A00;
            boolean z6 = wallPostItem instanceof WallMediaPostItem;
            if (z6) {
                c5Tl.Eno(1710666868);
                if (!A01) {
                    C38321qM c38321qM = ((WallMediaPostItem) wallPostItem).A01;
                    if (c38321qM.Cff() && z4) {
                        c5Tl.Eno(1710730232);
                        AbstractC28333CeL.A00(c5Tl, null, AbstractC25228BEl.A0X(AbstractC27468CAo.A00(AbstractC25226BEj.A0T(c1130158n), c38321qM.A0m(), false), 12.0f), c38321qM, null, 0, 384, 248, true, false, false);
                        C117505Tk.A0L(A0K, false);
                    }
                }
                c5Tl.Eno(1711068318);
                Bitmap bitmap = (Bitmap) interfaceC74953Yl.getValue();
                c5Tl.Eno(-83350663);
                if (bitmap != null) {
                    CZ6.A00(bitmap, c5Tl, ((WallMediaPostItem) wallPostItem).A01.A0m(), 0);
                    c0eB = C0eB.A00;
                }
                C117505Tk.A0L(A0K, false);
                if (c0eB == null) {
                    C38321qM c38321qM2 = ((WallMediaPostItem) wallPostItem).A01;
                    CZ6.A01(c5Tl, c38321qM2.A1S(), c38321qM2.A0m(), 0);
                }
                C117505Tk.A0L(A0K, false);
            } else if (wallPostItem instanceof WallMusicPostItem) {
                c5Tl.Eno(-83342590);
                WallMusicPostItem wallMusicPostItem = (WallMusicPostItem) wallPostItem;
                CZ7.A01(c5Tl, wallMusicPostItem.A00, wallMusicPostItem.A02, ((i3 >> 3) & 896) | 3072, 0, z3, true);
            } else if (wallPostItem instanceof WallGifPostItem) {
                c5Tl.Eno(-83338318);
                WallGifPostItem wallGifPostItem = (WallGifPostItem) wallPostItem;
                CKW.A00(c5Tl, wallGifPostItem.A00, wallGifPostItem.A02, 0);
            } else if (wallPostItem instanceof WallRepostItem) {
                c5Tl.Eno(-83335565);
                CKZ.A00(c5Tl, ((WallRepostItem) wallPostItem).A01, interfaceC16660sJ, (i3 >> 9) & 112, 0);
            } else {
                c5Tl.Eno(-83333252);
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.Eno(-83332450);
            if (z5) {
                if (z6) {
                    boolean Cff = ((WallMediaPostItem) wallPostItem).A01.Cff();
                    i4 = R.drawable.instagram_photo_pano_outline_24;
                    if (Cff) {
                        i4 = R.drawable.instagram_reels_pano_outline_24;
                    }
                } else if (wallPostItem instanceof WallMusicPostItem) {
                    i4 = R.drawable.instagram_music_pano_outline_24;
                } else {
                    boolean z7 = wallPostItem instanceof WallGifPostItem;
                    i4 = R.drawable.instagram_text_post_pano_outline_24;
                    if (z7) {
                        i4 = R.drawable.instagram_gif_pano_outline_24;
                    }
                }
                C5YS.A09(c5Tl, AbstractC28010CWi.A01(c119645bN.AB5(C118195Wf.A0D, AbstractC118185Wd.A03(c1130158n)), C30139DPv.A00), C5Y7.A00(c5Tl, i4, 0), AbstractC136736Hc.A00(c5Tl, 2131966152), AbstractC25226BEj.A0D(c5Tl));
            }
            C117505Tk.A0L(A0K, false);
            c5Tl.ASW();
            c5Tl.Eno(-791808324);
            if (z5) {
                AbstractC25226BEj.A1O(c5Tl, c1130158n, f);
            }
            C117505Tk.A0L(A0K, false);
            A01(c5Tl, interfaceC74953Yl, wallPostItem, i3 & 14);
            if (C0fH.A02()) {
                C0fH.A00(838230591);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV0(wallPostItem, interfaceC16660sJ, f, i, i2, 0, z3, z4);
        }
    }
}
