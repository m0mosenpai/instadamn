package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import java.io.Serializable;

/* renamed from: X.Ejn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33144Ejn extends ELn {
    public static final String __redex_internal_original_name = "PrivateStoryOnYourListAudiencePickerFragment";
    public C34407FEx A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35679FpE.A00(this, 24), AbstractC31179DnN.A0B(interfaceC56362iU, getString(2131956264)), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "close_friends_on_your_list";
    }

    @Override // X.ELn, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        AbstractC166997dE.A0S(view, R.id.audience_picker_disclaimer_text).setVisibility(8);
        String A0p = AbstractC166997dE.A0p(requireContext, 2131956264);
        String A0p2 = AbstractC166997dE.A0p(requireContext, 2131969957);
        A0A().A00 = new C34624FNh(requireContext, A0p, A0p2, R.drawable.instagram_star_outline_96, false);
        ELn.A02(A0B(), AbstractC31176DnK.A0g(C17060sy.A01, this.A01));
        A0E();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // X.ELn
    public final void A0D(IgdsCheckBox igdsCheckBox, C32069E6v c32069E6v) {
        Integer num;
        AbstractC167017dG.A1N(c32069E6v, igdsCheckBox);
        C34407FEx c34407FEx = this.A00;
        if (c34407FEx == null) {
            C14360o3.A0F("waterfall");
            throw C00O.createAndThrow();
        }
        EnumC33409Epg enumC33409Epg = c34407FEx.A00;
        if (enumC33409Epg != null) {
            boolean z = !igdsCheckBox.isChecked();
            igdsCheckBox.setChecked(z);
            boolean z2 = A0B().A01;
            C35167FfI c35167FfI = this.A03;
            if (z2) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            c35167FfI.A05(c32069E6v, num, z, z2);
            A0A().A04(AbstractC31173DnH.A0L(c35167FfI.A03), C16930sl.A00);
            C35167FfI.A01(this, c35167FfI);
            UserSession A0r = AbstractC166987dD.A0r(this.A01);
            String str = enumC33409Epg.A00;
            C14360o3.A07(str);
            FTd.A01(A0r, "close_friends_on_your_list", str, c32069E6v.A02.getId(), z);
        }
    }

    public final void A0E() {
        A0A().A03(requireContext(), null, EnumC153216up.A06);
        C32548EUy.A00(requireContext(), AbstractC018607g.A00(this), FTd.A00(AbstractC166987dD.A0r(this.A01), null, null, false, false), this, 42);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AbstractC31174DnI.A0I(this).A0b();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.FEx] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC33409Epg enumC33409Epg;
        int A02 = C0f9.A02(-192327783);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = new Object();
        Serializable serializable = requireArguments.getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (serializable instanceof EnumC33409Epg) {
            enumC33409Epg = (EnumC33409Epg) serializable;
        } else {
            enumC33409Epg = null;
        }
        C34407FEx c34407FEx = this.A00;
        if (c34407FEx == null) {
            C14360o3.A0F("waterfall");
            throw C00O.createAndThrow();
        }
        if (enumC33409Epg == null) {
            enumC33409Epg = EnumC33409Epg.UNKNOWN;
        }
        c34407FEx.A00 = enumC33409Epg;
        C0f9.A09(223935086, A02);
    }

    @Override // X.ELn, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1497380709);
        ELn.A01(this, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.layout_audience_picker, viewGroup, false);
        C0f9.A09(1625095233, A02);
        return inflate;
    }
}
