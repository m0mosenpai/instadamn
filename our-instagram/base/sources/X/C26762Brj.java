package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.creatortools.api.schemas.ValuePropsFlow;

/* renamed from: X.Brj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26762Brj extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CreatorToolsValuePropsFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01 = C1XM.A00(new D87(this, 42));
    public final InterfaceC09390do A02 = C1XM.A00(new D87(this, 43));
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewOnClickListenerC28667ClF viewOnClickListenerC28667ClF;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A01;
        if (interfaceC09390do.getValue() != null) {
            AbstractC25225BEi.A0w(this.A04).A00 = AbstractC25225BEi.A15(interfaceC09390do);
        }
        ((RecyclerView) view.findViewById(R.id.value_props_recycle_view)).setAdapter((C2UU) this.A00.getValue());
        InterfaceC09390do interfaceC09390do2 = this.A04;
        C25845Bc0 A0w = AbstractC25225BEi.A0w(interfaceC09390do2);
        String A15 = AbstractC25225BEi.A15(this.A02);
        C14360o3.A0B(A15, 0);
        AbstractC166997dE.A1Y(A0w.A0D, true);
        C15370ps A1F = AbstractC25225BEi.A1F();
        C16930sl c16930sl = C16930sl.A00;
        A1F.A00 = c16930sl;
        C15370ps A1F2 = AbstractC25225BEi.A1F();
        A1F2.A00 = c16930sl;
        C15370ps A1F3 = AbstractC25225BEi.A1F();
        C6S c6s = C6S.A03;
        A1F3.A00 = c6s;
        C15370ps A1F4 = AbstractC25225BEi.A1F();
        A1F4.A00 = c6s;
        C141796aw A00 = AbstractC141776au.A00(A0w);
        D54 d54 = new D54(A0w, A15, (InterfaceC23621Ds) null, A1F, A1F3, A1F4, A1F2, 10);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, new D54(A0w, A15, (InterfaceC23621Ds) null, A1F2, A1F4, A1F3, A1F, 11), AbstractC25235BEs.A0W(A0w, anonymousClass191, d54, A00));
        boolean A2I = C17060sy.A01.A01(AbstractC166987dD.A0r(this.A03)).A2I();
        C64P c64p = (C64P) view.findViewById(R.id.value_props_bottom_button_layout);
        if (A2I) {
            if (c64p != null) {
                c64p.setPrimaryActionText(getString(2131965064));
                viewOnClickListenerC28667ClF = new ViewOnClickListenerC28667ClF(this, 58);
                c64p.setPrimaryActionOnClickListener(viewOnClickListenerC28667ClF);
            }
        } else if (c64p != null) {
            c64p.setPrimaryActionText(getString(2131956829));
            viewOnClickListenerC28667ClF = new ViewOnClickListenerC28667ClF(this, 59);
            c64p.setPrimaryActionOnClickListener(viewOnClickListenerC28667ClF);
        }
        BY8.A00(getViewLifecycleOwner(), AbstractC25225BEi.A0w(interfaceC09390do2).A06, new C57749Pjc(this, 44), 8);
        BY8.A00(getViewLifecycleOwner(), AbstractC25225BEi.A0w(interfaceC09390do2).A02, new C50370MLx(18, view, this), 8);
        BY8.A00(getViewLifecycleOwner(), AbstractC25225BEi.A0w(interfaceC09390do2).A03, new C50370MLx(19, view, this), 8);
        AbstractC23641Du.A05(anonymousClass191, new D4v(this, null, 22), AbstractC25235BEs.A0S(this));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C26762Brj() {
        D87 d87 = new D87(this, 47);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new D87(new D87(this, 44), 45));
        this.A04 = AbstractC25225BEi.A0a(new D87(A00, 46), d87, new C50169MDw(25, A00, null), AbstractC25225BEi.A1D(C25845Bc0.class));
        this.A00 = C1XM.A00(new D87(this, 41));
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        boolean A10 = AbstractC25236BEt.A10(interfaceC56362iU);
        String A15 = AbstractC25225BEi.A15(this.A02);
        C14360o3.A0B(A15, A10 ? 1 : 0);
        if (A15.equals(ValuePropsFlow.A08.A00)) {
            i = 2131964518;
        } else if (A15.equals(ValuePropsFlow.A09.A00)) {
            i = 2131964522;
        } else if (A15.equals(ValuePropsFlow.A06.A00)) {
            i = 2131966862;
        } else if (A15.equals(ValuePropsFlow.A0B.A00)) {
            i = 2131966874;
        } else if (A15.equals(ValuePropsFlow.A05.A00)) {
            i = 2131966861;
        } else {
            boolean equals = A15.equals(ValuePropsFlow.A07.A00);
            i = 2131976585;
            if (equals) {
                i = 2131966864;
            }
        }
        interfaceC56362iU.Efu(i);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-628175983);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_tools_value_props_screen, viewGroup, false);
        C0f9.A09(-1754488417, A02);
        return inflate;
    }
}
