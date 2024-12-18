package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.instagram.login.twofac.model.TrustedDevice;
import com.instagram.maps.ui.IgStaticMapView;

/* renamed from: X.EHp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32231EHp extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "TwoFacTrustedDevicesBottomSheetFragment";
    public TrustedDevice A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "trusted_devices";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2057698876);
        super.onCreate(bundle);
        TrustedDevice trustedDevice = (TrustedDevice) requireArguments().getParcelable("trusted_device");
        TrustedDevice trustedDevice2 = trustedDevice;
        if (trustedDevice == null) {
            trustedDevice2 = new Object();
        }
        this.A00 = trustedDevice2;
        C0f9.A09(-10659869, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String A03;
        int A02 = C0f9.A02(1615699175);
        C14360o3.A0B(layoutInflater, 0);
        View A0C = AbstractC31173DnH.A0C(layoutInflater, viewGroup, R.layout.two_fac_trusted_devices_map_bottom_sheet, false);
        IgStaticMapView igStaticMapView = (IgStaticMapView) A0C.requireViewById(R.id.trusted_device_map_view);
        igStaticMapView.setEnabled(true);
        igStaticMapView.A07 = VGB.TOP_LEFT;
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = new StaticMapView$StaticMapOptions("review_suspicious_login_map");
        TrustedDevice trustedDevice = this.A00;
        if (trustedDevice != null) {
            staticMapView$StaticMapOptions.A02(trustedDevice.A00, trustedDevice.A01);
            TrustedDevice trustedDevice2 = this.A00;
            if (trustedDevice2 != null) {
                staticMapView$StaticMapOptions.A01(trustedDevice2.A00 + 0.0275d, trustedDevice2.A01);
                staticMapView$StaticMapOptions.A03(11);
                igStaticMapView.setMapOptions(staticMapView$StaticMapOptions);
                TextView A0T = AbstractC166997dE.A0T(A0C, R.id.trusted_device_map_platform);
                TrustedDevice trustedDevice3 = this.A00;
                if (trustedDevice3 != null) {
                    A0T.setText(trustedDevice3.A05);
                    TextView A0N = AbstractC167007dF.A0N(A0C, R.id.trusted_device_map_time);
                    TrustedDevice trustedDevice4 = this.A00;
                    if (trustedDevice4 != null) {
                        if (trustedDevice4.A09) {
                            AbstractC166987dD.A1O(requireContext(), A0N, AbstractC53242c7.A0H(A0C.getContext(), R.attr.igds_color_success));
                        }
                        TrustedDevice trustedDevice5 = this.A00;
                        if (trustedDevice5 != null) {
                            if (trustedDevice5.A09) {
                                A03 = AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131975995);
                            } else {
                                Context requireContext = requireContext();
                                if (this.A00 != null) {
                                    A03 = C23831Eq.A03(requireContext, r0.A02);
                                }
                            }
                            A0N.setText(A03);
                            String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(this), 2131961132);
                            TrustedDevice trustedDevice6 = this.A00;
                            if (trustedDevice6 != null) {
                                AbstractC31176DnK.A1F(A0C, AnonymousClass001.A0R(A0q, trustedDevice6.A07), R.id.trusted_device_map_location);
                                ViewOnClickListenerC35667Fp2.A00(A0C.requireViewById(R.id.trusted_device_map_remove_button), 6, this);
                                C0f9.A09(841007472, A02);
                                return A0C;
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F("trustedDevice");
        throw C00O.createAndThrow();
    }
}
