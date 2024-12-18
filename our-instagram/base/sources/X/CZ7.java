package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CZ7 {
    public static final void A00(Context context, C5Tl c5Tl, int i, boolean z) {
        int i2;
        C14360o3.A0B(context, 0);
        c5Tl.Enr(32790973);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, context) | i;
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
                C0fH.A01(1134254010, "com.instagram.wonderwall.ui.compose.components.MusicWave (WallMusicAttachment.kt:271)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -751132633);
            Object obj = C5UI.A00;
            boolean z2 = true;
            Object obj2 = A0q;
            if (A0q == obj) {
                C138586Po A00 = AbstractC138576Pn.A00(1.0f, 16, true);
                A00.A0A.setColor(AbstractC167007dF.A09(context, R.attr.igds_color_icon_on_media));
                c5Tl.FBy(A00);
                obj2 = A00;
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Modifier A03 = AbstractC118185Wd.A03(Modifier.A00);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, obj2, -751121277);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == obj) {
                EEc = C30179DRk.A00(c5Tl, obj2, 7);
            }
            InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K, EEc, false);
            boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, obj2, -751118487);
            if ((i2 & 112) != 32) {
                z2 = false;
            }
            boolean z3 = A1Z2 | z2;
            Object EEc2 = c5Tl.EEc();
            if (z3 || EEc2 == obj) {
                EEc2 = new DHP(27, obj2, z);
                c5Tl.FBy(EEc2);
            }
            AbstractC28450Cgz.A02(c5Tl, A03, A1B, AbstractC25225BEi.A1B(A0K, EEc2, false), 48, 0);
            if (C0fH.A02()) {
                C0fH.A00(-1723194113);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30502Dbl.A01(ASZ, context, i, 17, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0321  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r41, com.instagram.music.common.model.AudioOverlayTrack r42, java.util.List r43, int r44, int r45, boolean r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZ7.A01(X.5Tl, com.instagram.music.common.model.AudioOverlayTrack, java.util.List, int, int, boolean, boolean):void");
    }
}
