package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CER {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(-628775453);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-566644370, "com.instagram.barcelona.feed.post.ui.PostTagButton (PostTagButton.kt:21)");
            }
            C2DC A00 = C5Y7.A00(c5Tl, R.drawable.barcelona_hashtag_outline_16, 0);
            String A002 = C5YD.A00(c5Tl, 2131953749);
            C5YS.A07(c5Tl, AbstractC118635Yc.A02(c5Tl, AbstractC118185Wd.A0C(modifier2, 20.0f), AbstractC25225BEi.A0W(0), interfaceC16820sZ), A00, C5YJ.A05, A002, DalvikInternals.IOPRIO_BACKGROUND, 0, AbstractC25226BEj.A0M(c5Tl));
            if (C0fH.A02()) {
                C0fH.A00(1640462918);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(modifier2, interfaceC16820sZ, i2, i, 18);
        }
    }
}
