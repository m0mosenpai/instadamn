package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.user.model.User;

/* renamed from: X.LlM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48972LlM implements InterfaceC162527Pp {
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        ImageUrl imageUrl;
        C160787Im c160787Im = (C160787Im) c7vc;
        C14360o3.A0B(context, 0);
        JQ0.A1O(userSession, c18a, c7im, c160787Im, anonymousClass988);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        Object obj = c83403nh.A1T;
        User user = c160787Im.A0K;
        Class<?> cls = null;
        String str = null;
        if (obj instanceof C910143t) {
            imageUrl = (ImageUrl) AbstractC43691JUa.A00(((C910143t) obj).A0X, AbstractC25225BEi.A0t(""), "previewUrl");
        } else {
            if (!(obj instanceof C148276lx)) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("message.content required to be StaticSticker but is");
                if (obj != null) {
                    cls = obj.getClass();
                }
                throw AbstractC43594JPz.A0n(cls, A1C);
            }
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.model.StaticSticker");
            imageUrl = ((C148286ly) ((C148276lx) obj).A0O.get(0)).A0H;
            C14360o3.A07(imageUrl);
        }
        DirectMessageIdentifier A0V = c83403nh.A0V();
        if (user != null) {
            str = user.getUsername();
        }
        C7SY c7sy = new C7SY(imageUrl, AbstractC43592JPx.A0d(context, userSession, anonymousClass988, c160787Im, c83403nh), A0V, str, false);
        String A0k = JQ0.A0k(userSession, c83403nh, z);
        C14360o3.A0A(A0k);
        return new K0W(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), c7sy, A0k);
    }
}
