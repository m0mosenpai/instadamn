package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.1mF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35951mF extends C1OW {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1mG
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C35951mF c35951mF = (C35951mF) obj;
            anonymousClass182.A0d();
            anonymousClass182.A0T("is_block_op", c35951mF.A03);
            String str = c35951mF.A02;
            if (str != null) {
                anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
            }
            if (c35951mF.A00 != null) {
                anonymousClass182.A0r("analytics_params");
                FYG.A00(anonymousClass182, c35951mF.A00);
            }
            String str2 = c35951mF.A01;
            if (str2 != null) {
                anonymousClass182.A0S("full_name", str2);
            }
            AbstractC43669JTd.A00(anonymousClass182, c35951mF);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC34333FCb.parseFromJson(c16l);
        }
    };
    public C35199Ffr A00;
    public String A01;
    public String A02;
    public boolean A03;

    @Override // X.C1OW
    public final String A02() {
        return "block_fb_user";
    }
}
