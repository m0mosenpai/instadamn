package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import java.util.List;

/* loaded from: classes9.dex */
public final class N5M extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ClipsAdvancedSettingsFragment";
    public NJL A00;
    public ClipsAdvancedSettingsConfig A01;
    public final java.util.Set A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    private final void A00(View view) {
        view.setSaveEnabled(false);
        if (view instanceof ViewGroup) {
            C12500ku c12500ku = new C12500ku((ViewGroup) view);
            while (c12500ku.hasNext()) {
                A00(MSW.A0A(c12500ku));
            }
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "share_reels_advanced_settings";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C22C A0T = AbstractC43593JPy.A0T(this.A04);
        java.util.Set set = this.A02;
        C448824s c448824s = A0T.A0G;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448824s.A01, "ig_camera_ui_tool_impression");
        if (A0f.isSampled()) {
            MSW.A1N(C81X.A0B, A0f);
            MSW.A1V(A0f, "IG_CAMERA_CLIPS_ADVANCE_SETTINGS_LOAD");
            C22M c22m = c448824s.A04;
            AbstractC166987dD.A1S(A0f, MSX.A0f(c22m));
            MSW.A1Q(A0f);
            AbstractC167017dG.A1A(c22m.A09, A0f);
            MSZ.A1A(EnumC50631MWs.A0L, A0f);
            A0f.A8R(EnumC193318hB.A02, "capture_type");
            AbstractC167017dG.A1B(A0f);
            A0f.A7v("funded_content_available", false);
            A0f.AAk("share_sheet_entity_loaded", AbstractC166987dD.A1F(set));
            A0f.Cht();
        }
        A00(view);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public N5M() {
        C0YZ A1D = AbstractC25225BEi.A1D(C50882MeD.class);
        this.A03 = AbstractC25225BEi.A0a(C57522Pfw.A00(this, 4), C57522Pfw.A00(this, 5), MSW.A1G(this, null, 6), A1D);
        this.A02 = AbstractC31171DnF.A0l();
        this.A04 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle(AbstractC31176DnK.A05(this, interfaceC56362iU).getString(2131971152));
        interfaceC56362iU.EkT(new ViewOnClickListenerC55462OkH(this, 46), true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        int A02 = C0f9.A02(890653109);
        super.onActivityCreated(bundle);
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof BaseFragmentActivity) {
            ((IgFragmentActivity) requireActivity).registerOnActivityResultListener(new NAp(this, 0));
        }
        C0f9.A09(-1956812081, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1146295559);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
            C14360o3.A08(bundle2);
        }
        UserSession A0r = AbstractC166987dD.A0r(this.A04);
        String string = bundle2.getString("ClipsConstants.ARGS_WATERFALL_ID", AbstractC166997dE.A0n());
        C14360o3.A07(string);
        NJL njl = new NJL(bundle2, this, this, A0r, string);
        this.A00 = njl;
        njl.A06();
        setModuleNameV2("share_reels_advanced_settings");
        this.A01 = (ClipsAdvancedSettingsConfig) AbstractC153636vY.A00(bundle2, ClipsAdvancedSettingsConfig.class, "ClipsConstants.ARG_CLIPS_ADVANCED_SETTINGS");
        getParentFragmentManager().A0u(new C55552Olm(this, 1), this, "request_key_audience_restrictions");
        C0f9.A09(-684140192, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List<AbstractC53462Nkp> list;
        NJR njr;
        int A02 = C0f9.A02(-1248051715);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_clips_advanced_settings, false);
        ViewGroup A0C = AbstractC31176DnK.A0C(A0R, R.id.content_view);
        NJL njl = this.A00;
        if (njl != null) {
            AbstractC50867Mdy A05 = njl.A05();
            if ((A05 instanceof NJR) && (njr = (NJR) A05) != null) {
                list = njr.A0B.A06(PublishScreenCategoryType.A07, njr.A01);
            } else {
                list = C16930sl.A00;
            }
            for (AbstractC53462Nkp abstractC53462Nkp : list) {
                if (abstractC53462Nkp instanceof NJX) {
                    Integer num = ((NJX) abstractC53462Nkp).A00;
                    NJL njl2 = this.A00;
                    if (njl2 != null) {
                        InterfaceC58169PqZ A052 = njl2.A04().A05(new NJX(num));
                        A0C.addView(A052.ANR());
                        A052.Ctj();
                    }
                } else if (abstractC53462Nkp instanceof NJV) {
                    Integer num2 = ((NJV) abstractC53462Nkp).A00;
                    NJL njl3 = this.A00;
                    if (njl3 != null) {
                        InterfaceC58169PqZ A053 = njl3.A04().A05(new NJV(num2));
                        A0C.addView(A053.ANR());
                        A053.Ctj();
                        AbstractC43593JPy.A0T(this.A04).A15(EnumC114925Hg.CLIPS, A053.BIL());
                        EnumC53380NjV B2J = A053.B2J();
                        if (B2J != null) {
                            this.A02.add(B2J);
                        }
                    }
                } else {
                    continue;
                }
            }
            C0f9.A09(-1260951880, A02);
            return A0R;
        }
        MSW.A1K();
        throw C00O.createAndThrow();
    }
}
