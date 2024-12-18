package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionHandler;
import com.instagram.realtimeclient.RealtimeEventHandler;
import com.instagram.realtimeclient.RealtimeEventHandlerProvider;
import java.io.IOException;

/* renamed from: X.1zD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43431zD implements RealtimeEventHandlerProvider {
    public static final C43431zD A00 = new C43431zD();

    @Override // com.instagram.realtimeclient.RealtimeEventHandlerProvider
    public final RealtimeEventHandler get(final UserSession userSession) {
        C14360o3.A0A(userSession);
        return new GraphQLSubscriptionHandler(userSession) { // from class: X.4M9
            public final UserSession A00;

            {
                C14360o3.A0B(userSession, 1);
                this.A00 = userSession;
            }

            @Override // com.instagram.realtimeclient.RealtimeEventHandler
            public final boolean canHandleRealtimeEvent(String str, String str2) {
                return false;
            }

            @Override // com.instagram.realtimeclient.GraphQLSubscriptionHandler
            public final void onRealtimeEventPayload(String str, String str2, String str3) {
                String str4;
                C14360o3.A0B(str3, 2);
                try {
                    C41094IHl parseFromJson = AbstractC40537HyJ.parseFromJson(C16V.A00(str3));
                    if (parseFromJson != null) {
                        boolean equals = "success".equals(parseFromJson.A03);
                        String str5 = parseFromJson.A02;
                        int i = 0;
                        if (str5 != null) {
                            try {
                                i = Integer.parseInt(str5);
                            } catch (NumberFormatException unused) {
                            }
                        }
                        if (!equals && (str4 = parseFromJson.A01) != null) {
                            try {
                                Integer.parseInt(str4);
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        UserSession userSession2 = this.A00;
                        AbstractC25651Mw.A00(userSession2).E4s(new C155006xp(userSession2.userId, i, equals));
                    }
                } catch (IOException e) {
                    Object[] objArr = {str2, str3};
                    if (C0K8.A01.isLoggable(5)) {
                        C0K8.A0H(C4M9.class.getSimpleName(), StringFormatUtil.formatStrLocaleSafe("onRealtimeEventPayload exception", objArr), e);
                    }
                }
            }
        };
    }
}
