package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Bqx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26716Bqx extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "FloatingSocialContextNuxFragment";
    public CQH A00;
    public final InterfaceC09390do A01 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC19610xo A0g = AbstractC167017dG.A0g(AbstractC25230BEn.A0l(this.A01).A01, "friendly_feed_nux_seen_count");
        A0g.E7G("friendly_feed_nux_last_shown_time_ms", System.currentTimeMillis());
        A0g.apply();
        ((C64P) AbstractC166997dE.A0R(view, R.id.note_action_buttons)).setPrimaryAction(view.getContext().getString(2131956698), new ViewOnClickListenerC28667ClF(this, 34));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A01);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(99547764);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.floating_social_context_nux_landing, viewGroup, false);
        C0f9.A09(-1535164644, A02);
        return inflate;
    }
}
