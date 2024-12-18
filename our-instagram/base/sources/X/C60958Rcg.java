package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.base.activity.BaseFragmentActivity;

/* renamed from: X.Rcg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60958Rcg extends AbstractC60893Rb7 implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "IgHubContainerFragment";

    public final void A00() {
        FragmentActivity activity = getActivity();
        activity.getClass();
        C56352iT.A0t.A03(activity).A0T();
        FragmentActivity activity2 = getActivity();
        if (activity2 != null && (activity2 instanceof BaseFragmentActivity)) {
            ((BaseFragmentActivity) activity2).A0d();
        }
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        View.OnClickListener onClickListener;
        C3LO c3lo;
        View.OnClickListener onClickListener2;
        if (getChildFragmentManager().A0O(R.id.container_fragment) instanceof InterfaceC65387TjK) {
            SOB C8u = ((InterfaceC65387TjK) getChildFragmentManager().A0O(R.id.container_fragment)).C8u();
            interfaceC56362iU.EkF(C8u.A08);
            interfaceC56362iU.EkS(true);
            boolean A1O = AbstractC58319PtB.A1O();
            String str = C8u.A05;
            str.getClass();
            if (A1O) {
                interfaceC56362iU.setTitle(str);
            } else {
                interfaceC56362iU.EaW(str, requireContext().getString(2131962332));
            }
            if (C8u.A07 && (i = C8u.A01) != 0) {
                if (i == 1) {
                    String str2 = C8u.A04;
                    if (str2 != null && (onClickListener2 = C8u.A03) != null) {
                        if (C8u.A06) {
                            c3lo = new C3LO();
                            c3lo.A0K = str2;
                            c3lo.A0G = onClickListener2;
                        } else {
                            interfaceC56362iU.AAD(str2);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    Drawable drawable = C8u.A02;
                    if (drawable == null || (onClickListener = C8u.A03) == null) {
                        return;
                    }
                    c3lo = new C3LO();
                    c3lo.A0F = drawable;
                    c3lo.A0G = onClickListener;
                    c3lo.A05 = C8u.A00;
                }
                interfaceC56362iU.AA9(new C3LY(c3lo));
                return;
            }
            return;
        }
        interfaceC56362iU.EkF(false);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (getChildFragmentManager().A0O(R.id.container_fragment) != null) {
            getChildFragmentManager().A0O(R.id.container_fragment).onActivityResult(i, i2, intent);
        }
    }
}
