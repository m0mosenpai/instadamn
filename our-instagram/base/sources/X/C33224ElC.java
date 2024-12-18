package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: X.ElC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33224ElC extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BirthdayVisibilitySettingsFragment";
    public C31349DqE A00;
    public C31294DpG A01;
    public String A02;
    public String A03;
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131953846);
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = AbstractC166997dE.A0N(this).getString(2131972699);
        AbstractC31176DnK.A1B(ViewOnClickListenerC35689FpO.A00(this, 41), A0B, interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "birthday_visibility_settings_fragment";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(this);
    }

    public static final void A00(C33224ElC c33224ElC) {
        c33224ElC.setItems(AbstractC166987dD.A1J(new Object()));
        C25621Ms A0D = AbstractC31179DnN.A0D(AbstractC166987dD.A0o(c33224ElC.A04));
        A0D.A03();
        A0D.A0B("api/v1/users/get_birthday_visibility_setting/");
        C1ON A0e = AbstractC25227BEk.A0e(A0D, EA2.class, C34734FRx.class);
        C14360o3.A0C(A0e, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayVisibilitySettingResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BirthdayVisibilitySettingResponse>>");
        C31702Dw7.A00(c33224ElC, A0e, 44);
    }

    public static final void A01(C33224ElC c33224ElC, String str) {
        AbstractC12990ll A0o = AbstractC166987dD.A0o(c33224ElC.A04);
        C14360o3.A0B(str, 0);
        EnumC33412Epj enumC33412Epj = (EnumC33412Epj) EnumC33412Epj.A03.get(str);
        if (enumC33412Epj == null) {
            enumC33412Epj = EnumC33412Epj.A07;
        }
        int i = enumC33412Epj.A00;
        Integer valueOf = Integer.valueOf(i);
        C14360o3.A0B(A0o, 0);
        C25621Ms A0q = AbstractC25228BEl.A0q(A0o);
        AbstractC31181DnP.A0m(A0q);
        if (valueOf != null) {
            A0q.A0D("visibility_status", i);
        }
        C1ON A0T = AbstractC31172DnG.A0T(A0q, "surface", "caa");
        C14360o3.A0C(A0T, AbstractC111324zv.A00(1138));
        A0T.A00 = new EUP(str, c33224ElC, 9);
        c33224ElC.schedule(A0T);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    public static final void A02(C33224ElC c33224ElC, InterfaceC16820sZ interfaceC16820sZ) {
        Context context = c33224ElC.getContext();
        if (context != null) {
            C31349DqE c31349DqE = c33224ElC.A00;
            if (c31349DqE != null) {
                AbstractC31177DnL.A1L(c31349DqE);
                c33224ElC.A00 = null;
            }
            C29319CwE c29319CwE = new C29319CwE(interfaceC16820sZ, 3);
            C146106i8 A0j = AbstractC25229BEm.A0j();
            int i = 2131968572;
            if (AbstractC15820qc.A0F(context)) {
                i = 2131974293;
            }
            AbstractC31171DnF.A18(c33224ElC, A0j, i);
            A0j.A01 = -1;
            A0j.A0G = AbstractC25227BEk.A0v(c33224ElC, 2131972568);
            A0j.A0L = true;
            G97.A00(A0j, c29319CwE, 14);
            C31349DqE A00 = A0j.A00();
            AbstractC166997dE.A1O(C41451vu.A01, A00);
            c33224ElC.A00 = A00;
        }
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1617953945);
        super.onCreate(bundle);
        Context requireContext = requireContext();
        InterfaceC09390do interfaceC09390do = this.A04;
        setAdapter(new C33238ElX(requireContext, AbstractC166987dD.A0o(interfaceC09390do), this));
        this.A01 = new C31294DpG(this, AbstractC166987dD.A0r(interfaceC09390do));
        C0f9.A09(-486341655, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1519436624);
        super.onDestroyView();
        C31349DqE c31349DqE = this.A00;
        if (c31349DqE != null) {
            AbstractC31177DnL.A1L(c31349DqE);
            this.A00 = null;
        }
        C0f9.A09(1970712618, A02);
    }
}
