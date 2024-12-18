package com.instagram.debug.devoptions.avatars;

import X.AbstractC25227BEk;
import X.AbstractC31177DnL;
import X.C25621Ms;
import X.C47826LAm;
import X.InterfaceC23621Ds;
import X.K7s;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class ImmersiveAvatarConfigRepository {
    public static final Companion Companion = new Object();
    public static final String IMMERSIVE_AVATAR_HOME_CONFIG_ENDPOINT = "creatives/immersive_avatar_home_config/";

    public final Object createImmersiveAvatarHomeConfigRequest(UserSession userSession, InterfaceC23621Ds interfaceC23621Ds) {
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B(IMMERSIVE_AVATAR_HOME_CONFIG_ENDPOINT);
        return AbstractC25227BEk.A0e(A0M, K7s.class, C47826LAm.class).A00(1925716449, interfaceC23621Ds);
    }

    /* loaded from: classes8.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
