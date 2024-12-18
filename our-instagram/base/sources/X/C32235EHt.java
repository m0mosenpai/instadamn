package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.EHt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32235EHt extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DirectDailyPromptsCreationNuxFragment";
    public FFQ A00;
    public String A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.creation_nux_title);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.creation_nux_subtitle);
        InterfaceC09390do interfaceC09390do = this.A02;
        int i = 2131958968;
        if (C7HD.A02(AbstractC166987dD.A0r(interfaceC09390do))) {
            i = 2131958967;
        }
        int i2 = 2131958966;
        if (C7HD.A02(AbstractC166987dD.A0r(interfaceC09390do))) {
            i2 = 2131958965;
        }
        A0N.setText(i);
        A0N2.setText(i2);
        ViewOnClickListenerC35681FpG.A01(view.requireViewById(R.id.prompt_nux_get_started_button), 70, this);
        String str = this.A01;
        if (str != null) {
            AbstractC31177DnL.A1M(AbstractC166987dD.A0w(AbstractC25230BEn.A0l(interfaceC09390do)), "broadcast_channel_daily_prompt_nux", str, true);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(93184871);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.daily_prompts_creation_nux, false);
        C0f9.A09(1732861827, A02);
        return A0R;
    }
}
