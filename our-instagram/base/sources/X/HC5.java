package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.facebook.R;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public final class HC5 extends AbstractC59962oe implements InterfaceC60122ou, JG0 {
    public static final String __redex_internal_original_name = "IgMediaDebugFragment";
    public String A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131966071);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "media_debug";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        String obj;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("media_id", "");
        String str = "Unknown";
        String string2 = requireArguments.getString(AbstractC58358Pty.A00(), "Unknown");
        InterfaceC09390do interfaceC09390do = this.A01;
        C38321qM A0F = AbstractC37304Gc5.A0F(string, interfaceC09390do);
        if (A0F != null) {
            boolean A03 = C28071Xl.A00(requireContext(), AbstractC166987dD.A0r(interfaceC09390do)).A03(string);
            int i = requireArguments.getInt("position", -1);
            User A2E = A0F.A2E(AbstractC166987dD.A0r(interfaceC09390do));
            if (A2E != null) {
                IEW iew = new IEW("Handle", A2E.getUsername());
                C14360o3.A0A(string2);
                IEW iew2 = new IEW("MainSession Id", string2);
                String str2 = A0F.A0R;
                if (str2 != null) {
                    str = str2;
                }
                IEW iew3 = new IEW("Request Id", str);
                String id = A0F.getId();
                if (id != null) {
                    IEW iew4 = new IEW("Media Id", id);
                    IEW iew5 = new IEW("Delivery Method", AbstractC77343dK.A01(A0F.A0e));
                    IEW iew6 = new IEW("Position", String.valueOf(i));
                    long currentTimeMillis = System.currentTimeMillis();
                    Long BLz = A0F.A0C.BLz();
                    if (BLz != null) {
                        j = BLz.longValue();
                    } else {
                        j = -1;
                    }
                    IEW iew7 = new IEW("Time Since Last Synced (MS)", String.valueOf(currentTimeMillis - j));
                    IEW iew8 = new IEW("Was Seen Previously", String.valueOf(A03));
                    C1EN c1en = A0F.A0D;
                    if (c1en != null) {
                        obj = String.valueOf(c1en);
                    } else {
                        obj = C1EN.A0G.toString();
                    }
                    List<IEW> A1Q = AbstractC16960so.A1Q(iew, iew2, iew3, iew4, iew5, iew6, iew7, iew8, new IEW("Reason", obj));
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    for (IEW iew9 : A1Q) {
                        A1C.append(iew9.A00);
                        A1C.append(": ");
                        A1C.append(iew9.A01);
                        A1C.append('\n');
                        A1C.append('\n');
                    }
                    this.A00 = A1C.toString();
                    AbsListView absListView = (AbsListView) view.findViewById(R.id.debug_ad_view);
                    HEA hea = new HEA(this, A1Q);
                    if (absListView != null) {
                        absListView.setAdapter((ListAdapter) hea);
                        return;
                    }
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.JG0
    public final void Dkp() {
        AbstractC13900nG.A00(requireContext(), this.A00);
        C9GR.A09(getContext(), getString(2131956831));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1314716815);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_sponsored_debug, false);
        C0f9.A09(-477737350, A02);
        return A0R;
    }
}
