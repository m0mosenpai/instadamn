package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class EII extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "OneTapUpsellLogOutFragment";
    public boolean A00;
    public LinearLayout A01;
    public User A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "one_tap_upsell_logout_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 0;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        if (C1AD.A06(C06090Tz.A05, 18296144069329079L)) {
            IgdsPeopleCell igdsPeopleCell = new IgdsPeopleCell(requireContext, false);
            User user = this.A02;
            if (user != null) {
                igdsPeopleCell.A08(user.getUsername(), false);
                User user2 = this.A02;
                if (user2 != null) {
                    igdsPeopleCell.A04(user2.Bhu(), null);
                    LinearLayout linearLayout = this.A01;
                    if (linearLayout != null) {
                        linearLayout.addView(igdsPeopleCell, 0);
                        i = 1;
                    }
                    C14360o3.A0F("linearLayout");
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            throw C00O.createAndThrow();
        }
        IgdsListCell igdsListCell = new IgdsListCell(requireContext, null);
        igdsListCell.A0I(AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131969001));
        G9H.A00(igdsListCell, this, 27);
        igdsListCell.setChecked(this.A00);
        igdsListCell.setTextCellType(EnumC53237Nga.A08);
        LinearLayout linearLayout2 = this.A01;
        if (linearLayout2 != null) {
            linearLayout2.addView(igdsListCell, i);
            LinearLayout linearLayout3 = this.A01;
            if (linearLayout3 != null) {
                TextView A0N = AbstractC167007dF.A0N(linearLayout3, R.id.one_tap_upsell_bottom_sheet_text_message);
                Resources A0N2 = AbstractC166997dE.A0N(this);
                User user3 = this.A02;
                if (user3 != null) {
                    A0N.setText(AbstractC166997dE.A0r(A0N2, user3.getUsername(), 2131969002), TextView.BufferType.NORMAL);
                    return;
                }
                C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F("linearLayout");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1619696464);
        super.onCreate(bundle);
        this.A02 = AbstractC31176DnK.A0g(C17060sy.A01, this.A03);
        C0f9.A09(292409207, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(869693156);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.one_tap_upsell_bottom_sheet_layout, viewGroup, false);
        this.A01 = AbstractC31172DnG.A0B(inflate, R.id.container);
        C0f9.A09(5794415, A02);
        return inflate;
    }
}
