package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.779, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass779 implements InterfaceC60602pj {
    public final Activity A00;
    public final UserSession A01;
    public final C77A A02;
    public final C77E A03;
    public final C77H A04;
    public final C7FJ A05;
    public final List A06;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
        C14360o3.A0B(view, 0);
        C77A c77a = this.A02;
        c77a.A00 = new C9EL(this, 13);
        c77a.A01.A01(c77a.A03, C2Io.class);
        C7FJ c7fj = this.A05;
        if (!c7fj.A00()) {
            if (C18U.A06(C06090Tz.A05, c7fj.A00, 36318505448052966L)) {
                C77H c77h = this.A04;
                List list = this.A06;
                MM0 mm0 = new MM0(this, 8);
                Object obj = c77h.A01.get(Integer.valueOf(list.hashCode()));
                if (obj != null) {
                    mm0.invoke(new C09550e6(obj));
                    return;
                }
                C77G c77g = c77h.A00;
                C30172DRc c30172DRc = new C30172DRc(45, mm0, list, c77h);
                C2JM c2jm = new C2JM();
                C2JM c2jm2 = new C2JM();
                ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
                c2jm.A05("user_ids", copyOf);
                boolean z = false;
                if (copyOf != null) {
                    z = true;
                }
                C18C.A0E(z);
                C2JQ c2jq = PandoGraphQLRequest.Companion;
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGSocialAvatarStickersEligibilityQuery", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C59760Qma.class, false, null, 0, null, "xfb_social_avatar_stickers_eligibility", new ArrayList());
                c77g.A00.ATV(new C63998SxV(c30172DRc), new C64009Sxg(c30172DRc), pandoGraphQLRequest);
            }
        }
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
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public /* synthetic */ AnonymousClass779(Activity activity, UserSession userSession, List list) {
        C77A c77a = (C77A) userSession.A01(C77A.class, new MHS(userSession, 40));
        C77E c77e = new C77E(userSession);
        C77H c77h = (C77H) userSession.A01(C77H.class, new MHS(new C77G(userSession, AbstractC40691uc.A01(userSession)), 42));
        C7FJ c7fj = new C7FJ(userSession);
        C14360o3.A0B(c77a, 4);
        C14360o3.A0B(c77h, 6);
        this.A01 = userSession;
        this.A06 = list;
        this.A00 = activity;
        this.A02 = c77a;
        this.A03 = c77e;
        this.A04 = c77h;
        this.A05 = c7fj;
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        C77A c77a = this.A02;
        c77a.A00 = null;
        c77a.A01.A02(c77a.A03, C2Io.class);
    }
}
