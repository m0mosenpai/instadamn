package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.74N, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C74N {
    public static final Drawable A00(Context context, UserSession userSession, C148286ly c148286ly, boolean z, boolean z2) {
        int A01;
        String str;
        C148286ly c148286ly2;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        ImageUrl imageUrl = c148286ly.A0H;
        if (z2) {
            String url = imageUrl.getUrl();
            C14360o3.A07(url);
            return A03(context, url, c148286ly.A0c);
        }
        C14360o3.A07(imageUrl);
        String url2 = AbstractC59522nv.A00(imageUrl).getUrl();
        C14360o3.A07(url2);
        C148286ly c148286ly3 = c148286ly.A0I;
        int A012 = C1H4.A01(c148286ly.A00 * c148286ly.A01);
        if (c148286ly3 == null) {
            A01 = -1;
        } else {
            A01 = C1H4.A01(c148286ly3.A01 * c148286ly3.A00);
        }
        int A013 = AbstractC188878Yd.A01(context) * AbstractC188878Yd.A00(context);
        boolean z3 = true;
        if (A012 + 1 > A01 || A01 > A013) {
            z3 = false;
        }
        ImageUrl imageUrl2 = null;
        if (z3 && (c148286ly2 = c148286ly.A0I) != null) {
            imageUrl2 = c148286ly2.A0H;
        }
        String str2 = c148286ly.A0S;
        C14360o3.A07(str2);
        Integer valueOf = Integer.valueOf(c148286ly.A09);
        String str3 = c148286ly.A0Z;
        String str4 = c148286ly.A0c;
        if (imageUrl2 == null || (str = imageUrl2.getUrl()) == null) {
            str = url2;
        }
        return new C74O(context, userSession, C74U.A01(context, c148286ly.A01(), c148286ly.A01 / c148286ly.A00, context.getResources().getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large)), null, valueOf, url2, str2, str3, str4, str, context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin), context.getColor(R.color.cds_white_a20), context.getColor(R.color.fds_white_alpha60), z, true, false);
    }

    public static final Drawable A02(Context context, UserSession userSession, String str, int i, int i2, boolean z) {
        return A01(context, userSession, null, str, null, null, null, i, i2, false, true, z, true, false);
    }

    public static final Drawable A01(Context context, UserSession userSession, C74M c74m, String str, String str2, String str3, String str4, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str5 = str3;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        if (z3) {
            return A03(context, str, str2);
        }
        int i3 = R.color.fds_transparent;
        int i4 = R.color.fds_transparent;
        if (z4) {
            i3 = R.color.cds_white_a20;
            i4 = R.color.fds_white_alpha60;
        }
        String url = AbstractC59522nv.A00(new SimpleImageUrl(str)).getUrl();
        C14360o3.A07(url);
        if (str3 == null) {
            str5 = str;
        }
        return new C74O(context, userSession, C74U.A00(1.0f, i2, i, -1), c74m, null, url, str5, str4, str2, url, context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin), context.getColor(i3), context.getColor(i4), z, z2, z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Drawable A03(Context context, String str, String str2) {
        C1VG.A00();
        InterfaceC59172nI A00 = C6BY.A00(AbstractC08820cl.A03(str), AbstractC16850sd.A0M(new C09530e4("image_format", "animation")));
        C27651Vs A01 = C59232nO.A01();
        Resources resources = context.getResources();
        C14360o3.A07(resources);
        C2nP A02 = A01.A02(resources, C27771Wf.A0b, A00, false);
        InterfaceC59242nQ interfaceC59242nQ = (InterfaceC59242nQ) C59232nO.A00().AM5();
        C2nP BGo = interfaceC59242nQ.BGo();
        if (BGo != null && !BGo.equals(A02)) {
            C59232nO.A00().EEL(interfaceC59242nQ);
        }
        interfaceC59242nQ.EcP(new D25(interfaceC59242nQ, A02, str2));
        Runnable Bm6 = interfaceC59242nQ.Bm6();
        if (Bm6 != null) {
            Bm6.run();
        }
        interfaceC59242nQ.EhD(new WV4(interfaceC59242nQ));
        return (Drawable) interfaceC59242nQ;
    }
}
