package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.google.gson.Gson;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.HashMap;

/* renamed from: X.EKm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32299EKm extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CollabStatusFragment";
    public String A00 = "edit_profile";
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131956337);
        ViewOnClickListenerC35690FpP.A02(AbstractC31174DnI.A0K(), interfaceC56362iU, this, 5);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "collab_status_fragment";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        HashMap A1G = AbstractC166987dD.A1G();
        AbstractC31171DnF.A1T(this.A00, A1G);
        String A0B = new Gson().A0B(A1G);
        C14360o3.A07(A0B);
        InterfaceC09390do interfaceC09390do = this.A01;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0O(AbstractC166987dD.A0o(interfaceC09390do), "collab_status_fragment"), "ig_creator_connections_events");
        AbstractC31171DnF.A1B(A0f, "impression");
        A0f.A8R(EnumC33488ErN.EDIT_OPEN_TO_COLLAB_SETTINGS, "screen");
        A0f.AAP("target", "edit_settings");
        A0f.A8R(AbstractC100604fP.A00(AbstractC166987dD.A0r(interfaceC09390do)), "project");
        A0f.AAP("extra", A0B);
        A0f.Cht();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1882118530);
        super.onCreate(bundle);
        String string = requireArguments().getString(MSV.A00(177));
        if (string == null) {
            string = "edit_profile";
        }
        this.A00 = string;
        C0f9.A09(-1618582132, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-899010357);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.collab_status_fragment, viewGroup, false);
        IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0R(inflate, R.id.collab_status_switch_cell);
        igdsListCell.A0G(EnumC53237Nga.A08, false);
        igdsListCell.setEnabled(true);
        InterfaceC09390do interfaceC09390do = this.A01;
        C1ON A00 = AbstractC33655Eu5.A00(AbstractC25228BEl.A0q(AbstractC25230BEn.A0k(interfaceC09390do, 0)));
        C31456Ds0.A00(A00, igdsListCell, this, 4);
        schedule(A00);
        G9H.A00(igdsListCell, this, 2);
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.collab_status_subtext);
        int i = 2131956334;
        if (C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36318896290077447L)) {
            i = 2131956335;
        }
        A0N.setText(i);
        C0f9.A09(-277923977, A02);
        return inflate;
    }
}
