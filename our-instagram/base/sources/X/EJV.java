package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.TrackOrOriginalSoundSchema;
import com.instagram.igds.components.banner.IgdsBanner;
import java.io.Serializable;

/* loaded from: classes6.dex */
public final class EJV extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TrendFragment";
    public EnumC39549HdL A00;
    public TrackOrOriginalSoundSchema A01;
    public IgdsBanner A02;
    public final InterfaceC09390do A03 = C1XM.A00(new C57239PbN(this, 15));
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        ((C56352iT) this.A03.getValue()).Efu(2131975732);
        interfaceC56362iU.EkS(true);
        C35026Fbz c35026Fbz = new C35026Fbz(C05F.A00);
        c35026Fbz.A0A = ViewOnClickListenerC35682FpH.A00(this, 10);
        c35026Fbz.A01();
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A02(C05F.A0Y);
        AbstractC31176DnK.A1B(ViewOnClickListenerC35682FpH.A00(this, 11), A0B, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "trend_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (IgdsBanner) view.requireViewById(R.id.trend_header_banner);
        C23031Ai A0l = AbstractC25230BEn.A0l(this.A04);
        if (!AbstractC167017dG.A1b(A0l, A0l.A5O, C23031Ai.A8c, 432)) {
            IgdsBanner igdsBanner = this.A02;
            if (igdsBanner != null) {
                igdsBanner.setIconBackground(null);
            }
            IgdsBanner igdsBanner2 = this.A02;
            if (igdsBanner2 != null) {
                G81.A00(igdsBanner2, A0l, 13);
                igdsBanner2.setVisibility(0);
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC39549HdL enumC39549HdL;
        int A02 = C0f9.A02(696496360);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String A00 = AbstractC43591JPw.A00(53);
        Serializable serializable = requireArguments.getSerializable(A00);
        if (serializable instanceof EnumC39549HdL) {
            enumC39549HdL = (EnumC39549HdL) serializable;
        } else {
            enumC39549HdL = null;
        }
        this.A00 = enumC39549HdL;
        Bundle requireArguments2 = requireArguments();
        String A002 = AbstractC43591JPw.A00(783);
        this.A01 = (TrackOrOriginalSoundSchema) requireArguments2.getParcelable(A002);
        C8BO c8bo = C8BO.A08;
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("referrer_audio_id", null);
        A0b.putSerializable(AbstractC43591JPw.A00(41), c8bo);
        InterfaceC09390do interfaceC09390do = this.A04;
        AbstractC31173DnH.A1C(A0b, AbstractC166987dD.A0r(interfaceC09390do));
        A0b.putParcelable(A002, this.A01);
        A0b.putSerializable(A00, this.A00);
        A0b.putBoolean(AbstractC43591JPw.A00(1327), C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(interfaceC09390do), 36328302268726723L));
        interfaceC09390do.getValue();
        C45507KCw c45507KCw = new C45507KCw();
        c45507KCw.setArguments(A0b);
        C14240no c14240no = new C14240no(getChildFragmentManager());
        c14240no.A0A(c45507KCw, R.id.trending_audio_container);
        c14240no.A00();
        C0f9.A09(93954763, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-954207376);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.fragment_trend, false);
        C0f9.A09(-929439897, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1590217772);
        super.onDestroy();
        C0f9.A09(-1442679272, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1401791764);
        super.onDestroyView();
        this.A02 = null;
        C0f9.A09(813425901, A02);
    }
}
