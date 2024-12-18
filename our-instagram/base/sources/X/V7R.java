package X;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes11.dex */
public final class V7R extends V07 {
    public static final String __redex_internal_original_name = "DirectPinnedLocationMapFragment";
    public final AnonymousClass987 A04 = new AnonymousClass987();
    public final InterfaceC09390do A00 = C1XM.A00(new C37014GSt(this, 15));
    public final InterfaceC09390do A01 = C1XM.A00(new C37014GSt(this, 16));
    public final InterfaceC09390do A02 = C1XM.A00(new C37014GSt(this, 17));
    public final InterfaceC09390do A03 = C1XM.A00(new C37014GSt(this, 18));

    @Override // X.V07
    public final void A05(C69271Vkf c69271Vkf) {
        super.A05(c69271Vkf);
        Number number = (Number) this.A00.getValue();
        Number number2 = (Number) this.A01.getValue();
        if (number != null && number2 != null) {
            double doubleValue = number.doubleValue();
            double doubleValue2 = number2.doubleValue();
            A04(doubleValue, doubleValue2);
            V07.A00(requireContext().getDrawable(R.drawable.direct_location_sharing_map_pin), null, this, doubleValue, doubleValue2);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.V07, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        TextView textView2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0S = AbstractC166997dE.A0S(view, R.id.center_location_button);
        TFA tfa = super.A01;
        if (tfa != null) {
            if (tfa.A00(__redex_internal_original_name) != null) {
                A0S.setVisibility(0);
                WNO.A00(A0S, 53, this);
            }
            WNO.A00(view.requireViewById(R.id.back_button), 54, this);
            ViewStub A0M = AbstractC167007dF.A0M(view, R.id.pinned_location_bottomsheet_stub);
            if (A0M.getParent() != null) {
                View findViewById = A0M.inflate().findViewById(R.id.pinned_location_bottomsheet);
                BottomSheetBehavior A01 = BottomSheetBehavior.A01(findViewById);
                C14360o3.A07(A01);
                A01.A0W(3);
                A01.A0N = false;
                InterfaceC09390do interfaceC09390do = this.A02;
                if (interfaceC09390do.getValue() != null && (textView2 = (TextView) findViewById.findViewById(R.id.pinned_location_address)) != null) {
                    textView2.setText((String) interfaceC09390do.getValue());
                    textView2.setVisibility(0);
                }
                TFA tfa2 = super.A01;
                if (tfa2 != null) {
                    Location A00 = tfa2.A00(__redex_internal_original_name);
                    Number number = (Number) this.A00.getValue();
                    Number number2 = (Number) this.A01.getValue();
                    if (A00 != null && number != null && number2 != null && (textView = (TextView) findViewById.findViewById(R.id.pinned_location_distance)) != null) {
                        Context requireContext = requireContext();
                        String A012 = WFD.A01(requireContext, A00.getLatitude(), A00.getLongitude(), number.doubleValue(), number2.doubleValue());
                        C14360o3.A07(A012);
                        textView.setText(AbstractC31177DnL.A0b(requireContext, A012, 2131959793));
                        textView.setVisibility(0);
                    }
                    String str = (String) this.A03.getValue();
                    if (str != null) {
                        Intent intent = new Intent("android.intent.action.VIEW", AbstractC08820cl.A03(str));
                        View findViewById2 = findViewById.findViewById(R.id.get_directions_button);
                        if (findViewById2 != null) {
                            WNP.A00(findViewById2, 23, intent, this);
                            findViewById2.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        C14360o3.A0F("locationManager");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1652778763);
        C14360o3.A0B(layoutInflater, 0);
        this.A04.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_location_sharing_xma, viewGroup, false);
        C0f9.A09(-2100255025, A02);
        return inflate;
    }
}
