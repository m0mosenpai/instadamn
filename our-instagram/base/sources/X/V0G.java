package X;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* loaded from: classes11.dex */
public final class V0G extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "PromoteNuxFragment";
    public VG4 A00;
    public ReboundViewPager A01;
    public CirclePageIndicator A02;
    public boolean A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new X2v(this, 10));
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new X2v(this, 11));
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new X2v(this, 13));
    public final InterfaceC09390do A08 = AbstractC09440dt.A01(new X2v(this, 14));
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new X2v(this, 12));

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkG(false);
        AbstractC31176DnK.A1C(new WNT(this, 63), AbstractC31176DnK.A0I(), interfaceC56362iU);
        interfaceC56362iU.EPD(new ColorDrawable(AbstractC167007dF.A09(requireContext(), R.attr.igds_color_primary_background)));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "promote_native_nux";
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0038. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Type inference failed for: r1v38, types: [com.instagram.ui.slidecardpageadapter.SlideCardViewModel, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V0G.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) AbstractC166987dD.A17(this.A08);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        VG4 vg4;
        int A02 = C0f9.A02(503125305);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("is_enter_flow_nux");
        } else {
            z = false;
        }
        this.A03 = z;
        int ordinal = ((VG4) this.A04.getValue()).ordinal();
        if (ordinal != 10) {
            if (ordinal != 11) {
                if (ordinal != 15) {
                    if (ordinal == 45) {
                        vg4 = VG4.A1C;
                    }
                    super.onCreate(bundle);
                    C0f9.A09(-1679758556, A02);
                }
                vg4 = VG4.A0i;
            } else {
                vg4 = VG4.A0h;
            }
        } else if (this.A03 && ((PromoteData) AbstractC166987dD.A17(this.A05)).A2D) {
            vg4 = VG4.A16;
        } else {
            vg4 = VG4.A0j;
        }
        this.A00 = vg4;
        super.onCreate(bundle);
        C0f9.A09(-1679758556, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1479235887);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_nux_view, viewGroup, false);
        C0f9.A09(1856206976, A02);
        return inflate;
    }
}
