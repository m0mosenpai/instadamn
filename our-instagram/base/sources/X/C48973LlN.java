package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;

/* renamed from: X.LlN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48973LlN implements InterfaceC162527Pp {
    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        C160787Im c160787Im = (C160787Im) c7vc;
        C14360o3.A0B(context, 0);
        JQ0.A1O(userSession, c18a, c7im, c160787Im, anonymousClass988);
        C83403nh c83403nh = c160787Im.A0e;
        C14360o3.A07(c83403nh);
        Object obj = c83403nh.A1T;
        if (!(obj instanceof DirectStoreSticker)) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("message.content required to be DirectStoreSticker but is ");
            throw AbstractC43594JPz.A0n(AbstractC43593JPy.A0o(obj), A1C);
        }
        String A0k = JQ0.A0k(userSession, c83403nh, z);
        C14360o3.A0A(A0k);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        Object obj2 = c83403nh.A1T;
        C14360o3.A0C(obj2, "null cannot be cast to non-null type com.instagram.model.direct.stickerstore.DirectStoreSticker");
        DirectStoreSticker directStoreSticker = (DirectStoreSticker) obj2;
        C14360o3.A0B(directStoreSticker, 3);
        return new K0O(C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), new KT9(AbstractC43592JPx.A0d(context, userSession, anonymousClass988, c160787Im, c83403nh), directStoreSticker.A00, directStoreSticker.A02, false), A0k);
    }
}
