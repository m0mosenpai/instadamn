package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.78q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1583178q implements InterfaceC1582578k {
    public static final C1583178q A00 = new Object();

    @Override // X.InterfaceC1582578k
    public final C7QY AMI(Context context, UserSession userSession, C7QL c7ql, AnonymousClass988 anonymousClass988, C160787Im c160787Im) {
        float f;
        float f2;
        C1579877i c1579877i;
        String str;
        String str2;
        String str3;
        String str4;
        int length;
        float f3;
        ExtendedImageUrl extendedImageUrl;
        ExtendedImageUrl extendedImageUrl2;
        String username;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c7ql, 2);
        C14360o3.A0B(anonymousClass988, 3);
        C14360o3.A0B(c160787Im, 4);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        Object obj = c83403nh.A1T;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectProductShare");
        Product A01 = AbstractC38048Gob.A01((ProductDetailsProductItemDict) ((C51755Mte) obj).A00);
        User user = c160787Im.A0K;
        DirectMessageIdentifier A0V = c83403nh.A0V();
        User user2 = A01.A0B;
        C1583678w c1583678w = null;
        if (user2 != null && (username = user2.A03.getUsername()) != null && username.length() != 0) {
            c1583678w = new C1583678w(null, null, username, null, null, null, null, null, null, null, AbstractC16960so.A1O(user2.A03.Bhu()));
        }
        ImageInfo imageInfo = A01.A08;
        if (imageInfo != null) {
            ExtendedImageUrl A012 = AbstractC40161tk.A01(context, imageInfo);
            if (A012 != null) {
                List AlQ = imageInfo.AlQ();
                if (AlQ != null && (extendedImageUrl2 = (ExtendedImageUrl) AbstractC001800i.A0O(AlQ, 0)) != null) {
                    f = extendedImageUrl2.getWidth();
                } else {
                    f = 1.0f;
                }
                int i = (int) f;
                Integer valueOf = Integer.valueOf(i);
                List AlQ2 = imageInfo.AlQ();
                if (AlQ2 != null && (extendedImageUrl = (ExtendedImageUrl) AbstractC001800i.A0O(AlQ2, 0)) != null) {
                    f2 = extendedImageUrl.getHeight();
                } else {
                    f2 = 1.0f;
                }
                int i2 = (int) f2;
                Integer valueOf2 = Integer.valueOf(i2);
                float f4 = 1.0f;
                if (valueOf != null && valueOf2 != null) {
                    if (i2 == 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = i / i2;
                    }
                    Float valueOf3 = Float.valueOf(f3);
                    if (valueOf3 != null) {
                        f4 = valueOf3.floatValue();
                    }
                }
                C158737Aj c158737Aj = new C158737Aj(A012, false, Float.valueOf(f4), valueOf, valueOf2, null, null, null, null, null);
                String str5 = A01.A0J;
                if (str5 != null && (length = str5.length()) != 0) {
                    SpannableString spannableString = new SpannableString(str5);
                    StyleSpan styleSpan = new StyleSpan(1);
                    Pattern pattern = AbstractC13670mt.A00;
                    spannableString.setSpan(styleSpan, 0, length, 17);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC1566271k.A08(context, A01, Integer.valueOf(R.style.FullPriceSubtitleStyle), Integer.valueOf(R.style.ProductPriceColor)));
                    String str6 = A01.A0K;
                    if (str6 != null) {
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) AbstractC1566271k.A02(context, userSession, str6, A01.A05()));
                    }
                    c1579877i = new C1579877i(null, null, null, spannableString, null, null, spannableStringBuilder, null, null, 1, 1, null, null, null, null, 1);
                } else {
                    c1579877i = null;
                }
                if (user2 != null) {
                    str = AbstractC76433bn.A00(user2);
                } else {
                    str = null;
                }
                if (user2 != null) {
                    str2 = user2.A03.getUsername();
                } else {
                    str2 = null;
                }
                String A06 = AbstractC13670mt.A06("http://www.instagram.com/_n/product_display_page?business_user_id=%s&merchant_name=%s&product_id=%s&prior_module=direct_thread&entry_point=direct", str, str2, A01.A0H);
                String str7 = c83403nh.A1u;
                C14360o3.A07(str7);
                C9C9 c9c9 = new C9C9(A06, str7, 5);
                if (user != null) {
                    str3 = user.getUsername();
                } else {
                    str3 = null;
                }
                C9C9 c9c92 = new C9C9(context.getString(2131959249, str3), context.getString(2131959224), 3);
                EnumC910243u enumC910243u = EnumC910243u.SINGLE;
                if (user != null) {
                    str4 = user.getUsername();
                } else {
                    str4 = null;
                }
                return new C7QY(null, null, null, c9c9, c9c92, null, null, null, C7QM.A00(context, userSession, anonymousClass988, c160787Im, c83403nh.A10), c7ql, c1579877i, c1583678w, c158737Aj, null, null, null, enumC910243u, null, A0V, null, null, null, null, null, null, null, str4, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false);
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
