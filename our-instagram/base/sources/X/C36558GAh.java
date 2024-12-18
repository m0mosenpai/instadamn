package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.GAh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36558GAh implements GY0 {
    @Override // X.GY0
    public final /* bridge */ /* synthetic */ Object Cma(AbstractC12990ll abstractC12990ll, Object obj, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds) {
        QJ0 qj0 = (QJ0) obj;
        String str4 = qj0.A04;
        String str5 = qj0.A01;
        String str6 = qj0.A02;
        if (abstractC12990ll instanceof C07270a1) {
            AbstractC25233BEq.A0w(1, str4, str, str2);
            C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
            A0M.A0B("accounts/one_tap_app_login/");
            A0M.A9s("login_nonce", str5);
            AbstractC31173DnH.A1O(A0M, str);
            A0M.A9s("guid", str2);
            AbstractC31175DnJ.A1F(C19T.A1v, A0M, AbstractC35276FhB.A00(A0M, abstractC12990ll, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str4));
            A0M.A0H("device_base_login_session", str6);
            AbstractC31175DnJ.A1J(A0M);
            return AbstractC31172DnG.A0U(A0M, true).A00(820, interfaceC23621Ds);
        }
        return new C194848jk(new C115095Ie(AbstractC166987dD.A14("LoggedOutSession is required for one tap log ins")));
    }
}
