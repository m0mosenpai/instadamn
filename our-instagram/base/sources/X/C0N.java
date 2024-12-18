package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.opal.impl.data.OpalProfileData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class C0N extends AbstractC26782Bs6 implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "OpalEditFragment";
    public CSY A00;
    public boolean A01;
    public final InterfaceC09390do A02;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.AbstractC26782Bs6, X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        ?? obj = new Object();
        obj.A02 = getString(2131969039);
        obj.A01 = ViewOnClickListenerC28666ClE.A00(this, 11);
        interfaceC56362iU.Ehj(new C31722DwR(obj));
        ViewOnClickListenerC28666ClE.A02(interfaceC56362iU, this, 12);
        super.configureActionBar(interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "opal_edit_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        CSY csy = this.A00;
        if (csy != null) {
            csy.A00.onSaveInstanceState(bundle);
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        CSY csy = new CSY(requireContext(), AbstractC166987dD.A0r(super.A00), new C29336CwV(this));
        this.A00 = csy;
        csy.A00.Dgs(bundle);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57165PZj(c07s, this, viewLifecycleOwner, null, 4), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC26782Bs6
    public final void A08(boolean z) {
        C56352iT.A0t.A03(requireActivity()).A0Z(z);
        super.A08(z);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(super.A00);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        List list;
        Object value;
        C51760Mtj c51760Mtj;
        Parcelable[] parcelableArrayExtra;
        super.onActivityResult(i, i2, intent);
        CSY csy = this.A00;
        if (csy != null) {
            csy.A00.onActivityResult(i, i2, intent);
        }
        if (i == 68682 && i2 == -1) {
            if (intent != null) {
                i3 = intent.getIntExtra(MSV.A00(955), 0);
            } else {
                i3 = 0;
            }
            OpalProfileData opalProfileData = null;
            if (intent != null && (parcelableArrayExtra = intent.getParcelableArrayExtra(MSV.A00(956))) != null) {
                ArrayList A17 = AbstractC25225BEi.A17(parcelableArrayExtra.length);
                for (Parcelable parcelable : parcelableArrayExtra) {
                    C14360o3.A0C(parcelable, MSV.A00(1446));
                    A17.add(parcelable);
                }
                list = AbstractC001800i.A0a(A17);
            } else {
                list = C16930sl.A00;
            }
            InterfaceC09390do interfaceC09390do = this.A02;
            C05A c05a = ((C50922Mer) interfaceC09390do.getValue()).A04;
            do {
                value = c05a.getValue();
                c51760Mtj = (C51760Mtj) value;
            } while (!AbstractC25236BEt.A0z(c51760Mtj, OpalProfileData.A00((OpalProfileData) c51760Mtj.A01, null, null, null, null, null, null, list, i3, 5119, false, false), value, c05a));
            Intent intent2 = new Intent();
            OpalProfileData opalProfileData2 = (OpalProfileData) ((C51760Mtj) ((C50922Mer) interfaceC09390do.getValue()).A05.getValue()).A02;
            if (opalProfileData2 != null) {
                opalProfileData = OpalProfileData.A00(opalProfileData2, null, null, null, null, null, null, list, i3, 5119, false, false);
            }
            intent2.putExtra(MSV.A00(958), opalProfileData);
            requireActivity().setResult(-1, intent2);
        }
    }

    public C0N() {
        DH3 dh3 = new DH3(this, 16);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new DH3(new DH3(this, 13), 14));
        this.A02 = AbstractC25225BEi.A0a(new DH3(A00, 15), dh3, new C57255Pbd(16, null, A00), AbstractC25225BEi.A1D(C50922Mer.class));
    }

    @Override // X.AbstractC26782Bs6, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        int A02 = C0f9.A02(-1803083563);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            parcelable = bundle2.getParcelable("argument_opal_data");
        } else {
            parcelable = null;
        }
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = super.A00;
        this.A01 = c08730cb.A01(AbstractC166987dD.A0r(interfaceC09390do)).A2C();
        if (parcelable != null) {
            AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A02);
            AbstractC166987dD.A1Z(new PZU(A0Z, parcelable, (InterfaceC23621Ds) null, 25), AbstractC141776au.A00(A0Z));
        }
        AbstractC34277F9x.A00(this, AbstractC166987dD.A0r(interfaceC09390do), "surface_appear", "empty", "edit_opal", AbstractC166987dD.A0r(interfaceC09390do).userId, null);
        C0f9.A09(-1493488642, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1403967552);
        ComposeView A022 = AbstractC25319BIo.A02(this, C5UA.A04(new C30496Dbf(this, 43), 500154201, true), true, false);
        C0f9.A09(336136630, A02);
        return A022;
    }

    @Override // X.AbstractC26782Bs6, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1699070737);
        super.onDestroy();
        InterfaceC09390do interfaceC09390do = super.A00;
        AbstractC34277F9x.A00(this, AbstractC166987dD.A0r(interfaceC09390do), "surface_disappear", "empty", "edit_opal", AbstractC166987dD.A0r(interfaceC09390do).userId, null);
        C0f9.A09(137355135, A02);
    }
}
