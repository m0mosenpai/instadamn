package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class EIY extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "TranslateToBottomSheetFragment";
    public String A00;
    public Context A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "translate_to_bottomsheet_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0S(view, R.id.translate_to_bottomsheet_layout);
        for (Integer num : C05F.A00(5)) {
            Context context = this.A01;
            if (context != null) {
                IgdsListCell igdsListCell = new IgdsListCell(context, null);
                Context context2 = this.A01;
                if (context2 != null) {
                    switch (num.intValue()) {
                        case 1:
                            i = 2131964803;
                            break;
                        case 2:
                            i = 2131964804;
                            break;
                        case 3:
                            i = 2131964801;
                            break;
                        case 4:
                            i = 2131964802;
                            break;
                        default:
                            i = 2131964800;
                            break;
                    }
                    igdsListCell.A0I(AbstractC166997dE.A0p(context2, i));
                    igdsListCell.A0G(EnumC53237Nga.A07, true);
                    C07S c07s = C07S.STARTED;
                    C07X viewLifecycleOwner = getViewLifecycleOwner();
                    AbstractC166987dD.A1Z(new JTH(num, this, viewLifecycleOwner, igdsListCell, c07s, (InterfaceC23621Ds) null, 22), C07Y.A00(viewLifecycleOwner));
                    igdsListCell.A0D(new C35730FqD(2, this, num));
                    viewGroup.addView(igdsListCell);
                }
            }
            C14360o3.A0F("context");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    public EIY() {
        X32 x32 = new X32(this, 46);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X32(new X32(this, 43), 44));
        this.A03 = AbstractC25225BEi.A0a(new X32(A00, 45), x32, new D8L(4, null, A00), AbstractC25225BEi.A1D(C31804DyO.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1587939566);
        super.onCreate(bundle);
        this.A01 = requireContext();
        C0f9.A09(-1920534990, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-813171420);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.translate_to_bottomsheet, false);
        C0f9.A09(1288032919, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i;
        int A02 = C0f9.A02(1071140235);
        super.onDestroy();
        InterfaceC09390do interfaceC09390do = this.A03;
        String str = (String) ((C31804DyO) interfaceC09390do.getValue()).A01.getValue();
        String str2 = this.A00;
        if (str2 != null) {
            if (C14360o3.A0K(str, str2)) {
                i = 828133300;
            } else {
                InterfaceC09390do interfaceC09390do2 = this.A02;
                java.util.Set A0J = AbstractC25230BEn.A0l(interfaceC09390do2).A0J(AbstractC16830sb.A06(C00Q.A03(AbstractC166987dD.A19(C1Q2.A02()), 2)));
                String str3 = this.A00;
                if (str3 != null) {
                    A0J.remove(str3);
                    A0J.add(str);
                    AbstractC25230BEn.A0l(interfaceC09390do2).A1A(A0J);
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (EnumC33410Eph enumC33410Eph : EnumC33410Eph.A02) {
                        C2JO c2jo = new C2JO();
                        String str4 = enumC33410Eph.A01;
                        c2jo.A08("enabled", AbstractC31172DnG.A0s(A0J.contains(str4)));
                        c2jo.A09(str4, "language");
                        A1E.add(c2jo);
                    }
                    C2JO c2jo2 = new C2JO();
                    c2jo2.A05("translate_from_preference", A1E);
                    C2JM A0b = AbstractC25225BEi.A0b();
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    A0b.A00(c2jo2, "input");
                    PandoGraphQLRequest A00 = AbstractC35852FsS.A00(A0b, A0b2);
                    C40701ud A01 = AbstractC40691uc.A01(AbstractC166987dD.A0r(interfaceC09390do2));
                    C14360o3.A0A(A00);
                    A01.ATV(C35803Frf.A00, C35837FsD.A00, A00);
                    C31804DyO c31804DyO = (C31804DyO) interfaceC09390do.getValue();
                    C14360o3.A0B(str, 0);
                    c31804DyO.A00.Egh(str);
                    InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC25230BEn.A0l(interfaceC09390do2));
                    A0w.E7K("translate_to_language", str);
                    A0w.apply();
                    C04060Jx c04060Jx = GraphQlCallInput.A02;
                    C0CA A0T = AbstractC25227BEk.A0T(c04060Jx, 0, "preference_rank");
                    C0CA.A00(A0T, str, "language");
                    C0CA A022 = c04060Jx.A02();
                    A022.A0E(A0T, "translate_to_preference");
                    C2JM A0b3 = AbstractC25225BEi.A0b();
                    PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A022, A0b3, "input"), "SetTranslateToPreference", A0b3.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), C59185QaJ.class, true, null, 0, null, "xdt_set_translate_to_preference", AbstractC166987dD.A1E());
                    AbstractC40691uc.A01(AbstractC166987dD.A0r(interfaceC09390do2)).ATV(C35804Frg.A00, C35838FsE.A00, pandoGraphQLRequest);
                    i = -947529500;
                }
            }
            C0f9.A09(i, A02);
            return;
        }
        C14360o3.A0F("initialSelectedLanguage");
        throw C00O.createAndThrow();
    }
}
