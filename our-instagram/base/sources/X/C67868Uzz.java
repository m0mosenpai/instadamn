package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.maps.ui.IgStaticMapView;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import java.util.List;

/* renamed from: X.Uzz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67868Uzz extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceLocationsLocalFragmentV2";
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public C70399WUb A04;
    public IgSimpleImageView A05;
    public IgSimpleImageView A06;
    public IgdsSwitch A07;
    public IgStaticMapView A08;
    public final InterfaceC09390do A0D = new C60842q8(new X55(this, 36), new X55(this, 37), new C57253Pbb(29, null, this), new C0YZ(UFT.class));
    public final View.OnClickListener A0A = new WNT(this, 39);
    public final View.OnClickListener A09 = new WNT(this, 38);
    public final XAB A0B = new WeT(this);
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_create_audience_locations_local";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A08 = (IgStaticMapView) view.requireViewById(R.id.map_view);
        IgdsSwitch igdsSwitch = (IgdsSwitch) view.requireViewById(R.id.switch_button);
        this.A07 = igdsSwitch;
        if (igdsSwitch == null) {
            str = "useCurrentLocationSwitch";
        } else {
            igdsSwitch.A07 = new C70950Wkw(this, 6);
            View requireViewById = view.requireViewById(R.id.custom_address_entry);
            this.A00 = requireViewById;
            if (requireViewById == null) {
                str = "customAddressEntry";
            } else {
                C0fQ.A00(this.A0A, requireViewById);
                this.A03 = (TextView) view.requireViewById(R.id.custom_address_title);
                this.A01 = (TextView) view.requireViewById(R.id.custom_address);
                this.A02 = (TextView) view.requireViewById(R.id.custom_address_edit_button);
                this.A05 = (IgSimpleImageView) view.requireViewById(R.id.custom_address_chevron_icon);
                IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.requireViewById(R.id.custom_address_cross_icon);
                this.A06 = igSimpleImageView;
                if (igSimpleImageView == null) {
                    str = "customAddressCrossIcon";
                } else {
                    C0fQ.A00(this.A09, igSimpleImageView);
                    int A07 = AbstractC13880nE.A07(requireContext());
                    int round = Math.round(A07 / 1.5f);
                    IgStaticMapView igStaticMapView = this.A08;
                    if (igStaticMapView == null) {
                        str = "mapView";
                    } else {
                        AbstractC43592JPx.A1H(igStaticMapView, A07, round);
                        Context A0L = AbstractC166997dE.A0L(view);
                        C69341Vln c69341Vln = new C69341Vln(view, "radius_slider");
                        List A03 = WG3.A03(requireContext());
                        int i = ((UFT) this.A0D.getValue()).A06().A01;
                        C68721Vax c68721Vax = new C68721Vax(this);
                        IgEditSeekBar igEditSeekBar = c69341Vln.A03;
                        igEditSeekBar.setActiveColor(AbstractC167007dF.A09(A0L, R.attr.igds_color_controls));
                        igEditSeekBar.setShouldOverrideVisualValue(true);
                        igEditSeekBar.setOverrideVisualValueList(A03);
                        igEditSeekBar.setCurrentValue(WG3.A02.indexOf(Integer.valueOf(i)));
                        igEditSeekBar.setOnSliderChangeListener(new C56782PHz(c68721Vax, 0));
                        AbstractC23641Du.A05(AnonymousClass191.A00, new MBT(this, null, 9), AbstractC25229BEm.A0a(this));
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0C.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-705043533);
        super.onCreate(bundle);
        this.A04 = AbstractC43594JPz.A0N(this.A0C);
        C0f9.A09(-1394587323, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1563700551);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_locations_local_view, viewGroup, false);
        C0f9.A09(-1581145658, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1601089790);
        super.onDestroyView();
        C0f9.A09(-2135580422, A02);
    }
}
