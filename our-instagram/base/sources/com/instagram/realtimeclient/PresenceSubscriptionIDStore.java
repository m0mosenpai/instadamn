package com.instagram.realtimeclient;

import X.C1AT;
import X.C1AV;
import X.InterfaceC16820sZ;
import X.InterfaceC19630xq;
import com.instagram.common.session.UserSession;

/* loaded from: classes2.dex */
public class PresenceSubscriptionIDStore {
    public static final String PRESENCE_SUBSCRIPTION_ID_KEY = "presence_subscription_id_key";
    public final InterfaceC19630xq mPreferences;
    public final UserSession mUserSession;

    public static PresenceSubscriptionIDStore getInstance(final UserSession userSession) {
        return (PresenceSubscriptionIDStore) userSession.A01(PresenceSubscriptionIDStore.class, new InterfaceC16820sZ() { // from class: com.instagram.realtimeclient.PresenceSubscriptionIDStore$$ExternalSyntheticLambda0
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return PresenceSubscriptionIDStore.lambda$getInstance$0(UserSession.this);
            }
        });
    }

    public PresenceSubscriptionIDStore(InterfaceC19630xq interfaceC19630xq, UserSession userSession) {
        this.mPreferences = interfaceC19630xq;
        this.mUserSession = userSession;
    }

    public static /* synthetic */ PresenceSubscriptionIDStore lambda$getInstance$0(UserSession userSession) {
        return new PresenceSubscriptionIDStore(C1AT.A01(userSession).A03(C1AV.A2W), userSession);
    }
}
