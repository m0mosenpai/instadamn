package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.R;
import java.util.ArrayList;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: X.Ka8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46053Ka8 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final byte[] A03 = {5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, PublicSuffixDatabase.EXCEPTION_MARKER, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74};
    public static final String __redex_internal_original_name = "IcdcDevOptionsFragment";
    public C42221xC A00;
    public final C41761wQ A01 = AbstractC31174DnI.A0S();
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31175DnJ.A1I(interfaceC56362iU, "ICDC Developer Options");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "msys_icdc_dev_options";
    }

    public static final void A00(C46053Ka8 c46053Ka8, String str, InterfaceC16660sJ interfaceC16660sJ) {
        int i;
        Resources resources;
        Context context = c46053Ka8.getContext();
        if (context != null && (resources = context.getResources()) != null) {
            i = AbstractC31171DnF.A02(resources, R.dimen.account_discovery_bottom_gap);
        } else {
            i = 0;
        }
        EditText editText = new EditText(c46053Ka8.getContext());
        editText.setHint("fbid");
        editText.setText(String.valueOf(AbstractC31176DnK.A0g(C17060sy.A01, c46053Ka8.A02).BTC()), TextView.BufferType.EDITABLE);
        editText.setPadding(i, i, i, i);
        C69797Vvh c69797Vvh = new C69797Vvh(c46053Ka8.requireContext());
        c69797Vvh.A08(str);
        c69797Vvh.A01.A0C = "Enter the contact ID (fbid):";
        c69797Vvh.A07(editText);
        c69797Vvh.A06(DialogInterfaceOnClickListenerC48016LMl.A00, "OK");
        c69797Vvh.A05(DialogInterfaceOnClickListenerC48017LMm.A00, "Cancel");
        c69797Vvh.A00();
        UD9 A00 = c69797Vvh.A00();
        C0fJ.A00(A00);
        ViewOnClickListenerC48068LPt.A00(A00.A00.A0F, editText, interfaceC16660sJ, A00, 24);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(841324167);
        super.onCreate(bundle);
        this.A00 = C1334460n.A01(AbstractC166987dD.A0r(this.A02), __redex_internal_original_name).A02;
        ArrayList A1E = AbstractC166987dD.A1E();
        GHY.A01(requireContext(), new ViewOnClickListenerC48062LPn(this, 45), "Inject an ICDC additional device to a user account", A1E);
        GHY.A01(requireContext(), new ViewOnClickListenerC48062LPn(this, 46), "Clear ICDC additional devices in a user account", A1E);
        GHY.A01(requireContext(), new ViewOnClickListenerC48062LPn(this, 47), "Clear ICDC failure data from a user account", A1E);
        GHY.A01(requireContext(), new ViewOnClickListenerC48062LPn(this, 48), "Remove ICDC metadata from a user account", A1E);
        GHY.A01(requireContext(), new ViewOnClickListenerC48062LPn(this, 49), "Increase ICDC metadata sequence for a user account", A1E);
        GHY.A01(requireContext(), new ViewOnClickListenerC48062LPn(this, 50), "Decrease ICDC metadata sequence for a user account", A1E);
        setItems(A1E);
        C0f9.A09(1099856073, A02);
    }
}
