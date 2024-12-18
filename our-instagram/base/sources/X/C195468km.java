package X;

import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8km, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195468km implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "MetaGalleryRecentsCache$Companion";

    public static final void A00(UserSession userSession, List list) {
        C14360o3.A0B(userSession, 0);
        String A0B = new Gson().A0B(list);
        C14360o3.A07(A0B);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        A00.A6X.Egi(A00, A0B, C23031Ai.A8c[475]);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "meta_gallery_recents_cache";
    }
}
