package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.instagram.common.session.UserSession;
import com.instagram.maps.ui.IgStaticMapView;
import com.instagram.model.venue.Venue;

/* renamed from: X.27b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C454227b {
    public final StaticMapView$StaticMapOptions A00 = new StaticMapView$StaticMapOptions("feed_user_location_dialog");
    public final UserSession A01;

    public final void A01(Context context, double d, double d2) {
        C14360o3.A0B(context, 0);
        Resources resources = context.getResources();
        int min = Math.min(resources.getDimensionPixelSize(R.dimen.challenge_winners_sticker_2_winner_column_height), resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right) * 2));
        IgStaticMapView igStaticMapView = new IgStaticMapView(context);
        igStaticMapView.setLayoutParams(new ViewGroup.LayoutParams(min, (min * 5) / 7));
        C0fQ.A00(new ViewOnClickListenerC35552Fn4(d, d2), igStaticMapView);
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = this.A00;
        staticMapView$StaticMapOptions.A00();
        staticMapView$StaticMapOptions.A02(d, d2);
        staticMapView$StaticMapOptions.A03(10);
        igStaticMapView.setMapOptions(staticMapView$StaticMapOptions);
        C193328hC c193328hC = new C193328hC(context);
        c193328hC.A0l(igStaticMapView);
        c193328hC.A04();
        C0fJ.A00(c193328hC.A02());
    }

    public final void A04(FragmentActivity fragmentActivity, String str, String str2) {
        C14360o3.A0B(fragmentActivity, 0);
        UserSession userSession = this.A01;
        Venue venue = new Venue();
        venue.A06(str);
        C69668Vt9 AKn = venue.A00.AKn();
        AKn.A05 = str2;
        venue.A00 = AKn.A00();
        AbstractC68491VSw.A00(fragmentActivity, null, null, userSession, venue, "media_location", "", null, false);
    }

    public C454227b(UserSession userSession) {
        this.A01 = userSession;
    }

    private final void A00(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        Venue A27 = c38321qM.A27();
        UserSession userSession = this.A01;
        C82713mZ A04 = AbstractC82703mY.A04(c38321qM, interfaceC60442pS, "location");
        A04.A0G(userSession, c38321qM);
        if (A27 != null) {
            A04.A5y = A27.A05();
        }
        int i = -1;
        if (c38321qM.A5M()) {
            i = 0;
        }
        C32U.A0E(userSession, A04, c38321qM, interfaceC60442pS, i);
    }

    public final void A02(Context context, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        Double A2J = c38321qM.A2J();
        Double A2K = c38321qM.A2K();
        if (A2J != null && A2K != null) {
            A01(context, A2J.doubleValue(), A2K.doubleValue());
            A00(c38321qM, interfaceC60442pS);
        }
    }

    public final void A03(FragmentActivity fragmentActivity, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS) {
        Venue A27 = c38321qM.A27();
        if (A27 != null) {
            String A05 = A27.A05();
            C14360o3.A07(A05);
            Venue A272 = c38321qM.A27();
            if (A272 != null) {
                String A02 = A272.A02();
                C14360o3.A07(A02);
                A04(fragmentActivity, A05, A02);
                A00(c38321qM, interfaceC60442pS);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
