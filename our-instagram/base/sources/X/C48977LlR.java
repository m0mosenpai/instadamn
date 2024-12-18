package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectAREffectShare;
import java.util.List;
import java.util.Map;

/* renamed from: X.LlR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48977LlR implements InterfaceC162527Pp {
    public final Map A00;

    public C48977LlR(Map map) {
        C14360o3.A0B(map, 1);
        this.A00 = map;
    }

    @Override // X.InterfaceC162527Pp
    public final /* bridge */ /* synthetic */ InterfaceC66482zP AWm(Context context, UserSession userSession, AnonymousClass988 anonymousClass988, C7VC c7vc, C7IM c7im, C18A c18a, boolean z) {
        List list;
        C160787Im c160787Im = (C160787Im) c7vc;
        C14360o3.A0B(context, 0);
        JQ0.A1O(userSession, c18a, c7im, c160787Im, anonymousClass988);
        boolean A00 = C7Q1.A00(userSession, z);
        C83403nh c83403nh = c160787Im.A0e;
        String A0v = AbstractC43594JPz.A0v(c83403nh, A00 ? 1 : 0);
        C14360o3.A0A(A0v);
        Object obj = c83403nh.A1T;
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.model.DirectAREffectShare");
        DirectAREffectShare directAREffectShare = (DirectAREffectShare) obj;
        this.A00.put(directAREffectShare.A02(), directAREffectShare);
        String A01 = directAREffectShare.A01();
        ImageUrl A002 = directAREffectShare.A00();
        String A02 = directAREffectShare.A02();
        String A03 = directAREffectShare.A03();
        C14360o3.A07(A03);
        C37771pE c37771pE = directAREffectShare.A03;
        ImageUrl imageUrl = null;
        if (c37771pE != null && (list = c37771pE.A1k) != null && AbstractC166987dD.A1b(list) && (imageUrl = ((C38321qM) list.get(0)).A1S()) == null) {
            throw AbstractC166997dE.A0g();
        }
        return new K09(new KTC(A002, imageUrl, AbstractC43592JPx.A0d(context, userSession, anonymousClass988, c160787Im, c83403nh), AbstractC43594JPz.A0Y(userSession, anonymousClass988, c160787Im, c7im, c83403nh), A01, A02, A03), C7QZ.A03(context, userSession, anonymousClass988, c160787Im, c7im, c18a), A0v);
    }
}
