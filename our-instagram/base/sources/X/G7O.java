package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G7O implements GZ7 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ RectF A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    @Override // X.GZ7
    public final void Dpv(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        AbstractC35183Ffa.A02(this.A00, this.A01, new RectF(0.0f, 0.0f, 0.0f, 0.0f), this.A02, null, c38321qM, this.A04, null, 0, true);
    }

    public G7O(Activity activity, RectF rectF, UserSession userSession, String str, String str2) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = rectF;
        this.A04 = str;
        this.A03 = str2;
    }

    @Override // X.GZ7
    public final void onFail(String str) {
        C9GR.A0B(this.A00, "shareFeedPostToStoryWithMediaId_something_went_wrong");
        C0f5 AEp = C18950wb.A01.AEp("Failed to fetch media from mediaId: $errorMessage", 817891009);
        AEp.ABW("Media Id", this.A03);
        AEp.report();
    }
}
