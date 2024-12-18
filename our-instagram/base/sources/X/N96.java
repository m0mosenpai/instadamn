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
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes9.dex */
public final class N96 extends AbstractC65632xz {
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
        int A03 = C0f9.A03(536402829);
        OEG oeg = (OEG) AbstractC31172DnG.A0x(view);
        Activity activity = this.A00;
        Fragment fragment = this.A01;
        Context context = view.getContext();
        UserSession userSession = this.A04;
        Collection collection = (Collection) obj;
        InterfaceC11380iw interfaceC11380iw = this.A03;
        ArchiveReelFragment archiveReelFragment = this.A02;
        C14360o3.A0B(oeg, 0);
        JQ0.A1O(activity, fragment, context, userSession, collection);
        AbstractC167017dG.A1U(interfaceC11380iw, archiveReelFragment);
        C22P c22p = C22P.A54;
        int i2 = 5;
        ArrayList A1F = AbstractC166987dD.A1F(collection);
        C01T.A1D(A1F, new C31460Ds4((InterfaceC16620sF) C57759Pjm.A00, 1));
        int i3 = 5;
        long j = Long.MAX_VALUE;
        int i4 = 0;
        int i5 = 0;
        while (i3 < A1F.size()) {
            long A1B = ((C38321qM) A1F.get(i5)).A1B() / SandboxRepository.CACHE_TTL;
            long A1B2 = ((C38321qM) A1F.get(i3)).A1B() / SandboxRepository.CACHE_TTL;
            long j2 = A1B2 - A1B;
            if (j2 < j) {
                i2 = i3;
                for (int i6 = i3 + 1; i6 < A1F.size() && i6 - i5 < 50 && (((C38321qM) A1F.get(i6)).A1B() / SandboxRepository.CACHE_TTL) - A1B2 < 1; i6++) {
                    i2 = i6;
                }
                i4 = i5;
                j = j2;
            }
            i3++;
            i5++;
        }
        List subList = A1F.subList(i4, i2 + 1);
        C38321qM A0x = AbstractC25225BEi.A0x(subList, 0);
        IgImageView igImageView = oeg.A01;
        if (igImageView != null) {
            ExtendedImageUrl A1q = A0x.A1q(context);
            if (A1q != null) {
                igImageView.setUrl(A1q, interfaceC11380iw);
            }
        } else {
            boolean A63 = A0x.A63();
            ViewStub viewStub = oeg.A04;
            if (A63) {
                View A0E = AbstractC31173DnH.A0E(viewStub, R.layout.archive_suggestion_preview);
                oeg.A00 = A0E;
                oeg.A01 = (IgImageView) A0E;
            } else {
                View A0E2 = AbstractC31173DnH.A0E(viewStub, R.layout.archive_suggestion_feed_post_preview);
                oeg.A00 = A0E2;
                if (A0E2 != null) {
                    oeg.A01 = AbstractC31172DnG.A0Z(A0E2, R.id.on_this_day_preview_image_thumbnail);
                }
                IgImageView igImageView2 = oeg.A01;
                if (igImageView2 != null) {
                    igImageView2.A0E = oeg.A06;
                }
            }
        }
        oeg.A05.setText(2131977177);
        ViewOnClickListenerC55422OjX viewOnClickListenerC55422OjX = new ViewOnClickListenerC55422OjX(0, activity, fragment, c22p, userSession, subList);
        C0fQ.A00(viewOnClickListenerC55422OjX, oeg.A02);
        View view2 = oeg.A00;
        if (view2 != null) {
            C0fQ.A00(viewOnClickListenerC55422OjX, view2);
        }
        C0fQ.A00(new ViewOnClickListenerC55467OkM(archiveReelFragment, 0), oeg.A03);
        C0f9.A0A(257988397, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        if (!((C54374O1g) obj2).A00) {
            anonymousClass306.A7a(0);
        }
    }

    public N96(Activity activity, Fragment fragment, ArchiveReelFragment archiveReelFragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = activity;
        this.A01 = fragment;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A02 = archiveReelFragment;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1606394725);
        View A0C = AbstractC31173DnH.A0C(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.layout_archive_auto_create_clip, false);
        A0C.setTag(new OEG(A0C));
        C0f9.A0A(-1629738989, A03);
        return A0C;
    }
}
