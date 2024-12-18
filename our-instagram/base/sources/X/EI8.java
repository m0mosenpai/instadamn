package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes6.dex */
public final class EI8 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DoNotTranslateBottomSheetFragment";
    public java.util.Set A00;
    public Context A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "do_not_translate_bottomsheet_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.do_not_translate_bottomsheet_layout);
        this.A00 = AbstractC25230BEn.A0l(this.A02).A0J(AbstractC16830sb.A06(C00Q.A03(AbstractC166987dD.A19(C1Q2.A02()), 2)));
        for (EnumC33410Eph enumC33410Eph : EnumC33410Eph.values()) {
            Context context = this.A01;
            String str = "context";
            if (context != null) {
                IgdsListCell igdsListCell = new IgdsListCell(context, null);
                Context context2 = this.A01;
                if (context2 != null) {
                    igdsListCell.A0I(AbstractC166997dE.A0p(context2, enumC33410Eph.A00));
                    EnumC53237Nga enumC53237Nga = EnumC53237Nga.A03;
                    String A03 = C00Q.A03(AbstractC166987dD.A19(C1Q2.A02()), 2);
                    String str2 = enumC33410Eph.A01;
                    igdsListCell.A0G(enumC53237Nga, AbstractC25225BEi.A1a(A03, str2));
                    java.util.Set set = this.A00;
                    if (set == null) {
                        str = "currentDoNotTranslateLanguages";
                    } else {
                        if (!set.contains(str2)) {
                            z = false;
                            if (!C14360o3.A0K(str2, C00Q.A03(AbstractC166987dD.A19(C1Q2.A02()), 2))) {
                                igdsListCell.setChecked(z);
                                igdsListCell.A0D(new C35744Fqc(0, enumC33410Eph, this, igdsListCell));
                                A0C.addView(igdsListCell);
                            }
                        }
                        z = true;
                        igdsListCell.setChecked(z);
                        igdsListCell.A0D(new C35744Fqc(0, enumC33410Eph, this, igdsListCell));
                        A0C.addView(igdsListCell);
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(658961838);
        super.onCreate(bundle);
        this.A01 = requireContext();
        C0f9.A09(138678033, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(583613704);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.do_not_translate_bottomsheet, false);
        C0f9.A09(-346136912, A02);
        return A0R;
    }
}
