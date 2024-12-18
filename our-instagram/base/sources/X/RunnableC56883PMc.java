package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.PMc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56883PMc implements Runnable {
    public final /* synthetic */ N6M A00;

    public RunnableC56883PMc(N6M n6m) {
        this.A00 = n6m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        EnumC189548aZ enumC189548aZ;
        N6M n6m = this.A00;
        String str2 = n6m.A0E;
        if (str2 != null) {
            PHB phb = n6m.A06;
            if (phb != null) {
                C14360o3.A0A(str2);
                phb.A02(str2);
                return;
            }
        } else {
            String str3 = n6m.A0D;
            if (str3 == null) {
                return;
            }
            PHB phb2 = n6m.A06;
            if (phb2 != null) {
                C14360o3.A0A(str3);
                UserSession userSession = phb2.A02;
                C47Z A0h = AbstractC43593JPy.A0h(userSession, str3);
                if (A0h == null) {
                    return;
                }
                if (A0h.A0r != null) {
                    ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0S(phb2.A01, R.id.vvp_people_tagging_video_preview_container);
                    viewGroup.setVisibility(0);
                    Context context = phb2.A00;
                    int A0B = AbstractC166987dD.A0B(AbstractC13880nE.A09(context) / 2, 0.5625f);
                    int A09 = AbstractC13880nE.A09(context) / 2;
                    C185368Kc c185368Kc = A0h.A12;
                    if (c185368Kc != null) {
                        enumC189548aZ = c185368Kc.A03;
                    } else {
                        enumC189548aZ = null;
                    }
                    new TextureViewSurfaceTextureListenerC55357OiJ(context, viewGroup, userSession, null, A0h, null, 0.0f, A0B, A09, !AbstractC167007dF.A1X(enumC189548aZ, EnumC189548aZ.A06), true);
                    RoundedCornerFrameLayout roundedCornerFrameLayout = phb2.A03.A09;
                    if (roundedCornerFrameLayout == null) {
                        return;
                    }
                    roundedCornerFrameLayout.setVisibility(0);
                    return;
                }
                ClipInfo clipInfo = A0h.A1N;
                if (clipInfo == null || (str = clipInfo.A0F) == null) {
                    return;
                }
                phb2.A02(str);
                return;
            }
        }
        C14360o3.A0F("clipsPeopleTaggingController");
        throw C00O.createAndThrow();
    }
}
