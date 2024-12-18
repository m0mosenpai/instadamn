package X;

import com.instagram.user.model.User;

/* renamed from: X.2Lu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC48762Lu {
    public String A00 = "2.0";

    public final void A00(String str, String str2, String str3, String str4) {
        long j;
        String str5;
        if (str3 != null) {
            C48732Lr c48732Lr = (C48732Lr) this;
            C18920wW c18920wW = (C18920wW) c48732Lr.A00;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "privacy_fx_access_library");
            if (A00.isSampled()) {
                Long A0k = AbstractC003100w.A0k(10, str3);
                if (A0k != null) {
                    j = A0k.longValue();
                } else {
                    j = -1;
                }
                A00.A9K("target_credential_uid", Long.valueOf(j));
                A00.AAP("library_version", this.A00);
                A00.A8R((EnumC223269tJ) A3E.A00(EnumC223269tJ.class, str), "target_app_source");
                User user = c48732Lr.A01;
                if (user != null) {
                    str5 = user.getId();
                } else {
                    str5 = "";
                }
                A00.AAP("current_account_uid", str5);
                A00.AAP("caller", str4);
                A00.A8R((EnumC223279tK) A3E.A00(EnumC223279tK.class, str2), "target_credential_source");
                A00.Cht();
            }
        }
    }
}
