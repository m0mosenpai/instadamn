package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class N71 extends AbstractC59962oe implements InterfaceC58279PsX {
    public static final String __redex_internal_original_name = "MediaKitIntroFragment";
    public int A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public C56352iT A04;
    public final InterfaceC09390do A07 = AbstractC25225BEi.A0a(new C57546PgK(this, 31), new C57546PgK(this, 32), C57535Pg9.A00(null, this, 33), AbstractC25225BEi.A1D(C51053Mh7.class));
    public final InterfaceC09390do A08 = C57546PgK.A01(this, 30);
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final InterfaceC60122ou A05 = new C70568Wd2(this, 1);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "MediaKitHomeFragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewOnClickListenerC55456OkA.A00(view.requireViewById(R.id.mk_intro_bottom_button), 9, this);
        this.A00 = AbstractC56402iY.A01(getActivity());
        ViewGroup A0F = AbstractC31173DnH.A0F(view, R.id.mk_action_bar);
        this.A03 = A0F;
        String str = "actionBar";
        if (A0F != null) {
            this.A04 = new C56352iT(ViewOnClickListenerC55451Ok0.A00, A0F);
            ViewGroup viewGroup = this.A03;
            if (viewGroup != null) {
                this.A04 = new C56352iT(new ViewOnClickListenerC55456OkA(this, 10), viewGroup);
                View requireViewById = view.requireViewById(R.id.mk_status_bar_background);
                this.A02 = requireViewById;
                str = "statusBarLayout";
                if (requireViewById != null) {
                    requireViewById.setBackgroundColor(AbstractC56402iY.A00(requireActivity()));
                    View view2 = this.A02;
                    if (view2 != null) {
                        AbstractC43592JPx.A1H(view2, -1, this.A00);
                        C56352iT c56352iT = this.A04;
                        if (c56352iT != null) {
                            c56352iT.A0X(this.A05);
                        }
                        Window A0H = AbstractC31174DnI.A0H(this);
                        C14360o3.A07(A0H);
                        AbstractC56402iY.A08(A0H, true);
                        AbstractC56402iY.A02(requireActivity(), 0);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58279PsX
    public final C54780OIu BOh() {
        return (C54780OIu) this.A08.getValue();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-2090988823);
        super.onCreate(bundle);
        AbstractC55033OXz.A01(this, C05F.A01);
        C0f9.A09(1186114282, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1454041883);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.media_kit_intro_fragment, false);
        C0f9.A09(-612072475, A02);
        return A0R;
    }
}
