package X;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.facebook.R;

/* renamed from: X.78u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1583478u {
    public static final SpannableString A00(String str, String str2) {
        StyleSpan styleSpan;
        int length;
        SpannableString spannableString = null;
        if (str != null) {
            spannableString = new SpannableString(str);
            if (str2 != null && AbstractC001900j.A0Y(spannableString, str2)) {
                styleSpan = new StyleSpan(1);
                length = str2.length();
            } else {
                styleSpan = new StyleSpan(1);
                length = str.length();
            }
            spannableString.setSpan(styleSpan, 0, length, 17);
        }
        return spannableString;
    }

    public static final String A03(String str, String str2) {
        if (str == null) {
            return null;
        }
        android.net.Uri A03 = AbstractC08820cl.A03(str);
        C14360o3.A07(A03);
        String scheme = A03.getScheme();
        if (scheme == null || !scheme.equals("instagram")) {
            return null;
        }
        return A03.getQueryParameter(str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Integer A01(int i) {
        int i2;
        if (i != 16) {
            switch (i) {
                case 0:
                case 3:
                case 4:
                case 9:
                    return null;
                case 1:
                    i2 = R.drawable.filled_grid_album_icon;
                    break;
                case 2:
                    i2 = R.drawable.play_button;
                    break;
                case 5:
                    i2 = R.drawable.instagram_shopping_bag_filled_32;
                    break;
                case 6:
                    i2 = R.drawable.instagram_calendar_filled_32;
                    break;
                case 7:
                    i2 = -2;
                    break;
                case 8:
                    i2 = R.drawable.instagram_reels_pano_filled_24;
                    break;
                default:
                    C0w9.A03("GenericXmaModelMapping_getContentAttributionResId", AnonymousClass001.A0O("Invalid previewImageDecorationType: ", i));
                    return null;
            }
        } else {
            i2 = R.drawable.instagram_trophy_pano_outline_24;
        }
        return Integer.valueOf(i2);
    }

    public static final String A02(InterfaceC83733oI interfaceC83733oI, int i) {
        String str;
        if (interfaceC83733oI != null && AbstractC1345466e.A02(interfaceC83733oI) != null && i == 29 && (str = AbstractC1345466e.A01(interfaceC83733oI).A00) != null) {
            return AnonymousClass001.A0g("instagram://thread/", str, "/show_gated_channel_content_upsell");
        }
        return "";
    }
}
