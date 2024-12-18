package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.direct.visual.model.DirectVisualMessageItemModel;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LXj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48260LXj implements InterfaceC11380iw, GXW {
    public static final String __redex_internal_original_name = "ExpiringMediaDeeplinkHandler";
    public final InterfaceC165117a0 A00;

    public C48260LXj(InterfaceC165117a0 interfaceC165117a0) {
        C14360o3.A0B(interfaceC165117a0, 1);
        this.A00 = interfaceC165117a0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    @Override // X.GXW
    public final boolean CoA(android.net.Uri uri, C32051E6d c32051E6d) {
        EnumC40111tc enumC40111tc;
        int i;
        String str;
        EnumC40111tc enumC40111tc2;
        ?? A1R = AbstractC167007dF.A1R(0, uri, c32051E6d);
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() >= A1R) {
            String A1I = AbstractC25226BEj.A1I(pathSegments, 0);
            ArrayList arrayList = null;
            if ("story_remix_reply".equalsIgnoreCase(A1I)) {
                String queryParameter = uri.getQueryParameter("content_url");
                String queryParameter2 = uri.getQueryParameter("preview_url");
                String queryParameter3 = uri.getQueryParameter("reshare_mode");
                String queryParameter4 = uri.getQueryParameter("view_original_url");
                String queryParameter5 = uri.getQueryParameter("media_type");
                if (queryParameter != null && queryParameter.length() != 0) {
                    String str2 = c32051E6d.A08;
                    String str3 = c32051E6d.A09;
                    long A0t = AbstractC25232BEp.A0t(c32051E6d.A06);
                    if (queryParameter5 != null) {
                        enumC40111tc2 = AbstractC40091ta.A00(AbstractC003100w.A0i(queryParameter5));
                    } else {
                        enumC40111tc2 = null;
                    }
                    boolean A1a = AbstractC25229BEm.A1a(enumC40111tc2, EnumC40111tc.A0Q);
                    android.net.Uri A0B = AbstractC25227BEk.A0B(queryParameter);
                    if (queryParameter2 == null) {
                        queryParameter2 = "";
                    }
                    DirectVisualMessageItemModel.MediaFields.RemixMedia remixMedia = new DirectVisualMessageItemModel.MediaFields.RemixMedia(A0B, AbstractC25227BEk.A0B(queryParameter2), queryParameter3, queryParameter4);
                    String str4 = c32051E6d.A07;
                    List A1J = AbstractC166987dD.A1J(new DirectVisualMessageItemModel(remixMedia, null, str2, str3, str4, 3, A0t, A1a));
                    InterfaceC165117a0 interfaceC165117a0 = this.A00;
                    MessageIdentifier messageIdentifier = new MessageIdentifier(str2, str4);
                    RectF rectF = c32051E6d.A01;
                    C48737Lh5 c48737Lh5 = new C48737Lh5(c32051E6d);
                    List list = c32051E6d.A0B;
                    if (list != null) {
                        ArrayList A0q = AbstractC167017dG.A0q(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AbstractC167017dG.A1V(A0q, it);
                        }
                        arrayList = AbstractC001800i.A0U(A0q);
                    }
                    interfaceC165117a0.Cqv(rectF, c48737Lh5, messageIdentifier, A1J, arrayList, false, false, A1R);
                    UserSession userSession = c32051E6d.A03;
                    if (userSession != null) {
                        HashMap A1G = AbstractC166987dD.A1G();
                        A1G.put("message_owner_id", str3);
                        AbstractC43821JZj.A00(this, userSession, null, "remix_xma_message", "tap", "remix_xma", null, A1G);
                        return A1R;
                    }
                    return A1R;
                }
            } else if ("add_remix_reply_to_story".equalsIgnoreCase(A1I)) {
                String queryParameter6 = uri.getQueryParameter("content_url");
                String queryParameter7 = uri.getQueryParameter("media_type");
                if (queryParameter6 != null && queryParameter6.length() != 0) {
                    L5I l5i = new L5I();
                    l5i.A00 = c32051E6d.A00;
                    UserSession userSession2 = c32051E6d.A03;
                    l5i.A03 = userSession2;
                    l5i.A05 = null;
                    l5i.A01 = c32051E6d.A02;
                    l5i.A02 = C22P.A2W;
                    l5i.A09 = c32051E6d.A08;
                    l5i.A0B = c32051E6d.A09;
                    l5i.A0A = queryParameter6;
                    l5i.A04 = c32051E6d.A05;
                    if (queryParameter7 == null || (enumC40111tc = AbstractC40091ta.A00(AbstractC003100w.A0i(queryParameter7))) == null) {
                        enumC40111tc = EnumC40111tc.A0a;
                    }
                    l5i.A06 = enumC40111tc;
                    C47936LFk c47936LFk = new C47936LFk(l5i);
                    L5I l5i2 = c47936LFk.A00;
                    Activity activity = l5i2.A00;
                    if (activity != null && l5i2.A03 != null && l5i2.A0A != null) {
                        C14360o3.A0A(activity);
                        UserSession userSession3 = l5i2.A03;
                        C14360o3.A0A(userSession3);
                        String str5 = l5i2.A0A;
                        C14360o3.A0A(str5);
                        AbstractC47007KqQ.A00(userSession3).A01(activity, new C43922JbX(c47936LFk, 18), str5, l5i2.A06.equals(EnumC40111tc.A0a));
                    } else {
                        if (l5i2.A06.equals(EnumC40111tc.A0a)) {
                            i = 2131962086;
                            str = "failed_to_load_video_toast";
                        } else {
                            i = 2131962085;
                            str = "failed_to_load_photo_toast";
                        }
                        C9GR.A01(activity, str, i, 0);
                    }
                    if (userSession2 != null) {
                        AbstractC43821JZj.A01(this, userSession2, "remix_xma_add_to_story", "tap", "remix_xma");
                    }
                    return A1R;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "expiring_media_deeplink_handler";
    }
}
