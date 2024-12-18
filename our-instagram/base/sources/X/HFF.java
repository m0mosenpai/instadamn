package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* loaded from: classes7.dex */
public final class HFF extends AbstractC65632xz {
    public final GenericSurveyFragment A00;
    public final boolean A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final C41131IIw A05;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        IMQ imq = (IMQ) obj2;
        AbstractC167007dF.A1D(anonymousClass306, 0, imq);
        if (imq.A03 == C05F.A0C && !imq.A06 && !this.A01) {
            anonymousClass306.A7a(0);
        }
        anonymousClass306.A7a(1);
    }

    public HFF(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, GenericSurveyFragment genericSurveyFragment, C41131IIw c41131IIw) {
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A00 = genericSurveyFragment;
        this.A05 = c41131IIw;
        this.A02 = fragmentActivity;
        this.A01 = C18U.A06(C06090Tz.A05, userSession, 36320777485689745L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0112, code lost:
    
        if (java.lang.Integer.valueOf(r5) == null) goto L29;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r30, android.view.View r31, java.lang.Object r32, java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HFF.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [X.HjF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, X.IwX] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View view;
        Object obj;
        View view2;
        int A03 = C0f9.A03(1513748853);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i == 1) {
                boolean z = this.A01;
                LayoutInflater A0P = AbstractC25228BEl.A0P(viewGroup);
                if (z) {
                    View A0C = AbstractC31173DnH.A0C(A0P, viewGroup, R.layout.reel_preview_content_with_autoplay_view, false);
                    C14360o3.A0B(A0C, 1);
                    ?? obj2 = new Object();
                    obj2.A00 = A0C;
                    obj2.A08 = (MediaFrameLayout) AbstractC166997dE.A0R(A0C, R.id.preview_video);
                    obj2.A07 = (IgProgressImageView) AbstractC166997dE.A0R(obj2.A00, R.id.preview_image);
                    obj2.A06 = AbstractC31176DnK.A0U(obj2.A00, R.id.reel_preview_profile_picture);
                    obj2.A04 = AbstractC167007dF.A0N(obj2.A00, R.id.reel_preview_username);
                    obj2.A03 = AbstractC167007dF.A0N(obj2.A00, R.id.reel_preview_subtitle);
                    obj2.A02 = (FrameLayout) AbstractC166997dE.A0R(obj2.A00, R.id.reel_preview_container);
                    obj2.A01 = (FrameLayout) AbstractC166997dE.A0R(obj2.A00, R.id.reel_preview_frame_layout);
                    obj2.A05 = new C3W4(AbstractC31173DnH.A0G(obj2.A00, R.id.audio_icon_view_stub));
                    view2 = A0C;
                    obj = obj2;
                } else {
                    View A0C2 = AbstractC31173DnH.A0C(A0P, viewGroup, R.layout.reel_preview_content_view, false);
                    A0C2.setTag(new C42800Iwc(A0C2));
                    view = A0C2;
                    C0f9.A0A(-1647762688, A03);
                    return view;
                }
            } else {
                UnsupportedOperationException A1D = AbstractC166987dD.A1D("Unhandled view type");
                C0f9.A0A(1411904802, A03);
                throw A1D;
            }
        } else {
            View A0C3 = AbstractC31173DnH.A0C(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.reel_preview_hint_view, false);
            C14360o3.A0B(A0C3, 1);
            ?? obj3 = new Object();
            obj3.A00 = AbstractC167007dF.A0N(A0C3, R.id.hint);
            view2 = A0C3;
            obj = obj3;
        }
        view2.setTag(obj);
        view = view2;
        C0f9.A0A(-1647762688, A03);
        return view;
    }
}
