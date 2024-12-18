package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.ENh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32360ENh extends C53Z {
    public static final String __redex_internal_original_name = "DirectIceBreakerNullStateFragment";
    public C34675FPk A00;
    public EnumC33321EoG A01;
    public C34923Fa9 A02;
    public String A03;
    public boolean A04;
    public Context A05;
    public View A06;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "direct_icebreaker_null_state_fragment";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1090830933);
        super.onCreate(bundle);
        this.A05 = requireContext();
        this.A03 = requireArguments().getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "business_settings");
        this.A04 = AbstractC31172DnG.A1X(requireArguments(), "show_set_up_preference");
        this.A02 = new C34923Fa9(this, getSession());
        this.A00 = new C34675FPk(getSession(), requireActivity());
        C0f9.A09(-1784011814, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1685968590);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_icebreaker_null_state, viewGroup, false);
        this.A06 = inflate;
        String str = this.A03;
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(inflate, R.id.null_state_headline);
        int i = 2131959389;
        if (this.A04) {
            i = 2131959390;
        }
        A0Q.setBody(i);
        int i2 = 2131959393;
        if (str.equals("inbox_qp_creation_flow")) {
            i2 = 2131959394;
        }
        A0Q.setHeadline(i2);
        View view = this.A06;
        Context context = this.A05;
        String str2 = this.A03;
        C64P c64p = (C64P) view.requireViewById(R.id.null_state_bottom_button);
        int i3 = 2131959386;
        if (str2.equals("inbox_qp_creation_flow")) {
            i3 = 2131959387;
        }
        c64p.setPrimaryActionText(context.getString(i3));
        c64p.setPrimaryActionOnClickListener(ViewOnClickListenerC35681FpG.A00(this, 51));
        View view2 = this.A06;
        Context context2 = this.A05;
        if (this.A04) {
            IgRadioGroup igRadioGroup = (IgRadioGroup) view2.requireViewById(R.id.null_state_set_up_preference_group);
            igRadioGroup.removeAllViews();
            EnumC33321EoG enumC33321EoG = EnumC33321EoG.IMPORT_FROM_PAGE;
            C14360o3.A0B(context2, 1);
            C66359UCf c66359UCf = new C66359UCf(context2);
            c66359UCf.setTag(enumC33321EoG);
            c66359UCf.setPrimaryText(2131959392);
            c66359UCf.setSecondaryText(2131959391);
            c66359UCf.A04(true);
            igRadioGroup.addView(c66359UCf);
            EnumC33321EoG enumC33321EoG2 = EnumC33321EoG.CREATE_NEW;
            C66359UCf c66359UCf2 = new C66359UCf(context2);
            c66359UCf2.setTag(enumC33321EoG2);
            c66359UCf2.setPrimaryText(2131959388);
            igRadioGroup.addView(c66359UCf2);
            igRadioGroup.A02 = new C71085Wnh(this, 3);
            if (igRadioGroup.A00 == -1) {
                igRadioGroup.findViewWithTag(enumC33321EoG).getClass();
                igRadioGroup.A02(igRadioGroup.findViewWithTag(enumC33321EoG).getId());
                this.A01 = enumC33321EoG;
            }
            igRadioGroup.setVisibility(0);
        }
        View view3 = this.A06;
        C0f9.A09(654435203, A02);
        return view3;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-1039694283);
        super.onDestroy();
        C0f9.A09(851717662, A02);
    }
}
