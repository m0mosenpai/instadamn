package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.commentreply.model.ReelsVisualRepliesModel;
import java.io.File;

/* loaded from: classes6.dex */
public final class EZA extends C2AH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ RectF A02;
    public final /* synthetic */ RectF A03;
    public final /* synthetic */ C22P A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ ReelsVisualRepliesModel A06;
    public final /* synthetic */ C38321qM A07;
    public final /* synthetic */ C6WQ A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    public EZA(Activity activity, RectF rectF, RectF rectF2, C22P c22p, UserSession userSession, ReelsVisualRepliesModel reelsVisualRepliesModel, C38321qM c38321qM, C6WQ c6wq, String str, String str2, int i, boolean z) {
        this.A08 = c6wq;
        this.A01 = activity;
        this.A05 = userSession;
        this.A07 = c38321qM;
        this.A00 = i;
        this.A0B = z;
        this.A02 = rectF;
        this.A03 = rectF2;
        this.A04 = c22p;
        this.A0A = str;
        this.A06 = reelsVisualRepliesModel;
        this.A09 = str2;
    }

    @Override // X.C2AH
    public final void onFail(Exception exc) {
        C9GR.A0B(this.A01, "shareVideoFeedPostToStory_something_went_wrong");
    }

    @Override // X.C2AH, X.C11R
    public final void onFinish() {
        if (!this.A01.isDestroyed()) {
            this.A08.dismiss();
        }
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        C0fJ.A00(this.A08);
    }

    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        File A0Z = AbstractC166997dE.A0Z(obj);
        UserSession userSession = this.A05;
        Activity activity = this.A01;
        C38321qM c38321qM = this.A07;
        int i = this.A00;
        boolean z = this.A0B;
        AbstractC35183Ffa.A00(activity, this.A02, this.A03, this.A04, userSession, this.A06, null, c38321qM, A0Z, this.A0A, this.A09, i, z);
    }
}
