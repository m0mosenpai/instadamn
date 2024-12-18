package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

/* loaded from: classes4.dex */
public final class AS7 implements View.OnClickListener {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ ClipsTimelineEditorDrawerController A01;
    public final /* synthetic */ C38321qM A02;

    public AS7(IgSimpleImageView igSimpleImageView, ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController, C38321qM c38321qM) {
        this.A02 = c38321qM;
        this.A01 = clipsTimelineEditorDrawerController;
        this.A00 = igSimpleImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EnumC77213d7 enumC77213d7;
        int A05 = C0f9.A05(-582977926);
        C38321qM c38321qM = this.A02;
        if (c38321qM != null && c38321qM.CcN()) {
            enumC77213d7 = EnumC77213d7.A03;
        } else {
            enumC77213d7 = EnumC77213d7.A04;
        }
        ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController = this.A01;
        C8PF c8pf = clipsTimelineEditorDrawerController.A0m;
        IgSimpleImageView igSimpleImageView = this.A00;
        FragmentActivity fragmentActivity = clipsTimelineEditorDrawerController.A0Y;
        Context A0L = AbstractC166997dE.A0L(igSimpleImageView);
        UserSession userSession = clipsTimelineEditorDrawerController.A0a;
        C24H c24h = clipsTimelineEditorDrawerController.A0Z;
        if (c24h == null) {
            c24h = C24H.UNKNOWN;
        }
        c8pf.A00(fragmentActivity, A0L, c24h, userSession, igSimpleImageView, c38321qM, clipsTimelineEditorDrawerController, null, enumC77213d7);
        C0f9.A0C(1493381479, A05);
    }
}
