package X;

import android.app.Activity;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.reels.smb.model.ProfileStickerAiAgentData;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class LT9 implements InterfaceC48192Ji {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C22P A01;
    public final /* synthetic */ IGAIAgentType A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C6WQ A04;
    public final /* synthetic */ User A05;
    public final /* synthetic */ String A06;

    public LT9(Activity activity, C22P c22p, IGAIAgentType iGAIAgentType, UserSession userSession, C6WQ c6wq, User user, String str) {
        this.A06 = str;
        this.A02 = iGAIAgentType;
        this.A03 = userSession;
        this.A00 = activity;
        this.A01 = c22p;
        this.A05 = user;
        this.A04 = c6wq;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        R11 r11;
        R10 A0E;
        R1W r1w;
        String str;
        String str2;
        String str3;
        String str4;
        if (anonymousClass436 != null && (r11 = (R11) anonymousClass436.Bos()) != null && (A0E = r11.A0E()) != null && (r1w = (R1W) A0E.reinterpretRequired(2, R1W.class, -612162544)) != null) {
            QpP A0E2 = r1w.A0E();
            if (A0E2 != null) {
                str = A0E2.A07(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            } else {
                str = null;
            }
            QpS A0G = r1w.A0G();
            if (A0G != null) {
                str2 = A0G.A09(DevServerEntity.COLUMN_DESCRIPTION);
            } else {
                str2 = null;
            }
            QpS A0G2 = r1w.A0G();
            if (A0G2 != null) {
                str3 = A0G2.A0C("tagline");
            } else {
                str3 = null;
            }
            QpQ A0F = r1w.A0F();
            if (A0F != null) {
                str4 = A0F.A08(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
            } else {
                str4 = null;
            }
            QpS A0G3 = r1w.A0G();
            String optionalStringField = A0G3 != null ? A0G3.getOptionalStringField(6, "welcome_message") : null;
            if (str != null && str2 != null && str3 != null && str4 != null) {
                A2E.A00(this.A00, this.A01, this.A03, new ProfileStickerAiAgentData(this.A02, this.A06, str3, str, str4, optionalStringField), this.A05, C05F.A0C);
                return;
            }
        }
        C6WQ c6wq = this.A04;
        Activity activity = this.A00;
        c6wq.dismiss();
        C9GR.A0C(activity, "unknown_error_occured");
    }
}
