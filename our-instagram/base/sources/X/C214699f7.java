package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.9f7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214699f7 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "MentionPrivacySettingBottomSheetFragment";
    public A75 A00;
    public IgdsSwitch A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "mention_privacy_setting_bottomsheet";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(158215349);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_mentions_privacy_setting_bottomsheet, viewGroup, false);
        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.row_simple_text_textview);
        AbstractC166987dD.A1P(A0T.getContext(), A0T, 2131952935);
        TextView A0T2 = AbstractC166997dE.A0T(inflate, R.id.row_simple_text_detail);
        A0T2.setVisibility(0);
        AbstractC166987dD.A1P(A0T2.getContext(), A0T2, 2131966289);
        this.A01 = (IgdsSwitch) inflate.requireViewById(R.id.row_menu_item_switch);
        C64P c64p = (C64P) inflate.requireViewById(R.id.mention_privacy_setting_button_group);
        c64p.setPrimaryActionOnClickListener(new ViewOnClickListenerC23249ASk(this, 25));
        c64p.setSecondaryActionOnClickListener(new ViewOnClickListenerC23249ASk(this, 26));
        C0f9.A09(-1658454602, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1515315208);
        super.onDestroyView();
        this.A01 = null;
        C0f9.A09(276774641, A02);
    }
}
