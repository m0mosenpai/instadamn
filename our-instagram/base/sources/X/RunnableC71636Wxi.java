package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;

/* renamed from: X.Wxi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71636Wxi implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ XIGIGBoostDestination A03;
    public final /* synthetic */ C1Y6 A04;
    public final /* synthetic */ InterfaceC11380iw A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ ImageUrl A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ boolean A09;

    public RunnableC71636Wxi(Intent intent, Bundle bundle, FragmentActivity fragmentActivity, XIGIGBoostDestination xIGIGBoostDestination, C1Y6 c1y6, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ImageUrl imageUrl, Integer num, boolean z) {
        this.A08 = num;
        this.A06 = userSession;
        this.A02 = fragmentActivity;
        this.A07 = imageUrl;
        this.A05 = interfaceC11380iw;
        this.A03 = xIGIGBoostDestination;
        this.A09 = z;
        this.A04 = c1y6;
        this.A00 = intent;
        this.A01 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        ImageUrl imageUrl;
        Dialog A02;
        Integer num = this.A08;
        Integer num2 = C05F.A01;
        UserSession userSession = this.A06;
        if (num == num2) {
            C70399WUb.A00(userSession).A0I(VG4.A1P, "customize_button_of_success_dialog");
            FragmentActivity fragmentActivity = this.A02;
            C193328hC c193328hC = new C193328hC((Activity) fragmentActivity);
            c193328hC.A0A(2131970417);
            c193328hC.A09(2131970415);
            String string = fragmentActivity.getString(2131970413);
            IgdsHeadline igdsHeadline = c193328hC.A0Z;
            igdsHeadline.setDetailText(string);
            igdsHeadline.setVisibility(0);
            c193328hC.A09 = true;
            c193328hC.A0J(new DialogInterfaceOnClickListenerC70207WHl(2, this.A01, this.A03, userSession, fragmentActivity), 2131970411);
            c193328hC.A0I(null, 2131970557);
            c193328hC.A0i(null, this.A05, this.A07);
            A02 = c193328hC.A02();
        } else {
            XIGIGBoostDestination xIGIGBoostDestination = this.A03;
            boolean z = this.A09;
            if (!C17060sy.A01.A01(userSession).isVerified() && xIGIGBoostDestination != XIGIGBoostDestination.A04 && xIGIGBoostDestination != XIGIGBoostDestination.A0G && z && C18U.A06(C06090Tz.A05, userSession, 36317401644405895L)) {
                FragmentActivity fragmentActivity2 = this.A02;
                InterfaceC11380iw interfaceC11380iw = this.A05;
                ImageUrl imageUrl2 = this.A07;
                C2JM c2jm = new C2JM();
                C2JM c2jm2 = new C2JM();
                C2JQ c2jq = PandoGraphQLRequest.Companion;
                AbstractC40691uc.A01(userSession).ATV(null, WW8.A00, new PandoGraphQLRequest(AbstractC40511uK.A00(), "IGNMEBoostUpsellLogImpressionMutation", c2jm.getParamsCopy(), c2jm2.getParamsCopy(), C67148UhI.class, true, null, 0, null, "xdt_nme_log_boost_success_mv_upsell_impression", new ArrayList()));
                C70399WUb.A00(userSession).A0I(VG4.A1P, "meta_verified_success_dialog");
                C193328hC c193328hC2 = new C193328hC((Activity) fragmentActivity2);
                c193328hC2.A0A(2131970418);
                c193328hC2.A09(2131970416);
                String string2 = fragmentActivity2.getString(2131970414);
                IgdsHeadline igdsHeadline2 = c193328hC2.A0Z;
                igdsHeadline2.setDetailText(string2);
                igdsHeadline2.setVisibility(0);
                c193328hC2.A09 = true;
                c193328hC2.A0J(new WHj(1, interfaceC11380iw, fragmentActivity2, userSession), 2131970412);
                c193328hC2.A0I(null, 2131970557);
                c193328hC2.A0i(null, interfaceC11380iw, imageUrl2);
                A02 = c193328hC2.A02();
            } else {
                boolean z2 = true;
                if (!this.A00.getBooleanExtra("is_ab_test", false)) {
                    z2 = false;
                }
                C193328hC c193328hC3 = new C193328hC((Activity) this.A02);
                c193328hC3.A0A(2131970827);
                if (z2) {
                    i = 2131970825;
                } else {
                    boolean A03 = WG1.A03(userSession);
                    i = 2131970824;
                    if (A03) {
                        i = 2131970826;
                    }
                }
                c193328hC3.A09(i);
                c193328hC3.A07();
                if (z2) {
                    imageUrl = null;
                } else {
                    imageUrl = this.A07;
                }
                c193328hC3.A0i(null, this.A05, imageUrl);
                A02 = c193328hC3.A02();
            }
        }
        C0fJ.A00(A02);
    }
}
