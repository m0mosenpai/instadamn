package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.google.android.material.appbar.AppBarLayout;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Wdj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70605Wdj implements InterfaceC57923PmT {
    public final C70399WUb A00;
    public final V18 A01;
    public final C70606Wdk A02;
    public final C70908WkB A03;
    public final Vb2 A04;
    public final UserSession A05;
    public final String A06;
    public final Context A07;

    public C70605Wdj(Context context, V18 v18, C70606Wdk c70606Wdk, C70908WkB c70908WkB, Vb2 vb2, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 2);
        this.A07 = context;
        this.A05 = userSession;
        this.A06 = str;
        this.A01 = v18;
        this.A04 = vb2;
        this.A02 = c70606Wdk;
        this.A03 = c70908WkB;
        C70399WUb A00 = C70399WUb.A00(userSession);
        C14360o3.A07(A00);
        this.A00 = A00;
        vb2.A00.setLoadingStatus(C3T1.LOADING);
        c70606Wdk.A02 = this;
        c70908WkB.A01 = this;
    }

    public static final void A00(C70605Wdj c70605Wdj, boolean z) {
        String str;
        SpinnerImageView spinnerImageView = c70605Wdj.A04.A00;
        if (spinnerImageView.getVisibility() == 0) {
            if (z) {
                AbstractC69887VxE.A00(c70605Wdj.A05, c70605Wdj.A06, "No media available");
            } else {
                V18 v18 = c70605Wdj.A01;
                W4U w4u = v18.A01;
                if (w4u == null) {
                    str = "mediaPickerState";
                } else {
                    EnumC68134VCs enumC68134VCs = w4u.A00;
                    EnumC68134VCs enumC68134VCs2 = v18.A00;
                    if (enumC68134VCs2 == null) {
                        str = "mediaContentType";
                    } else if (enumC68134VCs == enumC68134VCs2) {
                        C70399WUb.A00(c70605Wdj.A05).A0T(c70605Wdj.A06, "media_selection");
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            spinnerImageView.setLoadingStatus(C3T1.SUCCESS);
            c70605Wdj.A03.A05.A02.setVisibility(0);
            c70605Wdj.A02.A08.A01.setVisibility(0);
        }
    }

    public final void A01() {
        this.A00.A0P(this.A05, "media_selection", this.A06, "media_fetch");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.2zP] */
    public final void A02(String str, boolean z) {
        if (str == null) {
            A00(this, true);
        } else if (z) {
            UserSession userSession = this.A05;
            String str2 = this.A06;
            boolean A04 = this.A02.A04();
            boolean z2 = true;
            C18920wW A02 = AbstractC12220kQ.A02(userSession);
            InterfaceC02590Ai A00 = A02.A00(A02.A00, "promoted_posts_tap_component");
            if (A00.isSampled()) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A03(AbstractC111324zv.A00(33), Boolean.valueOf(A04));
                c0Zx.A03("is_business_user_access_token_enabled", true);
                if (AbstractC68468VRy.A00(userSession).A00 == null) {
                    z2 = false;
                }
                c0Zx.A03("is_business_user_access_token_enabled_and_cached", Boolean.valueOf(z2));
                A00.AAP("component", "media_cell");
                A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                AbstractC65702TsY.A1F(A00, "boost_posts");
                A00.AAQ(c0Zx, "configurations");
                A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "media_selection");
                A00.Cht();
            }
        }
        C70908WkB c70908WkB = this.A03;
        if (str != null) {
            Vb0 vb0 = c70908WkB.A04;
            XDK xdk = c70908WkB.A06;
            C14360o3.A0B(xdk, 1);
            vb0.A00.A00(xdk, str);
        } else {
            C69644Vsl c69644Vsl = c70908WkB.A05;
            C66362zD c66362zD = c69644Vsl.A07;
            ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
            viewModelListUpdate.A00(new Object());
            c66362zD.A05(viewModelListUpdate);
            c66362zD.notifyDataSetChanged();
            AppBarLayout appBarLayout = c69644Vsl.A05;
            appBarLayout.A03 = 13;
            appBarLayout.requestLayout();
        }
        V18 v18 = this.A01;
        W4U w4u = v18.A01;
        if (w4u != null) {
            w4u.A01 = str;
            w4u.A00();
            if (v18.A01 != null) {
                v18.A02 = str;
                return;
            }
        }
        C14360o3.A0F("mediaPickerState");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC57923PmT
    public final void destroy() {
        this.A03.destroy();
    }
}
