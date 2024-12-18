package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Br5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26724Br5 extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "RollCallNuxBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "roll_call_nux";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1025590683);
        super.onCreate(bundle);
        requireArguments();
        C0f9.A09(-919988587, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-1192965833);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_rollcall_nux_bottomsheet, viewGroup, false);
        if (inflate != null) {
            Context context = getContext();
            if (context != null) {
                inflate.requireViewById(R.id.rollcall_nux_icon).setVisibility(0);
                AbstractC166987dD.A1P(context, AbstractC166997dE.A0T(inflate, R.id.rollcall_nux_header_text), 2131972635);
                AbstractC166987dD.A1P(context, AbstractC166997dE.A0T(inflate, R.id.rollcall_nux_body_text), 2131972634);
                View.OnClickListener onClickListener = this.A00;
                if (onClickListener != null) {
                    C0fQ.A00(onClickListener, AbstractC166997dE.A0S(inflate, R.id.rollcall_nux_try_it_button));
                }
                View.OnClickListener onClickListener2 = this.A01;
                if (onClickListener2 != null) {
                    C0fQ.A00(onClickListener2, AbstractC166997dE.A0S(inflate, R.id.rollcall_nux_learn_more_button));
                }
                C0f9.A09(1666768178, A02);
                return inflate;
            }
            A14 = AbstractC166987dD.A14("Cannot find context");
            i = 1279427548;
        } else {
            A14 = AbstractC166987dD.A14("Root View Not initialized");
            i = -1329579458;
        }
        C0f9.A09(i, A02);
        throw A14;
    }
}
