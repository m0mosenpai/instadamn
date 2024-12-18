package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.1mN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36031mN extends C1OW {
    public static final C1OZ A02 = new C1OZ() { // from class: X.1mO
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C36031mN c36031mN = (C36031mN) obj;
            anonymousClass182.A0d();
            Boolean bool = c36031mN.A00;
            if (bool != null) {
                anonymousClass182.A0T("is_messaging_pseudo_blocking", bool.booleanValue());
            }
            String str = c36031mN.A01;
            if (str != null) {
                anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
            }
            AbstractC43669JTd.A00(anonymousClass182, c36031mN);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return F7D.parseFromJson(c16l);
        }
    };
    public Boolean A00;
    public String A01;

    @Override // X.C1OW
    public final String A02() {
        return "remove_pseudo_block";
    }
}
