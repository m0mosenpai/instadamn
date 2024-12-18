package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.business.Address;
import com.instagram.model.business.ProfileAddressData;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class EK0 extends AbstractC59962oe implements InterfaceC60122ou, GXG {
    public static final String __redex_internal_original_name = "ProfileMultipleAddressesEditListFragment";
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_multiple_addresses_edit_list";
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.2zJ, java.lang.Object] */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        InterfaceC09390do interfaceC09390do = this.A00;
        UserSession A0K = AbstractC31175DnJ.A0K(interfaceC09390do, 0);
        FAI.A00(this, A0K, "impression", "screen", "subscriber", "ig_profile_edit_address_list_page", A0K.userId, null);
        Context requireContext = requireContext();
        C66392zG A00 = C66362zD.A00(requireContext);
        A00.A01(new EYV(this));
        A00.A01(new EYW(this));
        C66362zD A0R = AbstractC31173DnH.A0R(A00, new Object());
        RecyclerView recyclerView = (RecyclerView) AbstractC166997dE.A0R(view, R.id.multiple_addresses_edit_list_recycler_view);
        recyclerView.setAdapter(A0R);
        AbstractC31174DnI.A15(requireContext, recyclerView);
        recyclerView.A10(new E0C(this, 4));
        C05A c05a = ((C31832Dyq) this.A01.getValue()).A00;
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC31174DnI.A1E(getViewLifecycleOwner(), AbstractC58232lf.A00(anonymousClass191, c05a), new C30184DRp(19, requireContext, A0R, this), 70);
        AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
        if (C3BQ.A00(A0k).booleanValue() && C18U.A06(C06090Tz.A05, A0k, 2342172050217779185L)) {
            AbstractC23641Du.A05(anonymousClass191, new C57165PZj(this, null), AbstractC25235BEs.A0S(this));
        }
    }

    public static final Address A00(ProfileAddressData profileAddressData, EK0 ek0) {
        if (profileAddressData == null) {
            return null;
        }
        String str = profileAddressData.A03;
        String str2 = profileAddressData.A05;
        String str3 = profileAddressData.A04;
        if (str3 == null) {
            str3 = "0";
        }
        String str4 = profileAddressData.A08;
        return new Address(str, str2, str3, str4, AbstractC1567472a.A05(ek0.requireContext(), str, str4, str2));
    }

    public static final Integer A01(EK0 ek0, List list) {
        User A0g = AbstractC31176DnK.A0g(C17060sy.A01, ek0.A00);
        if (list == null && (list = (List) AbstractC31172DnG.A0E(((C31832Dyq) ek0.A01.getValue()).A00).A02()) == null) {
            return null;
        }
        return AbstractC1567472a.A03(ek0.requireContext(), A0g, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0166  */
    @Override // X.GXG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FBL(com.instagram.model.business.Address r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EK0.FBL(com.instagram.model.business.Address, java.lang.String):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A00);
    }

    public EK0() {
        GSv gSv = new GSv(this, 25);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new GSv(new GSv(this, 22), 23));
        this.A01 = AbstractC25225BEi.A0a(new GSv(A00, 24), gSv, new C57257Pbf(7, null, A00), AbstractC25225BEi.A1D(C31832Dyq.class));
        this.A00 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.Efu(2131966629);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1559385212);
        super.onCreate(bundle);
        C0f9.A09(431964799, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-2102995008);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_profile_multiple_addresses_edit_list_fragment, false);
        C0f9.A09(-1734207929, A02);
        return A0R;
    }
}
