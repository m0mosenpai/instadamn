package X;

/* loaded from: classes6.dex */
public abstract class F9X {
    public static void A00(C16L c16l, AbstractC32152EAz abstractC32152EAz, String str) {
        if ("vetted_phone_reg_login_uid".equals(str)) {
            abstractC32152EAz.A02 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("vetted_phone_reg_login_nonce".equals(str)) {
            abstractC32152EAz.A01 = AbstractC167017dG.A0m(c16l);
            return;
        }
        if ("vetted_phone_reg_login_username".equals(str)) {
            abstractC32152EAz.A03 = AbstractC167017dG.A0m(c16l);
        } else if ("vetted_phone_reg_login_profile_pic_url".equals(str)) {
            abstractC32152EAz.A00 = AbstractC222616c.A00(c16l);
        } else {
            C55702hA.A01(c16l, abstractC32152EAz, str);
        }
    }
}
