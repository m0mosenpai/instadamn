package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.Ufj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67058Ufj extends C2JS implements C2JT {
    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return new C4OU(new C4OM[]{new C4OW(c94754Oe, "client_subscription_id"), new C4OW(new C94774Oi(c94754Oe), TraceFieldType.BroadcastId), new C4OW(AbstractC58319PtB.A0S(), "is_active"), new C4OW(new C94774Oi(c94754Oe), "question_id"), new C4OW(new C94774Oi(c94754Oe), "story_question_id"), new C4OW(c94754Oe, "question_prompt"), new C4OW(c94754Oe, "question_body"), new C4OW(new C94774Oi(C67A.A00), "video_timestamp_ms"), new C4OW(new C94774Oi(c94754Oe), CacheBehaviorLogger.SOURCE), new C4OK(C59785Qmz.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 2122535321)});
    }

    public C67058Ufj(int i) {
        super(i);
    }

    public C67058Ufj() {
        super(-1452445418);
    }
}
