package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.OuH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56045OuH implements InterfaceC60602pj {
    public Dialog A00;
    public final Context A01;
    public final UserSession A02;
    public final C50866Mdx A03;
    public final ClipsCreationViewModel A04;
    public final C187418Sj A05;
    public final C187358Sd A06;
    public final ClipsStackedTimelineViewController A07;
    public final C50869Me0 A08;
    public final C87H A09;

    public C56045OuH(Context context, UserSession userSession, ClipsStackedTimelineViewController clipsStackedTimelineViewController, C50866Mdx c50866Mdx, ClipsCreationViewModel clipsCreationViewModel, C50869Me0 c50869Me0, C187418Sj c187418Sj, C187358Sd c187358Sd, C87H c87h) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = context;
        this.A07 = clipsStackedTimelineViewController;
        this.A05 = c187418Sj;
        this.A04 = clipsCreationViewModel;
        this.A06 = c187358Sd;
        this.A03 = c50866Mdx;
        this.A09 = c87h;
        this.A08 = c50869Me0;
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(C56045OuH c56045OuH, int i) {
        c56045OuH.A06.A0G(new C52414NHk(i, C05F.A0j));
        C55081Oab.A02.A02(AbstractC166997dE.A0p(c56045OuH.A01, 2131955552));
    }

    public final void A01() {
        C8TF c8tf;
        C115475Kh c115475Kh;
        AbstractC187378Sf A0E = this.A06.A0E();
        if ((A0E instanceof C8TF) && (c8tf = (C8TF) A0E) != null) {
            C50869Me0 c50869Me0 = this.A08;
            InterfaceC115495Kj A04 = this.A04.A0G().A04(c8tf.A00);
            if (A04 instanceof C115475Kh) {
                c115475Kh = (C115475Kh) A04;
            } else {
                c115475Kh = null;
            }
            boolean z = false;
            if (c115475Kh != null && MSW.A05(c115475Kh) > 400) {
                z = true;
            }
            c50869Me0.A01 = z;
            C50869Me0.A01(EnumC53325Ni3.A0P, c50869Me0, z);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onViewCreated(View view, Bundle bundle) {
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = this.A07;
        ClipsTimelineActionBarViewController.A01(new ViewOnClickListenerC55460OkF(this, 8), EnumC53325Ni3.A0P, clipsStackedTimelineViewController.A0C);
    }
}
