package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import java.util.Map;

/* renamed from: X.Brz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26778Brz extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "MemuSettingsFragment";
    public C8k A00;
    public String A01;
    public final String A02;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final String A03 = AbstractC25231BEo.A0p();
    public final InterfaceC09390do A05 = C1XM.A00(new DGV(this, 40));
    public final InterfaceC09390do A06 = C1XM.A00(new DGV(this, 41));
    public final InterfaceC09390do A09 = AbstractC25225BEi.A0a(new DGV(this, 45), new DGV(this, 46), new DH0(38, null, this), AbstractC25225BEi.A1D(C25866BcL.class));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131966245);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C28176CbO c28176CbO = (C28176CbO) this.A07.getValue();
        String str = this.A03;
        C14360o3.A0B(str, 0);
        C28176CbO.A00(C8o.A0Q, c28176CbO, str);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 47), C07Y.A00(viewLifecycleOwner));
    }

    public static final void A01(C26778Brz c26778Brz, Integer num) {
        Map map;
        C27959CUd c27959CUd = new C27959CUd(c26778Brz.requireActivity(), AbstractC166987dD.A0r(c26778Brz.A08));
        C8k c8k = c26778Brz.A00;
        if (c8k == null) {
            c8k = C8k.SETTINGS;
        }
        String str = c26778Brz.A03;
        String str2 = c26778Brz.A01;
        if (str2 != null) {
            map = AbstractC167007dF.A0n("ig_mifu_ifysession_id", str2);
        } else {
            map = null;
        }
        c27959CUd.A01(new CWL(c8k, null, num, str, null, null, null, map, false, false, false), new C29512CzQ(c26778Brz, 2));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A08);
    }

    public C26778Brz() {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A07 = AbstractC09440dt.A00(enumC09460dv, new DGV(this, 42));
        this.A08 = AbstractC60492pY.A02(this);
        this.A02 = "gen_ai_memu_settings";
        this.A04 = AbstractC09440dt.A00(enumC09460dv, new DGV(this, 39));
    }

    public static final void A00(DialogInterface.OnClickListener onClickListener, C26778Brz c26778Brz, int i, int i2, int i3) {
        C193328hC c193328hC = new C193328hC((Activity) c26778Brz.requireActivity());
        c193328hC.A0A(i);
        c193328hC.A09(i2);
        c193328hC.A0M(onClickListener, i3);
        c193328hC.A0D(DialogInterfaceOnClickListenerC28547Cif.A00);
        c193328hC.A0h(new DialogInterfaceOnShowListenerC55325Ogn(c26778Brz, 1));
        AbstractC166987dD.A1W(c193328hC);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Long l;
        String string;
        int A02 = C0f9.A02(509646177);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A09;
        C25866BcL A0x = AbstractC25226BEj.A0x(interfaceC09390do);
        C8k c8k = null;
        AbstractC25231BEo.A1H(A0x, AbstractC141776au.A00(A0x), 44);
        C25866BcL A0x2 = AbstractC25226BEj.A0x(interfaceC09390do);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            l = Long.valueOf(bundle2.getLong("arg_mifu_content_id", -1L));
        } else {
            l = null;
        }
        A0x2.A01 = l;
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null && (string = bundle3.getString("arg_entry_point")) != null) {
            c8k = C8k.MEMU_IN_FEED_THREE_DOT_MENU;
            if (!string.equals(c8k.toString())) {
                c8k = C8k.SETTINGS;
            }
        }
        this.A00 = c8k;
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str = bundle4.getString("arg_mifu_session_id");
        }
        this.A01 = str;
        C25866BcL A0x3 = AbstractC25226BEj.A0x(interfaceC09390do);
        C28176CbO c28176CbO = (C28176CbO) this.A07.getValue();
        C14360o3.A0B(c28176CbO, 0);
        A0x3.A00 = c28176CbO;
        C0f9.A09(-1538828436, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-561014028);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30481DbQ.A00(this, 10), 1593098541);
        C0f9.A09(-940458047, A02);
        return A00;
    }
}
