package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsActionCell;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes6.dex */
public final class EI4 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AiSubscriptionItemFragment";
    public final InterfaceC09390do A00 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ai_subscription_item_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String string;
        String string2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsListCell igdsListCell = (IgdsListCell) AbstractC166997dE.A0R(view, R.id.ai_subscription_time);
        IgdsListCell igdsListCell2 = (IgdsListCell) AbstractC166997dE.A0R(view, R.id.ai_subscription_frequency);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string2 = bundle2.getString("ai_subscription_time")) != null) {
            igdsListCell.A0H(string2);
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str = bundle3.getString(AbstractC111324zv.A00(169));
        } else {
            str = null;
        }
        if (C14360o3.A0K(str, "GENAI_REMINDER")) {
            igdsListCell2.A06(2131952875);
        }
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null && (string = bundle4.getString("ai_subscription_frequency")) != null) {
            igdsListCell2.A0H(string);
        }
        IgdsActionCell igdsActionCell = (IgdsActionCell) AbstractC166997dE.A0R(view, R.id.ai_subscription_delete);
        CharSequence text = getText(2131957640);
        C14360o3.A07(text);
        igdsActionCell.A00(ViewOnClickListenerC35681FpG.A00(this, 7), EnumC33337EoW.A03, text);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C30D.A04(activity, AbstractC167007dF.A09(requireContext(), R.attr.igds_color_secondary_background));
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1485131468);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.ai_subscription_item_detail, viewGroup, false);
        C0f9.A09(-911302524, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1755372610);
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C30D.A04(activity, 0);
        }
        C0f9.A09(-711716383, A02);
    }
}
