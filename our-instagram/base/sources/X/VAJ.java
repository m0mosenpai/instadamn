package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class VAJ extends AbstractC67878V0j {
    public static final String __redex_internal_original_name = "ForYouSerpGridFragment";
    public final InterfaceC09390do A01 = C1XM.A00(new X2z(this, 6));
    public final XB9 A00 = new U14(this, 3);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "serp_top";
    }

    @Override // X.AbstractC67878V0j, X.AbstractC59962oe, X.AbstractC59972of
    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        String str;
        super.onSetUserVisibleHint(z, z2);
        if (z) {
            UserSession session = getSession();
            if (C18U.A06(AbstractC166997dE.A0U(session), session, 36328242138922347L) && (str = A06().A0F) != null) {
                C51042Mgs A07 = A07();
                String A04 = A06().A04();
                AbstractC23641Du.A05(AnonymousClass191.A00, new MBX(A07, str, A04, (InterfaceC23621Ds) null, 19), AbstractC141776au.A00(A07));
            }
        }
    }
}
