package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.api.base.CacheBehaviorLogger;

/* renamed from: X.Fir, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC35376Fir implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public DialogInterfaceOnClickListenerC35376Fir(Object obj, Object obj2, Object obj3, String str, String str2, String str3, String str4, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A04 = str4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            C12260kU.A0G((Context) this.A01, AbstractC08820cl.A03("https://www.facebook.com/help/instagram/240116693975803"));
            InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) this.A02;
            AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
            String str = this.A05;
            String str2 = this.A06;
            String str3 = this.A07;
            String str4 = this.A04;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), "instagram_shopping_mini_shop_legal_nux_learn_more_tap");
            if (A0f.isSampled()) {
                AbstractC31181DnP.A0j(A0f, str4, str, str2, str3);
                A0f.Cht();
                return;
            }
            return;
        }
        C07270a1 c07270a1 = (C07270a1) this.A02;
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
        String str5 = this.A07;
        String str6 = this.A06;
        String str7 = this.A05;
        EnumC31713DwI enumC31713DwI = (EnumC31713DwI) this.A03;
        Context requireContext = abstractC59962oe.requireContext();
        C14360o3.A0A(c07270a1);
        C25621Ms A0M = AbstractC31173DnH.A0M(c07270a1);
        A0M.A0B("accounts/vetted_phone_reg_login/");
        A0M.A9s("token", str7);
        A0M.A9s(CacheBehaviorLogger.SOURCE, "vetted_phone_reg");
        AbstractC31178DnM.A0n(requireContext, A0M, AbstractC31189DnY.A02(), C16030qx.A00(requireContext));
        AbstractC31176DnK.A1O(C19T.A1v, A0M, AbstractC35276FhB.A00(A0M, c07270a1, "uid", str6));
        AbstractC31175DnJ.A1J(A0M);
        C1ON A0U = AbstractC31172DnG.A0U(A0M, true);
        A0U.A00 = new Eg1(abstractC59962oe, abstractC59962oe, c07270a1, new G9Q(abstractC59962oe.requireActivity()), enumC31713DwI, str5, str7);
        C1GJ.A03(A0U);
    }
}
