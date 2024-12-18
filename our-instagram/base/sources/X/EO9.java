package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.R;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.api.schemas.FanClubInfoDict;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class EO9 extends AbstractC43842Ja5 implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "UserPayFanclubEarningsFragment";
    public SpinnerImageView A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131976502);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A06 = R.drawable.instagram_info_pano_outline_24;
        A0B.A05 = 2131962137;
        AbstractC31176DnK.A1B(ViewOnClickListenerC35685FpK.A00(this, 3), A0B, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        SpinnerImageView A0V = AbstractC31180DnO.A0V(view);
        this.A00 = A0V;
        if (A0V == null) {
            C14360o3.A0F("spinner");
            throw C00O.createAndThrow();
        }
        AbstractC31171DnF.A1M(A0V);
        InterfaceC09390do interfaceC09390do = this.A01;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0B(A0r, 1);
        FanClubInfoDict A0M = AbstractC31172DnG.A0M(AbstractC31178DnM.A0U(interfaceC09390do));
        if (A0M == null || (str = A0M.getFanClubId()) == null) {
            str = "";
        }
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(AbstractC31173DnH.A0g());
        C14360o3.A07(format);
        WW0 ww0 = new WW0(this, 13);
        C2JM A0b = AbstractC25225BEi.A0b();
        C2JM A0b2 = AbstractC25225BEi.A0b();
        A0b.A04("fan_club_id", str);
        A0b.A04(DatePickerDialogModule.ARG_DATE, format);
        A0b.A03("count", 50);
        AbstractC40691uc.A01(A0r).ATV(C35815Frr.A00, ww0, new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "FanClubInsights", A0b.getParamsCopy(), A0b2.getParamsCopy(), C66984UeV.class, false, null, 0, null, "node", AbstractC166987dD.A1E()));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new EXT(requireActivity(), AbstractC166987dD.A0r(this.A01)), new Object());
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C37069GVe.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }
}
