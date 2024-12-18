package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* loaded from: classes9.dex */
public final class N5R extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "GraphQLRestConsistencyFragment";
    public int A00;
    public int A01;
    public C1Df A02;
    public C1Df A03;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC41501vz A09;
    public final InterfaceC74953Yl A06 = AbstractC25230BEn.A0U(null);
    public final InterfaceC74953Yl A04 = AbstractC25229BEm.A0R(null);
    public final InterfaceC74953Yl A05 = AbstractC25229BEm.A0R(null);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131958047);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "graphql_rest_consistency";
    }

    public static final void A00(N5R n5r) {
        InterfaceC09390do interfaceC09390do = n5r.A07;
        C40701ud A01 = AbstractC40691uc.A01(AbstractC166987dD.A0r(interfaceC09390do));
        C2JM A0b = AbstractC25225BEi.A0b();
        n5r.A03 = A01.A01(null, new C58510Pwe(n5r, 29), new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC43594JPz.A1X(A0b, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AbstractC31173DnH.A0t(interfaceC09390do))), "IGConsistencyDemoUserQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), R0E.class, false, null, 0, null, "xdt_users__info", AbstractC166987dD.A1E()));
    }

    public static final void A01(N5R n5r) {
        C50888MeJ c50888MeJ = (C50888MeJ) n5r.A08.getValue();
        String A0t = AbstractC31173DnH.A0t(n5r.A07);
        InterfaceC74953Yl interfaceC74953Yl = n5r.A06;
        boolean A1R = AbstractC167007dF.A1R(0, A0t, interfaceC74953Yl);
        MV2 mv2 = (MV2) c50888MeJ.A01.getValue();
        AnonymousClass500 anonymousClass500 = new AnonymousClass500(A0t);
        mv2.A03(new C52684NSp(new C50689MZh(interfaceC74953Yl, 37), null, C5K5.A00(c50888MeJ.A00)), new AnonymousClass700(null, A1R, false, A1R), anonymousClass500, "graphql/rest consistency fragment", "internal settings", -1, false);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public N5R() {
        C43203J8a c43203J8a = new C43203J8a(this, 17);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43203J8a(new C43203J8a(this, 14), 15));
        this.A08 = AbstractC25225BEi.A0a(new C43203J8a(A00, 16), c43203J8a, new D8I(29, null, A00), AbstractC25225BEi.A1D(C50888MeJ.class));
        this.A09 = new C56026Otx(this, 6);
        this.A07 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1789641208);
        super.onCreate(bundle);
        A01(this);
        InterfaceC09390do interfaceC09390do = this.A07;
        C40701ud A01 = AbstractC40691uc.A01(AbstractC166987dD.A0r(interfaceC09390do));
        C2JM A0b = AbstractC25225BEi.A0b();
        this.A02 = A01.A01(null, new MV7(this, 21), new PandoGraphQLRequest(AbstractC25227BEk.A0U(AbstractC43594JPz.A1X(A0b, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, AbstractC31173DnH.A0t(interfaceC09390do))), "IGConsistencyDemoUserQuery", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), R0E.class, false, null, 0, null, "xdt_users__info", AbstractC166987dD.A1E()));
        A00(this);
        AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A09, C2AS.class);
        C0f9.A09(-1062579954, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2105031693);
        ComposeView A00 = AbstractC25319BIo.A00(this, new C30194DRz(this, 5), 1572338031);
        C0f9.A09(125986203, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-190282366);
        C1Df c1Df = this.A02;
        if (c1Df != null) {
            c1Df.cancel();
        }
        C1Df c1Df2 = this.A03;
        if (c1Df2 != null) {
            c1Df2.cancel();
        }
        AbstractC31176DnK.A0Q(this.A07).A02(this.A09, C2AS.class);
        super.onDestroyView();
        C0f9.A09(-2074317674, A02);
    }
}
