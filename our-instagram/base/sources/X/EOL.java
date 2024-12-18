package X;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EOL extends AbstractC43842Ja5 implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FanClubCustomizedBenefitsEditFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC43842Ja5, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A03);
        C141796aw A00 = AbstractC141776au.A00(A0Z);
        MBp mBp = new MBp(A0Z, null, 4);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mBp, A00);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, new MCM(view, viewLifecycleOwner, c07s, this, null, 38), C07Y.A00(viewLifecycleOwner));
        AbstractC23641Du.A05(anonymousClass191, new MCL(A0K, c07s, this, null, 18), C07Y.A00(A0K));
    }

    @Override // X.AbstractC43842Ja5
    public final Collection getDefinitions() {
        return AbstractC166987dD.A1J(new EX7((C31792DyB) this.A03.getValue()));
    }

    @Override // X.AbstractC43842Ja5
    public final L5L getRecyclerConfigBuilder() {
        return configBuilder(C37067GVc.A00);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C31792DyB c31792DyB = (C31792DyB) this.A03.getValue();
        List A0Z = AbstractC001800i.A0Z(c31792DyB.A00);
        Iterable A0w = AbstractC31172DnG.A0w(c31792DyB.A05);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : A0w) {
            if (((C32084E8i) obj).A01) {
                A1E.add(obj);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        Iterator it = A1E.iterator();
        while (it.hasNext()) {
            AbstractC31173DnH.A17(c31792DyB.A0D(), A0q, ((C32084E8i) it.next()).A03);
        }
        if (AbstractC25225BEi.A1a(A0Z, AbstractC001800i.A0Z(A0q))) {
            C193328hC A0b = AbstractC31176DnK.A0b(this);
            A0b.A0A(2131957385);
            A0b.A09(2131957384);
            DialogInterfaceOnClickListenerC35453FkA.A02(A0b, this, 21, 2131957383);
            A0b.A0P(DialogInterfaceOnClickListenerC35453FkA.A00(this, 22), EnumC193348hE.A05, 2131957382);
            AbstractC166987dD.A1W(A0b);
            return true;
        }
        return false;
    }

    public EOL() {
        ArrayList A1E = AbstractC166987dD.A1E();
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A00 = AbstractC09440dt.A00(enumC09460dv, new C57262Pbk(A1E, this, AbstractC111324zv.A00(3494), 14));
        this.A01 = DH5.A01(this, AbstractC111324zv.A00(1487), enumC09460dv, 28);
        this.A02 = AbstractC60492pY.A02(this);
        C37053GUj c37053GUj = new C37053GUj(this, 43);
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new C37053GUj(new C37053GUj(this, 40), 41));
        this.A03 = AbstractC25225BEi.A0a(new C37053GUj(A00, 42), c37053GUj, new C50171MDy(24, null, A00), AbstractC25225BEi.A1D(C31792DyB.class));
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131957388);
        interfaceC56362iU.Ect(getString(2131957386), ViewOnClickListenerC35685FpK.A00(this, 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(356746379);
        super.onCreate(bundle);
        setAdapter(AbstractC31173DnH.A0R(AbstractC31174DnI.A0R(this), new EX7((C31792DyB) this.A03.getValue())));
        C0f9.A09(-547211970, A02);
    }
}
