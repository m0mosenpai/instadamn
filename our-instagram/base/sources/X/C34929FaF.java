package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.FaF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34929FaF {
    public final C18920wW A00;

    public static void A00(C34929FaF c34929FaF, EnumC31713DwI enumC31713DwI, String str, String str2, String str3, boolean z) {
        C1QE A01 = C1QE.A01("log_in");
        String A0s = AbstractC31174DnI.A0s();
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c34929FaF.A00, "reactivate_account_attempt");
        A0f.AAP("waterfall_id", A01.A05());
        A0f.AAP("app_device_id", A0s);
        AbstractC31177DnL.A1B(A0f, currentTimeMillis, A01.A03());
        AbstractC31176DnK.A1J(A0f, A01.A03());
        A0f.A7v(AbstractC111324zv.A00(4786), Boolean.valueOf(z));
        A0f.AAP("reactivation_source", str);
        AbstractC31171DnF.A1A(A0f, enumC31713DwI.A01);
        AbstractC31178DnM.A14(A0f);
        A0f.AAP("release_channel", AbstractC31176DnK.A0r(EnumC12920le.A00()));
        A0f.AAP(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
        A0f.AAP(AbstractC31189DnY.A01(), str3);
        A0f.Cht();
    }

    public C34929FaF(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll) {
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
    }
}
