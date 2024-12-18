package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.form.IgFormField;

/* loaded from: classes6.dex */
public final class EJH extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EditLinksEditUrlFragment";
    public C25671My A00;
    public IgFormField A01;
    public C34649FOh A02;
    public C6WQ A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "edit_links_edit_url_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (IgFormField) view.findViewById(R.id.link_action_edit_url_formfield);
        C6WQ A0i = AbstractC31174DnI.A0i(requireContext());
        this.A03 = A0i;
        AbstractC31176DnK.A13(requireContext(), A0i);
        C6WQ c6wq = this.A03;
        if (c6wq == null) {
            C14360o3.A0F("dialog");
            throw C00O.createAndThrow();
        }
        C0fJ.A00(c6wq);
        AbstractC35216Fg9.A02(AbstractC166987dD.A0r(this.A04), this, 20);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C35197Ffp A00 = C35197Ffp.A00(interfaceC56362iU);
        A00.A02 = getString(2131970208);
        C31722DwR.A01(ViewOnClickListenerC31723DwS.A00(this, 27), interfaceC56362iU, A00);
        AbstractC31180DnO.A17(ViewOnClickListenerC31723DwS.A00(this, 28), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(963053126);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0Q(this.A04);
        C0f9.A09(-1412670178, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(2017195613);
        C14360o3.A0B(layoutInflater, 0);
        View A07 = AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.layout_links_edit_link_fragment, false);
        C0f9.A09(1131433578, A02);
        return A07;
    }
}
