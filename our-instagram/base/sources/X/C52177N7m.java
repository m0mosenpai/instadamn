package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;
import java.util.Collection;
import java.util.List;

/* renamed from: X.N7m, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52177N7m extends AbstractC43842Ja5 implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ActiveTrialsFragment";
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A04;
    public final String A00 = __redex_internal_original_name;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131975748);
        interfaceC56362iU.EkS(true);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A02(C05F.A0Y);
        AbstractC31176DnK.A1B(new Ok4(this, 1), A0B, interfaceC56362iU);
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC37304Gc5.A0y(getRecyclerView().A0D, getRecyclerView(), new P2N(this, 7), C153146ui.A06);
        RefreshableNestedScrollingParent refreshableNestedScrollingParent = this.refreshableNestedScrollingParent;
        if (refreshableNestedScrollingParent != null) {
            refreshableNestedScrollingParent.setEnabled(false);
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57166PZk(c07s, this, viewLifecycleOwner, null, 32), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC16960so.A1Q(new NFE(this, AbstractC166987dD.A0r(this.A03), this), new NF5(this), new NF6(this));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A00;
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(new C57746PjZ(this, 24));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C52177N7m() {
        C57239PbN c57239PbN = new C57239PbN(this, 20);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57239PbN(new C57239PbN(this, 17), 18));
        this.A04 = AbstractC25225BEi.A0a(new C57239PbN(A00, 19), c57239PbN, new C43208J8f(44, null, A00), AbstractC25225BEi.A1D(N87.class));
        this.A02 = C1XM.A00(C57476PfC.A00);
        this.A01 = C1XM.A00(C57475PfB.A00);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i == 2 && i2 == 9683) {
                AbstractC25231BEo.A16(this);
                return;
            }
            return;
        }
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A04);
        AbstractC166987dD.A1Z(new PYs(A0Z, null, 42), AbstractC141776au.A00(A0Z));
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C56073Ouq c56073Ouq;
        int A02 = C0f9.A02(765009454);
        super.onResume();
        int A022 = getAdapter().A02(AbstractC25225BEi.A1D(C56073Ouq.class));
        if (A022 >= 0) {
            List AuX = getAdapter().A04.AuX();
            C14360o3.A07(AuX);
            Object A0O = AbstractC001800i.A0O(AuX, A022);
            if ((A0O instanceof C56073Ouq) && (c56073Ouq = (C56073Ouq) A0O) != null) {
                c56073Ouq.A00 = true;
            }
            getAdapter().notifyItemChanged(A022);
        }
        C0f9.A09(1014930467, A02);
    }
}
