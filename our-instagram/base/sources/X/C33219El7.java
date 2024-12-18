package X;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.ArrayList;

/* renamed from: X.El7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33219El7 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AvatarOptionsFragment";
    public EnumC33432Eq3 A00;
    public FQM A01;
    public String A02;
    public TextView A03;
    public boolean A04;
    public final C53O A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131953525);
        this.A03 = interfaceC56362iU.C94();
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A07;
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do);
        C141796aw A00 = AbstractC141776au.A00(A0Z);
        PZL pzl = new PZL((InterfaceC23621Ds) null, A0Z, 28);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, pzl, A00);
        AbstractC52922bZ A0Z2 = AbstractC25225BEi.A0Z(interfaceC09390do);
        AbstractC23641Du.A05(anonymousClass191, new PZC(A0Z2, null, 35), AbstractC141776au.A00(A0Z2));
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        C07X A0K = AbstractC31173DnH.A0K(this, anonymousClass191, new C57166PZk(c07s, this, viewLifecycleOwner, null, 4), C07Y.A00(viewLifecycleOwner));
        C07X A0K2 = AbstractC31173DnH.A0K(this, anonymousClass191, new C57166PZk(c07s, this, A0K, null, 5), C07Y.A00(A0K));
        AbstractC23641Du.A05(anonymousClass191, new C57166PZk(c07s, this, A0K2, null, 6), C07Y.A00(A0K2));
    }

    public static final void A00(C33219El7 c33219El7) {
        EnumC33432Eq3 enumC33432Eq3;
        String str = c33219El7.A02;
        if (str != null && (enumC33432Eq3 = c33219El7.A00) != null && !c33219El7.A04) {
            C14360o3.A0A(enumC33432Eq3);
            ArrayList A1E = AbstractC166987dD.A1E();
            C35246Fgf A00 = C35246Fgf.A00(c33219El7.requireContext(), 2131953513);
            A00.A01 = R.style.igds_emphasized_body_1;
            FQM fqm = new FQM(c33219El7.requireActivity(), c33219El7.requireContext(), c33219El7.A05, AbstractC166987dD.A0r(c33219El7.A06), str);
            c33219El7.A01 = fqm;
            A1E.add(A00);
            A1E.add(fqm);
            C35119FeM.A00(A1E, true);
            C35246Fgf A002 = C35246Fgf.A00(c33219El7.requireContext(), 2131953509);
            A002.A01 = R.style.igds_emphasized_body_1;
            A002.A03 = R.dimen.accent_edge_thickness;
            ArrayList A1E2 = AbstractC166987dD.A1E();
            String str2 = "EVERYONE";
            C35124FeR.A00("EVERYONE", c33219El7.requireContext().getString(2131953508), A1E2);
            C35124FeR.A00("PEOPLE_YOU_FOLLOW", c33219El7.requireContext().getString(2131953511), A1E2);
            C35124FeR.A00("NO_ONE", c33219El7.requireContext().getString(2131953510), A1E2);
            int ordinal = enumC33432Eq3.ordinal();
            if (ordinal == 2) {
                str2 = "NO_ONE";
            } else if (ordinal == 3 || ordinal != 1) {
                str2 = "PEOPLE_YOU_FOLLOW";
            }
            A1E.add(A002);
            A1E.add(C35246Fgf.A00(AbstractC31173DnH.A07(c33219El7, new C34960Fak(new C35752Fqk(4, c33219El7, A1E2), str2, A1E2), A1E), 2131953507));
            c33219El7.setItems(A1E);
            RecyclerView recyclerView = c33219El7.getRecyclerView();
            String A003 = AbstractC111324zv.A00(2);
            C14360o3.A0C(recyclerView, A003);
            TextView textView = c33219El7.A03;
            C14360o3.A0C(textView, A003);
            AbstractC010103p.A0B(recyclerView, new UEI(textView, 1));
            c33219El7.A04 = true;
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    public C33219El7() {
        X2z x2z = new X2z(this, 43);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2z(new X2z(this, 40), 41));
        this.A07 = AbstractC25225BEi.A0a(new X2z(A00, 42), x2z, new C57252Pba(15, null, A00), AbstractC25225BEi.A1D(C31818Dyc.class));
        this.A05 = new C35909FtT(this, 6);
        this.A06 = AbstractC60492pY.A02(this);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1599482342);
        super.onDestroyView();
        this.A03 = null;
        C0f9.A09(914419207, A02);
    }
}
