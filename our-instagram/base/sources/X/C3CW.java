package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.avatars.pokes.PokeReceiverView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.3CW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CW implements InterfaceC60602pj {
    public PokeReceiverView A00;
    public final Fragment A01;
    public final UserSession A02;

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
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        UserSession userSession = this.A02;
        if (C18U.A06(C06090Tz.A05, userSession, 36324174804824004L)) {
            PokeReceiverView pokeReceiverView = this.A00;
            if (pokeReceiverView == null) {
                View inflate = ((ViewStub) view.requireViewById(R.id.feed_pokes_stub)).inflate();
                if (inflate instanceof PokeReceiverView) {
                    pokeReceiverView = (PokeReceiverView) inflate;
                } else {
                    pokeReceiverView = null;
                }
            }
            this.A00 = pokeReceiverView;
            if (pokeReceiverView != null) {
                Fragment fragment = this.A01;
                pokeReceiverView.A00 = fragment;
                pokeReceiverView.A02 = userSession;
                pokeReceiverView.A01 = (C44518JmO) new C52942bb(new KFQ(userSession), fragment).A00(C44518JmO.class);
                PokeReceiverView.A00(pokeReceiverView);
                Fragment fragment2 = pokeReceiverView.A00;
                if (fragment2 != null) {
                    C57312k6 A00 = AbstractC57302k5.A00(fragment2.getLifecycle());
                    AbstractC23641Du.A05(AnonymousClass191.A00, new PXR(0, null), A00);
                }
                C44518JmO c44518JmO = pokeReceiverView.A01;
                if (c44518JmO != null) {
                    KZ9 kz9 = c44518JmO.A01;
                    if (kz9.A00 == null) {
                        if (kz9.A01.CRR()) {
                            kz9.A01 = new C24721Ip(100);
                        }
                        C2JM c2jm = new C2JM();
                        C2JM c2jm2 = new C2JM();
                        C04060Jx c04060Jx = GraphQlCallInput.A02;
                        UserSession userSession2 = kz9.A02;
                        String str = userSession2.userId;
                        C0CA A02 = c04060Jx.A02();
                        C0CA.A00(A02, str, "poke_receiver_id");
                        c2jm.A00.A02().A0E(A02, AbstractC111324zv.A00(2542));
                        C2JQ c2jq = PandoGraphQLRequest.Companion;
                        kz9.A00 = AbstractC40691uc.A01(userSession2).A01(null, new C48148LSx(kz9), new PandoGraphQLRequest(AbstractC40511uK.A00(), "PokesSubscription", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), QnP.class, false, PandoRealtimeInfoJNI.forSubscription("xdt_poke_v2_subscribe"), 0, null, "xdt_poke_v2_subscribe", new ArrayList()));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroyView() {
        PokeReceiverView pokeReceiverView = this.A00;
        if (pokeReceiverView != null) {
            C12500ku c12500ku = new C12500ku(pokeReceiverView);
            while (c12500ku.hasNext()) {
                ((View) c12500ku.next()).clearAnimation();
            }
            pokeReceiverView.removeAllViews();
            pokeReceiverView.A01 = null;
            pokeReceiverView.A04 = null;
        }
        this.A00 = null;
    }

    public C3CW(Fragment fragment, UserSession userSession) {
        this.A01 = fragment;
        this.A02 = userSession;
    }
}
