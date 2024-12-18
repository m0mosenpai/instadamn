package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Lld, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48989Lld implements InterfaceC162527Pp {
    public final Map A00;
    public final InterfaceC09390do A01;

    public C48989Lld(Map map, InterfaceC09390do interfaceC09390do) {
        C14360o3.A0B(map, 2);
        this.A01 = interfaceC09390do;
        this.A00 = map;
    }

    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C45081JxB c45081JxB;
        ImageUrl imageUrl;
        String str;
        ExtendedImageUrl A01;
        C160787Im A0Y = AbstractC43593JPy.A0Y(c7vc, context);
        JQ0.A1O(userSession, c18a, c7im, A0Y, anonymousClass988);
        boolean A00 = C7Q1.A00(userSession, z);
        C83403nh c83403nh = A0Y.A0e;
        String A0v = AbstractC43594JPz.A0v(c83403nh, A00 ? 1 : 0);
        C14360o3.A0A(A0v);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        InterfaceC09390do interfaceC09390do = this.A01;
        Map map = this.A00;
        AbstractC25229BEm.A1I(interfaceC09390do, 2, map);
        Object obj = c83403nh.A1T;
        C14360o3.A0C(obj, AbstractC111324zv.A00(4981));
        Product A012 = AbstractC38048Gob.A01((ProductDetailsProductItemDict) ((C51755Mte) obj).A00);
        User user = A012.A0B;
        ImageInfo imageInfo = A012.A08;
        String str2 = null;
        if (imageInfo != null && (A01 = AbstractC40161tk.A01(context, imageInfo)) != null) {
            c45081JxB = new C45081JxB(A01, AbstractC40161tk.A00(imageInfo));
        } else {
            c45081JxB = null;
        }
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AbstractC1566271k.A08(context, A012, Integer.valueOf(R.style.FullPriceSubtitleStyle), Integer.valueOf(R.style.ProductPriceColor)));
        String str3 = A012.A0K;
        if (str3 != null) {
            A0H.append((CharSequence) " ");
            A0H.append((CharSequence) AbstractC1566271k.A02(context, userSession, str3, A012.A05()));
        }
        User user2 = A0Y.A0K;
        String str4 = A012.A0H;
        map.put(str4, A012);
        if (user != null) {
            imageUrl = user.Bhu();
            str = user.getUsername();
        } else {
            imageUrl = null;
            str = null;
        }
        C14360o3.A0A(str);
        if (user2 != null) {
            str2 = user2.getUsername();
        }
        String str5 = A012.A0J;
        C14360o3.A0A(str5);
        return new K0V(C7QZ.A03(context, userSession, anonymousClass988, A0Y, c7im, c18a), new KTI(imageUrl, AbstractC43592JPx.A0d(context, userSession, anonymousClass988, A0Y, c83403nh), C7QK.A04(userSession, anonymousClass988, A0Y, c7im, c83403nh.A10, interfaceC09390do), c45081JxB, A0H, str, str2, str4, str5, A012.A04()), A0v);
    }
}
