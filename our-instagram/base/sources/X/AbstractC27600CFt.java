package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CFt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27600CFt {
    public static final void A00(C5Tl c5Tl, ImageUrl imageUrl, int i) {
        int i2;
        C14360o3.A0B(imageUrl, 0);
        c5Tl.Enr(975829025);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-316057145, "com.instagram.comments.mvvm.view.compose.RowCommentLikedByAuthorBadge (RowCommentLikedByCreatorBadge.kt:20)");
            }
            C5YS.A08(c5Tl, AbstractC118185Wd.A0C(AbstractC118175Wb.A08(Modifier.A00, 4.0f), 12.0f), C5Y7.A00(c5Tl, R.drawable.instagram_heart_pano_filled_24, 0), C5YD.A00(c5Tl, 2131965113), 392, C5XL.A00(c5Tl).A0T);
            BGD.A04(c5Tl, AbstractC25226BEj.A0w(c5Tl, imageUrl, i2), new BI2(12.0f, 12.0f, 2.0f, 1.0f), 56, 2044);
            if (C0fH.A02()) {
                C0fH.A00(-13215668);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, imageUrl, i, 26);
        }
    }
}
