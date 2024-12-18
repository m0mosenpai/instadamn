package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HyV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40549HyV {
    public static final C1ON A00(UserSession userSession, String str, String str2, String str3, String str4, String str5, boolean z) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("clips/get_blend_medias/");
        A0c.A9s("blend_id", str);
        A0c.A0I(AbstractC111324zv.A00(2399), z);
        A0c.A0H("target_media_ids", str2);
        AbstractC37301Gc2.A1N(A0c, AbstractC111324zv.A00(2960), str3, str4);
        A0c.A0H("seen_reels", str5);
        return AbstractC25227BEk.A0e(A0c, C38954HDg.class, C41298IPn.class);
    }
}
