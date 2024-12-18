package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class EMW extends AbstractC59962oe implements InterfaceC189488aT {
    public static final String __redex_internal_original_name = "DirectPersistentMenuFragment";
    public C9BW A00;
    public FPX A01;
    public String A02;
    public final String A04 = "direct_persistent_menu_details";
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<C9CJ> list;
        List<C105954q9> list2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC25227BEk.A12(AbstractC167007dF.A0N(view, R.id.persistent_menu_header), this, 2131966902);
        if (this.A02 != null) {
            AbstractC31177DnL.A10(AbstractC167007dF.A0N(view, R.id.instant_reply_hint), this, this.A02, 2131959713);
        }
        LayoutInflater layoutInflater = getLayoutInflater();
        C14360o3.A07(layoutInflater);
        FNR fnr = new FNR(layoutInflater, view, this.A00);
        fnr.A00 = new C34417FFh(this);
        InterfaceC09390do interfaceC09390do = fnr.A04;
        View A0d = AbstractC166987dD.A0d(interfaceC09390do);
        InterfaceC09390do interfaceC09390do2 = fnr.A05;
        AbstractC13880nE.A0l(A0d, AbstractC166987dD.A0d(interfaceC09390do2).getPaddingLeft(), 10, AbstractC166987dD.A0d(interfaceC09390do2).getPaddingRight(), 18);
        ((ViewGroup) interfaceC09390do2.getValue()).addView(AbstractC166987dD.A0d(interfaceC09390do));
        View A0d2 = AbstractC166987dD.A0d(interfaceC09390do2);
        Context context = fnr.A02.getContext();
        AbstractC31173DnH.A0z(context, A0d2, AbstractC53242c7.A0H(context, R.attr.bottomSheetBackground));
        ViewGroup viewGroup = (ViewGroup) interfaceC09390do.getValue();
        C14360o3.A0C(viewGroup, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) viewGroup).setOrientation(1);
        C9BW c9bw = fnr.A03;
        if (c9bw != null && (list2 = (List) c9bw.A00) != null) {
            for (C105954q9 c105954q9 : list2) {
                ViewGroup viewGroup2 = (ViewGroup) interfaceC09390do.getValue();
                View inflate = fnr.A01.inflate(R.layout.direct_instant_reply_pill, (ViewGroup) interfaceC09390do.getValue(), false);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                FpQ.A01(inflate, 10, fnr, c105954q9);
                AbstractC166987dD.A0e(inflate, R.id.instant_reply_text_view).setText(c105954q9.A05);
                viewGroup2.addView(inflate);
            }
        }
        FragmentActivity requireActivity = requireActivity();
        UserSession A0r = AbstractC166987dD.A0r(this.A03);
        LayoutInflater layoutInflater2 = getLayoutInflater();
        C14360o3.A07(layoutInflater2);
        C34640FNx c34640FNx = new C34640FNx(requireActivity, layoutInflater2, view, this.A00, A0r);
        c34640FNx.A00 = new C34418FFi(this);
        InterfaceC09390do interfaceC09390do3 = c34640FNx.A06;
        View A0d3 = AbstractC166987dD.A0d(interfaceC09390do3);
        InterfaceC09390do interfaceC09390do4 = c34640FNx.A07;
        A0d3.setPadding(AbstractC166987dD.A0d(interfaceC09390do4).getPaddingLeft(), 0, AbstractC166987dD.A0d(interfaceC09390do4).getPaddingRight(), 0);
        ((ViewGroup) interfaceC09390do4.getValue()).addView(AbstractC166987dD.A0d(interfaceC09390do3));
        ViewGroup viewGroup3 = (ViewGroup) interfaceC09390do3.getValue();
        C14360o3.A0C(viewGroup3, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) viewGroup3).setOrientation(1);
        C9BW c9bw2 = c34640FNx.A04;
        if (c9bw2 != null && (list = (List) c9bw2.A01) != null) {
            for (C9CJ c9cj : list) {
                ViewGroup viewGroup4 = (ViewGroup) interfaceC09390do3.getValue();
                View inflate2 = c34640FNx.A02.inflate(R.layout.direct_persistent_menu_url_button, (ViewGroup) interfaceC09390do3.getValue(), false);
                C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.LinearLayout");
                TextView A0e = AbstractC166987dD.A0e(inflate2, R.id.url_title_text_view);
                TextView A0e2 = AbstractC166987dD.A0e(inflate2, R.id.url_text_view);
                A0e.setText(c9cj.A00);
                if (A0e2 != null) {
                    A0e2.setText(c9cj.A02);
                }
                FpQ.A01(inflate2, 11, c34640FNx, c9cj);
                viewGroup4.addView(inflate2);
            }
        }
        AbstractC166997dE.A0S(view, R.id.persistent_menu_items_scroll_view).setVisibility(0);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A04;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1811468842);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_thread_persistent_menu, viewGroup, false);
        C0f9.A09(1093476802, A02);
        return inflate;
    }
}
