package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.compose.core.ui.IgClickableTextKt;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;

/* renamed from: X.CgA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28404CgA {
    public static final void A01(C5Tl c5Tl, WallPostInfo wallPostInfo, int i) {
        int i2;
        C2DC A00;
        long A07;
        C14360o3.A0B(wallPostInfo, 0);
        c5Tl.Enr(-75485025);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, wallPostInfo) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1895074455, "com.instagram.wonderwall.ui.compose.components.WallPostHeaderEndContent (WallPost.kt:100)");
            }
            switch (wallPostInfo.A05.ordinal()) {
                case 0:
                case 1:
                case 6:
                    BIR.A02(c5Tl, null, BIX.A01(c5Tl), 64, 1, AbstractC25227BEk.A0g(c5Tl, -638119025).A0J);
                    break;
                case 2:
                case 4:
                    c5Tl.Eno(-637915076);
                    A00 = C5Y7.A00(c5Tl, R.drawable.instagram_error_pano_filled_24, 0);
                    A07 = AbstractC25226BEj.A07(c5Tl);
                    C5YS.A04(c5Tl, AbstractC118185Wd.A0C(Modifier.A00, 14.0f), A00, A07);
                    break;
                case 3:
                default:
                    c5Tl.Eno(-637390277);
                    if (wallPostInfo.A09) {
                        c5Tl.Eno(-637362253);
                        C5YS.A07(c5Tl, AbstractC118185Wd.A0C(Modifier.A00, 12.0f), C5Y7.A00(c5Tl, R.drawable.instagram_pin_pano_filled_24, 0), null, AbstractC136736Hc.A00(c5Tl, 2131969670), 384, 24, 0L);
                    } else {
                        c5Tl.Eno(-637147330);
                        A02(c5Tl, wallPostInfo, i2 & 14);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    break;
                case 5:
                    c5Tl.Eno(-637638432);
                    A00 = C5Y7.A00(c5Tl, R.drawable.instagram_circle_check_pano_filled_24, 0);
                    A07 = C5XL.A00(c5Tl).A10;
                    C5YS.A04(c5Tl, AbstractC118185Wd.A0C(Modifier.A00, 14.0f), A00, A07);
                    break;
            }
            if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                C0fH.A00(-1617937071);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, wallPostInfo, i, 7);
        }
    }

    public static final void A02(C5Tl c5Tl, WallPostInfo wallPostInfo, int i) {
        int i2;
        C118125Vw A01;
        C14360o3.A0B(wallPostInfo, 0);
        c5Tl.Enr(2099097626);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, wallPostInfo) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-610800076, "com.instagram.wonderwall.ui.compose.components.WallPostTimeStamp (WallPost.kt:164)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            long j = wallPostInfo.A02;
            C14360o3.A0B(A0K, 0);
            String A04 = C23831Eq.A04(A0K, j);
            long A0M = AbstractC25226BEj.A0M(c5Tl);
            A01 = C118125Vw.A01(null, AbstractC25225BEi.A0Y(c5Tl), null, null, null, 0, 0, 15728637, 0L, AbstractC118155Vz.A01(12), 0L);
            C5WR.A0u(c5Tl, A01, A04, A0M);
            if (C0fH.A02()) {
                C0fH.A00(-794273667);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30498Dbh.A01(ASZ, wallPostInfo, i, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r7 == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C5Tl r29, androidx.compose.ui.Modifier r30, com.instagram.wonderwall.model.WallPostItem r31, X.InterfaceC31065Dl7 r32, java.lang.String r33, int r34, int r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28404CgA.A00(X.5Tl, androidx.compose.ui.Modifier, com.instagram.wonderwall.model.WallPostItem, X.Dl7, java.lang.String, int, int, boolean, boolean, boolean):void");
    }

    public static final void A03(C5Tl c5Tl, WallPostItem wallPostItem, InterfaceC31065Dl7 interfaceC31065Dl7, float f, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        InterfaceC31065Dl7 interfaceC31065Dl72 = interfaceC31065Dl7;
        C14360o3.A0B(wallPostItem, 0);
        c5Tl.Enr(-59399459);
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
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, interfaceC31065Dl72);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0e(c5Tl, z2);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                interfaceC31065Dl72 = null;
            }
            z2 = AbstractC25226BEj.A1V(i5, z2);
            if (C0fH.A02()) {
                C0fH.A01(1766557319, "com.instagram.wonderwall.ui.compose.components.WallPostText (WallPost.kt:144)");
            }
            String str = wallPostItem.Bez().A07;
            long j = C5XL.A00(c5Tl).A0b;
            boolean A1W = AbstractC25226BEj.A1W(c5Tl, j, AbstractC25227BEk.A1Y(c5Tl, str, 565922138));
            Object EEc = c5Tl.EEc();
            if (A1W || EEc == C5UI.A00) {
                EEc = CZ9.A01(str, j);
                c5Tl.FBy(EEc);
            }
            C5C8 c5c8 = (C5C8) EEc;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            if (str.length() > 0) {
                C118125Vw A00 = AbstractC28470ChM.A00(c5Tl, c5c8, wallPostItem.BB6());
                boolean A1P = AbstractC167007dF.A1P(i3 & 896, 256) | AbstractC25228BEl.A1V(c5Tl, c5c8, AbstractC25233BEq.A1O(c5Tl, 565930325, i3), AbstractC167007dF.A1P(i3 & 7168, C3OO.FLAG_MOVED));
                Object EEc2 = c5Tl.EEc();
                if (A1P || EEc2 == C5UI.A00) {
                    EEc2 = new MIF(21, c5c8, interfaceC31065Dl72, wallPostItem, z2);
                    c5Tl.FBy(EEc2);
                }
                IgClickableTextKt.A05(c5Tl, null, c5c8, A00, AbstractC25225BEi.A1B(A0K, EEc2, false), 112638, 0L);
                AbstractC25226BEj.A1O(c5Tl, Modifier.A00, f);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1923027515);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTP(wallPostItem, interfaceC31065Dl72, f, i, i2, z2);
        }
    }
}
