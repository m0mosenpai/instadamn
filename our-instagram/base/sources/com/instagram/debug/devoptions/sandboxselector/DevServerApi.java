package com.instagram.debug.devoptions.sandboxselector;

import X.AbstractC31177DnL;
import X.C14360o3;
import X.C25621Ms;
import X.C3JY;
import X.InterfaceC19390xP;
import X.InterfaceC25601Mq;
import X.JX4;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public class DevServerApi {
    public static final Companion Companion = new Object();
    public static final String IG_HEALTH_CHECK_ENDPOINT_PATH = "bfad3e85bc/";

    public final InterfaceC19390xP checkServerConnectionHealth(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A03();
        A0M.A0B(IG_HEALTH_CHECK_ENDPOINT_PATH);
        A0M.A0Q(new InterfaceC25601Mq() { // from class: com.instagram.debug.devoptions.sandboxselector.DevServerApi$checkServerConnectionHealth$1
            @Override // X.InterfaceC25601Mq
            public final IgServerHealthCheckResponse then(C3JY c3jy) {
                C14360o3.A0B(c3jy, 0);
                return new IgServerHealthCheckResponse(c3jy.A02);
            }
        });
        return JX4.A00(new DevServerApi$checkServerConnectionHealth$3(null), JX4.A01(new DevServerApi$checkServerConnectionHealth$2(null), A0M.A0N().A03(685)));
    }

    /* loaded from: classes9.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
