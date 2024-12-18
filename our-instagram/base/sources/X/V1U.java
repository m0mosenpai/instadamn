package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;

/* loaded from: classes11.dex */
public final class V1U extends C38K implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EventInfoFragment";
    public C67912V2c A00;
    public AnalyticsEventDebugInfo A01;
    public AbstractC18680vv A02;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.setTitle(this.A01.A00);
        C50674MYs c50674MYs = new C50674MYs(requireContext(), this.A02);
        c50674MYs.A07("OPTIONS");
        c50674MYs.A0B("STRING", new WNN(this, 55));
        if (this.A01.A02 == 1) {
            c50674MYs.A0B("RELOG", new WNN(this, 56));
        }
        interfaceC56362iU.AAE("OPTIONS", new WNV(30, this, c50674MYs));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC43591JPw.A00(359);
    }

    @Override // X.C38K
    public final /* bridge */ /* synthetic */ AbstractC12990ll A0X() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-217904689);
        super.onCreate(bundle);
        this.A02 = (AbstractC18680vv) AbstractC60492pY.A01(this).getValue();
        Parcelable parcelable = requireArguments().getParcelable("EventInfoFragment.EventInfo");
        parcelable.getClass();
        this.A01 = (AnalyticsEventDebugInfo) parcelable;
        C67912V2c c67912V2c = new C67912V2c(requireContext(), this, this.A01);
        this.A00 = c67912V2c;
        A0U(c67912V2c);
        C0f9.A09(-962207084, A02);
    }
}
