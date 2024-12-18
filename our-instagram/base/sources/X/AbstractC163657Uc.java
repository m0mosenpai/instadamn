package X;

import com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Uc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC163657Uc {
    public static final AvatarPrivacySettingsRepository A00(UserSession userSession) {
        return (AvatarPrivacySettingsRepository) userSession.A01(AvatarPrivacySettingsRepository.class, new C9EI(userSession, 30));
    }
}
