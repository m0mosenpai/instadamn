package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Calendar;

/* loaded from: classes9.dex */
public final class N97 extends AbstractC65632xz {
    public final Activity A00;
    public final Fragment A01;
    public final ArchiveReelFragment A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        ExtendedImageUrl A1q;
        int A03 = C0f9.A03(281606571);
        OEH oeh = (OEH) AbstractC31172DnG.A0x(view);
        Activity activity = this.A00;
        Fragment fragment = this.A01;
        Context context = view.getContext();
        UserSession userSession = this.A04;
        C38321qM c38321qM = (C38321qM) obj;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        ArchiveReelFragment archiveReelFragment = this.A02;
        IgImageView igImageView = oeh.A01;
        if (igImageView == null) {
            boolean A63 = c38321qM.A63();
            ViewStub viewStub = oeh.A03;
            if (A63) {
                View A0E = AbstractC31173DnH.A0E(viewStub, R.layout.archive_suggestion_preview);
                oeh.A00 = A0E;
                igImageView = (IgImageView) A0E;
                oeh.A01 = igImageView;
            } else {
                View A0E2 = AbstractC31173DnH.A0E(viewStub, R.layout.archive_suggestion_feed_post_preview);
                oeh.A00 = A0E2;
                igImageView = AbstractC31172DnG.A0Z(A0E2, R.id.on_this_day_preview_image_thumbnail);
                oeh.A01 = igImageView;
                igImageView.A0E = oeh.A06;
            }
        }
        if (igImageView != null && (A1q = c38321qM.A1q(context)) != null) {
            oeh.A01.setUrl(A1q, interfaceC11380iw);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(c38321qM.A1B() * 1000);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(System.currentTimeMillis());
        oeh.A05.setText(AbstractC167017dG.A0k(context.getResources(), calendar2.get(1) - calendar.get(1), R.plurals.on_this_day_subtitle));
        ViewOnClickListenerC28651Ckz viewOnClickListenerC28651Ckz = new ViewOnClickListenerC28651Ckz(0, activity, fragment, userSession, c38321qM);
        C0fQ.A00(viewOnClickListenerC28651Ckz, oeh.A04);
        View view2 = oeh.A00;
        if (view2 != null) {
            C0fQ.A00(viewOnClickListenerC28651Ckz, view2);
        }
        ViewOnClickListenerC55464OkJ.A01(oeh.A02, 2, c38321qM, archiveReelFragment);
        if (!archiveReelFragment.A0C) {
            archiveReelFragment.A0C = true;
            archiveReelFragment.A03.A04(c38321qM, archiveReelFragment.A0G);
        }
        C0f9.A0A(-38474958, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        if (!((C54374O1g) obj2).A00) {
            anonymousClass306.A7a(0);
        }
    }

    public N97(Activity activity, Fragment fragment, ArchiveReelFragment archiveReelFragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = activity;
        this.A01 = fragment;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A02 = archiveReelFragment;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(2013043675);
        View A0A = AbstractC31172DnG.A0A(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.layout_archive_on_this_day);
        A0A.setTag(new OEH(A0A));
        C0f9.A0A(-893489750, A03);
        return A0A;
    }
}
