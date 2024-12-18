package X;

import android.graphics.RectF;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.net.URLDecoder;
import java.util.List;

/* renamed from: X.G2f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36353G2f implements GXW {
    public final InterfaceC165047Zt A00;
    public final InterfaceC165057Zu A01;

    @Override // X.GXW
    public final boolean CoA(android.net.Uri uri, C32051E6d c32051E6d) {
        String str;
        boolean equals;
        boolean A1R = AbstractC167007dF.A1R(0, uri, c32051E6d);
        List<String> pathSegments = uri.getPathSegments();
        String queryParameter = uri.getQueryParameter("reel_id");
        String queryParameter2 = uri.getQueryParameter("item_type");
        if (pathSegments.size() >= 3 && "stories".equalsIgnoreCase(AbstractC25226BEj.A1I(pathSegments, 0)) && queryParameter != null) {
            String A1I = AbstractC25226BEj.A1I(pathSegments, A1R ? 1 : 0);
            String A1I2 = AbstractC25226BEj.A1I(pathSegments, 2);
            String queryParameter3 = uri.getQueryParameter(AbstractC43591JPw.A00(1273));
            if (queryParameter3 == null) {
                queryParameter3 = queryParameter;
            }
            C1N9 c1n9 = new C1N9(new User(queryParameter3, A1I));
            String A0T = AnonymousClass001.A0T(A1I2, queryParameter3, '_');
            String queryParameter4 = uri.getQueryParameter(AbstractC111324zv.A00(2711));
            String str2 = null;
            if (queryParameter4 != null) {
                str = URLDecoder.decode(queryParameter4, ReactWebViewManager.HTML_ENCODING);
            } else {
                str = null;
            }
            if (uri.getBooleanQueryParameter("add_to_story", false)) {
                if (AbstractC31174DnI.A1a(C2EY.A1x, queryParameter2)) {
                    InterfaceC165047Zt interfaceC165047Zt = this.A00;
                    C14360o3.A0A(A1I2);
                    interfaceC165047Zt.Cr0(A1I2);
                    return A1R;
                }
                boolean booleanQueryParameter = uri.getBooleanQueryParameter(MSV.A00(106), false);
                String queryParameter5 = uri.getQueryParameter("music");
                InterfaceC165047Zt interfaceC165047Zt2 = this.A00;
                boolean A1Z = AbstractC25229BEm.A1Z(queryParameter5);
                if (queryParameter5 == null) {
                    equals = false;
                } else {
                    equals = queryParameter5.equals("original");
                }
                interfaceC165047Zt2.Crn(c32051E6d.A05, c1n9, A0T, queryParameter, str, booleanQueryParameter, A1Z, equals);
                return A1R;
            }
            RectF rectF = c32051E6d.A01;
            if (rectF != null) {
                String queryParameter6 = uri.getQueryParameter("reaction");
                InterfaceC165057Zu interfaceC165057Zu = this.A01;
                C47777L8c c47777L8c = c32051E6d.A05;
                ImageUrl imageUrl = c32051E6d.A04;
                if (imageUrl != null) {
                    str2 = imageUrl.getUrl();
                }
                interfaceC165057Zu.Crp(rectF, c47777L8c, new MessageIdentifier(c32051E6d.A08, c32051E6d.A07), c1n9, A0T, queryParameter, queryParameter6, str2, c32051E6d.A09);
                return A1R;
            }
        }
        return false;
    }

    public C36353G2f(InterfaceC165047Zt interfaceC165047Zt, InterfaceC165057Zu interfaceC165057Zu) {
        AbstractC167017dG.A1P(interfaceC165057Zu, interfaceC165047Zt);
        this.A01 = interfaceC165057Zu;
        this.A00 = interfaceC165047Zt;
    }
}
