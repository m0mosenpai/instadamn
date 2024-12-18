package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.1mR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36071mR extends C1OW {
    public static final C1OZ A05 = new C1OZ() { // from class: X.1mS
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C36071mR c36071mR = (C36071mR) obj;
            anonymousClass182.A0d();
            String str = c36071mR.A03;
            if (str != null) {
                anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
            }
            String str2 = c36071mR.A02;
            if (str2 != null) {
                anonymousClass182.A0S("full_name", str2);
            }
            String str3 = c36071mR.A04;
            if (str3 != null) {
                anonymousClass182.A0S(AbstractC31186DnV.A00(), str3);
            }
            anonymousClass182.A0Q("block_operation_type", c36071mR.A00);
            if (c36071mR.A01 != null) {
                anonymousClass182.A0r("analytics_params");
                FYG.A00(anonymousClass182, c36071mR.A01);
            }
            AbstractC43669JTd.A00(anonymousClass182, c36071mR);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC34334FCc.parseFromJson(c16l);
        }
    };
    public int A00;
    public C35199Ffr A01;
    public String A02;
    public String A03;
    public String A04;

    @Override // X.C1OW
    public final String A02() {
        return "block_ig_user";
    }
}
