package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.7Kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161247Kj {
    public final C18920wW A00;
    public final java.util.Set A01;
    public final InterfaceC16820sZ A02;

    public static final String A00(AnonymousClass541 anonymousClass541) {
        AbstractC46719Klc abstractC46719Klc = AbstractC46719Klc.$redex_init_class;
        int ordinal = anonymousClass541.ordinal();
        if (ordinal != 6) {
            if (ordinal != 7) {
                if (ordinal != 8) {
                    if (ordinal != 9) {
                        return "unknown_avatar_power_up";
                    }
                    return "cry_avatar_power_up";
                }
                return "laugh_avatar_power_up";
            }
            return "angry_avatar_power_up";
        }
        return "love_avatar_power_up";
    }

    public /* synthetic */ C161247Kj(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C18920wW A02 = AbstractC12220kQ.A02(userSession);
        this.A02 = interfaceC16820sZ;
        this.A00 = A02;
        this.A01 = new LinkedHashSet();
    }
}
