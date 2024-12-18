package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.facebook.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Jhj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44293Jhj extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "UpdateProfilePictureTabFragment";
    public ListView A00;
    public InterfaceC56392iX A01;
    public InterfaceC56392iX A02;
    public SpinnerImageView A03;
    public String A04;
    public String A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "edit_profile_picture_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("logging_surface_key")) != null) {
            this.A05 = string;
            Bundle bundle3 = this.mArguments;
            if (bundle3 != null && (string2 = bundle3.getString("logging_mechanism_key")) != null) {
                this.A04 = string2;
                this.A00 = (ListView) view.requireViewById(R.id.update_profile_options_list);
                this.A03 = (SpinnerImageView) view.requireViewById(R.id.update_profile_loading_spinner);
                this.A02 = AbstractC31173DnH.A0U(view, R.id.update_profile_no_avatar_view_stub);
                this.A01 = AbstractC31173DnH.A0U(view, R.id.update_profile_instant_avatar_view_stub);
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = getViewLifecycleOwner();
                C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
                MCQ mcq = new MCQ(viewLifecycleOwner, c07s, this, null, 24);
                AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
                C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, mcq, A00);
                AbstractC23641Du.A05(anonymousClass191, new MCQ(A0K, c07s, this, null, 25), C07Y.A00(A0K));
                return;
            }
            throw AbstractC166987dD.A14("mechanism is required");
        }
        throw AbstractC166987dD.A14("surface is required");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public C44293Jhj() {
        C37048GUe c37048GUe = new C37048GUe(this, 4);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37048GUe(new C37048GUe(this, 1), 2));
        this.A08 = AbstractC25225BEi.A0a(new C37048GUe(A00, 3), c37048GUe, new MHV(17, (Object) null, A00), AbstractC25225BEi.A1D(Jn8.class));
        C0YZ A1D = AbstractC25225BEi.A1D(C60852q9.class);
        this.A06 = AbstractC25225BEi.A0a(new C50162MDp(this, 49), new C37048GUe(this, 0), new MHV(16, (Object) null, this), A1D);
        this.A07 = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C60852q9) this.A06.getValue()).A00(new C45417K9e(i, i2, intent));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1916985078);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_update_profile_picture_page, false);
        C0f9.A09(-589992426, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-760018559);
        super.onResume();
        View view = this.mView;
        if (view != null) {
            view.requestLayout();
        }
        C0f9.A09(1228701076, A02);
    }

    public static final void A00(C44293Jhj c44293Jhj) {
        AbstractC25233BEq.A14(c44293Jhj);
    }
}
