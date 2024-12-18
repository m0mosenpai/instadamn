package X;

import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kka, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46657Kka {
    public static final BrandedContentSettingsRepository A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (BrandedContentSettingsRepository) userSession.A01(BrandedContentSettingsRepository.class, new C50163MDq(userSession, 21));
    }
}
