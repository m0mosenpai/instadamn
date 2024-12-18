package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.R;

/* renamed from: X.Ras, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60884Ras extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "IGAutofillBloksSoftKeyboardFragment";
    public C6T7 A00;
    public C1338462s A01;
    public FrameLayout A02;
    public C126545np A03;
    public C62862tP A04;
    public C57112jm A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "autofill_bloks_soft_keyboard_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        C1338462s c1338462s = this.A01;
        if (c1338462s == null) {
            str = "bloksParseResult";
        } else {
            C62862tP c62862tP = this.A04;
            if (c62862tP == null) {
                str = "igBloksHost";
            } else {
                C6T8 A00 = C6T7.A00(requireContext, c1338462s, c62862tP);
                A00.A01 = AbstractC166987dD.A1G();
                C6T7 A002 = A00.A00();
                this.A00 = A002;
                C126545np c126545np = this.A03;
                if (c126545np != null) {
                    A002.A07(c126545np);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(157948549);
        super.onCreate(bundle);
        this.A05 = C57112jm.A00();
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A06);
        C57112jm c57112jm = this.A05;
        if (c57112jm == null) {
            C14360o3.A0F("viewpointManager");
            throw C00O.createAndThrow();
        }
        this.A04 = C62862tP.A03(this, A0o, c57112jm);
        C0f9.A09(1552526207, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(144302482);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_autofill_soft_keyboard, viewGroup, false);
        C14360o3.A07(inflate);
        this.A02 = (FrameLayout) inflate.requireViewById(R.id.iab_autofill_soft_keyboard);
        C126545np c126545np = new C126545np(requireContext());
        this.A03 = c126545np;
        c126545np.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        FrameLayout frameLayout = this.A02;
        if (frameLayout != null) {
            frameLayout.addView(this.A03);
        }
        C0f9.A09(-1882898106, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(151802163);
        super.onDestroyView();
        this.A03 = null;
        this.A02 = null;
        C6T7 c6t7 = this.A00;
        if (c6t7 != null) {
            c6t7.A04();
        }
        C0f9.A09(-761579425, A02);
    }
}
