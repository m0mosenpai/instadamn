package X;

import android.os.Handler;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.request.graphql.IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl;

/* renamed from: X.F4y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34148F4y {
    /* JADX WARN: Type inference failed for: r21v1, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v1, types: [X.0oO, java.lang.Object] */
    public static final void A00(UserSession userSession, C34435FFz c34435FFz, String str, String str2) {
        AbstractC167017dG.A1P(str, c34435FFz);
        Handler A0J = AbstractC167007dF.A0J();
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("user_prompt", str);
        A0b.A04(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "IGDirectMessagingSearchMetaAISnippetQueryQuery", A0b.getParamsCopy(), A0b2.getParamsCopy(), IGDirectMessagingSearchMetaAISnippetQueryQueryResponseImpl.class, false, null, 0, null, "xfb_messaging_search_genai_snippet", AbstractC166987dD.A1E());
        A01.ATW(C35812Fro.A00, new C35832Fs8(A0J, userSession, c34435FFz, str, new Object(), new Object()), pandoGraphQLRequest, new ExecutorC14110nb(428207724));
    }
}
