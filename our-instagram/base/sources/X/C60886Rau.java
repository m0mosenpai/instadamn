package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Rau, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60886Rau extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SaveAutofillLearnMoreFragment";
    public AbstractC18680vv A00;
    public boolean A01;
    public boolean A02;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        int i = 2131953421;
        if (this.A02) {
            i = 2131951991;
        }
        AbstractC25229BEm.A1G(interfaceC56362iU, i);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "save_autofill_learn_more";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A02) {
            TextView A0N = AbstractC167007dF.A0N(view, R.id.what_is_autofill_description);
            int i = 2131977170;
            if (this.A01) {
                i = 2131977169;
            }
            String string = getString(i);
            C14360o3.A0A(string);
            A0N.setText(AnonymousClass001.A0T(getString(2131977064), string, ' '));
            StringBuilder A1C = AbstractC166987dD.A1C();
            String A0v = AbstractC25227BEk.A0v(this, 2131961132);
            A1C.append(A0v);
            A1C.append(getString(2131975418));
            A1C.append("\n");
            A1C.append(A0v);
            AbstractC58320PtC.A1N(getString(2131975417), "\n", A0v, A1C);
            AbstractC58320PtC.A1N(getString(2131975416), "\n", A0v, A1C);
            A1C.append(getString(2131963691));
            AbstractC167007dF.A0N(view, R.id.autofill_activity_list).setText(A1C);
            Em1 em1 = new Em1(this, AbstractC25233BEq.A04(this), 1);
            TextView A0N2 = AbstractC167007dF.A0N(view, R.id.control_autofill_preferences);
            String A0v2 = AbstractC25227BEk.A0v(this, 2131952524);
            String string2 = getString(2131956800, A0v2);
            C14360o3.A07(string2);
            AnonymousClass773.A07(em1, A0N2, A0v2, string2);
            TextView A0N3 = AbstractC167007dF.A0N(view, R.id.who_can_see_autofill_info_title);
            TextView A0N4 = AbstractC167007dF.A0N(view, R.id.who_can_see_autofill_info_description);
            int i2 = 2131977101;
            int i3 = 2131977100;
            if (this.A01) {
                i2 = 2131977099;
                i3 = 2131977098;
            }
            A0N3.setText(getString(i2));
            A0N4.setText(getString(i3));
            TextView A0N5 = AbstractC167007dF.A0N(view, R.id.how_is_my_contact_info_stored_description);
            AbstractC18680vv abstractC18680vv = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A1X = AbstractC31178DnM.A1X(c06090Tz, abstractC18680vv, 36310426616397899L);
            int i4 = 2131963658;
            if (A1X) {
                i4 = 2131963659;
            }
            String string3 = getString(i4);
            C14360o3.A0A(string3);
            A0N5.setText(string3);
            if (this.A01) {
                ViewStub viewStub = (ViewStub) AbstractC166997dE.A0R(view, R.id.saved_payment_info_relevant_ads_title);
                ViewStub viewStub2 = (ViewStub) AbstractC166997dE.A0R(view, R.id.saved_payment_info_relevant_ads_description);
                boolean A1X2 = AbstractC31178DnM.A1X(c06090Tz, this.A00, 36310426616397899L);
                int i5 = R.id.payment_info_section;
                if (A1X2) {
                    i5 = R.id.payment_info_section_metapay;
                }
                ViewStub A0G = AbstractC31173DnH.A0G(view, i5);
                C14360o3.A0A(A0G);
                viewStub.inflate();
                viewStub2.inflate();
                A0G.inflate();
                Em1 em12 = new Em1(this, AbstractC25233BEq.A04(this), 2);
                TextView A0N6 = AbstractC167007dF.A0N(view, R.id.payment_method_description);
                String A0v3 = AbstractC25227BEk.A0v(this, 2131965052);
                int i6 = 2131963661;
                if (AbstractC31178DnM.A1X(c06090Tz, this.A00, 36310426616397899L)) {
                    i6 = 2131963662;
                }
                String string4 = getString(i6);
                C14360o3.A0A(string4);
                StringBuilder A11 = AbstractC166997dE.A11(string4);
                A11.append(' ');
                A11.append(A0v3);
                AnonymousClass773.A07(em12, A0N6, A0v3, MSX.A0l(A11, ' '));
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1370929042);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = C023409i.A0A.A04(requireArguments);
        this.A01 = requireArguments.getBoolean("is_payment_enabled", false);
        this.A02 = requireArguments.getBoolean("is_reconsent_enabled", false);
        C0f9.A09(-1014506691, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(658627141);
        C14360o3.A0B(layoutInflater, 0);
        boolean z = this.A02;
        int i = R.layout.fragment_save_autofill_learn_more;
        if (z) {
            i = R.layout.fragment_about_autofill;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C0f9.A09(-1243178124, A02);
        return inflate;
    }
}
