package X;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.autocreatedclips.repository.ClipsSoundSyncBeatsInfoRepository;
import com.instagram.creation.capture.quickcapture.autocreatedclips.repository.ClipsSoundSyncMediaImportRepository;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.List;

/* renamed from: X.NDs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52329NDs extends AbstractC61132qb {
    public final int A00;
    public final Application A01;
    public final Fragment A02;
    public final FragmentActivity A03;
    public final C26086BgF A04;
    public final UserSession A05;
    public final C1810981l A06;
    public final CameraSpec A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;

    public C52329NDs(Fragment fragment, FragmentActivity fragmentActivity, C26086BgF c26086BgF, UserSession userSession, C1810981l c1810981l, CameraSpec cameraSpec, String str, List list, int i, boolean z, boolean z2) {
        AbstractC25233BEq.A0x(1, userSession, cameraSpec, str);
        C14360o3.A0B(c1810981l, 7);
        this.A05 = userSession;
        this.A03 = fragmentActivity;
        this.A02 = fragment;
        this.A07 = cameraSpec;
        this.A08 = str;
        this.A04 = c26086BgF;
        this.A06 = c1810981l;
        this.A0B = z;
        this.A0A = z2;
        this.A09 = list;
        this.A00 = i;
        this.A01 = fragmentActivity.getApplication();
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        int i;
        if (this.A0B) {
            i = 90000;
        } else {
            i = this.A00;
        }
        Application application = this.A01;
        C14360o3.A06(application);
        UserSession userSession = this.A05;
        C8XO c8xo = (C8XO) new C52942bb(this.A02).A00(C8XO.class);
        FragmentActivity fragmentActivity = this.A03;
        ClipsCreationViewModel clipsCreationViewModel = (ClipsCreationViewModel) AbstractC50522MSa.A0L(fragmentActivity, userSession);
        C185418Kh c185418Kh = (C185418Kh) new C52942bb(fragmentActivity).A00(C185418Kh.class);
        Context A0O = AbstractC166987dD.A0O(fragmentActivity);
        C14360o3.A0B(userSession, 1);
        AnonymousClass825 anonymousClass825 = (AnonymousClass825) MSW.A0F(new AnonymousClass824(A0O, userSession), fragmentActivity).A00(AnonymousClass825.class);
        ClipsSoundSyncMediaImportRepository clipsSoundSyncMediaImportRepository = new ClipsSoundSyncMediaImportRepository(application, userSession, this.A07, this.A08);
        ClipsSoundSyncBeatsInfoRepository clipsSoundSyncBeatsInfoRepository = new ClipsSoundSyncBeatsInfoRepository(userSession);
        O20 o20 = new O20(new C8SF(application, userSession, C05F.A00, fragmentActivity.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height), fragmentActivity.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height), false));
        ABW abw = (ABW) userSession.A01(ABW.class, new B61(17, application, userSession));
        C1810981l c1810981l = this.A06;
        C41185IKy c41185IKy = (C41185IKy) userSession.A01(C41185IKy.class, new C50151MDe(userSession, 22));
        return new C50870Me1(application, this.A04, userSession, c1810981l, c41185IKy, clipsSoundSyncBeatsInfoRepository, abw, clipsSoundSyncMediaImportRepository, o20, c8xo, clipsCreationViewModel, anonymousClass825, c185418Kh, this.A09, i, this.A0A);
    }
}
