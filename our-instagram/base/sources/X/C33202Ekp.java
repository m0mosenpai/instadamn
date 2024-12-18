package X;

import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.Ekp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33202Ekp extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LocationPageInfoPageReportFragment";
    public C34445FGj A00;
    public List A01;
    public UserSession A02;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.Efu(2131972390);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "location_page_info_page_report_fragment";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1138602116);
        super.onCreate(bundle);
        this.A02 = AbstractC31176DnK.A0S(this);
        boolean z = requireArguments().getBoolean("show_linked_business_report_options");
        List asList = Arrays.asList(new Pair(2131972392, "INACCURATE_INFO"), new Pair(2131972398, "DISLIKE"), new Pair(2131972391, "HARASSING"), new Pair(2131972400, "SHOULD_NOT_BE_ON_IG"), new Pair(2131972399, "SCAM"), new Pair(2131972395, "IP"));
        this.A01 = asList;
        if (z) {
            ArrayList A1F = AbstractC166987dD.A1F(asList);
            this.A01 = A1F;
            A1F.addAll(Arrays.asList(new Pair(2131972374, AbstractC111324zv.A00(1811)), new Pair(2131972373, "SPAM"), new Pair(2131972375, "WRONG_CLAIM")));
        }
        ArrayList A1F2 = AbstractC166987dD.A1F(this.A01);
        this.A01 = A1F2;
        A1F2.addAll(Arrays.asList(new Pair(2131972393, "PIN_INACCURATE"), new Pair(2131972394, "INAPPROPRIATE_AR"), new Pair(2131972396, "CONTENT_NOT_RELEVANT"), new Pair(2131972397, "NO_CONTENT_ALLOWED")));
        C0f9.A09(351360826, A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ArrayList A1E = AbstractC166987dD.A1E();
        C31335Dq0 A00 = C31335Dq0.A00(2131972372);
        A00.A0K = false;
        A1E.add(A00);
        for (Pair pair : this.A01) {
            AbstractC25235BEs.A1C(requireContext(), new WNP(51, this, pair), A1E, AbstractC166987dD.A0H(pair.first));
        }
        setItems(A1E);
    }
}
