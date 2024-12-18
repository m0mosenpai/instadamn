package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.5I6, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5I6 {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.common.session.UserSession r5, X.C3XG r6, X.InterfaceC60442pS r7, java.lang.String r8) {
        /*
            r0 = 1
            X.C14360o3.A0B(r7, r0)
            r0 = 2
            X.C14360o3.A0B(r8, r0)
            r0 = 3
            X.C14360o3.A0B(r6, r0)
            X.1XV r4 = r6.A06
            X.1XV r3 = X.C1XV.A0r
            r2 = 0
            if (r4 == r3) goto L17
            X.1XV r0 = X.C1XV.A0s
            if (r4 != r0) goto L2a
        L17:
            X.1qS r1 = r6.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.su.model.SuggestedUsers"
            X.C14360o3.A0C(r1, r0)
            X.47K r1 = (X.C47K) r1
            if (r1 == 0) goto L2a
            java.util.List r0 = r1.A04()
            if (r0 == 0) goto L91
            java.lang.String r2 = "preview"
        L2a:
            if (r4 == r3) goto L30
            X.1XV r0 = X.C1XV.A0s
            if (r4 != r0) goto L8f
        L30:
            X.1qS r1 = r6.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.su.model.SuggestedUsers"
            X.C14360o3.A0C(r1, r0)
            X.47K r1 = (X.C47K) r1
            if (r1 == 0) goto L8f
            java.lang.String r1 = r1.A0C
        L3d:
            X.0jB r4 = new X.0jB
            r4.<init>()
            if (r1 == 0) goto L49
            java.lang.String r0 = "insertion_context"
            r4.A0A(r0, r1)
        L49:
            if (r2 == 0) goto L50
            java.lang.String r0 = "format"
            r4.A0A(r0, r2)
        L50:
            r3 = 0
            X.1qS r2 = r6.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.base.NetegoItem"
            X.C14360o3.A0C(r2, r0)
            java.lang.String r0 = "instagram_netego_delivery"
            X.3mZ r1 = new X.3mZ
            r1.<init>(r3, r7, r0)
            r1.A70 = r8
            java.lang.String r0 = r2.getId()
            if (r0 == 0) goto L98
            r1.A6D = r0
            java.lang.String r0 = r2.CAR()
            if (r0 != 0) goto L71
            java.lang.String r0 = ""
        L71:
            r1.A6E = r0
            r1.A0E(r4)
            X.1XV r0 = r2.B5n()
            java.lang.String r0 = r0.toString()
            r1.A6F = r0
            java.lang.String r0 = r6.A09
            r1.A6D = r0
            r1.A5k = r0
            X.C14360o3.A0A(r5)
            java.lang.Integer r0 = X.C05F.A01
            X.C32U.A0I(r5, r1, r7, r0)
            return
        L8f:
            r1 = 0
            goto L3d
        L91:
            java.util.List r0 = r1.A0M
            if (r0 == 0) goto L2a
            java.lang.String r2 = "profile"
            goto L2a
        L98:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5I6.A00(com.instagram.common.session.UserSession, X.3XG, X.2pS, java.lang.String):void");
    }

    public static final void A01(UserSession userSession, InterfaceC73233Pz interfaceC73233Pz, InterfaceC60442pS interfaceC60442pS, String str, int i) {
        C14360o3.A0B(userSession, 2);
        C18920wW A01 = AbstractC12220kQ.A01(interfaceC60442pS, userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "instagram_netego_hide");
        String id = interfaceC73233Pz.getId();
        if (id != null) {
            A00.AAP("netego_id", id);
            A00.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, interfaceC73233Pz.B5n().toString());
            A00.A9K("m_ix", Long.valueOf(i));
            A00.AAP(AbstractC31182DnR.A04(), str);
            A00.AAP("tracking_token", interfaceC73233Pz.CAR());
            String str2 = userSession.userId;
            C14360o3.A0B(str2, 0);
            A00.A9K(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AbstractC003100w.A0k(10, str2));
            A00.AAP("m_pk", null);
            A00.Cht();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
