package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.Brp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26768Brp extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ProfileChannelListFragment";
    public C8SB A00;
    public RecyclerView A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        int i;
        View.OnClickListener A00;
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131955107);
        interfaceC56362iU.EkS(true);
        Object A02 = ((C25849Bc4) this.A04.getValue()).A01.A02();
        if (C14360o3.A0K(A02, C1Z.A00)) {
            interfaceC56362iU.EkH(null, true);
            interfaceC56362iU.setIsLoading(true);
            return;
        }
        if (C14360o3.A0K(A02, C1X.A00)) {
            i = 2131970101;
            A00 = new ViewOnClickListenerC28668ClG(33, interfaceC56362iU, this);
        } else if (C14360o3.A0K(A02, C1Y.A00)) {
            i = 2131970102;
            A00 = ViewOnClickListenerC28666ClE.A00(this, 16);
        } else {
            throw AbstractC166987dD.A14("invalid action bar state");
        }
        interfaceC56362iU.AAF(A00, i);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "edit_channels";
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.2zI, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.2zI, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = (RecyclerView) view.requireViewById(R.id.recycler_view);
        C66392zG A00 = C66362zD.A00(view.getContext());
        A00.A0C.addAll(AbstractC16960so.A1Q(new Object(), new EXX(this, null, new C30519Dc2(this, 3), requireContext().getColor(AbstractC53242c7.A0D(getContext()))), new Object()));
        C66362zD A002 = A00.A00();
        InterfaceC09390do interfaceC09390do = this.A04;
        Object value = interfaceC09390do.getValue();
        C57312k6 A0a = AbstractC25229BEm.A0a(this);
        PZX pzx = new PZX(value, new C57748Pjb(A002, 27), (InterfaceC23621Ds) null, 30);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, pzx, A0a);
        this.A00 = new C8SB(new C31859DzR(new C30189DRu(this, 17)));
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null) {
            recyclerView.setAdapter(A002);
            C70623Ez c70623Ez = new C70623Ez();
            RecyclerView recyclerView2 = this.A01;
            if (recyclerView2 != null) {
                recyclerView2.setItemAnimator(c70623Ez);
                ((C3F0) c70623Ez).A00 = false;
                BY8.A00(this, ((C25849Bc4) interfaceC09390do.getValue()).A01, new C57748Pjb(this, 28), 10);
                C07S c07s = C07S.STARTED;
                C07X viewLifecycleOwner = getViewLifecycleOwner();
                AbstractC23641Du.A05(anonymousClass191, new C57165PZj(c07s, this, viewLifecycleOwner, null, 18), C07Y.A00(viewLifecycleOwner));
                return;
            }
        }
        C14360o3.A0F("recyclerView");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C26768Brp() {
        GSv gSv = new GSv(this, 30);
        GSv gSv2 = new GSv(this, 27);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new GSv(gSv2, 28));
        this.A04 = AbstractC25225BEi.A0a(new GSv(A00, 29), gSv, new C57257Pbf(8, null, A00), AbstractC25225BEi.A1D(C25849Bc4.class));
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new GSv(this, 26));
        this.A03 = AbstractC60492pY.A02(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(948294763);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.edit_channels, false);
        C0f9.A09(-362190555, A02);
        return A0R;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        int A02 = C0f9.A02(1001108536);
        super.onDetach();
        C25849Bc4 c25849Bc4 = (C25849Bc4) this.A04.getValue();
        CRV crv = c25849Bc4.A00;
        if (crv != null) {
            c25849Bc4.A03.A03(crv);
        }
        c25849Bc4.A00();
        C0f9.A09(-450617276, A02);
    }
}
